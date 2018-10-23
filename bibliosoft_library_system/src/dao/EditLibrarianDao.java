package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utils.DBHelper;

public class EditLibrarianDao {

	public boolean CanEdit(String account) {
		boolean returnValue = false;
		String sql = "SELECT * from Manager";
		try {
			Connection conn = DBHelper.getInstance().getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String userNameInDB = rs.getString("Manager_ID");
				if (userNameInDB.equals(account)) {
					returnValue = true;
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return returnValue;
	}

	public boolean update(String name, String password, String phone, String type, String account) {
		boolean jian = false;
		try {

			Connection c = DBHelper.getInstance().getConnection();

			String sql = "update user_login set Manager_name=? Manager_password=? Manager_phone Manager_type=?  where Manager_ID=? ";
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ps.setString(3, phone);
			ps.setString(4, type);
			ps.setString(5, account);

			ps.executeUpdate();

			jian = true;
			DBHelper.closeConnection(c, ps, null);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return jian;
	}
	public boolean updateadmin(String name,String phone,String type,String account)
	{
		boolean jian = false;
		try {

			Connection c = DBHelper.getInstance().getConnection();

			String sql = "update user_login set Manager_name=?  Manager_phone Manager_type=?  where Manager_ID=? ";
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, phone);
			ps.setString(3, type);
			ps.setString(4, account);

			ps.executeUpdate();

			jian = true;
			DBHelper.closeConnection(c, ps, null);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return jian;
	}

}
