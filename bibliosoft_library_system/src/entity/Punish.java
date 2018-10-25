package entity;
import java.sql.Connection;

public class Punish {
	private String punish_id;
	private String reader_phone;
	private String book_id;
	private String punish_reason;
	private String punish_result;
	private String punish_price;
	
	public Punish() {
		
	}
	public Punish(String punish_id,String reader_phone,String book_id,String punish_reason,String punish_result,String punish_price){
		this.punish_id=punish_id;
		this.reader_phone=reader_phone;
		this.book_id=book_id;
		this.punish_reason=punish_reason;
		this.punish_result=punish_result;
		this.punish_price=punish_price;
	}
	public String getPunish_id(){
		return this.punish_id;
	}
	public String getReader_phone(){
		return this.reader_phone;
	}
	public String getBook_id(){
		return this.book_id;
	}
	public String getPunish_reason(){
		return this.punish_reason;
	}
	public String getPunish_result(){
		return this.punish_result;
	}
	public String getPunish_price(){
		return this.punish_price;
	}
	
	public void setPunish_id(String punish_id){
		this.punish_id=punish_id;
	}
	public void setReader_phone(String reader_phone){
		this.reader_phone=reader_phone;
	}
	public void setBook_id(String book_id){
		this.book_id=book_id;
	}
	public void setPunish_reason(String punish_reason){
		this.punish_reason=punish_reason;
	}
	public void setPunish_result(String punish_result){
		this.punish_result=punish_result;
	}
	public void setPunish_price(String punish_price){
		this.punish_price=punish_price;
	}
	
	
	
}
