package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.User;
import utils.DBHelper;

public class PersonDAO {

	private PersonDAO() {
	}

	public static PersonDAO getInstance() {
		return new PersonDAO();
	}

	public int getTotal() {
		int total = 0;
		try {

			Connection c = DBHelper.getInstance().getConnection();

			Statement s = c.createStatement();

			String sql = "select count(*) from reader";

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
	

	public List<User> list() {
		return list(0, Short.MAX_VALUE);
	}

	public List<User> list(int start, int count) {
		List<User> students = new ArrayList<User>();

		try {

			Connection c = DBHelper.getInstance().getConnection();

			String sql = "select * from reader order by reader_phone desc limit ?,? ";

			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(1, start);
			ps.setInt(2, count);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				User user = new User();
				  String reader_phone=rs.getString("reader_phone");
				String reader_password=rs.getString("reader_password");
				String reader_name=rs.getString("reader_name");
				String reader_email=rs.getString("reader_email");
				String banzheng_date=rs.getString("banzheng_date");
				String yj=rs.getString("yj");
				String ljjs=rs.getString("ljjs");
				String rule_id=rs.getString("rule_id");
				String reader_birthday=rs.getString("reader_birthday");
				String reader_address=rs.getString("reader_address");
				user.setReader_phone(reader_phone);
				user.setReader_password(reader_password);
				user.setReader_name(reader_name);
				user.setReader_email(reader_email);
				user.setBanzheng_date(banzheng_date);
				user.setYj(yj);
				user.setLjjs(ljjs);
				user.setRule_id(rule_id);
				user.setReader_birthday(reader_birthday);
				user.setReader_address(reader_address);
				students.add(user);
			}
			DBHelper.closeConnection(c, ps, rs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return students;
	}

}