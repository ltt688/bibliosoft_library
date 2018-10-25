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

public class repasswordServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("account");
		LibrarianDao librarianDao=new LibrarianDao();
		Librarian librarian=librarianDao.librarianifo(id);
		if(librarian==null)
		{
			req.getRequestDispatcher("Retrieve_Password.jsp?error=yes").forward(req, resp);
		}
		else{
			req.setAttribute("librarian", librarian);
			System.out.println()librarian.getManager_password();
			req.getRequestDispatcher("Retrieve_Password1.jsp").forward(req, resp);
		}
	}
	

}
