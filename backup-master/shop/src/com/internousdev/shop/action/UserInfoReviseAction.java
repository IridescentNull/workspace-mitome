package com.internousdev.shop.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.shop.dao.UserInfoDAO;
import com.internousdev.shop.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserInfoReviseAction extends ActionSupport implements SessionAware{
	private String loginUserId;
	private String loginUserIdShadow;
	private String loginPassword;
	private String userName;
	private String userAddress1;
	private String userAddress2;
	private String userCity;
	private String userState;
	private String userZIP;
	private String userCountry;
	private String userPhone;
	public Map<String, Object> session;
	private String result;
	private UserInfoDAO userInfoDAO=new UserInfoDAO();
	private UserInfoDTO userInfoDTO=new UserInfoDTO();

	public String execute() throws SQLException{
		if(session.containsKey("loginUserIdShadow")){
		userInfoDTO=userInfoDAO.getUserInfo(session.get("loginUserIdShadow").toString());//userInfoDTO=で始めないと上手くいかない
		loginUserId=userInfoDTO.getLoginUserId();
		userName=userInfoDTO.getUserName();
		userAddress1=userInfoDTO.getUserAddress1();
		userAddress2=userInfoDTO.getUserAddress2();
		userCity=userInfoDTO.getUserCity();
		userState=userInfoDTO.getUserState();
		userZIP=userInfoDTO.getUserZIP();
		userCountry=userInfoDTO.getUserCountry();
		userPhone=userInfoDTO.getUserPhone();
		result = SUCCESS;
		return result;}
		else {
			return ERROR;
		}
	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginUserIdShadow() {
		return loginUserIdShadow;
	}

	public void setLoginUserIdShadow(String loginUserIdShadow) {
		this.loginUserIdShadow = loginUserIdShadow;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
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

	public UserInfoDAO getUserInfoDAO() {
		return userInfoDAO;
	}

	public void setUserInfoDAO(UserInfoDAO userInfoDAO) {
		this.userInfoDAO = userInfoDAO;
	}

	public UserInfoDTO getUserInfoDTO() {
		return userInfoDTO;
	}

	public void setUserInfoDTO(UserInfoDTO userInfoDTO) {
		this.userInfoDTO = userInfoDTO;
	}
}
