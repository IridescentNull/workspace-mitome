package com.internousdev.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.shop.util.DBConnector;
import com.internousdev.shop.util.DateUtil;

public class UserInfoReviseCompleteDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private DateUtil dateUtil = new DateUtil();
	private String sql="UPDATE login_user_transaction SET user_name=?, user_address1=?, user_address2=?, user_city=?, user_state=?, user_zip=?, user_country=?, user_phone=?, updated_date=? WHERE login_id = ?";

	public void reviseUser(String newUserName, String newUserAddress1, String newUserAddress2, String newUserCity, String newUserState, String newUserZIP, String newUserCountry, String newUserPhone, String loginUserIdShadow)throws SQLException{
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, newUserName);
			preparedStatement.setString(2, newUserAddress1);
			preparedStatement.setString(3, newUserAddress2);
			preparedStatement.setString(4, newUserCity);
			preparedStatement.setString(5, newUserState);
			preparedStatement.setString(6, newUserZIP);
			preparedStatement.setString(7, newUserCountry);
			preparedStatement.setString(8, newUserPhone);
			preparedStatement.setString(9, dateUtil.getDate());
			preparedStatement.setString(10, loginUserIdShadow);

			preparedStatement.execute();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
	}

}
