package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LibrarianDao;
import dao.addruleDao;
import dao.rulelistDao;
import entity.Librarian;
import entity.Rule;
import utils.DBHelper;

public class  rulelistpageservlet extends HttpServlet {
	private rulelistDao rld = rulelistDao.getInstance();

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		String key=req.getParameter("key");
		List<Rule> rules = rld.search(key);
		System.out.println(rules.get(0).getdeposit());
		req.setAttribute("rules", rules); 
		req.getRequestDispatcher("Rule_List.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String delete_id = req.getParameter("delete_id");
		String sql = "delete from reader_rule where rule_id='" + delete_id + "' ";
		try {

			Connection c = DBHelper.getInstance().getConnection();
			PreparedStatement ps = c.prepareStatement(sql);
			ps.execute();
			DBHelper.closeConnection(c, ps, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		resp.sendRedirect("deleterule");
	}

}
