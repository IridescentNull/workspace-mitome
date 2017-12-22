package com.internousdev.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.shop.util.DBConnector;

public class BuyHistoryRemoveDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();

	public void deleteBuyHistory(int id) throws SQLException{
		String sql="DELETE FROM buy_table where id=?";
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);

			preparedStatement.executeUpdate();
	}catch (SQLException e){
		e.printStackTrace();
	}finally{
		connection.close();
	}

	}

}