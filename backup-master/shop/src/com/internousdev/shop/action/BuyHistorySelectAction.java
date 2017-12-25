package com.internousdev.shop.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.shop.dao.BuyHistorySelectDAO;
import com.internousdev.shop.dto.BuyHistoryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyHistorySelectAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;
	private String targetId;
	private BuyHistorySelectDAO buyHistorySelectDAO = new BuyHistorySelectDAO();
	private List<BuyHistoryDTO> buyHistoryDTOList = new ArrayList<BuyHistoryDTO>();

	public String execute() throws SQLException{
		if (!session.containsKey("administratorIdShadow")){
			return ERROR;
		}
		buyHistoryDTOList = buyHistorySelectDAO.getBuyHistory(targetId);
		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



	public List<BuyHistoryDTO> getBuyHistoryDTOList() {
		return buyHistoryDTOList;
	}

	public void setBuyHistoryDTOList(List<BuyHistoryDTO> buyHistoryDTOList) {
		this.buyHistoryDTOList = buyHistoryDTOList;
	}

	public String getTargetId() {
		return targetId;
	}

	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public BuyHistorySelectDAO getBuyHistorySelectDAO() {
		return buyHistorySelectDAO;
	}

	public void setBuyHistorySelectDAO(BuyHistorySelectDAO buyHistorySelectDAO) {
		this.buyHistorySelectDAO = buyHistorySelectDAO;
	}

}
