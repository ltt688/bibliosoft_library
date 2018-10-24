package entity;

import java.sql.Connection;
public class Reader {
	private String id;
	private String name;
	private String password;
	private String phone;
	private String email;
	private String banzheng_date;
	private String shengxiao_date;
	private String daoqi_date;
	private String yj;

	private int ljjs;
	private String rule_id;	
	public Reader(){
		
	}
	public Reader(String id, String name ,String password,String phone,String email,String banzheng_date,String shengxiao_date,String daoqi_date,String yj,int ljjs,String rule_id){
		this.id=id;
		this.name=name;
		this.password=password;
		this.phone=phone;
		this.email=email;
		this.banzheng_date=banzheng_date;
		this.shengxiao_date=shengxiao_date;
		this.daoqi_date=daoqi_date;
		this.yj=yj;
		//this.sxf=sxf;
		this.ljjs=ljjs;
		this.rule_id=rule_id;
	}
	public String getID() {
		  return id;
	  }
	  
	  public String getName() {
		  return name;
	  }
	  public String getEmail() {
		  return email;
	  }
	  
	  public String getPassword() {
		  return password;
	  }
	  public String getPhone(){
		  return this.phone;
	  }
	  public String getBanZheng_date() {
		  return banzheng_date;
	  }
	  public String getShengXiao_date() {
		  return shengxiao_date;
	  }
	  public String getDaoQi_date() {
		  return daoqi_date;
	  }
	  public String getYj() {
		  return yj;
	  }
	  public int getLjjs() {
		  return ljjs;
	  }
	  public String getRule_id() {
		  return rule_id;
	  }
	  public void setID(String id) {
		  this.id=id;
	  }
	  
	  public void setName(String name) {
		  this.name=name;
	  }
	  public void setPassword(String password) {
		  this.password=password;
	  }
	  public void setPhone(String phone){
		  this.phone=phone;
	  }
	  public void setBanZheng_date(String banzheng_date) {
		  this.banzheng_date=banzheng_date;
	  }
	  public void setShengXiao_date(String shengxiao_date) {
		  this.shengxiao_date=shengxiao_date;
	  }
	  public void setDaoQi_date(String daoqi_date) {
		  this.daoqi_date=daoqi_date;
	  }
	  public void setYj(String yj) {
		  this.yj=yj;
	  }
	  public void setEmail(String email) {
		  this.email=email;
	  }
	  public void setLjjs(int ljjs) {
		  this.ljjs=ljjs;
	  }
	  public void setRule_id(String rule_id) {
		  this.rule_id=rule_id;
	  }
	  
	
}


