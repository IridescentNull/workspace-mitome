package com.internousdev.shop.dto;

public class AdministratorEnterDTO {
	private String administratorId;
	private String administratorIdShadow;
	private String administratorPassword;
	private String administratorUserName;
	private boolean loginFlg = false;

	public String getAdministratorId() {
		return administratorId;
	}
	public void setAdministratorId(String administratorId) {
		this.administratorId = administratorId;
	}
	public String getAdministratorIdShadow() {
		return administratorIdShadow;
	}
	public void setAdministratorIdShadow(String administratorIdShadow) {
		this.administratorIdShadow = administratorIdShadow;
	}
	public String getAdministratorPassword() {
		return administratorPassword;
	}
	public void setAdministratorPassword(String administratorPassword) {
		this.administratorPassword = administratorPassword;
	}
	public boolean getLoginFlg() {
		return loginFlg;
	}
	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}
	public String getAdministratorUserName() {
		return administratorUserName;
	}
	public void setAdministratorUserName(String administratorUserName) {
		this.administratorUserName = administratorUserName;
	}
}
