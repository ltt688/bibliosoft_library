package servlet;

import java.io.IOException;

import java.io.PrintWriter;

import java.sql.Connection;

 

import javax.servlet.RequestDispatcher;

import javax.servlet.ServletContext;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;

 

import dao.UserDao;

import bean.User;

import utils.DBUtil;



 

import java.io.IOException;

import java.io.PrintWriter;

import java.sql.Connection;

 

import javax.servlet.RequestDispatcher;

import javax.servlet.ServletContext;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;

 

import dao.UserDao;

import bean.User;

import utils.DBUtil;

 

public class LoginServlet  extends HttpServlet{

 

	/**

	 * 

	 */

	private static final long serialVersionUID = 1L;

 

	private DBUtil dbUtil = new DBUtil();

	private UserDao userDao = new UserDao();

	

	@Override

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.doPost(request, response);

	}

 

	@Override

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String reader_phone = request.getParameter("reader_phone");

		String reader_password = request.getParameter("reader_password");

		Connection con=null;

		try {

			User user = new User(reader_phone,reader_password);

			con = dbUtil.getCon();

			User currentUser = userDao.login(con, user);

			if (null == currentUser) {

				request.setAttribute("error", "ERROR Incorrect username or password!");

				request.setAttribute("reader_phone", reader_phone);

				request.setAttribute("reader_password", reader_password);

				RequestDispatcher dispatcher = request.getRequestDispatcher("ReaderLogin.jsp");

				dispatcher.forward(request, response);

			}else {

				HttpSession session = request.getSession();

				session.setAttribute("currentUser",currentUser);

				response.sendRedirect("ReaderUsermain.jsp");

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

 	}

 

 

}
 

