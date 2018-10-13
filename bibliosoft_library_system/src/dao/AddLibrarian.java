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
				String userNameInDB = rs.getString("Manager_ID");
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

	public void addUser(Librarian librarian) {
		Connection connection = null;
		try {
			connection = utils.DBHelper.getInstance().getConnection();

			String sql = "insert into Manager values(?,?,?,?,?);";

			PreparedStatement ps = connection.prepareStatement(sql);

			// 运用实体对象进行参数赋值
			ps.setString(1, librarian.getManager_ID());
			ps.setString(2, librarian.getManager_name());
			ps.setString(3, librarian.getManager_password());
			ps.setString(4, librarian.getManager_phone());
			ps.setString(5, librarian.getManager_type());
			ps.executeUpdate();
			utils.DBHelper.closeConnection(connection, ps, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
