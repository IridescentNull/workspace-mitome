package com.internousdev.shop.action;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.shop.dao.PurchaseCompleteDAO;
import com.internousdev.shop.util.DBConnector;
import com.internousdev.shop.util.DateUtil;
import com.opensymphony.xwork2.ActionSupport;

public class PurchaseCompleteAction extends ActionSupport implements SessionAware{
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private int itemTransactionId;
	private String shippingUserName;
	private String shippingCompanyName;
	private String shippingAddress1;
	private String shippingAddress2;
	private String shippingUserCity;
	private String shippingUserState;
	private String shippingUserZIP;
	private String shippingUserCountry;
	private String shippingUserPhone;
	private int memoryForm;
	private int storageForm;
	private int mouseForm;
	private int fruitForm;
	private int flowerForm;
	private int careCheck;
	private int connector1Check;
	private int connector2Check;
	private int driveCheck;
	private int storageCheck;
	private int airportCheck;
	private int timeCapsuleCheck;
	private int officeCheck;
	private int accessoriesType;
	private int deliver;
	private float tax;
	private String loginUserIdShadow;
	private DateUtil dateUtil = new DateUtil();
	private int cardType;
	private String cardNumber;
	private String nameOnCard;
	private String cardExpiryDate;
	private short cardCode;
	private float price;
	private float totalPrice3;
	private int freeShipFlug;
	private PurchaseCompleteDAO purchaseCompleteDAO = new PurchaseCompleteDAO();
	public Map<String, Object> session;
	public int goodsTypeArray[] = new int[11];//これいらんかも
	// Cureが3、connectorが4,5,driveが6、外部storageが7,airportが8、timeカプセルが9、オフィスが10
	float goodsPriceArray[][];




