package com.internousdev.shop.action;

import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport{
	public String execute(){
		System.out.println("HelloWorld");
			return SUCCESS;
	}
}
