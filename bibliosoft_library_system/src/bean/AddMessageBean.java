
package bean;

public class AddMessageBean {  

    

    /** 

     * 属性和数据库中的字段相对应 

     */  

        

	private String Book_ID;
	private String Title;
	private String Author;
	private String ISBN;
	private String Publisher;
	private String Book_ifo;
	private String China_type;
	private String Science_type;
	private String Publish_date;
	private String Book_price;
	private String Book_state;
	public String getBook_ID() {
		return Book_ID;
	}
	public void setBook_ID(String book_ID) {
		this.Book_ID = book_ID;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		this.Title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		this.Author = author;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		this.ISBN = iSBN;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		this.Publisher = publisher;
	}
	public String getBook_ifo() {
		return Book_ifo;
	}
	public void setBook_ifo(String book_ifo) {
		this.Book_ifo = book_ifo;
	}
	public String getChina_type() {
		return China_type;
	}
	public void setChina_type(String china_type) {
		this.China_type = china_type;
	}
	public String getScience_type() {
		return Science_type;
	}
	public void setScience_type(String science_type) {
		this.Science_type = science_type;
	}
	public String getPublish_date() {
		return Publish_date;
	}
	public void setPublish_date(String publish_date) {
		this.Publish_date = publish_date;
	}
	public String getBook_price() {
		return Book_price;
	}
	public void setBook_price(String book_price) {
		this.Book_price = book_price;
	}
	public String getBook_state() {
		return Book_state;
	}
	public void setBook_state(String book_state) {
		this.Book_state = book_state;
	}

}
