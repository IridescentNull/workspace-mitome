package com.internousdev.template.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware {
	private String loginUserId;
	private String loginPassword;
	private String userName;
	public Map<String, Object> session;
	private String result;
	private String errorMessage;

	public String execute(){
		result=SUCCESS;
		if(!(loginUserId.equals("")) &&!(loginPassword.equals("")) && !(userName.equals(""))){
			session.put("loginUserId", loginUserId);
			session.put("loginPassword", loginPassword);
			session.put("userName", userName);
		}else{
			setErrorMessage("未入力の場所があります");
			result=ERROR;
		}
		return result;
	}
	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String l){
		this.loginUserId=l;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String l){
		this.loginPassword=l;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserName(String u){
		this.userName=u;
	}
	@Override
	public void setSession(Map<String, Object> session){
		this.session=session;
	}
	public String getErroMessage(){
		return errorMessage;
	}
	public void setErrorMessage(String e){
		this.errorMessage=e;
	}


}
