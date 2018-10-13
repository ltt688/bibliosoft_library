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

public class AddBookPageServlet extends HttpServlet{
	private BookDAO bookDAO = BookDAO.getInstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("content-type", "text/html;charset=UTF-8");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		int count=bookDAO.getTotal();
		String id=String.valueOf(count+1);
		req.setAttribute("id", id);
		req.getRequestDispatcher("addBookPage.jsp").forward(req, resp);		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("content-type", "text/html;charset=UTF-8");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		int count=bookDAO.getTotal();
		String id=String.valueOf(count+1);
		String title=req.getParameter("title");
		System.out.println(title);
		String author=req.getParameter("author");
		String isbn=req.getParameter("isbn");
		String publisher=req.getParameter("publisher");
		String book_info=req.getParameter("book_info");
		String china_type=req.getParameter("china_type");
		String science_type=req.getParameter("science_type");
		String publish_date=req.getParameter("publish_date");
		String book_price=req.getParameter("book_price");
		String book_state=req.getParameter("book_state");
		String location=req.getParameter("location");
		String sql="insert into bookListTable values ('"+id+"','"+title+"','"+author+"','"+isbn+"','"+publisher+"','"+book_info+"','"+china_type+"','"+science_type+"','"+publish_date+"','"+book_price+"','"+book_state+"','"+location+"')";
		
		try {

			Connection c = DBHelper.getInstance().getConnection();
			PreparedStatement ps = c.prepareStatement(sql);
			ps.execute();
			DBHelper.closeConnection(c, ps, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		count=bookDAO.getTotal();
		id=String.valueOf(count+1);
		req.setAttribute("id", id);
		req.getRequestDispatcher("addBookPage.jsp").forward(req, resp);
	}
	
	
}
