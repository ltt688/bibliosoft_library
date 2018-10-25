package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Reserve;
import utils.DBHelper;

public class ReserveDAO {

	

	

	public int getTotal() {
		int total = 0;
		try {

			Connection c = DBHelper.getInstance().getConnection();

			Statement s = c.createStatement();

			String sql = "select count(*) from reserve";

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
	

	public List<Reserve> list() {
		return list(0, Short.MAX_VALUE);
	}

	public List<Reserve> list(int start, int count) {
		List<Reserve> students = new ArrayList<Reserve>();

		try {

			Connection c = DBHelper.getInstance().getConnection();

			String sql = "select * from reserve order by id desc limit ?,? ";

			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(1, start);
			ps.setInt(2, count);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Reserve reserve=new Reserve();
				  String reserve_id=rs.getString("reserve_id");
				  String reader_phone=rs.getString("reader_phone");
				  String book_id=rs.getString("book_id");
				  String reserve_date=rs.getString("reserve_date");
				  String reserve_state=rs.getString("reserve_state");
	              reserve.setReserve_id(reserve_id);
	              reserve.setReader_phone(reader_phone);
	              reserve.setBook_id(book_id);
	              reserve.setReserve_date(reserve_date);
	              reserve.setReserve_state(reserve_state);
				students.add(reserve);
			}
			DBHelper.closeConnection(c, ps, rs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return students;
	}

}
