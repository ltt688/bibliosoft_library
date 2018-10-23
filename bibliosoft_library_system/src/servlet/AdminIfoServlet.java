package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LibrarianDao;
import entity.Librarian;
import utils.DBHelper;

public class AdminIfoServlet extends HttpServlet {
	private LibrarianDao librarianDao = LibrarianDao.getInstance();

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		Librarian librarian=librarianDao.ifo();

		req.setAttribute("librarian", librarian); 
		req.getRequestDispatcher("Account_Information.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String account=req.getParameter("account");
		String name=req.getParameter("name");
		String phone=req.getParameter("phone");
		String type=req.getParameter("type");
		String sql="update manager set Manager_name='"+name+"' , Manager_phone='"+phone+"' , Manager_type='"+type+"' where 	Manager_ID='"+account+"'";
		try {

			Connection c = DBHelper.getInstance().getConnection();
			PreparedStatement ps = c.prepareStatement(sql);
			ps.execute();
			DBHelper.closeConnection(c, ps, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Librarian librarian=librarianDao.ifo();
		req.setAttribute("librarian", librarian); 
		req.getRequestDispatcher("Account_Information.jsp").forward(req, resp);

	}

}