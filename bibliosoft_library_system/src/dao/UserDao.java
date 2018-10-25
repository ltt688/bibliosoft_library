package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

 

import bean.User;

 

public class UserDao {

	public User login(Connection con,User user) throws Exception{

		User resultUser = null;

		String sql = "select * from reader where reader_phone=? and reader_password=?";

		PreparedStatement pstmt = con.prepareStatement(sql);

		pstmt.setString(1, user.getReader_phone());

		pstmt.setString(2, user.getReader_password());

		ResultSet rs =  pstmt.executeQuery();

		if (rs.next()) {

			resultUser = new User();

			resultUser.setReader_phone(rs.getString("reader_phone"));

			resultUser.setReader_password(rs.getString("reader_password"));

			resultUser.setReader_name(rs.getString("reader_name"));
			
			resultUser.setReader_email(rs.getString("reader_email"));

			resultUser.setYj(rs.getString("yj"));
			
			resultUser.setBanzheng_date(rs.getString("banzheng_date"));

			resultUser.setLjjs(rs.getString("ljjs"));
			
			resultUser.setRule_id(rs.getString("rule_id"));

		}

		return resultUser;

	}

}
