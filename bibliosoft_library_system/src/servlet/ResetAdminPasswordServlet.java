package servlet;

import java.io.IOException;
import java.util.List;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LibrarianDao;
import entity.Librarian;
import utils.DBHelper;
public class ResetAdminPasswordServlet extends HttpServlet{
	String now_id;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String password=req.getParameter("validation_password");
		String sql="update manager set Manager_password='"+password+"'  where Manager_type='admin'";
		try {

			Connection c = DBHelper.getInstance().getConnection();
			PreparedStatement ps = c.prepareStatement(sql);
			ps.execute();
			DBHelper.closeConnection(c, ps, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		req.getRequestDispatcher("Account_Edit.jsp").forward(req, resp);
	}
}
