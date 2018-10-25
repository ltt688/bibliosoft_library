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

			String sql = "select count(*) from borrow";

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
  

	public List<BorrowRecords> list() {
		List<BorrowRecords> borrowRecordses = new ArrayList<BorrowRecords>();

		try {

			Connection c = DBHelper.getInstance().getConnection();

			String sql = "select * from borrow order by borrow_id  ";

			PreparedStatement ps = c.prepareStatement(sql);


			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				BorrowRecords borrowRecords = new BorrowRecords();
				String borrow_id = rs.getString("borrow_id");
				String reader_phone=rs.getString("reader_phone");
				String book_id = rs.getString("book_id");
				String borrow_date=rs.getString("borrow_date");
				String deadline_date=rs.getString("deadline_date");
				String return_date=rs.getString("return_date");
				String borrow_state=rs.getString("borrow_state");
				
				borrowRecords.setBorrow_id(borrow_id);
				borrowRecords.setReader_phone(reader_phone);
				borrowRecords.setBook_id(book_id);
				borrowRecords.setBorrow_date(borrow_date);
				borrowRecords.setDeadline_date(deadline_date);
				borrowRecords.setReturn_date(return_date);
				borrowRecords.setBorrow_state(borrow_state);

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
