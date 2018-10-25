package bean;

public class User {

	private String  reader_phone;
	private String  reader_password;
	private String  reader_name;
	private String  reader_email;
	private String  banzheng_date;
	private String  yj;
	private String  ljjs;
	private String  rule_id;
	private String  reader_birthday;
	private String  reader_address;
	
	public User() {

		super();

	}
	public User(String reader_phone, String reader_password) {

		super();
		this.reader_phone = reader_phone;
		this.reader_password = reader_password;

	}
	public User(String reader_phone, String reader_password, String reader_name, String reader_email,
			String banzheng_date, String yj, String ljjs, String rule_id) {
		super();
		this.reader_phone = reader_phone;
		this.reader_password = reader_password;
		this.reader_name = reader_name;
		this.reader_email = reader_email;
		this.banzheng_date = banzheng_date;
		this.yj = yj;
		this.ljjs = ljjs;
		this.rule_id = rule_id;
	}
	public String getReader_phone() {
		return reader_phone;
	}
	public void setReader_phone(String reader_phone) {
		this.reader_phone = reader_phone;
	}
	public String getReader_password() {
		return reader_password;
	}
	public void setReader_password(String reader_password) {
		this.reader_password = reader_password;
	}
	public String getReader_name() {
		return reader_name;
	}
	public void setReader_name(String reader_name) {
		this.reader_name = reader_name;
	}
	public String getReader_email() {
		return reader_email;
	}
	public void setReader_email(String reader_email) {
		this.reader_email = reader_email;
	}
	public String getBanzheng_date() {
		return banzheng_date;
	}
	public void setBanzheng_date(String banzheng_date) {
		this.banzheng_date = banzheng_date;
	}
	public String getYj() {
		return yj;
	}
	public void setYj(String yj) {
		this.yj = yj;
	}
	public String getLjjs() {
		return ljjs;
	}
	public void setLjjs(String ljjs) {
		this.ljjs = ljjs;
	}
	public String getRule_id() {
		return rule_id;
	}
	public void setRule_id(String rule_id) {
		this.rule_id = rule_id;
	}
	public String getReader_birthday() {
		return reader_birthday;
	}
	public void setReader_birthday(String reader_birthday) {
		this.reader_birthday = reader_birthday;
	}
	public String getReader_address() {
		return reader_address;
	}
	public void setReader_address(String reader_address) {
		this.reader_address = reader_address;
	}
	
	
	
	

}
