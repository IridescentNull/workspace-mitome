package com.internousdev.shop.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.shop.dao.GeneralUserDAO;
import com.internousdev.shop.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GeneralUserAction extends ActionSupport implements SessionAware{

	public Map<String, Object> session;
	private GeneralUserDAO dao = new GeneralUserDAO();
	private List<UserInfoDTO> dto = new ArrayList<UserInfoDTO>();

	public String execute() throws SQLException{
		if (!session.containsKey("administratorIdShadow")){
			return ERROR;
		}
		dto = dao.getUserInfo();
		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public GeneralUserDAO getDao() {
		return dao;
	}

	public void setDao(GeneralUserDAO dao) {
		this.dao = dao;
	}

	public List<UserInfoDTO> getDto() {
		return dto;
	}

	public void setDto(List<UserInfoDTO> dto) {
		this.dto = dto;
	}


}
