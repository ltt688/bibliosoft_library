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

import dao.ReaderRequrementsDAO;
import entity.ReaderRequrements;
import utils.DBHelper;

public class ReaderRequrementsServlet extends HttpServlet{
	private ReaderRequrementsDAO readerRequrementsDAO = ReaderRequrementsDAO.getInstance();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		int start = 0;
		int count = 5;

		try {
			start = Integer.parseInt(req.getParameter("start"));
		} catch (NumberFormatException e) {
		}
		List<ReaderRequrements> readerRequrementses = readerRequrementsDAO.list(start, count);
		req.setAttribute("readerRequrementses", readerRequrementses);
		req.getRequestDispatcher("readerRequrements.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String delete_id=req.getParameter("delete_id");
		String sql="delete from readerListTable where id='"+delete_id+"' ";
		try {
			Connection c = DBHelper.getInstance().getConnection();
			PreparedStatement ps = c.prepareStatement(sql);
			ps.execute();
			DBHelper.closeConnection(c, ps, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		resp.sendRedirect("readerRequrementsWeb");
	}
	}
	
    
	

