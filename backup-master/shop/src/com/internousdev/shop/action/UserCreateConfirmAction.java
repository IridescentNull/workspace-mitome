package com.internousdev.shop.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.shop.dao.UserCreateDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware{
	private String loginUserId;
	private String loginPassword;
	private String loginPasswordShadow;
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
	private String errorMessage;
	private int passwordLength =0;
	private List<String> allLoginUserIdlist;
	//ここから情報格納処理
	public String execute(){
		result = SUCCESS;


		if(!(loginPassword.equals(loginPasswordShadow))){
				setErrorMessage("Oops! Please input same code in the password columns.");
				result=ERROR;
				UserCreateDAO userCreateDAO=new UserCreateDAO();
				setAllLoginUserIdlist((userCreateDAO.getAllLoginUserId()));}
		else if(!(loginUserId.equals("")) && !(loginPassword.equals("")) && !(loginPasswordShadow.equals("")) && !(userName.equals("")) && !(userAddress1.equals("")) && !(userCity.equals("")) && !(userState.equals("")) && !(userZIP.equals("")) && !(userCountry.equals("")) && !(userPhone.equals(""))){
			session.put("loginUserId", loginUserId);
			session.put("loginPassword", loginPassword);
			session.put("loginPasswordShadow", loginPasswordShadow);
			passwordLength=loginPassword.length();
			session.put("passwordLength",  passwordLength);
			session.put("userName", userName);
			session.put("userAddress1", userAddress1);
			session.put("userAddress2", userAddress2);
			session.put("userCity", userCity);
			session.put("userState", userState);
			session.put("userZIP", userZIP);
			session.put("userCountry", userCountry);
			session.put("userPhone", userPhone);
		}else{
			setErrorMessage("Oops! There is a blank column.");
			result=ERROR;
			UserCreateDAO userCreateDAO=new UserCreateDAO();
			setAllLoginUserIdlist((userCreateDAO.getAllLoginUserId()));
		}



		return result;
	}
	// following are encapsulation.
	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId=loginUserId;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword=loginPassword;
	}
	public String getLoginPasswordShadow(){
		return loginPasswordShadow;
	}
	public void setLoginPasswordShadow(String loginPasswordShadow){
		this.loginPasswordShadow=loginPasswordShadow;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	public String getUserAddress1(){
		return userAddress1;
	}
	public void setUserAddress1(String userAddress1){
		this.userAddress1=userAddress1;
	}
	public String getUserAddress2(){
		return userAddress2;
	}
	public void setUserAddress2(String userAddress2){
		this.userAddress2=userAddress2;
	}
	public String getUserCity(){
		return userCity;
	}
	public void setUserCity(String userCity){
		this.userCity=userCity;
	}
	public String getUserState(){
		return userState;
	}
	public void setUserState(String userState){
		this.userState=userState;
	}
	public String getUserZIP(){
		return userAddress1;
	}
	public void setUserZIP(String userZIP){
		this.userZIP=userZIP;
	}
	public String getUserCountry(){
		return userCountry;
	}
	public void setUserCountry(String userCountry){
		this.userCountry=userCountry;
	}
	public String getUserPhone(){
		return userPhone;
	}
	public void setUserPhone(String userPhone){
		this.userPhone=userPhone;
	}
	@Override
	public void setSession(Map<String, Object> session){
		this.session=session;
	}
	public String getErrorMessage(){
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage){
		this.errorMessage=errorMessage;
	}
	public int getPasswordLength(){
		return passwordLength;
	}
	public void setPasswordLength(int passwordLength){
		this.passwordLength=passwordLength;
	}
	public List<String> getAllLoginUserIdlist() {
		return allLoginUserIdlist;
	}
	public void setAllLoginUserIdlist(List<String> allLoginUserIdlist) {
		this.allLoginUserIdlist = allLoginUserIdlist;
	}



}
