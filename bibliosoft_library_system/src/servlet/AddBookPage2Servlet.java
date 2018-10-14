package servlet;

import java.io.IOException;
import java.sql.*;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDAO;
import entity.Book;
import utils.DBHelper;
import api.GetBookInfo;

public class AddBookPage2Servlet extends HttpServlet{
	private BookDAO bookDAO = BookDAO.getInstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("content-type", "text/html;charset=UTF-8");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		int count=bookDAO.getTotal();
		String id=String.valueOf(count+1);
		req.setAttribute("id", id);
		req.getRequestDispatcher("addBookPage2.jsp").forward(req, resp);		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("content-type", "text/html;charset=UTF-8");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		int count=bookDAO.getTotal();
		String id=String.valueOf(count+1);
		String isbn=req.getParameter("isbn");
		Vector<String> book=GetBookInfo.GetByISBN(isbn);
		Iterator<String> i=book.iterator();
		String title=i.next();
		String author=i.next();
		String book_price=i.next();
		String publisher=i.next();
		String sql="insert into bookListTable values ('"+id+"','"+title+"','"+author+"','"+isbn+"','"+publisher+"',null,null,null,null,'"+book_price+"',null,null)";
		
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
		req.getRequestDispatcher("addBookPage2.jsp").forward(req, resp);
	}
	
	
}
