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
import dao.LibrarianDao;
import entity.Librarian;

public class retrievepasswordServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("account");
		LibrarianDao librarianDao=new LibrarianDao();
		Librarian librarian=librarianDao.librarianifo(id);
		System.out.println(librarian.getManager_name());
		req.setAttribute("librarian", librarian);
		resp.sendRedirect("Retrieve_Password1.jsp");
	}
	

}
