package dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import utils.DBHelper;
 
public class LoginDao {
	
	public boolean login(String account, String password) {
		boolean returnValue = false;
		String sql = "SELECT * from manager";
		try {
			Connection conn =DBHelper.getInstance().getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String userNameInDB = rs.getString("Manager_ID");
				String passwordInDB = rs.getString("Manager_password");
				if (userNameInDB.equals(account) && passwordInDB.equals(password)) {
					returnValue = true;
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return returnValue;
	}
	public boolean register(String account) {
		boolean returnValue = true;
		String sql = "SELECT * from manager";
		try {
			Connection conn =DBHelper.getInstance().getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String userNameInDB = rs.getString("Manager_ID");
				if (userNameInDB.equals(account) ) {
					returnValue =false;
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return returnValue;
	}
}