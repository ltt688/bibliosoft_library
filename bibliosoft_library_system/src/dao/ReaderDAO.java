package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import entity.Reader;
import utils.DBHelper;

public class ReaderDAO {
	
  private ReaderDAO() {
  }
  
  public static ReaderDAO getInstance() {
	  return new ReaderDAO();
  }
  
  public int getTotal() {
		int total = 0;
		try {

			Connection c = DBHelper.getInstance().getConnection();

			Statement s = c.createStatement();

			String sql = "select count(*) from readerListTable";

			ResultSet rs = s.executeQuery(sql);
			while (rs.next()) {
				total = rs.getInt(1);
			}

			System.out.println("total:" + total);

			DBHelper.closeConnection(c, s, rs);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
  
  public List<Reader> list() {
		return list(0, Short.MAX_VALUE);
	}

	public List<Reader> list(int start, int count) {
		List<Reader> readers = new ArrayList<Reader>();

		try {

			Connection c = DBHelper.getInstance().getConnection();

			String sql = "select * from readerlisttable order by id desc limit ?,? ";

			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(1, start);
			ps.setInt(2, count);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Reader reader = new Reader();
				String id = rs.getString("id");
				String name = rs.getString("reader_name");
				String password=rs.getString("reader_password");
				String phone=rs.getString("reader_phone");
				String shengxiao_date=rs.getString("shengxiao_date");
				String banzheng_date=rs.getString("banzheng_date");
				String daoqi_date=rs.getString("daoqi_date");
				String yj=rs.getString("yj");
				String email=rs.getString("reader_email");
				String Ljjs=rs.getString("ljjs");
				String rule_id=rs.getString("rule_id");
				
				
				int ljjs=Integer.parseInt(Ljjs);
				reader.setID(id);
				reader.setName(name);
				reader.setPassword(password);
				reader.setPhone(phone);
				reader.setBanZheng_date(banzheng_date);
				reader.setShengXiao_date(shengxiao_date);
				reader.setDaoQi_date(daoqi_date);
				reader.setYj(yj);
				reader.setEmail(email);
				reader.setLjjs(ljjs);
				reader.setRule_id(rule_id);
				readers.add(reader);
			}
			DBHelper.closeConnection(c, ps, rs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return readers;
	}
}
