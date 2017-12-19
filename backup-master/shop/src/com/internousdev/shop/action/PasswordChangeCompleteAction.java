package com.internousdev.shop.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.shop.dao.LoginDAO;
import com.internousdev.shop.dao.PasswordChangeCompleteDAO;
import com.internousdev.shop.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class PasswordChangeCompleteAction extends ActionSupport implements SessionAware{
	private String loginUserId;
	private String loginPassword;
	private String newLoginPassword;
	private String newLoginPasswordShadow;
	public Map<String, Object> session;
	private LoginDAO loginDAO=new LoginDAO();
	private LoginDTO loginDTO=new LoginDTO();
	private PasswordChangeCompleteDAO passwordChangeCompleteDAO = new PasswordChangeCompleteDAO();
	private String errorMessage;

	public String execute() throws SQLException{
		String result=ERROR;

		if(!(loginPassword.equals("")) && !(newLoginPassword.equals("")) && !(newLoginPasswordShadow.equals(""))){



		if(newLoginPassword.equals(newLoginPasswordShadow)){
			loginDTO=loginDAO.getLoginUserInfo(loginUserId, loginPassword);
			session.put("passcheck",loginDTO);

			if(((LoginDTO) session.get("passcheck")).getLoginFlg()){
				passwordChangeCompleteDAO.passwordChange(loginUserId, newLoginPassword);
				result = SUCCESS;
				return result;
			}
			else{result =ERROR;
			setErrorMessage("Inputted now password is incorrect.");
			return result;}


	}else{ result = ERROR;
		setErrorMessage("Please input same code in the NEW password columns.");
		return result;}

	}else{ result = ERROR;
		setErrorMessage("Please fill out all columns.");
		return result;
	}
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}



	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getNewLoginPassword() {
		return newLoginPassword;
	}

	public void setNewLoginPassword(String newLoginPassword) {
		this.newLoginPassword = newLoginPassword;
	}

	public String getNewLoginPasswordShadow() {
		return newLoginPasswordShadow;
	}

	public void setNewLoginPasswordShadow(String newLoginPasswordShadow) {
		this.newLoginPasswordShadow = newLoginPasswordShadow;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public LoginDAO getLoginDAO() {
		return loginDAO;
	}

	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}

	public LoginDTO getLoginDTO() {
		return loginDTO;
	}

	public void setLoginDTO(LoginDTO loginDTO) {
		this.loginDTO = loginDTO;
	}

	public PasswordChangeCompleteDAO getPasswordChangeCompleteDAO() {
		return passwordChangeCompleteDAO;
	}

	public void setPasswordChangeCompleteDAO(PasswordChangeCompleteDAO passwordChangeCompleteDAO) {
		this.passwordChangeCompleteDAO = passwordChangeCompleteDAO;
	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}


}
