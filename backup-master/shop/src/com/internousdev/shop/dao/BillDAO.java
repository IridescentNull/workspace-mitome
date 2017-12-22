package com.internousdev.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.shop.dto.PayInfoDTO;
import com.internousdev.shop.util.DBConnector;

public class BillDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();

	public ArrayList<PayInfoDTO> getPayInfo() throws SQLException{
		ArrayList<PayInfoDTO> payInfoDTOList = new ArrayList<PayInfoDTO>();
		String sql = "SELECT * FROM pay_table";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				PayInfoDTO payInfoDTO = new PayInfoDTO();
				payInfoDTO.setId(resultSet.getInt("id"));
				payInfoDTO.setShippingUserName(resultSet.getString("shipping_user_name"));
				payInfoDTO.setShippingCompanyName(resultSet.getString("shipping_company_name"));
				payInfoDTO.setShippingAddress1(resultSet.getString("shipping_address1"));
				payInfoDTO.setShippingAddress2(resultSet.getString("shipping_address2"));
				payInfoDTO.setShippingUserCity(resultSet.getString("shipping_user_city"));
				payInfoDTO.setShippingUserState(resultSet.getString("shipping_user_state"));
				payInfoDTO.setShippingUserZIP(resultSet.getString("shipping_user_zip"));
				payInfoDTO.setShippingUserCountry(resultSet.getString("shipping_user_country"));
				payInfoDTO.setShippingUserPhone(resultSet.getString("shipping_user_phone"));
				payInfoDTO.setCardType(resultSet.getInt("card_type"));
				payInfoDTO.setCardNumber(resultSet.getString("card_number"));
				payInfoDTO.setNameOnCard(resultSet.getString("name_on_card"));
				payInfoDTO.setCardExpiryDate(resultSet.getString("card_expiry_date"));
				payInfoDTO.setCardCode((short)resultSet.getInt("card_code"));
				payInfoDTO.setPrice(resultSet.getFloat("price"));
				payInfoDTO.setLoginUserId(resultSet.getString("user_id"));
				payInfoDTO.setInsertTime(resultSet.getString("insert_date"));
				payInfoDTOList.add(payInfoDTO);
			}

		}catch(Exception e){
			e.printStackTrace();
		}
		return payInfoDTOList;
	}

}
