package com.internousdev.shop.action;

import com.opensymphony.xwork2.ActionSupport;

public class PaymentEditAction extends ActionSupport{
	private String shippingUserName;
	private String shippingCompanyName;
	private String shippingAddress1;
	private String shippingAddress2;
	private String shippingUserCity;
	private String shippingUserState;
	private String shippingUserZIP;
	private String shippingUserCountry;
	private String shippingUserPhone;
	private int continueFlug;
	private int freeShipFlug;

	public String ecexute(){
		return SUCCESS;
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
}
