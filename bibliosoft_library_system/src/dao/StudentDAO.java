package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Student;
import utils.DBHelper;

public class StudentDAO {

	private StudentDAO() {
	}

	public static StudentDAO getInstance() {
		return new StudentDAO();
	}

	public int getTotal() {
		int total = 0;
		try {

			Connection c = DBHelper.getInstance().getConnection();

			Statement s = c.createStatement();

			String sql = "select count(*) from booklisttable";

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
	

	public List<Student> list() {
		return list(0, Short.MAX_VALUE);
	}

	public List<Student> list(int start, int count) {
		List<Student> students = new ArrayList<Student>();

		try {

			Connection c = DBHelper.getInstance().getConnection();

			String sql = "select * from booklisttable order by id desc limit ?,? ";

			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(1, start);
			ps.setInt(2, count);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Student student = new Student();
				  String Book_ID =rs.getString("id");  
	                String Title=rs.getString("title"); 
	                String Author=rs.getString("author");
	                String ISBN=rs.getString("isbn");  
	                String Publisher=rs.getString("publisher");  
	                String Book_info=rs.getString("book_info");  
	                String China_type=rs.getString("china_type");  
	                String Science_type=rs.getString("science_type");  
	                String Publish_date=rs.getString("publish_date");  
	                String Book_price=rs.getString("book_price");  
	                String Book_state=rs.getString("book_state");
	                String Location =rs.getString("location");
				    student.setId(Book_ID);
				    student.setTitle(Title);
				    student.setAuthor(Author);
				    student.setIsbn(ISBN);
				    student.setPublisher(Publisher);
				    student.setBook_info(Book_info);
				    student.setChina_type(China_type);
				    student.setScience_type(Science_type);
				    student.setPublish_date(Publish_date);
				    student.setBook_price(Book_price);
				    student.setBook_state(Book_state);
				    student.setLocation(Location);
				    
				students.add(student);
			}
			DBHelper.closeConnection(c, ps, rs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return students;
	}

}
