package entity;
import java.sql.Connection;

public class ReaderRequrements {
	private String reserve_id;
	private String reader_phone;
	private String book_id;
	private String reserve_date;
	private String reserve_state;
	
	public ReaderRequrements() {
		
	}
	public ReaderRequrements(String reserve_id,String reader_phone,String book_id,String reserve_date,String reserve_state){
		this.reserve_id=reserve_id;
		this.reader_phone=reader_phone;
		this.book_id=book_id;
		this.reserve_date=reserve_date;
		this.reserve_state=reserve_state;
	}
	public String getReserve_id(){
		return this.reserve_id;
	}
	public String getReader_phone(){
		return this.reader_phone;
	}
	public String getBook_id(){
		return this.book_id;
	}
	public String getReserve_date(){
		return this.reserve_date;
	}
	public String getReserve_state(){
		return this.reserve_state;
	}
	public void setReserve_id(String reserve_id){
		this.reserve_id=reserve_id;
	}
	public void setReader_phone(String reader_phone){
		this.reader_phone=reader_phone;
	}
	public void setBook_id(String book_id){
		this.book_id=book_id;
	}
	public void setReserve_date(String reserve_date){
		this.reserve_date=reserve_date;
	}
	public void setReserve_state(String reserve_state){
		this.reserve_state=reserve_state;
	}
	
	
	
}
