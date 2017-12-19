package com.internousdev.shop.action;

import com.opensymphony.xwork2.ActionSupport;

public class ShippingEditAction extends ActionSupport{
	private String userName;
	private String userAddress1;
	private String userAddress2;
	private String userCity;
	private String userState;
	private String userZIP;
	private String userCountry;
	private String userPhone;
	private float tax;
	private int continueFlug;
	private int freeShipFlug;
	public String execute(){
		return SUCCESS;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress1() {
		return userAddress1;
	}
	public void setUserAddress1(String userAddress1) {
		this.userAddress1 = userAddress1;
	}
	public String getUserAddress2() {
		return userAddress2;
	}
	public void setUserAddress2(String userAddress2) {
		this.userAddress2 = userAddress2;
	}
	public String getUserCity() {
		return userCity;
	}
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	public String getUserState() {
		return userState;
	}
	public void setUserState(String userState) {
		this.userState = userState;
	}
	public String getUserZIP() {
		return userZIP;
	}
	public void setUserZIP(String userZIP) {
		this.userZIP = userZIP;
	}
	public String getUserCountry() {
		return userCountry;
	}
	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public int getContinueFlug() {
		return continueFlug;
	}
	public void setContinueFlug(int continueFlug) {
		this.continueFlug = continueFlug;
	}
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	public int getFreeShipFlug() {
		return freeShipFlug;
	}
	public void setFreeShipFlug(int freeShipFlug) {
		this.freeShipFlug = freeShipFlug;
	}
}
