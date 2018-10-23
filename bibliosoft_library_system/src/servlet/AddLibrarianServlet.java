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
import dao.AddLibrarian;

/**
 * Servlet implementation class RegisterServlet
 */
public class AddLibrarianServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddLibrarianServlet() {
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
		request.setCharacterEncoding("utf-8");
		String account = request.getParameter("account");
		String name = request.getParameter("name");
		String password="00010001";
		System.out.println(password);
		String phone = request.getParameter("phone");
		String type = request.getParameter("type");
		AddLibrarian ld = new AddLibrarian();
		boolean can = ld.CanAdd(account);
		if (can) {
			Librarian librarian = new Librarian();
//			librarian.setManager_ID(account);
//			librarian.setManager_name(name);
//			librarian.setManager_password("00010001");
//			System.out.println(librarian.getManager_password());
//			librarian.setManager_phone(phone);
//			librarian.setManager_type(type);
			AddLibrarian librariandao = new AddLibrarian();
			System.out.println(password);
			librariandao.addUser(account,name,password,phone,type);
			response.sendRedirect("Librarian_add.jsp?tishi=yes");
		} else {
			response.sendRedirect("Librarian_add.jsp?tishi=no");
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
