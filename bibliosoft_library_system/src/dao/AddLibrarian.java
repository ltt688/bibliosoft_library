package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import entity.Librarian;
import utils.DBHelper;

public class AddLibrarian {

	public boolean CanAdd(String account) {
		boolean returnValue = true;
		String sql = "SELECT * from Manager";
		try {
			Connection conn = DBHelper.getInstance().getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String userNameInDB = rs.getString("manager_id");
				if (userNameInDB.equals(account)) {
					returnValue = false;
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return returnValue;
	}

	public void addUser(String account,String name,String password,String phone,String type) {
		Connection connection = null;
		try {
			connection = utils.DBHelper.getInstance().getConnection();

			String sql = "insert into manager values(?,?,?,?,?);";

			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setString(1, account);
			ps.setString(2, name);
			ps.setString(3, password);
			System.out.println(password);
			ps.setString(4, phone);
			ps.setString(5, type);
			ps.executeUpdate();
			utils.DBHelper.closeConnection(connection, ps, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
