package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Publish;
import utils.DBHelper;

public class PublishDAO {

	

	public int getTotal() {
		int total = 0;
		try {

			Connection c = DBHelper.getInstance().getConnection();

			Statement s = c.createStatement();

			String sql = "select count(*) from publish";

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
	

	public List<Publish> list() {
		return list(0, Short.MAX_VALUE);
	}

	public List<Publish> list(int start, int count) {
		List<Publish> students = new ArrayList<Publish>();

		try {

			Connection c = DBHelper.getInstance().getConnection();

			String sql = "select * from publish order by id desc limit ?,? ";

			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(1, start);
			ps.setInt(2, count);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Publish publish = new Publish();
				    String publish_id=rs.getString("publish_id");
				    String reader_phone=rs.getString("reader_phone");
				    String book_id=rs.getString("book_id");
				    String publish_reason=rs.getString("publish_reason");
				    String publish_result=rs.getString("publish_result");
				    String publish_price=rs.getString("publish_price");
				    publish.setPublish_id(publish_id);
				    publish.setReader_phone(reader_phone);
				    publish.setBook_id(book_id);
				    publish.setPublish_reason(publish_reason);
				    publish.setPublish_result(publish_result);
				    publish.setPublish_price(publish_price);	    
				students.add(publish);
			}
			DBHelper.closeConnection(c, ps, rs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return students;
	}

}
