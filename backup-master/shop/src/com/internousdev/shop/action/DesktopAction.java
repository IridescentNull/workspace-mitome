package com.internousdev.shop.action;

import com.opensymphony.xwork2.ActionSupport;

public class DesktopAction extends ActionSupport {
	private int pcType;
	public String execute(){
		pcType =1;
		return SUCCESS;
	}
	public int getPcType() {
		return pcType;
	}
	public void setPcType(int pcType) {
		this.pcType = pcType;
	}
}
