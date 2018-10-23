package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import entity.Librarian;
import utils.DBHelper;

public class LibrarianDao {

	private void LibrarianDAO() {
	}

	public static LibrarianDao getInstance() {
		return new LibrarianDao();
	}

	public int getTotal() {
		int total = 0;
		try {

			Connection c = DBHelper.getInstance().getConnection();

			Statement s = c.createStatement();

			String sql = "select count(*) from manager";

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

	public List<Librarian> list() {
		return list(0, Short.MAX_VALUE);
	}

	public List<Librarian> list(int start, int count) {
		List<Librarian> librarians = new ArrayList<Librarian>();

		try {

			Connection c = DBHelper.getInstance().getConnection();

			String sql = "select * from manager order by manager_id desc limit ?,? ";

			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(1, start);

			ps.setInt(2, count);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Librarian librarian = new Librarian();

				librarian.setManager_ID(rs.getString("Manager_ID"));
				librarian.setManager_name(rs.getString("Manager_name"));
				librarian.setManager_phone(rs.getString("Manager_phone"));
				librarian.setManager_type(rs.getString("Manager_type"));
				librarian.setManager_password(rs.getString("Manager_password"));

				librarians.add(librarian);
			}
			DBHelper.closeConnection(c, ps, rs);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return librarians;
	}
	
	public Librarian ifo()
	{
		Librarian librarian = new Librarian();
		try {

			Connection c = DBHelper.getInstance().getConnection();

			String sql = "select * from manager where Manager_type='admin'";

			PreparedStatement ps = c.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				librarian.setManager_ID(rs.getString("Manager_ID"));
				librarian.setManager_name(rs.getString("Manager_name"));
				librarian.setManager_phone(rs.getString("Manager_phone"));
				librarian.setManager_type(rs.getString("Manager_type"));
				librarian.setManager_password(rs.getString("Manager_password"));
				System.out.println(librarian.getManager_ID());
			}
			DBHelper.closeConnection(c, ps, rs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return librarian;

	}
	public Librarian librarianifo(String id)
	{
		Librarian librarian = new Librarian();
		try {

			Connection c = DBHelper.getInstance().getConnection();

			String sql = "select * from manager where Manager_id='"+id+"'";

			PreparedStatement ps = c.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				librarian.setManager_ID(rs.getString("Manager_ID"));
				librarian.setManager_name(rs.getString("Manager_name"));
				librarian.setManager_phone(rs.getString("Manager_phone"));
				librarian.setManager_type(rs.getString("Manager_type"));
				librarian.setManager_password(rs.getString("Manager_password"));
				System.out.println(librarian.getManager_ID());
			}
			DBHelper.closeConnection(c, ps, rs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return librarian;

	}
}
