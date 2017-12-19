package com.internousdev.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.shop.util.DBConnector;
import com.internousdev.shop.util.DateUtil;

public class UserCreateCompleteDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private DateUtil dateUtil = new DateUtil();
	private String sql="INSERT INTO login_user_transaction (login_id, login_pass, user_name, user_address1, user_address2, user_city, user_state, user_zip, user_country, user_phone, insert_date) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

	public void createUser(String loginUserId, String loginUserPassword, String userName, String userAddress1, String userAddress2, String userCity, String userState, String userZIP, String userCountry, String userPhone) throws SQLException{
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginUserPassword);
			preparedStatement.setString(3, userName);
			preparedStatement.setString(4, userAddress1);
			preparedStatement.setString(5, userAddress2);
			preparedStatement.setString(6, userCity);
			preparedStatement.setString(7, userState);
			preparedStatement.setString(8, userZIP);
			preparedStatement.setString(9, userCountry);
			preparedStatement.setString(10, userPhone);
			preparedStatement.setString(11, dateUtil.getDate());

			preparedStatement.execute();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
	}
}
