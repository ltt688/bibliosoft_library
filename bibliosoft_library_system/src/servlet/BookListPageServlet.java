package servlet;

import java.io.IOException;
import java.sql.*;
import java.util.List;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.BookDAO;
import dao.PerformanceDAO;
import entity.Book;
import utils.DBHelper;
import api.GetBookInfo;

public class BookListPageServlet extends HttpServlet{
	private BookDAO bookDAO = BookDAO.getInstance();
	private PerformanceDAO performanceDAO=PerformanceDAO.getInstance();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("content-type", "text/html;charset=UTF-8");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		int start = 0;
		int count = 5;

		try {
			start = Integer.parseInt(req.getParameter("start"));
		} catch (NumberFormatException e) {
		}
		List<Book> books = bookDAO.list(start, count);
		req.setAttribute("books", books);
		req.getRequestDispatcher("bookListPage.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("content-type", "text/html;charset=UTF-8");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		String delete_id=req.getParameter("delete_id");
		String info=null;
		try {
			Connection c = DBHelper.getInstance().getConnection();
			String sql3="select * from booklisttable where id='"+delete_id+"'";
			PreparedStatement ps3 = c.prepareStatement(sql3);
			ResultSet rs=ps3.executeQuery();
			while (rs.next()) {
			info="book ¡¶"+rs.getString("title")+"¡·";
			}
			DBHelper.closeConnection(c, ps3, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String sql="delete from bookListTable where id='"+delete_id+"' ";
		int id=performanceDAO.getTotal()+1;
		String sql2="insert into performance_recording values('"+id+"','acc','delete','"+info+"','10.1')";
		try {
			Connection c = DBHelper.getInstance().getConnection();
			PreparedStatement ps = c.prepareStatement(sql);
			ps.execute();
			PreparedStatement ps2 = c.prepareStatement(sql2);
			ps2.execute();
			DBHelper.closeConnection(c, ps, null);
			DBHelper.closeConnection(c, ps2, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		resp.sendRedirect("bookListPageWeb");
	}
	
}
