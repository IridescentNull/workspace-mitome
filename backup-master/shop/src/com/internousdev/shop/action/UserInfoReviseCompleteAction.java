
package com.internousdev.shop.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.shop.dao.UserInfoReviseCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserInfoReviseCompleteAction extends ActionSupport implements SessionAware{
	private String newUserName;
	private String newUserAddress1;
	private String newUserAddress2;
	private String newUserCiry;
	private String newUserState;
	private String newUserZIP;
	private String newUserCountry;
	private String newUserPhone;
	public Map<String, Object> session;
	private String result;
	private boolean flg=true;
	private UserInfoReviseCompleteDAO userInfoReviseCompleteDAO=new UserInfoReviseCompleteDAO();

	public String execute() throws SQLException{
		userInfoReviseCompleteDAO.reviseUser(session.get("newUserName").toString(), session.get("newUserAddress1").toString(), session.get("newUserAddress2").toString(), session.get("newUserCity").toString(), session.get("newUserState").toString(), session.get("newUserZIP").toString(), session.get("newUserCountry").toString(), session.get("newUserPhone").toString(), session.get("loginUserIdShadow").toString());
		result = SUCCESS;
		return result;
	}

	public String getNewUserName() {
		return newUserName;
	}

	public void setNewUserName(String newUserName) {
		this.newUserName = newUserName;
	}

	public String getNewUserAddress1() {
		return newUserAddress1;
	}

	public void setNewUserAddress1(String newUserAddress1) {
		this.newUserAddress1 = newUserAddress1;
	}

	public String getNewUserAddress2() {
		return newUserAddress2;
	}

	public void setNewUserAddress2(String newUserAddress2) {
		this.newUserAddress2 = newUserAddress2;
	}

	public String getNewUserCiry() {
		return newUserCiry;
	}

	public void setNewUserCiry(String newUserCiry) {
		this.newUserCiry = newUserCiry;
	}

	public String getNewUserState() {
		return newUserState;
	}

	public void setNewUserState(String newUserState) {
		this.newUserState = newUserState;
	}

	public String getNewUserZIP() {
		return newUserZIP;
	}

	public void setNewUserZIP(String newUserZIP) {
		this.newUserZIP = newUserZIP;
	}

	public String getNewUserCountry() {
		return newUserCountry;
	}

	public void setNewUserCountry(String newUserCountry) {
		this.newUserCountry = newUserCountry;
	}

	public String getNewUserPhone() {
		return newUserPhone;
	}

	public void setNewUserPhone(String newUserPhone) {
		this.newUserPhone = newUserPhone;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public boolean isFlg() {
		return flg;
	}

	public void setFlg(boolean flg) {
		this.flg = flg;
	}

	public UserInfoReviseCompleteDAO getUserInfoReviseCompleteDAO() {
		return userInfoReviseCompleteDAO;
	}

	public void setUserInfoReviseCompleteDAO(UserInfoReviseCompleteDAO userInfoReviseCompleteDAO) {
		this.userInfoReviseCompleteDAO = userInfoReviseCompleteDAO;
	}

}
