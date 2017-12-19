package com.internousdev.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.shop.util.DBConnector;

public class UserCreateDAO {
	private String loginUserId;


	List<String> userCreateDTOList = new ArrayList<String>();

	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();


	public List<String> getAllLoginUserId(){

		String sql="select login_id from login_user_transaction";
		try{
			PreparedStatement preparedStatement =connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();

			while(resultSet.next()){

				this.loginUserId=resultSet.getString("login_id");
				userCreateDTOList.add(loginUserId);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}

		return userCreateDTOList;

	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}
}
