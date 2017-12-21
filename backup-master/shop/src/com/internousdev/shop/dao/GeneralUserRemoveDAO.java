package com.internousdev.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.shop.util.DBConnector;

public class GeneralUserRemoveDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
/*	private UserInfoDTO userInfoDTO = new UserInfoDTO();*/

	public void deleteUser(String loginUserId) throws SQLException{
		String sql="DELETE FROM login_user_transaction where login_id=?";

		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, loginUserId);

			preparedStatement.executeUpdate();
	}catch (SQLException e){
		e.printStackTrace();
	}finally{
		connection.close();
	}

}
}