package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import entity.Punish;
import utils.DBHelper;

public class PunishDAO {
	
  private PunishDAO() {
  }
  
  public static PunishDAO getInstance() {
	  return new PunishDAO();
  }
  
  public int getTotal() {
		int total = 0;
		try {

			Connection c = DBHelper.getInstance().getConnection();

			Statement s = c.createStatement();

			String sql = "select count(*) from punish";

			ResultSet rs = s.executeQuery(sql);
			while (rs.next()) {
				total = rs.getInt(1);
			}

			DBHelper.closeConnection(c, s, rs);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
  
  public List<Punish> list() {
		return list(0, Short.MAX_VALUE);
	}

	public  List<Punish> list(int start, int count) {
		List<Punish> punishes = new ArrayList<Punish>();

		try {

			Connection c = DBHelper.getInstance().getConnection();

			String sql = "select * from punish order by punish_id desc limit ?,? ";

			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(1, start);
			ps.setInt(2, count);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Punish punish = new Punish();
				String punish_id = rs.getString("punish_id");
				String reader_phone=rs.getString("reader_phone");
				String book_id = rs.getString("book_id");
				String punish_reason=rs.getString("punish_reason");
				String punish_result=rs.getString("punish_result");
				String punish_price=rs.getString("punish_price");
				
				punish.setPunish_id(punish_id);
				punish.setReader_phone(reader_phone);
				punish.setBook_id(book_id);
				punish.setPunish_reason(punish_reason);
				punish.setPunish_result(punish_result);
				punish.setPunish_price(punish_price);

				punishes.add(punish);
			}
			DBHelper.closeConnection(c, ps, rs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return punishes;
	}

	
	
}
