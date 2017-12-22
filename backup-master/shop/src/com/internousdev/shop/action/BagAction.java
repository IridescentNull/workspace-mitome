package com.internousdev.shop.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BagAction extends ActionSupport implements SessionAware{
	private int memoryForm;
	private int storageForm;
	private int mouseForm;
	private int fruitForm;
	private int flowerForm;
	private int pcType;
	private float totalPrice1;
	private float totalPrice2;
	private float tax;
	private int careCheck;
	private int connector1Check;
	private int connector2Check;
	private int driveCheck;
	private int storageCheck;
	private int airportCheck;
	private int timeCapsuleCheck;
	private int officeCheck;
	public float carePriceArray[] = new float[2];
	public float connector1PriceArray[] = new float[2];
	public float connector2PriceArray[] = new float[2];
	public float drivePriceArray[] = new float[2];
	public float storagePriceArray[] = new float[2];
	public float airportPriceArray[] = new float[3];
	public float timeCapsulePriceArray[] = new float[3];
	public float officePriceArray[] = new float[5];
	public Map<String, Object> session;

	public String execute(){
		carePriceArray[0] = 0;
		carePriceArray[1] = 169.00f;
		connector1PriceArray[0] = 0;
		connector1PriceArray[1] = 49.00f;
		connector2PriceArray[0] = 0;
		connector2PriceArray[1] = 69.00f;
		drivePriceArray[0] = 0;
		drivePriceArray[1] = 79.00f;
		storagePriceArray[0] = 0;
		storagePriceArray[1] = 1499.00f;
		airportPriceArray[0] = 0;
		airportPriceArray[1] = 99.00f;
		airportPriceArray[2] = 199.00f;
		timeCapsulePriceArray[0] = 0;
		timeCapsulePriceArray[1] = 299.00f;
		timeCapsulePriceArray[2] = 399.00f;
		officePriceArray[0] = 0;
		officePriceArray[1] = 99.95f;
		officePriceArray[2] = 69.95f;
		officePriceArray[3] = 149.95f;
		officePriceArray[4] = 229.95f;
		if(pcType==0){
			totalPrice1 = 0f;
		}

		totalPrice2 = totalPrice1 + carePriceArray[careCheck] + connector1PriceArray[connector1Check] + connector2PriceArray[connector2Check] + drivePriceArray[driveCheck] + storagePriceArray[storageCheck] + airportPriceArray[airportCheck] + timeCapsulePriceArray[timeCapsuleCheck] + officePriceArray[officeCheck];
		session.put("memoryForm", memoryForm);
		session.put("storageForm", storageForm);
		session.put("mouseForm", mouseForm);
		session.put("fruitForm", fruitForm);
		session.put("flowerForm", flowerForm);
		session.put("pcType", pcType);
		session.put("totalPrice1", totalPrice1);
		session.put("careCheck", careCheck);
		session.put("connector1Check", connector1Check);
		session.put("connector2Check", connector2Check);
		session.put("driveCheck", driveCheck);
		session.put("storageCheck", storageCheck);
		session.put("airportCheck", airportCheck);
		session.put("timeCapsuleCheck", timeCapsuleCheck);
		session.put("officeCheck", officeCheck);
		session.put("totalPrice1", totalPrice1);
		session.put("totalPrice2", totalPrice2);
		session.put("tax", tax);

		return SUCCESS;
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
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getPcType() {
		return pcType;
	}

	public void setPcType(int pcType) {
		this.pcType = pcType;
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

	public float getTotalPrice1() {
		return totalPrice1;
	}

	public void setTotalPrice1(float totalPrice1) {
		this.totalPrice1 = totalPrice1;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}
}
