package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PerformanceDAO;
import entity.Performance;
import utils.DBHelper;

public class PerformancePageServlet extends HttpServlet{
	private PerformanceDAO performanceDAO = PerformanceDAO.getInstance();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");

		int start = 0;
		int count = 5;

		try {
			start = Integer.parseInt(req.getParameter("start"));
		} catch (NumberFormatException e) {
		}
		List<Performance> pfs = performanceDAO.list(start, count);
		req.setAttribute("pfs", pfs);
		req.getRequestDispatcher("performancePage.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("performancePage.jsp").forward(req, resp);
	}
	
}
