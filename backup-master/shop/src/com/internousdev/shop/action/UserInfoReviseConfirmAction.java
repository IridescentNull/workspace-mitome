package com.internousdev.shop.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.shop.dao.UserInfoDAO;
import com.internousdev.shop.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserInfoReviseConfirmAction extends ActionSupport implements SessionAware{
	private String newUserName;
	private String newUserAddress1;
	private String newUserAddress2;
	private String newUserCity;
	private String newUserState;
	private String newUserZIP;
	private String newUserCountry;
	private String newUserPhone;
	public Map<String, Object> session;
	private String result;
	private String errorMessage;
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
	private UserInfoDAO userInfoDAO=new UserInfoDAO();
	private UserInfoDTO userInfoDTO=new UserInfoDTO();

	public String execute(){
		result = SUCCESS;
		userInfoDTO=userInfoDAO.getUserInfo(session.get("loginUserIdShadow").toString());//userInfoDTO=で始めないと上手くいかない
		loginUserId=userInfoDTO.getLoginUserId();
		if(!(newUserName.equals("")) && !(newUserAddress1.equals("")) && !(newUserCity.equals("")) && !(newUserState.equals("")) && !(newUserState.equals("")) && !(newUserZIP.equals("")) && !(newUserCountry.equals("")) && !(newUserPhone.equals(""))){
			session.put("newUserName", newUserName);
			session.put("newUserAddress1", newUserAddress1);
			session.put("newUserAddress2", newUserAddress2);
			session.put("newUserCity", newUserCity);
			session.put("newUserState", newUserState);
			session.put("newUserZIP", newUserZIP);
			session.put("newUserCountry", newUserCountry);
			session.put("newUserPhone", newUserPhone);
		}else{
			setErrorMessage("Please fill out all columns.");
			result = ERROR;
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

				return result;}
				else {
					result = NONE;
					return result;
				}

		}
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

	public String getNewUserCity() {
		return newUserCity;
	}

	public void setNewUserCity(String newUserCity) {
		this.newUserCity = newUserCity;
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

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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
