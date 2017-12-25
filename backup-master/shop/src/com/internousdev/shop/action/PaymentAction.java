package com.internousdev.shop.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class PaymentAction extends ActionSupport implements SessionAware{
	private int cardType;
	private String cardNumber;
	private String nameOnCard;
	private String cardExpiryDate;
	private short cardCode;
	private float tax;
	private int continueFlug;
	private int freeShipFlug;
	private int memoryForm;
	private int storageForm;
	private int mouseForm;
	private int fruitForm;
	private int flowerForm;
	private int pcType;
	private float totalPrice1;
	private float totalPrice2;
	private int careCheck;
	private int connector1Check;
	private int connector2Check;
	private int driveCheck;
	private int storageCheck;
	private int airportCheck;
	private int timeCapsuleCheck;
	private int officeCheck;
	private int pcOneDeliver;
	private int pcTwoDeliver;
	private int connectorOneDeliver;
	private int connectorTwoDeliver;
	private int driveDeliver;
	private int storageDeliver;
	private int airportDeliver;
	private int timeCapsuleDeliver;
	private int officeDeliver;
	private String shippingUserName;
	private String shippingCompanyName;
	private String shippingAddress1;
	private String shippingAddress2;
	private String shippingUserCity;
	private String shippingUserState;
	private String shippingUserZIP;
	private String shippingUserCountry;
	private String shippingUserPhone;
	private String errorMessage;


	public Map<String, Object> session;


	public String execute(){
		if(cardType == 0 || cardNumber.equals("")  || nameOnCard.equals("")   || cardExpiryDate.equals("")   || cardCode == 0 ){
			continueFlug = 2;
			errorMessage = "Please fill out all columns";
			System.out.println(errorMessage);
			return ERROR;
		}
		memoryForm = (int)session.get("memoryForm");
		storageForm = (int)session.get("storageForm");
		mouseForm = (int)session.get("mouseForm");
		fruitForm = (int)session.get("fruitForm");
		flowerForm = (int)session.get("flowerForm");
		pcType = (int)session.get("pcType");
		totalPrice1 = (float)session.get("totalPrice1");
		careCheck = (int)session.get("careCheck");
		connector2Check = (int)session.get("connector2Check");
		connector1Check = (int)session.get("connector1Check");
		driveCheck = (int)session.get("driveCheck");
		storageCheck = (int)session.get("storageCheck");
		airportCheck = (int)session.get("airportCheck");
		timeCapsuleCheck = (int)session.get("timeCapsuleCheck");
		officeCheck = (int)session.get("officeCheck");
		pcOneDeliver = (int)session.get("pcOneDeliver");
		pcTwoDeliver = ((int)session.get("pcTwoDeliver"));
		connectorOneDeliver = (int)session.get("connectorOneDeliver");
		connectorTwoDeliver = (int)session.get("connectorTwoDeliver");
		driveDeliver = (int)session.get("driveDeliver");
		storageDeliver = (int)session.get("storageDeliver");
		airportDeliver = (int)session.get("airportDeliver");
		timeCapsuleDeliver = (int)session.get("timeCapsuleDeliver");
		officeDeliver = (int)session.get("officeDeliver");
		return SUCCESS;
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

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public int getContinueFlug() {
		return continueFlug;
	}

	public void setContinueFlug(int continueFlug) {
		this.continueFlug = continueFlug;
	}

	public int getFreeShipFlug() {
		return freeShipFlug;
	}

	public void setFreeShipFlug(int freeShipFlug) {
		this.freeShipFlug = freeShipFlug;
	}

	public int getMemoryForm() {
		return memoryForm;
	}

	public void setMemoryForm(int memoryForm) {
		this.memoryForm = memoryForm;
	}

	public int getStorageForm() {
		return storageForm;
	}

	public void setStorageForm(int storageForm) {
		this.storageForm = storageForm;
	}

	public int getMouseForm() {
		return mouseForm;
	}

	public void setMouseForm(int mouseForm) {
		this.mouseForm = mouseForm;
	}

	public int getFruitForm() {
		return fruitForm;
	}

	public void setFruitForm(int fruitForm) {
		this.fruitForm = fruitForm;
	}

	public int getFlowerForm() {
		return flowerForm;
	}

	public void setFlowerForm(int flowerForm) {
		this.flowerForm = flowerForm;
	}

	public int getPcType() {
		return pcType;
	}

	public void setPcType(int pcType) {
		this.pcType = pcType;
	}

	public float getTotalPrice1() {
		return totalPrice1;
	}

	public void setTotalPrice1(float totalPrice1) {
		this.totalPrice1 = totalPrice1;
	}

	public float getTotalPrice2() {
		return totalPrice2;
	}

	public void setTotalPrice2(float totalPrice2) {
		this.totalPrice2 = totalPrice2;
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

	public int getPcOneDeliver() {
		return pcOneDeliver;
	}

	public void setPcOneDeliver(int pcOneDeliver) {
		this.pcOneDeliver = pcOneDeliver;
	}

	public int getConnectorOneDeliver() {
		return connectorOneDeliver;
	}

	public void setConnectorOneDeliver(int connectorOneDeliver) {
		this.connectorOneDeliver = connectorOneDeliver;
	}

	public int getConnectorTwoDeliver() {
		return connectorTwoDeliver;
	}

	public void setConnectorTwoDeliver(int connectorTwoDeliver) {
		this.connectorTwoDeliver = connectorTwoDeliver;
	}

	public int getDriveDeliver() {
		return driveDeliver;
	}

	public void setDriveDeliver(int driveDeliver) {
		this.driveDeliver = driveDeliver;
	}

	public int getStorageDeliver() {
		return storageDeliver;
	}

	public void setStorageDeliver(int storageDeliver) {
		this.storageDeliver = storageDeliver;
	}

	public int getAirportDeliver() {
		return airportDeliver;
	}

	public void setAirportDeliver(int airportDeliver) {
		this.airportDeliver = airportDeliver;
	}

	public int getTimeCapsuleDeliver() {
		return timeCapsuleDeliver;
	}

	public void setTimeCapsuleDeliver(int timeCapsuleDeliver) {
		this.timeCapsuleDeliver = timeCapsuleDeliver;
	}

	public int getOfficeDeliver() {
		return officeDeliver;
	}

	public void setOfficeDeliver(int officeDeliver) {
		this.officeDeliver = officeDeliver;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
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

	public int getPcTwoDeliver() {
		return pcTwoDeliver;
	}

	public void setPcTwoDeliver(int pcTwoDeliver) {
		this.pcTwoDeliver = pcTwoDeliver;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}



}
