package com.internousdev.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.shop.dto.LoginDTO;
import com.internousdev.shop.util.DBConnector;
import com.internousdev.shop.util.DateUtil;

public class PasswordChangeCompleteDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private DateUtil dateUtil = new DateUtil();
	private LoginDTO loginDTO = new LoginDTO();
	private boolean passcheck = false;



	public LoginDTO getLoginUserInfo(String loginUserId, String loginPassword){


		String sql1="SELECT * FROM login_user_transaction where login_id=? AND login_pass=?";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql1);
			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginPassword);

			ResultSet resultSet=preparedStatement.executeQuery();

			if(resultSet.next()){
				loginDTO.setLoginId(resultSet.getString("login_id"));
				loginDTO.setLoginPassword(resultSet.getString("login_pass"));
				loginDTO.setUserName(resultSet.getString("user_name"));//この行要らんかも

				if(!(resultSet.getString("login_id").equals(null))){
					loginDTO.setLoginFlg(true);//そもそもいきなりtrueにしたほうがいい？
					setPasscheck(true);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return loginDTO;
	}


	public void passwordChange(String loginUserId, String newLoginPassword)throws SQLException{

		String sql2="UPDATE login_user_transaction SET login_pass=?, updated_date=? WHERE login_id = ?";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql2);
			preparedStatement.setString(1, newLoginPassword);
			preparedStatement.setString(2, dateUtil.getDate());
			preparedStatement.setString(3, loginUserId);

			preparedStatement.execute();
		}catch(Exception e){
			e.printStackTrace();


		}finally{
			connection.close();
		}
	}

	public LoginDTO getLoginDTO(){
		return loginDTO;
	}


	public boolean isPasscheck() {
		return passcheck;
	}


	public void setPasscheck(boolean passcheck) {
		this.passcheck = passcheck;
	}

}
