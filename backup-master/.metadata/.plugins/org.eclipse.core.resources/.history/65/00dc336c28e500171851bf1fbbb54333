package com.internousdev.shop.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.shop.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware{
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
	private boolean flg=true;
	private UserCreateCompleteDAO userCreateCompleteDAO=new UserCreateCompleteDAO();

	public String execute() throws SQLException{
		userCreateCompleteDAO.createUser(session.get("loginUserId").toString(),
				session.get("loginPassword").toString(),
				session.get("userName").toString(),
				session.get("userAddress1").toString(),
				session.get("userAddress2").toString(),
				session.get("userCity").toString(),
				session.get("userState").toString(),
				session.get("userZIP").toString(),
				session.get("userCountry").toString(),
				session.get("userPhone").toString()
				);
		result=SUCCESS;
		this.loginUserIdShadow = session.get("loginUserId").toString();
		session.put("loginUserIdShadow",loginUserIdShadow);

		return result;

	}
	//Follwoing are encapsulations.
	public String getLoginUserId(){
		return loginUserId;
	}
	public void setloginUserId(String loginUserId){
		this.loginUserId=loginUserId;
	}
	public String getLoginUserIdShadow() {
		return loginUserIdShadow;
	}
	public void setLoginUserIdShadow(String loginUserIdShadow) {
		this.loginUserIdShadow = loginUserIdShadow;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword=loginPassword;
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
		return userZIP;
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
	public boolean getFlg(){
		return flg;
	}
	@Override
	public void setSession(Map<String, Object> session){
		this.session=session;
	}

}
