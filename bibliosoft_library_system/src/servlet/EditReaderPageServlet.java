package servlet;

import java.io.IOException;
import java.util.List;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ReaderDAO;
import entity.Reader;
import utils.DBHelper;
public class EditReaderPageServlet extends HttpServlet{
	private ReaderDAO readerDAO = ReaderDAO.getInstance();
	String now_id;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=now_id;
		String name=req.getParameter("reader_name");
		String password=req.getParameter("password");
		String phone=req.getParameter("phone");
		String banzheng_date=req.getParameter("banzheng_date");
		String shengxiao_date=req.getParameter("shengxiao_date");
		String daoqi_date=req.getParameter("daoqi_date");
		String yj=req.getParameter("yj");
		String email=req.getParameter("email");
		String Ljjs=req.getParameter("ljjs");
		int ljjs =Integer.parseInt(Ljjs);
		String rule_id=req.getParameter("rule_id");
		
		req.setAttribute("reader_id",id);
		String sql="update readerListTable set reader_name='"+name+"' , reader_password='"+password+"' ,reader_email='"+email+"',reader_phone='"+phone+"',"
				+ "shengxiao_date='"+shengxiao_date+"',banzheng_date='"+banzheng_date+"',daoqi_date='"+daoqi_date+"',yj='"+yj+"',"
						+ "ljjs='"+ljjs+"',rule_id='"+rule_id+"' where id='"+id+"'";
		try {

			Connection c = DBHelper.getInstance().getConnection();
			PreparedStatement ps = c.prepareStatement(sql);
			ps.execute();
			DBHelper.closeConnection(c, ps, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		req.getRequestDispatcher("editReaderPage.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("edit_id");
		now_id=id;
		req.setAttribute("reader_id",id);
		req.getRequestDispatcher("editReaderPage.jsp").forward(req, resp);
	}
	
	
}
