package com.internousdev.template.dto;

public class LoginDTO {
	private String loginId;
	private String loginPassword;
	private String userName;
	private boolean loginFlg=false;
	public String getLoginId(){
		return loginId;
	}
	public void setLoginId(String l){
		this.loginId=l;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String p){
		this.loginPassword=p;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	public boolean getLoginFlg(){
		return loginFlg;
	}
	public void setLoginFlg(boolean loginFlg){
		this.loginFlg=loginFlg;
	}
}