	public String execute() throws SQLException{
		int goodsTypeArray[] ={0,0,0,(int)session.get("careCheck"),(int)session.get("connector1Check"),(int)session.get("connector2Check"),(int)session.get("driveCheck"),(int)session.get("storageCheck"),(int)session.get("airportCheck"),(int)session.get("timeCapsuleCheck"),(int)session.get("officeCheck")};
		int goodsDeliverArray[] ={0,0,0,0,(int)session.get("connectorOneDeliver"),(int)session.get("connectorTwoDeliver"),(int)session.get("driveDeliver"),(int)session.get("storageDeliver"),(int)session.get("airportDeliver"),(int)session.get("timeCapsuleDeliver"),(int)session.get("officeDeliver")};
		goodsPriceArray = new float[12][5];
		goodsPriceArray[3][0] = 0;
		goodsPriceArray[3][1] = 169.00f;
		goodsPriceArray[4][0] = 0;
		goodsPriceArray[4][1] = 49.00f;
		goodsPriceArray[5][0] = 0;
		goodsPriceArray[5][1] = 69.00f;
		goodsPriceArray[6][0] = 0;
		goodsPriceArray[6][1] = 79.00f;
		goodsPriceArray[7][0] = 0;
		goodsPriceArray[7][1] = 1499.00f;
		goodsPriceArray[8][0] = 0;
		goodsPriceArray[8][1] = 99.00f;
		goodsPriceArray[8][2] = 199.00f;
		goodsPriceArray[9][0] = 0;
		goodsPriceArray[9][1] = 299.00f;
		goodsPriceArray[9][2] = 399.00f;
		goodsPriceArray[10][0] = 0;
		goodsPriceArray[10][1] = 99.9500f;
		goodsPriceArray[10][2] = 69.9500f;
		goodsPriceArray[10][3] = 149.9500f;
		goodsPriceArray[10][4] = 229.9500f;
		if((int)session.get("pcType") == 1 || (int)session.get("pcType") == 2){//デスクトップPCが1、ラックトップが2
			itemTransactionId = (int)session.get("pcType");
			memoryForm = (int)session.get("memoryForm");
			storageForm = (int)session.get("storageForm");
			mouseForm = (int)session.get("mouseForm");
			fruitForm = (int)session.get("fruitForm");
			flowerForm = (int)session.get("flowerForm");
			loginUserIdShadow = (String)session.get("loginUserIdShadow");
			deliver = (int)session.get("pcOneDeliver");
			tax = (float)session.get("tax");
			totalPrice3 = ((float)session.get("totalPrice1") * tax);
			purchaseCompleteDAO.recordGoods(itemTransactionId, totalPrice3, shippingUserName, shippingCompanyName, shippingAddress1, shippingAddress2, shippingUserCity, shippingUserState, shippingUserZIP, shippingUserCountry, shippingUserPhone, memoryForm, storageForm, mouseForm, fruitForm, flowerForm, 0, deliver, loginUserIdShadow);
			price = price + totalPrice3;
		}
		for(int i = 3; i <= 10; i++){
			if(goodsTypeArray[i] != 0){
				itemTransactionId = i;
				accessoriesType = goodsTypeArray[i];
				loginUserIdShadow = (String)session.get("loginUserIdShadow");
				deliver = goodsDeliverArray[i];
				tax = (float)session.get("tax");
				totalPrice3 = (goodsPriceArray[i][goodsTypeArray[i]]) * tax;
				purchaseCompleteDAO.recordGoods(itemTransactionId, totalPrice3, shippingUserName, shippingCompanyName, shippingAddress1, shippingAddress2, shippingUserCity, shippingUserState, shippingUserZIP, shippingUserCountry, shippingUserPhone, 0, 0, 0, 0, 0, accessoriesType, deliver, loginUserIdShadow);
				price = price + totalPrice3;
			}
		}
		System.out.println(freeShipFlug);
		if(freeShipFlug == 1){
			price = price + 9.00f;
		}
		loginUserIdShadow = (String)session.get("loginUserIdShadow");
		purchaseCompleteDAO.recordPay(shippingUserName, shippingCompanyName, shippingAddress1, shippingAddress2, shippingUserCity, shippingUserState, shippingUserZIP, shippingUserCountry, shippingUserPhone, cardType, cardNumber, nameOnCard, cardExpiryDate, cardCode, price, loginUserIdShadow) ;

		connection.close();
		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getItemTransactionId() {
		return itemTransactionId;
	}

	public void setItemTransactionId(int itemTransactionId) {
		this.itemTransactionId = itemTransactionId;
	}

	public String getShippingUserName() {
		return shippingUserName;
	}

	public void setShippingUserName(String shippingUserName) {
		this.shippingUserName = shippingUserName;
	}

	public String getShippingCompanyName() {
		return shippingCompanyName;
	}

	public void setShippingCompanyName(String shippingCompanyName) {
		this.shippingCompanyName = shippingCompanyName;
	}

	public String getShippingAddress1() {
		return shippingAddress1;
	}

	public void setShippingAddress1(String shippingAddress1) {
		this.shippingAddress1 = shippingAddress1;
	}

	public String getShippingAddress2() {
		return shippingAddress2;
	}

	public void setShippingAddress2(String shippingAddress2) {
		this.shippingAddress2 = shippingAddress2;
	}

	public String getShippingUserCity() {
		return shippingUserCity;
	}

	public void setShippingUserCity(String shippingUserCity) {
		this.shippingUserCity = shippingUserCity;
	}

	public String getShippingUserState() {
		return shippingUserState;
	}

	public void setShippingUserState(String shippingUserState) {
		this.shippingUserState = shippingUserState;
	}

	public String getShippingUserZIP() {
		return shippingUserZIP;
	}

	public void setShippingUserZIP(String shippingUserZIP) {
		this.shippingUserZIP = shippingUserZIP;
	}

	public String getShippingUserCountry() {
		return shippingUserCountry;
	}

	public void setShippingUserCountry(String shippingUserCountry) {
		this.shippingUserCountry = shippingUserCountry;
	}

	public String getShippingUserPhone() {
		return shippingUserPhone;
	}

	public void setShippingUserPhone(String shippingUserPhone) {
		this.shippingUserPhone = shippingUserPhone;
	}

	public int getCareCheck() {
		return careCheck;
	}

	public void setCareCheck(int careCheck) {
		this.careCheck = careCheck;
	}

	public int getConnector1Check() {
		return connector1Check;
	}

	public void setConnector1Check(int connector1Check) {
		this.connector1Check = connector1Check;
	}

	public int getConnector2Check() {
		return connector2Check;
	}

	public void setConnector2Check(int connector2Check) {
		this.connector2Check = connector2Check;
	}

	public int getDriveCheck() {
		return driveCheck;
	}

	public void setDriveCheck(int driveCheck) {
		this.driveCheck = driveCheck;
	}

	public int getStorageCheck() {
		return storageCheck;
	}

	public void setStorageCheck(int storageCheck) {
		this.storageCheck = storageCheck;
	}

	public int getAirportCheck() {
		return airportCheck;
	}

	public void setAirportCheck(int airportCheck) {
		this.airportCheck = airportCheck;
	}

	public int getTimeCapsuleCheck() {
		return timeCapsuleCheck;
	}

	public void setTimeCapsuleCheck(int timeCapsuleCheck) {
		this.timeCapsuleCheck = timeCapsuleCheck;
	}

	public int getOfficeCheck() {
		return officeCheck;
	}

	public void setOfficeCheck(int officeCheck) {
		this.officeCheck = officeCheck;
	}

	public int getDeliver() {
		return deliver;
	}

	public void setDeliver(int deliver) {
		this.deliver = deliver;
	}

	public String getLoginUserIdShadow() {
		return loginUserIdShadow;
	}

	public void setLoginUserIdShadow(String loginUserIdShadow) {
		this.loginUserIdShadow = loginUserIdShadow;
	}

	public DateUtil getDateUtil() {
		return dateUtil;
	}

	public void setDateUtil(DateUtil dateUtil) {
		this.dateUtil = dateUtil;
	}

	public int getCardType() {
		return cardType;
	}

	public void setCardType(int cardType) {
		this.cardType = cardType;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public String getCardExpiryDate() {
		return cardExpiryDate;
	}

	public void setCardExpiryDate(String cardExpiryDate) {
		this.cardExpiryDate = cardExpiryDate;
	}

	public short getCardCode() {
		return cardCode;
	}

	public void setCardCode(short cardCode) {
		this.cardCode = cardCode;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

/*	public int getFreeShipFlug() {
		return freeShipFlug;
	}*/

	public void setFreeShipFlug(int freeShipFlug) {
		this.freeShipFlug = freeShipFlug;
	}
}
