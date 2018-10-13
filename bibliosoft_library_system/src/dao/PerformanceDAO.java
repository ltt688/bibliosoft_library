package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import entity.Performance;
import utils.DBHelper;

public class PerformanceDAO {
	private PerformanceDAO() {
	  }
	  
	  public static PerformanceDAO getInstance() {
		  return new PerformanceDAO();
	  }
	
	public int getTotal() {
		int total = 0;
		try {

			Connection c = DBHelper.getInstance().getConnection();

			Statement s = c.createStatement();

			String sql = "select count(*) from performance_recording";

			ResultSet rs = s.executeQuery(sql);
			while (rs.next()) {
				total = rs.getInt(1);
			}

			DBHelper.closeConnection(c, s, rs);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
  
  public List<Performance> list() {
		return list(0, Short.MAX_VALUE);
	}

	public List<Performance> list(int start, int count) {
		List<Performance> pfs = new ArrayList<Performance>();

		try {

			Connection c = DBHelper.getInstance().getConnection();

			String sql = "select * from performance_recording order by id desc limit ?,? ";

			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(1, start);
			ps.setInt(2, count);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Performance pf=new Performance();
				String id = rs.getString("id");
				String account = rs.getString("account");
				String performance = rs.getString("performance");
				String date=rs.getString("date");
				String object=rs.getString("object");
				pf.setId(id);
				pf.setAccount(account);
				pf.setPerformance(performance);
				pf.setDate(date);
				pf.setObject(object);
				pfs.add(pf);
			}
			DBHelper.closeConnection(c, ps, rs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pfs;
	}
}
