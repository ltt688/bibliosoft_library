package entity;
import java.sql.Connection;

public class BorrowRecords {
	private String borrow_id;
	private String reader_phone;
	private String book_id;
	private String borrow_date;
	private String deadline_date;
	private String return_date;
	private String borrow_state;
	
	public BorrowRecords(){
		
	}
	public BorrowRecords(String id,String phone,String book_id,String borrow_date,String deadline_date,String return_date,String borrow_state){
		this.borrow_id=id;
		this.reader_phone=phone;
		this.book_id=book_id;
		this.borrow_date=borrow_date;
		this.deadline_date=deadline_date;
		this.return_date=return_date;
		this.borrow_state=borrow_state;
		
	}
	public String getBorrow_id(){
		return this.borrow_id;
	}
	public String getReader_phone(){
		return this.reader_phone;
	}
	public String getBook_id(){
		return this.book_id;
	}
	public String getBorrow_date(){
		return this.borrow_date;
	}
	public String getDeadline_date() {
		return this.deadline_date;
	}
	public String getReturn_date(){
		return this.return_date;
	}
	public String getBorrow_state() {
		return this.borrow_state;
	}
	
	public void setBorrow_id(String id){
		this.borrow_id=id;
	}
	public void setReader_phone(String phone){
		this.reader_phone=phone;
	}
	public void setBook_id(String book_id){
		this.book_id=book_id;
	}
	public void setBorrow_date(String borrow_date){
		this.borrow_date=borrow_date;
	}
	public void setDeadline_date(String deadline_date) {
		this.deadline_date=deadline_date;
	}
	public void setReturn_date(String return_date){
		this.return_date=return_date;
	}
	public void setBorrow_state(String borrow_state) {
		this.borrow_state=borrow_state;
	}

}
