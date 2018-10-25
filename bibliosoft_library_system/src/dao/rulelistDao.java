 package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Librarian;
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
		List<Rule> rules = new ArrayList<Rule>();

		try {

			Connection c = DBHelper.getInstance().getConnection();

			String sql = "select * from reader_rule order by rule_id  ";

			PreparedStatement ps = c.prepareStatement(sql);
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
	public Rule ruleifo(String id)
	{
		Rule rule = new Rule();
		try {

			Connection c = DBHelper.getInstance().getConnection();

			String sql = "select * from reader_rule where rule_id='"+id+"'";

			PreparedStatement ps = c.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				rule.setrule_id(rs.getString("rule_id"));
				rule.setfine(rs.getString("fine"));
				rule.setreturn_period(rs.getString("return_period"));
				rule.setdeposit(rs.getString("deposit"));
				System.out.println(rule.getrule_id());
			}
			DBHelper.closeConnection(c, ps, rs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rule;

	}
	public List<Rule> search(String key)
	{
		List<Rule> rules1=new ArrayList<Rule>();
		try
		{
			if(key==null)
			{
				rules1=list();
			}
			if(key=="")
			{
				rules1=list();
		
				
			}
			else{
				List<Rule> rules=getbyruleid(key);
				for(Rule l:rules)
				{
					rules1.add(l);
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return rules1;
	}
	public List<Rule> getbyruleid(String key)
	{
		List<Rule> rules = new ArrayList<Rule>();

		try {

			Connection c = DBHelper.getInstance().getConnection();

			String sql = "select * from reader_rule  where rule_id='"+key+"'";

			PreparedStatement ps = c.prepareStatement(sql);
			

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Rule rule=new Rule();

				rule.setrule_id(rs.getString("rule_id"));
				rule.setfine(rs.getString("fine"));
				rule.setreturn_period(rs.getString("return_period"));
				rule.setdeposit(rs.getString("deposit"));
				
				rules.add(rule);
			}
			DBHelper.closeConnection(c, ps, rs);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return rules;
	}
}
