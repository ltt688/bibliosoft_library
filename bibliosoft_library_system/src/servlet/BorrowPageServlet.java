package servlet;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import java.sql.*;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BorrowRecordsDAO;
import entity.BorrowRecords;
import utils.DBHelper;

public class BorrowPageServlet extends HttpServlet{
	private BorrowRecordsDAO borrowRecordsDAO = BorrowRecordsDAO.getInstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("content-type", "text/html;charset=UTF-8");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		int count=borrowRecordsDAO.getTotal();
		String id=String.valueOf(count+1);
		req.setAttribute("id", id);
		req.getRequestDispatcher("borrowPage.jsp").forward(req, resp);		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("content-type", "text/html;charset=UTF-8");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		String book_id=req.getParameter("book_id");
		String reader_phone=req.getParameter("reader_phone");
		Calendar cal=Calendar.getInstance();
		java.util.Date now=cal.getTime();
		String borrow_date=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(now);
		cal.add(java.util.Calendar.DAY_OF_MONTH,15);
		java.util.Date deadline=cal.getTime();
		String deadline_date=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(deadline);
		int count=borrowRecordsDAO.getTotal();
		String borrow_id=String.valueOf(count+1);
		String sql="insert into borrow values('"+borrow_id+"','"+reader_phone+"','"+book_id+"','"+borrow_date+"','"+deadline_date+"',null,null)";
		try {

			Connection c = DBHelper.getInstance().getConnection();
			PreparedStatement ps = c.prepareStatement(sql);
			ps.execute();
			DBHelper.closeConnection(c, ps, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		resp.sendRedirect("borrowPageWeb");
	}
	
	
}
