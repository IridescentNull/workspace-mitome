package com.internousdev.shop.dto;

public class PayInfoDTO {
	private int id;
	private String shippingUserName;
	private String shippingCompanyName;
	private String shippingAddress1;
	private String shippingAddress2;
	private String shippingUserCity;
	private String shippingUserState;
	private String shippingUserZIP;
	private String shippingUserCountry;
	private String shippingUserPhone;
	private int cardType;
	private String cardNumber;
	private String nameOnCard;
	private String cardExpiryDate;
	private short cardCode;
	private float price;
	private String loginUserId;
	private String insertTime;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getLoginUserId() {
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}
	public String getInsertTime() {
		return insertTime;
	}
	public void setInsertTime(String insertTime) {
		this.insertTime = insertTime;
	}
}
