package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import dao.SetpersonDAO;
import dao.SetpwdDAO;

/**
 * Servlet implementation class SetpersonServlet
 */
public class SetpersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SetpersonDAO setpersondao = new SetpersonDAO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetpersonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("utf-8");
		//…Ë÷√¬∑æ∂
            String reader_phone=request.getParameter("reader_phone");
			String reader_name= request.getParameter("reader_name");
			String reader_birthday = request.getParameter("reader_birthday");
			String reader_email = request.getParameter("reader_email");
			String reader_address = request.getParameter("reader_address");
			if(reader_phone != ""){
			User user=new User();
			user.setReader_phone(reader_phone);
			user.setReader_name(reader_name);
			user.setReader_birthday(reader_birthday);
			user.setReader_email(reader_email);
			user.setReader_address(reader_address);
			setpersondao.update(user);
		request.getRequestDispatcher("Setperson2.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("Setperson.jsp").forward(request, response);
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
