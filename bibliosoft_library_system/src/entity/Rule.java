package entity;


public class Rule {
	private String rule_id;
	private String fine;
	private String return_period;
	private String deposit;

	public Rule() {
	}

	public Rule(String rule_id, String fine, String return_period, String deposit) {
		super();
		this.rule_id = rule_id;
		this.fine = fine;
		this.return_period = return_period;
		this.deposit = deposit;
	}

	public String getrule_id() {
		return rule_id;
	}
	
	public void setrule_id(String rule_id) {
		this.rule_id = rule_id;
	}

	public String getfine() {
		return fine;
	}

	public void setfine(String fine) {
		this.fine = fine;
	}

	public String getreturn_period() {
		return return_period;
	}

	public void setreturn_period(String return_period) {
		this.return_period = return_period;
	}

	public String getdeposit() {
		return deposit;
	}

	public void setdeposit(String deposit) {
		this.deposit = deposit;
	}

}
