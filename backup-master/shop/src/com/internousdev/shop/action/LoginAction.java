package com.internousdev.shop.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.shop.dao.LoginDAO;
import com.internousdev.shop.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
	private String loginUserId;
	private String loginUserIdShadow;
	private String loginPassword;
	public Map<String, Object> session;
	private LoginDAO loginDAO=new LoginDAO();
	private LoginDTO loginDTO=new LoginDTO();
	public String execute(){
		String result =ERROR;
		loginDTO=loginDAO.getLoginUserInfo(loginUserId, loginPassword);

		session.put("loginUser", loginDTO);

		if(((LoginDTO) session.get("loginUser")).getLoginFlg()){
			result =SUCCESS;
			this.loginUserIdShadow = loginUserId;
			session.put("loginUserIdShadow",loginUserIdShadow);
			return result;
		}
		return result;
	}
	//The following are encapsulation.
	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
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

	@Override
	public void setSession(Map<String, Object> session){
		this.session=session;
	}

}
