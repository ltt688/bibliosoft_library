package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import entity.Librarian;
import utils.DBHelper;

public class addruleDao {

	public boolean CanAdd(String rule_id) {
		boolean returnValue = true;
		String sql = "SELECT * from reader_rule";
		try {
			Connection conn = DBHelper.getInstance().getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String userNameInDB = rs.getString("rule_id");
				if (userNameInDB.equals(rule_id)) {
					returnValue = false;
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return returnValue;
	}

	public void  addRule (String rule_id,String fine,String period,String deposit) {
		Connection connection = null;
		try {
			connection = utils.DBHelper.getInstance().getConnection();

			String sql = "insert into reader_rule values(?,?,?,?);";

			PreparedStatement ps = connection.prepareStatement(sql);

			// 运用实体对象进行参数赋值
			ps.setString(1, rule_id);
			ps.setString(2, fine);
			ps.setString(3, period);
			ps.setString(4, deposit);
			
			ps.executeUpdate();
			utils.DBHelper.closeConnection(connection, ps, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
