package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import entity.Book;
import utils.DBHelper;

public class BookDAO {
	
  private BookDAO() {
  }
  
  public static BookDAO getInstance() {
	  return new BookDAO();
  }
  
  public int getTotal() {
		int total = 0;
		try {

			Connection c = DBHelper.getInstance().getConnection();

			Statement s = c.createStatement();

			String sql = "select count(*) from bookListTable";

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
  

	public List<Book> list() {
		List<Book> books = new ArrayList<Book>();

		try {

			Connection c = DBHelper.getInstance().getConnection();

			String sql = "select * from bookListTable order by id ";

			PreparedStatement ps = c.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Book book = new Book();
				String id = rs.getString("id");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String isbn = rs.getString("isbn");
				String publisher=rs.getString("publisher");
				String book_info=rs.getString("book_info");
				String china_type=rs.getString("china_type");
				String science_type=rs.getString("science_type");
				String publish_date=rs.getString("publish_date");
				double book_price=rs.getDouble("book_price");
				String book_state=rs.getString("book_state");
				String location=rs.getString("location");
				book.setId(id);
				book.setTitle(title);
				book.setAuthor(author);
				book.setIsbn(isbn);
				book.setPublisher(publisher);
				book.setBook_info(book_info);
				book.setChina_type(china_type);
				book.setScience_type(science_type);
				book.setPublish_date(publish_date);
				book.setBook_price(book_price);
				book.setBook_state(book_state);
				book.setLocation(location);
				books.add(book);
			}
			DBHelper.closeConnection(c, ps, rs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return books;
	}
}
