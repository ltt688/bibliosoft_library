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

public class ReturnPageServlet extends HttpServlet{
	private BorrowRecordsDAO borrowRecordsDAO = BorrowRecordsDAO.getInstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("content-type", "text/html;charset=UTF-8");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");	
		req.getRequestDispatcher("returnBookPage.jsp").forward(req, resp);
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
		String return_date=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(now);
		String sql="update borrow set return_date='"+return_date+"',borrow_state='1' where book_id='"+book_id+"' and reader_phone='"+reader_phone+"'";
		try {

			Connection c = DBHelper.getInstance().getConnection();
			PreparedStatement ps = c.prepareStatement(sql);
			ps.execute();
			DBHelper.closeConnection(c, ps, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		resp.sendRedirect("returnPageWeb");
	}
	
	
}
