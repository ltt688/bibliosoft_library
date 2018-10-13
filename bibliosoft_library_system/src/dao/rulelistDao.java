 package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import entity.Rule;
import utils.DBHelper;

public class rulelistDao {

	private void rulelistDao() {
	}

	public static rulelistDao getInstance() {
		return new rulelistDao();
	}

	public int getTotal() {
		int total = 0;
		try {

			Connection c = DBHelper.getInstance().getConnection();

			Statement s = c.createStatement();

			String sql = "select count(*) from reader_rule";

			ResultSet rs = s.executeQuery(sql);
			while (rs.next()) {

				total = rs.getInt(1);

			}

			System.out.println("total:" + total);

			DBHelper.closeConnection(c, s, rs);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}

	public List<Rule> list() {
		return list(0, Short.MAX_VALUE);
	}

	public List<Rule> list(int start, int count) {
		List<Rule> rules = new ArrayList<Rule>();

		try {

			Connection c = DBHelper.getInstance().getConnection();

			String sql = "select * from reader_rule order by rule_id desc limit ?,? ";

			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(1, start);

			ps.setInt(2, count);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Rule rule = new Rule();
                String  rule_id=rs.getString("rule_id");
				rule.setrule_id(rule_id);
				rule.setfine(rs.getString("fine"));
				rule.setreturn_period(rs.getString("return_period"));
				rule.setdeposit(rs.getString("deposit"));

				rules.add(rule);
				System.out.println(rule.getrule_id());
			}
			DBHelper.closeConnection(c, ps, rs);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return rules;
	}
}
