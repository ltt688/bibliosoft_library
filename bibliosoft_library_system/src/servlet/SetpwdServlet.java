package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import dao.SetpwdDAO;

/**
 * Servlet implementation class SetpwdServlet
 */
public class SetpwdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetpwdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	private SetpwdDAO setpwddao = new SetpwdDAO();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
			//设置编码，很重要，否则页面提交，中文会出现乱码
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("utf-8");
			//设置路径
	            String reader_phone=request.getParameter("reader_phone");
				String reader_password = request.getParameter("reader_password");
				if(reader_phone!="" & reader_password!=""){
				User user=new User();
				user.setReader_phone(reader_phone);
				user.setReader_password(reader_password);
				setpwddao.update(user);
			request.getRequestDispatcher("Setpwd4.jsp").forward(request, response);
				}else{
			request.getRequestDispatcher("Setpwd1.jsp").forward(request, response);
				}
			 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
