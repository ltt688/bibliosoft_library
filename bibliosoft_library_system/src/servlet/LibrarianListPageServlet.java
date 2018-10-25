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

public class LibrarianListPageServlet extends HttpServlet {
	private LibrarianDao librarianDao = LibrarianDao.getInstance();

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		String key=req.getParameter("key");
		List<Librarian> librarians = librarianDao.search(key);
		

		req.setAttribute("librarians", librarians); 
		
		req.getRequestDispatcher("Librarian_List.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String delete_id = req.getParameter("delete_id");
		String sql = "delete from manager where Manager_ID='" + delete_id + "' ";
		try {

			Connection c = DBHelper.getInstance().getConnection();
			PreparedStatement ps = c.prepareStatement(sql);
			ps.execute();
			DBHelper.closeConnection(c, ps, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		resp.sendRedirect("LibrarianList");
	}

}
