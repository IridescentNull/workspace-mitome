package com.internousdev.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.shop.dto.PurchaseHistoryDTO;
import com.internousdev.shop.util.DBConnector;

public class PurchaseHistoryDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();

	public ArrayList<PurchaseHistoryDTO> getPurchaseHistory(String loginUserIdShadow) throws SQLException{
	ArrayList<PurchaseHistoryDTO> purchaseHistoryDTO = new ArrayList<PurchaseHistoryDTO>();

	String sql = "SELECT * FROM buy_table WHERE user_id = ?";

	try{
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, loginUserIdShadow);

		ResultSet resultSet = preparedStatement.executeQuery();

		while(resultSet.next()){
			PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
			dto.setItemTransactionId(resultSet.getInt("item_transaction_id"));
			dto.setTotalPrice3(resultSet.getFloat("total_price"));
			dto.setShippingUserName(resultSet.getString("shipping_user_name"));
			dto.setShippingCompanyName(resultSet.getString("shipping_company_name"));
			dto.setShippingAddress1(resultSet.getString("shipping_address1"));
			dto.setShippingAddress2(resultSet.getString("shipping_address2"));
			dto.setShippingUserCity(resultSet.getString("shipping_user_city"));
			dto.setShippingUserState(resultSet.getString("shipping_user_state"));
			dto.setShippingUserZIP(resultSet.getString("shipping_user_zip"));
			dto.setShippingUserCountry(resultSet.getString("shipping_user_country"));
			dto.setShippingUserPhone(resultSet.getString("shipping_user_phone"));
			dto.setMemoryForm(resultSet.getInt("memory_form"));
			dto.setStorageForm(resultSet.getInt("storage_form"));
			dto.setMouseForm(resultSet.getInt("mouse_form"));
			dto.setFruitForm(resultSet.getInt("fruit_form"));
			dto.setFlowerForm(resultSet.getInt("flower_form"));
			dto.setAccessoriesType(resultSet.getInt("accessories_type"));
			dto.setDeliver(resultSet.getInt("deliver"));
			dto.setLoginUserIdShadow(resultSet.getString("user_id"));
			dto.setInsertDate(resultSet.getString("insert_date"));
			purchaseHistoryDTO.add(dto);
			System.out.println(dto.getTotalPrice3());
			System.out.println(purchaseHistoryDTO);


		}
	}catch(Exception e){
		e.printStackTrace();
	}finally {
		connection.close();
	}

	return purchaseHistoryDTO;
}
}
