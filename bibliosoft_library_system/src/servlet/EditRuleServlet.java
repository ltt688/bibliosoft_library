package servlet;

import java.io.IOException;
import java.util.List;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.rulelistDao;
import entity.Rule;
import utils.DBHelper;

public class EditRuleServlet extends HttpServlet{
	private rulelistDao ruleDao = rulelistDao.getInstance();
	String now_id;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String rule_id=now_id;
		String fine=req.getParameter("fine");
		String return_period=req.getParameter("return_period");
		String deposit=req.getParameter("deposit");
		//String type=req.getParameter("type");
		req.setAttribute("Rule_id",rule_id);
		String sql="update reader_rule set fine='"+fine+"' , return_period='"+return_period+"' , deposit='"+deposit+"' where  Rule_ID='"+rule_id+"'";
		try {

			Connection c = DBHelper.getInstance().getConnection();
			PreparedStatement ps = c.prepareStatement(sql);
			ps.execute();
			DBHelper.closeConnection(c, ps, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		req.getRequestDispatcher("Rule_Edit.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String rule_id=req.getParameter("edit_id");
		now_id=rule_id;
		req.setAttribute("Rule_id",rule_id);
		req.getRequestDispatcher("Rule_Edit.jsp").forward(req, resp);
	}
	
	
}