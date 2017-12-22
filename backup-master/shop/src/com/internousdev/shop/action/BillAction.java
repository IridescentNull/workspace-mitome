package com.internousdev.shop.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.shop.dao.BillDAO;
import com.internousdev.shop.dto.PayInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BillAction extends ActionSupport implements SessionAware{
	Map<String, Object> session;
	private BillDAO billDAO = new BillDAO();
	private List<PayInfoDTO> payInfoDTOList = new ArrayList<PayInfoDTO>();

	public String execute() throws SQLException{
		if (!session.containsKey("administratorIdShadow")){
			return ERROR;
		}
		payInfoDTOList = billDAO.getPayInfo();
		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public BillDAO getBillDAO() {
		return billDAO;
	}

	public void setBillDAO(BillDAO billDAO) {
		this.billDAO = billDAO;
	}

	public List<PayInfoDTO> getPayInfoDTOList() {
		return payInfoDTOList;
	}

	public void setPayInfoDTOList(List<PayInfoDTO> payInfoDTOList) {
		this.payInfoDTOList = payInfoDTOList;
	}

}
