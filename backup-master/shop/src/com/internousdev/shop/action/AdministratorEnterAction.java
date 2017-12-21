package com.internousdev.shop.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.shop.dao.AdministratorEnterDAO;
import com.internousdev.shop.dto.AdministratorEnterDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AdministratorEnterAction extends ActionSupport implements SessionAware{
	private String administratorId;
	private String administratorIdShadow;
	private String administratorPassword;
	public Map<String, Object> session;
	private AdministratorEnterDAO dao = new AdministratorEnterDAO();
	private AdministratorEnterDTO dto = new AdministratorEnterDTO();

	public String execute(){
		dto = dao.getDto(administratorId, administratorPassword);
		if(dto.getLoginFlg()){
			session.put("administratorIdShadow",dto.getAdministratorIdShadow());
			session.put("administratorUserName",dto.getAdministratorUserName());
			return SUCCESS;
		}
		return ERROR;
	}

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

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public AdministratorEnterDAO getDao() {
		return dao;
	}

	public void setDao(AdministratorEnterDAO dao) {
		this.dao = dao;
	}

	public AdministratorEnterDTO getDto() {
		return dto;
	}

	public void setDto(AdministratorEnterDTO dto) {
		this.dto = dto;
	}
}
