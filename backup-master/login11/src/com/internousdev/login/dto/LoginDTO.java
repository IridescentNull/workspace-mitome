package com.internousdev.login.dto;

public class LoginDTO {
	private int id;
	private String name;
	private String password;

	public int getId(){
		return id;
	}

	public void setId(int i){
		this.id=i;
	}
	public String getName(){
		return name;
	}
	public void setName(String n){
		this.name=n;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password=password;
	}

}
