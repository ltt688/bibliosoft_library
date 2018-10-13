package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entity.Librarian;
import dao.addruleDao;

/**
 * Servlet implementation class RegisterServlet
 */
public class ruleservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ruleservlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String rule_id = request.getParameter("rule_id");
		String fine = request.getParameter("fine");
		String period = request.getParameter("period");
		String deposit = request.getParameter("deposit");
		addruleDao ld=new addruleDao();
		boolean can =ld.CanAdd(rule_id);
		if (can) {
			ld.addRule(rule_id, fine, period, deposit);
			response.sendRedirect("Rule_Add.jsp?tishi=yes");
		} else {
			response.sendRedirect("Rule_Add.jsp?tishi=no");
		}
		/*
		 * LoginDao ld=new LoginDao(); boolean canregister
		 * =ld.register(account); if(canregister){ user user=new user();
		 * user.setUseraccount(account);; user.setName(name);
		 * user.setPassword(password); userDAO userDAO=new userDAO();
		 * userDAO.addUser(user); response.sendRedirect("login.jsp？tishi=yes");
		 * }
		 * 
		 * else { response.sendRedirect("register.jsp？error=yes"); }
		 */
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		HttpServletRequest rq = (HttpServletRequest) request;
		HttpServletResponse rs = (HttpServletResponse) response;
		doPost(rq, rs);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
