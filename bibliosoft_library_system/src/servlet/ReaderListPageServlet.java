package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ReaderDAO;
import entity.Book;
import entity.Reader;
import utils.DBHelper;

public class ReaderListPageServlet extends HttpServlet{
	private ReaderDAO readerDAO = ReaderDAO.getInstance();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		List<Reader> readers = readerDAO.list();
		req.setAttribute("readers", readers);
		req.getRequestDispatcher("readerListPage.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int showAll=0;
		String v=req.getParameter("reader_phone_search");
		String delete_id=req.getParameter("delete_id");
		if (delete_id==null)
		{
		List<Reader> readers = readerDAO.list();
		List<Reader> showReaders=new ArrayList<Reader>();
	    Iterator i=readers.iterator();
		if (v.isEmpty())
		{
			showAll=1;
		}
		else
	 	{
	    while (i.hasNext())
	    {
	    	 Reader now=(Reader)i.next();
	    	 String vid=now.getPhone();
	    	 if (vid.equals(v))
	    	 {
	    		 showReaders.add(now);
	    	 }
	    }
		}
	    if (showAll==1)
	    {
	    	req.setAttribute("readers", readers);
	    req.getRequestDispatcher("readerListPage.jsp").forward(req, resp);
	    }
	    else
	    {
	    req.setAttribute("readers", showReaders);
	    req.getRequestDispatcher("readerListPage.jsp").forward(req, resp);
	    }
		}
		
		
		if (delete_id!=null)
		{
		String sql="delete from readerListTable where id='"+delete_id+"' ";
		try {
			Connection c = DBHelper.getInstance().getConnection();
			PreparedStatement ps = c.prepareStatement(sql);
			ps.execute();
			DBHelper.closeConnection(c, ps, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		resp.sendRedirect("readerListPageWeb");
		}
	}
	
}
