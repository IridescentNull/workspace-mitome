package com.internousdev.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.shop.util.DBConnector;
import com.internousdev.shop.util.DateUtil;

public class PurchaseCompleteDAO{
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private DateUtil dateUtil = new DateUtil();
	private String sql1="INSERT INTO buy_table (item_transaction_id, total_price, shipping_user_name, shipping_company_name, shipping_address1, shipping_address2, shipping_user_city, shipping_user_state, shipping_user_zip, shipping_user_country, shipping_user_phone, memory_form, storage_form, mouse_form, fruit_form, flower_form, accessories_type, deliver, user_id, insert_date) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	private String sql2="INSERT INTO pay_table (shipping_user_name, shipping_company_name, shipping_address1, shipping_address2, shipping_user_city, shipping_user_state, shipping_user_zip, shipping_user_country, shipping_user_phone, card_type, card_number, name_on_card, card_expiry_date, card_code, price, user_id, insert_date) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	public void recordGoods(int itemTransactionId, float totalPrice, String shippingUserName, String shippingCompanyName, String shippingAddress1, String shippingAddress2, String shippingUserCity, String shippingUserState, String shippingUserZIP, String shippingUserCountry, String shippingUserPhone, int memoryForm, int storageForm, int mouseForm, int fruitForm, int flowerForm, int accessoriesType, int deliver, String loginUserIdShadow) throws SQLException{
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql1);
			preparedStatement.setInt(1, itemTransactionId);
			preparedStatement.setFloat(2, totalPrice);
			preparedStatement.setString(3, shippingUserName);
			preparedStatement.setString(4, shippingCompanyName);
			preparedStatement.setString(5, shippingAddress1);
			preparedStatement.setString(6, shippingAddress2);
			preparedStatement.setString(7, shippingUserCity);
			preparedStatement.setString(8, shippingUserState);
			preparedStatement.setString(9, shippingUserZIP);
			preparedStatement.setString(10, shippingUserCountry);
			preparedStatement.setString(11, shippingUserPhone);
			preparedStatement.setInt(12, memoryForm);
			preparedStatement.setInt(13, storageForm);
			preparedStatement.setInt(14, mouseForm);
			preparedStatement.setInt(15, fruitForm);
			preparedStatement.setInt(16, flowerForm);
			preparedStatement.setInt(17, accessoriesType);
			preparedStatement.setInt(18, deliver);
			preparedStatement.setString(19, loginUserIdShadow);
			preparedStatement.setString(20, dateUtil.getDate());

			preparedStatement.execute();

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			/*connection.close(); アクションで必ずcloseすること*/
		}
	}

	public void recordPay(String shippingUserName, String shippingCompanyName, String shippingAddress1, String shippingAddress2, String shippingUserCity, String shippingUserState, String shippingUserZIP, String shippingUserCountry, String shippingUserPhone, int cardType, String cardNumber, String nameOnCard, String cardExpiryDate, short cardCode, float price, String loginUserIdShadow) throws SQLException{
	try{
		PreparedStatement preparedStatement=connection.prepareStatement(sql2);
		preparedStatement.setString(1, shippingUserName);
		preparedStatement.setString(2, shippingCompanyName);
		preparedStatement.setString(3, shippingAddress1);
		preparedStatement.setString(4, shippingAddress2);
		preparedStatement.setString(5, shippingUserCity);
		preparedStatement.setString(6, shippingUserState);
		preparedStatement.setString(7, shippingUserZIP);
		preparedStatement.setString(8, shippingUserCountry);
		preparedStatement.setString(9, shippingUserPhone);
		preparedStatement.setInt(10, cardType);
		preparedStatement.setString(11, cardNumber);
		preparedStatement.setString(12, nameOnCard);
		preparedStatement.setString(13, cardExpiryDate);
		preparedStatement.setShort(14, cardCode);
		preparedStatement.setFloat(15, price);
		preparedStatement.setString(16, loginUserIdShadow);
		preparedStatement.setString(17, dateUtil.getDate());

		preparedStatement.execute();
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		/*connection.close(); アクションで必ずcloseすること*/
	}
}


}


