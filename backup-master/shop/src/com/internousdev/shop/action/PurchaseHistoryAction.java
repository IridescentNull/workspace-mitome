package com.internousdev.shop.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.shop.dao.PurchaseHistoryDAO;
import com.internousdev.shop.dto.PurchaseHistoryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class PurchaseHistoryAction extends ActionSupport implements SessionAware{
;
	public Map<String, Object> session;
	private PurchaseHistoryDAO purchaseHistoryDAO = new PurchaseHistoryDAO();
	private List<PurchaseHistoryDTO> purchaseHistoryDTOList = new ArrayList<PurchaseHistoryDTO>();

	public String execute() throws SQLException{
		if (!session.containsKey("loginUserIdShadow")){
			return ERROR;
		}
			purchaseHistoryDTOList = purchaseHistoryDAO.getPurchaseHistory((String)session.get("loginUserIdShadow"));


		return SUCCESS;

	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



	public PurchaseHistoryDAO getPurchaseHistoryDAO() {
		return purchaseHistoryDAO;
	}

	public void setPurchaseHistoryDAO(PurchaseHistoryDAO purchaseHistoryDAO) {
		this.purchaseHistoryDAO = purchaseHistoryDAO;
	}

	public List<PurchaseHistoryDTO> getPurchaseHistoryDTOList() {
		return purchaseHistoryDTOList;
	}

	public void setPurchaseHistoryDTOList(List<PurchaseHistoryDTO> purchaseHistoryDTOList) {
		this.purchaseHistoryDTOList = purchaseHistoryDTOList;
	}
}
