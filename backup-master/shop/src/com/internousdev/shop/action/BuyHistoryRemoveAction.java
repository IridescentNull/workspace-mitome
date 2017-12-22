package com.internousdev.shop.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.shop.dao.BuyHistoryDAO;
import com.internousdev.shop.dao.BuyHistoryRemoveDAO;
import com.internousdev.shop.dto.BuyHistoryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyHistoryRemoveAction extends ActionSupport implements SessionAware{
	public Map<String, Object> session;
	private int id;
	private BuyHistoryDAO buyHistoryDAO = new BuyHistoryDAO();
	private BuyHistoryRemoveDAO buyHistoryRemoveDAO = new BuyHistoryRemoveDAO();
	private List<BuyHistoryDTO> buyHistoryDTOList = new ArrayList<BuyHistoryDTO>();

	public String execute() throws SQLException{
		if (!session.containsKey("administratorIdShadow")){
			return ERROR;
		}
		buyHistoryRemoveDAO.deleteBuyHistory(id);
		buyHistoryDTOList = buyHistoryDAO.getBuyHistory();
		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BuyHistoryDAO getBuyHistoryDAO() {
		return buyHistoryDAO;
	}

	public void setBuyHistoryDAO(BuyHistoryDAO buyHistoryDAO) {
		this.buyHistoryDAO = buyHistoryDAO;
	}

	public BuyHistoryRemoveDAO getBuyHistoryRemoveDAO() {
		return buyHistoryRemoveDAO;
	}

	public void setBuyHistoryRemoveDAO(BuyHistoryRemoveDAO buyHistoryRemoveDAO) {
		this.buyHistoryRemoveDAO = buyHistoryRemoveDAO;
	}

	public List<BuyHistoryDTO> getBuyHistoryDTOList() {
		return buyHistoryDTOList;
	}

	public void setBuyHistoryDTOList(List<BuyHistoryDTO> buyHistoryDTOList) {
		this.buyHistoryDTOList = buyHistoryDTOList;
	}


}
