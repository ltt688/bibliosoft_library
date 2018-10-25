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

import dao.BorrowRecordsDAO;
import entity.BorrowRecords;
import utils.DBHelper;

public class BorrowRecordsPageServlet extends HttpServlet{
	private BorrowRecordsDAO borrowRecordsDAO = BorrowRecordsDAO.getInstance();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		List<BorrowRecords> borrowRecordses = borrowRecordsDAO.list();
		req.setAttribute("borrowRecordses", borrowRecordses);
		req.getRequestDispatcher("borrowRecordsPage.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int showAll=0;
		String v=req.getParameter("reader_phone_search");
		if (v.isEmpty())
		{
			showAll=1;
		}
		List<BorrowRecords> borrowRecordses = borrowRecordsDAO.list();
		List<BorrowRecords> showRecordses=new ArrayList<BorrowRecords>();
	    Iterator i=borrowRecordses.iterator();
	    while (i.hasNext())
	    {
	    	 BorrowRecords now=(BorrowRecords)i.next();
	    	 String vid=now.getReader_phone();
	    	 if (vid.equals(v))
	    	 {
	    		 showRecordses.add(now);
	    	 }
	    }
	    if (showAll==1)
	    {
	    	req.setAttribute("borrowRecordses", borrowRecordses);
	    }
	    else
	    {
	    req.setAttribute("borrowRecordses", showRecordses);
	    }
		req.getRequestDispatcher("borrowRecordsPage.jsp").forward(req, resp);
	}
	
    
	
}
