package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDAO;
import bean.Student;

public class OrderServlet extends HttpServlet {
	
	private StudentDAO studentDAO = StudentDAO.getInstance();
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");

		int start = 0;
		int count = 5;

		try {
			start = Integer.parseInt(request.getParameter("start"));
		} catch (NumberFormatException e) {
			// 褰撴祻瑙堝櫒娌℃湁浼犲弬鏁皊tart鏃�
		}

		int next = start + count;
		int pre = start - count;

		int total = studentDAO.getTotal();

		int last;
		if (0 == total % count)
			last = total - count;
		else
			last = total - total % count;

		pre = pre < 0 ? 0 : pre;
		next = next > last ? last : next;

		request.setAttribute("next", next);
		request.setAttribute("pre", pre);
		request.setAttribute("last", last);

		List<Student> students = studentDAO.list(start, count);
		request.setAttribute("students", students);

		request.getRequestDispatcher("Order.jsp").forward(request, response);

	}

}

