package entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Book {
  private String id;
  private String title;
  private String author;
  private String isbn;
  private String publisher;
  private String book_info;
  private String china_type;
  private String science_type;
  private String publish_date;
  private double book_price;
  private String book_state;
  private String location;
  
  public Book() {
  }
  public Book(String id,String title,String author,String isbn,String publisher,String book_info,String china_type,String science_type,String publish_date,double book_price,String book_state,String location) {
	  super();
	  this.id=id;
	  this.title=title;
	  this.author=author;
	  this.isbn=isbn;
	  this.publisher=publisher;
	  this.book_info=book_info;
	  this.china_type=china_type;
	  this.science_type=science_type;
	  this.publish_date=publish_date;
	  this.book_price=book_price;
	  this.book_state=book_state;
	  this.location=location;
  }
  
  public String getId() {
	  return id;
  }
  public String getTitle() {
	  return title;
  }
  public String getAuthor() {
	  return author;
  }
  public String getIsbn() {
	  return isbn;
  }
  public String getPublisher() {
	  return publisher;
  }
  public String getBook_info() {
	  return book_info;
  }
  public String getChina_type() {
	  return china_type;
  }
  public String getScience_type() {
	  return science_type;
  }
  public String getPublish_date() {
	  return publish_date;
  }
  public double getBook_price() {
	  return book_price;
  }
  public String getBook_state() {
	  return book_state;
  }
  public String getLocation() {
	  return location;
  }
  
  public void setId(String id) {
	  this.id=id;
  }
  public void setTitle(String title) {
	  this.title=title;
  }
  
  public void setAuthor(String author) {
	  this.author=author;
  }
  
  public void setIsbn(String isbn) {
	  this.isbn=isbn;
  }
  public void setPublisher(String publisher) {
	  this.publisher=publisher;
  }
  public void setBook_info(String book_info) {
	  this.book_info=book_info;
  }
  public void setChina_type(String china_type) {
	  this.china_type=china_type;
  }
  public void setScience_type(String science_type) {
	  this.science_type=science_type;
  }
  public void setPublish_date(String publish_date) {
	  this.publish_date=publish_date;
  }
  public void setBook_price(double book_price) {
	  this.book_price=book_price;
  }
  public void setBook_state(String book_state) {
	  this.book_state=book_state;
  }
  public void setLocation(String location) {
	  this.location=location;
  }
}
