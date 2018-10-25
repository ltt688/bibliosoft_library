package servlet;

import java.io.IOException;
import java.util.List;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.*;
import dao.ReaderRequrementsDAO;
import entity.ReaderRequrements;
import utils.DBHelper;

public class AddReaderRequrementsServlet extends HttpServlet{
	
	private ReaderRequrementsDAO readerRequrementsDAO = ReaderRequrementsDAO.getInstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("addReaderRequrements.jsp").forward(req, resp);
	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String reader_phone=req.getParameter("reader_phone");
		String book_id=req.getParameter("book_id");
		String reserve_date=req.getParameter("reserve_date");
		String reserve_state=req.getParameter("reserve_state");
		int count=readerRequrementsDAO.getTotal();
		count=count+1;
		String sql="insert into reserve values ('"+count+"','"+reader_phone+"','"+book_id+"','"+reserve_date+"','"+reserve_state+"')";

		
		try {

			Connection c = DBHelper.getInstance().getConnection();
			PreparedStatement ps = c.prepareStatement(sql);
			ps.execute();
			DBHelper.closeConnection(c, ps, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		req.getRequestDispatcher("addReaderRequrements.jsp").forward(req, resp);
	}
	
	
}
