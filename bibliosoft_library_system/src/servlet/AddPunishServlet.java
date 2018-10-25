package servlet;

import java.io.IOException;
import java.util.List;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.*;
import dao.PunishDAO;
import entity.Punish;
import utils.DBHelper;

public class AddPunishServlet extends HttpServlet{
	
	private PunishDAO punishDAO = PunishDAO.getInstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("addPunish.jsp").forward(req, resp);
	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String reader_phone=req.getParameter("reader_phone");
		String book_id=req.getParameter("book_id");
		String punish_reason=req.getParameter("punish_reason");
		String punish_result=req.getParameter("punish_result");
		String punish_price=req.getParameter("punish_price");
		int count=punishDAO.getTotal();
		count=count+1;
		String sql="insert into punish values ('"+count+"','"+reader_phone+"','"+book_id+"','"+punish_reason+"','"+punish_result+"','"+punish_price+"')";

		
		try {

			Connection c = DBHelper.getInstance().getConnection();
			PreparedStatement ps = c.prepareStatement(sql);
			ps.execute();
			DBHelper.closeConnection(c, ps, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		req.getRequestDispatcher("addPunish.jsp").forward(req, resp);
	}
	
	
}
