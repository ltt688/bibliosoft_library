package bean;

public class Borrow {
private String borrow_id;
private String reader_phone;
private String book_id;
private String borrow_date;
private String deadline_date;
private String return_date;
private String borrow_state;
public String getBorrow_id() {
	return borrow_id;
}
public void setBorrow_id(String borrow_id) {
	this.borrow_id = borrow_id;
}
public String getReader_phone() {
	return reader_phone;
}
public void setReader_phone(String reader_phone) {
	this.reader_phone = reader_phone;
}
public String getBook_id() {
	return book_id;
}
public void setBook_id(String book_id) {
	this.book_id = book_id;
}
public String getBorrow_date() {
	return borrow_date;
}
public void setBorrow_date(String borrow_date) {
	this.borrow_date = borrow_date;
}
public String getDeadline_date() {
	return deadline_date;
}
public void setDeadline_date(String deadline_date) {
	this.deadline_date = deadline_date;
}
public String getReturn_date() {
	return return_date;
}
public void setReturn_date(String return_date) {
	this.return_date = return_date;
}
public String getBorrow_state() {
	return borrow_state;
}
public void setBorrow_state(String borrow_state) {
	this.borrow_state = borrow_state;
}

}
