package servlet;

import java.io.IOException;
import java.sql.*;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.BookDAO;
import dao.PerformanceDAO;
import entity.Book;
import entity.BorrowRecords;
import utils.DBHelper;
import api.GetBookInfo;

public class BookListPageServlet extends HttpServlet{
	private BookDAO bookDAO = BookDAO.getInstance();
	private PerformanceDAO performanceDAO=PerformanceDAO.getInstance();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("content-type", "text/html;charset=UTF-8");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		List<Book> books = bookDAO.list();
		req.setAttribute("books", books);
		req.getRequestDispatcher("bookListPage.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("content-type", "text/html;charset=UTF-8");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		int showAll=0;
		String v=req.getParameter("book_name_search");
		String delete_id=req.getParameter("delete_id");
		if (delete_id==null)
		{
		List<Book> books = bookDAO.list();
		List<Book> showBooks=new ArrayList<Book>();
	    Iterator i=books.iterator();
		if (v.isEmpty())
		{
			showAll=1;
		}
		else
	 	{
	    while (i.hasNext())
	    {
	    	 Book now=(Book)i.next();
	    	 String vid=now.getTitle();
	    	 if (vid.equals(v))
	    	 {
	    		 showBooks.add(now);
	    	 }
	    }
		}
	    if (showAll==1)
	    {
	    	req.setAttribute("books", books);
	    req.getRequestDispatcher("bookListPage.jsp").forward(req, resp);
	    }
	    else
	    {
	    req.setAttribute("books", showBooks);
	    req.getRequestDispatcher("bookListPage.jsp").forward(req, resp);
	    }
		}
	
		if (delete_id!=null)
		{	
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
			resp.sendRedirect("bookListPageWeb");
			DBHelper.closeConnection(c, ps, null);
			DBHelper.closeConnection(c, ps2, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	}
	
}
