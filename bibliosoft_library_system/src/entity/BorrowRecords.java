package entity;
import java.sql.Connection;

public class BorrowRecords {
	private String id;
	private String phone;
	private String name;
	private String book_id;
	private String book_name;
	private String borrow_date;
	private String return_date;
	
	public BorrowRecords(){
		
	}
	public BorrowRecords(String id,String phone,String name,String book_id,String book_name,String borrow_date,String return_date){
		this.id=id;
		this.phone=phone;
		this.name=name;
		this.book_id=book_id;
		this.book_name=book_name;
		this.borrow_date=borrow_date;
		this.return_date=return_date;
		
	}
	public String getId(){
		return this.id;
	}
	public String getPhone(){
		return this.phone;
	}
	public String getName(){
		return this.name;
	}
	public String getBookId(){
		return this.book_id;
	}
	public String getBookName(){
		return this.book_name;
	}
	public String getBorrowDate(){
		return this.borrow_date;
	}
	public String getReturnDate(){
		return this.return_date;
	}
	
	public void setId(String id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	public void setBookId(String book_id){
		this.book_id=book_id;
	}
	public void setBookName(String book_name){
		this.book_name=book_name;
	}
	public void setBorrowDate(String borrow_date){
		this.borrow_date=borrow_date;
	}
	public void setReturnDate(String return_date){
		this.return_date=return_date;
	}

}
