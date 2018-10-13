package servlet;

import java.io.IOException;
import java.util.List;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDAO;
import entity.Book;
import utils.DBHelper;
public class EditBookPageServlet extends HttpServlet{
	private BookDAO bookDAO = BookDAO.getInstance();
	String now_id;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=now_id;
		String title=req.getParameter("title");
		String author=req.getParameter("author");
		String isbn=req.getParameter("isbn");
		String publisher=req.getParameter("publisher");
		String book_info=req.getParameter("book_info");
		String china_type=req.getParameter("china_type");
		String science_type=req.getParameter("sicence_type");
		String publish_date=req.getParameter("publish_date");
		String book_price=req.getParameter("book_price");
		String book_state=req.getParameter("book_state");
		String location=req.getParameter("location");
		req.setAttribute("book_id",id);
		String sql="update bookListTable set title='"+title+"' , author='"+author+"' , isbn='"+isbn+"' , publisher='"+publisher+"', book_info='"+book_info+"' , china_type='"+china_type+"' , science_type='"+science_type+"' , publish_date='"+publish_date+"' , book_price='"+book_price+"' , book_state='"+book_state+"' , location='"+location+"' where id='"+id+"'";
		try {

			Connection c = DBHelper.getInstance().getConnection();
			PreparedStatement ps = c.prepareStatement(sql);
			ps.execute();
			DBHelper.closeConnection(c, ps, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		req.getRequestDispatcher("bookListPageWeb").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("edit_id");
		now_id=id;
		req.setAttribute("book_id",id);
		req.getRequestDispatcher("editBookPage.jsp").forward(req, resp);
	}
	
	
}
