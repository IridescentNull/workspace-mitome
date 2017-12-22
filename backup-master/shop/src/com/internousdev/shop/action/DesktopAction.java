package com.internousdev.shop.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class DesktopAction extends ActionSupport implements SessionAware{
	private int pcType;
	public Map<String, Object> session;
	public String execute(){
		if (!session.containsKey("loginUserIdShadow")){
			return ERROR;
		}
		pcType =1;
		return SUCCESS;
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
