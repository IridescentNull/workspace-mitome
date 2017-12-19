package com.internousdev.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.shop.dto.UserInfoDTO;
import com.internousdev.shop.util.DBConnector;

public class UserInfoDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private UserInfoDTO userInfoDTO = new UserInfoDTO();


	public UserInfoDTO getUserInfo(String loginUserId){
		String sql="SELECT * FROM login_user_transaction where login_id=?";

		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, loginUserId);

			ResultSet resultSet=preparedStatement.executeQuery();

			if(resultSet.next()){
				userInfoDTO.setLoginUserId(resultSet.getString("login_id"));
				userInfoDTO.setLoginPassword(resultSet.getString("login_pass"));
				userInfoDTO.setUserName(resultSet.getString("user_name"));
				userInfoDTO.setUserAddress1(resultSet.getString("user_address1"));
				userInfoDTO.setUserAddress2(resultSet.getString("user_address2"));
				userInfoDTO.setUserCity(resultSet.getString("user_city"));
				userInfoDTO.setUserState(resultSet.getString("user_state"));
				userInfoDTO.setUserZIP(resultSet.getString("user_zip"));
				userInfoDTO.setUserCountry(resultSet.getString("user_country"));
				userInfoDTO.setUserPhone(resultSet.getString("user_phone"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return userInfoDTO;
	}

	public UserInfoDTO getUserInfoDTO() {
		return userInfoDTO;
	}

	public void setUserInfoDTO(UserInfoDTO userInfoDTO) {
		this.userInfoDTO = userInfoDTO;
	}


}
