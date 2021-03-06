package com.internousdev.shop.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class PerchaseAction extends ActionSupport implements SessionAware{
	private int memoryForm;
	private int storageForm;
	private int mouseForm;
	private int fruitForm;
	private int flowerForm;
	private int pcType;
	private float totalPrice1;
	public float memoryPriceArray[] = new float[3];
	public float storagePriceArray[] = new float[5];
	public float mousePriceArray[] = new float[3];
	public float fruitPriceArray[] = new float[2];
	public float flowerPriceArray[] = new float[2];
	public Map<String, Object> session;




	public String execute(){
		memoryPriceArray[0] = 0;
		memoryPriceArray[1] = 200;
		memoryPriceArray[2] = 600;
		storagePriceArray[0] = 0;
		storagePriceArray[1] = 200;
		storagePriceArray[2] = 100;
		storagePriceArray[3] = 300;
		storagePriceArray[4] = 700;
		mousePriceArray[0] = 0;
		mousePriceArray[1] = 50;
		mousePriceArray[2] = 129;
		fruitPriceArray[0] = 0;
		fruitPriceArray[1] = 299.99f;
		flowerPriceArray[0] = 0;
		flowerPriceArray[1] = 199.99f;
		if(pcType == 1){
			totalPrice1 = 1799;
		}
		if(pcType == 2){
			totalPrice1 = 1299;
			storagePriceArray[0] = 0;
			storagePriceArray[1] = 0;
			storagePriceArray[2] = 200;
			storagePriceArray[3] = 400;
			storagePriceArray[4] = 800;
		}
		totalPrice1 = totalPrice1 + memoryPriceArray[memoryForm] + storagePriceArray[storageForm] +  mousePriceArray[mouseForm] + fruitPriceArray[fruitForm] +  flowerPriceArray[flowerForm];
		session.put("memoryForm", memoryForm);
		session.put("storageForm", storageForm);
		session.put("mouseForm", mouseForm);
		session.put("fruitForm", fruitForm);
		session.put("flowerForm", flowerForm);
		session.put("pcType", pcType);
		session.put("totalPrice1", totalPrice1);
		System.out.println(memoryForm);
		System.out.println(storageForm);
		System.out.println(mouseForm);
		System.out.println(fruitForm);
		System.out.println(flowerForm);
		System.out.println(pcType);
		System.out.println(getSession());
		return SUCCESS;
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

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}

