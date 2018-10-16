package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
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

		int start = 0;
		int count = 5;

		try {
			start = Integer.parseInt(req.getParameter("start"));
		} catch (NumberFormatException e) {
		}
		List<BorrowRecords> borrowRecordses = borrowRecordsDAO.list(start, count);
		req.setAttribute("borrowRecordses", borrowRecordses);
		req.getRequestDispatcher("borrowRecordsPage.jsp").forward(req, resp);
	}
	

	
}
