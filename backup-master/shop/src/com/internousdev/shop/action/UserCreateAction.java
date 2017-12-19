package com.internousdev.shop.action;

import java.util.List;

import com.internousdev.shop.dao.UserCreateDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateAction extends ActionSupport{

	private UserCreateDAO userCreateDAO=new UserCreateDAO();
	private List<String> allLoginUserIdlist;

	public String execute(){
		allLoginUserIdlist=(userCreateDAO.getAllLoginUserId());
		System.out.println(allLoginUserIdlist);//デバック用、後で消す
		//System.out.println(userCreateDAO.getAllLoginUserId());//デバック用、後で消す
		return SUCCESS;
	}
//以下、消すかも
	public List<String> getAllLoginUserIdlist() {
		return allLoginUserIdlist;
	}

	public void setAllLoginUserIdlist(List<String> allLoginUserIdlist) {
		this.allLoginUserIdlist = allLoginUserIdlist;
	}
}
