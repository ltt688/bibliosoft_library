package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import entity.BorrowRecords;
import utils.DBHelper;

public class BorrowRecordsDAO {
	
  private BorrowRecordsDAO() {
  }
  
  public static BorrowRecordsDAO getInstance() {
	  return new BorrowRecordsDAO();
  }
  
  public int getTotal() {
		int total = 0;
		try {

			Connection c = DBHelper.getInstance().getConnection();

			Statement s = c.createStatement();

			String sql = "select count(*) from borrowRecordsListTable";

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
  
  public List<BorrowRecords> list() {
		return list(0, Short.MAX_VALUE);
	}

	public List<BorrowRecords> list(int start, int count) {
		List<BorrowRecords> borrowRecordses = new ArrayList<BorrowRecords>();

		try {

			Connection c = DBHelper.getInstance().getConnection();

			String sql = "select * from borrowRecordsListTable order by id desc limit ?,? ";

			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(1, start);
			ps.setInt(2, count);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				BorrowRecords borrowRecords = new BorrowRecords();
				String id = rs.getString("id");
				String phone=rs.getString("phone");
				String name = rs.getString("name");
				String book_id=rs.getString("book_id");
				String book_name=rs.getString("book_name");
				String borrow_date=rs.getString("borrow_date");
				String return_date=rs.getString("return_date");
				
				borrowRecords.setId(id);
				borrowRecords.setPhone(phone);
				borrowRecords.setName(name);
				borrowRecords.setBookId(book_id);
				borrowRecords.setBookName(book_name);
				borrowRecords.setBorrowDate(borrow_date);
				borrowRecords.setReturnDate(return_date);

				borrowRecordses.add(borrowRecords);
			}
			DBHelper.closeConnection(c, ps, rs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return borrowRecordses;
	}
	
	//
	//
	//
	//
	//
	//
	//
	
	
	//
	//
	//
	//
	//
	//
	//
	
	
	
}
