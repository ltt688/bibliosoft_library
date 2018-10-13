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
import dao.LoginDao;
 
public class LoginServlet extends HttpServlet {
 
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
 
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		String account = request.getParameter("account");// 取得用户名
		String password = request.getParameter("password");// 取得密码
		LoginDao ld = new LoginDao();// 构建登录对象
		boolean canLogin = ld.login(account, password);
		if (canLogin) {// 根据登陆情况，跳转页面
			String admin="admin";
			if(admin.equals(account))
			{
			response.sendRedirect("calendar.jsp");
			}
			else
			{
				response.sendRedirect("mainPage.jsp");
			}
		} else {
			response.sendRedirect("login.jsp?error=yes");
			
			
		}
		
		
		
	}
 
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		HttpServletRequest rq = (HttpServletRequest) request;
		HttpServletResponse rs = (HttpServletResponse) response;
		doPost(rq, rs);
		
		
		((HttpServletResponse) response).setHeader("content-type","text/html;charset=UTF-8");
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