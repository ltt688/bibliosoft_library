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
public class EditLibServlet extends HttpServlet{
	private LibrarianDao librarianDao = LibrarianDao.getInstance();
	String now_id;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=now_id;
		String name=req.getParameter("name");
		String phone=req.getParameter("phone");
		String password=req.getParameter("validation_password");
		String type=req.getParameter("type");
		req.setAttribute("Librarian_id",id);
		String sql="update manager set Manager_name='"+name+"' , Manager_phone='"+phone+"' , Manager_password='"+password+"' where 	Manager_ID='"+id+"'";
		try {

			Connection c = DBHelper.getInstance().getConnection();
			PreparedStatement ps = c.prepareStatement(sql);
			ps.execute();
			DBHelper.closeConnection(c, ps, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		req.getRequestDispatcher("Librarian_Edit2.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("edit_id");
		now_id=id;
		req.setAttribute("Librarian_id",id);
		req.getRequestDispatcher("Librarian_Edit2.jsp").forward(req, resp);
	}
	
	
}