
package dao;

import java.sql.Connection;  

import java.io.*;

import java.sql.DriverManager;  

import java.sql.ResultSet;  

import java.sql.SQLException;  

import java.sql.Statement;  

import java.util.ArrayList;  

import java.util.List;

import javax.servlet.annotation.WebServlet;

 

import bean.AddMessageBean; 

 

public class AddMessageDao {  

	static {  

        // �������ݿ�����  ��Ҳ����jdbc

        try {  

            Class.forName("com.mysql.jdbc.Driver");

        } 

        catch (ClassNotFoundException e) {

            e.printStackTrace();  

        }  

    }  

    public List<AddMessageBean> SearchName(String title) {  

  	  

        Connection conn = null;  

        Statement stmt = null;  

        List<AddMessageBean> classList= new ArrayList<AddMessageBean>();  

        try {  

            // ��ȡ����  

        	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bibliosoft","root",""); 

            // ����һ��SQL���  

            String sql = "select * from booklisttable where title like '%"+ title+"%'";
            

            // ����ִ��sql�Ķ��� 

            stmt = conn.createStatement();  

            //ִ��sql���  

            ResultSet rs =stmt.executeQuery(sql);  

            //���������  

            while(rs.next()){  

                String Book_ID =rs.getString("id");  
                String Title=rs.getString("title"); 
                String Author=rs.getString("author");
                String ISBN=rs.getString("isbn");  
                String Publisher=rs.getString("publisher");  
                String Book_info=rs.getString("book_info");  
                String China_type=rs.getString("china_type");  
                String Science_type=rs.getString("science_type");  
                String Publish_date=rs.getString("publish_date");  
                String Book_price=rs.getString("book_price");  
                String Book_state=rs.getString("book_state");
                String Location =rs.getString("location");
                AddMessageBean bean = new AddMessageBean();  

                bean.setId(Book_ID);  
                bean.setTitle(Title);
                bean.setAuthor(Author);
                bean.setIsbn(ISBN);
                bean.setPublisher(Publisher);
                bean.setBook_info(Book_info);
                bean.setChina_type(China_type);
                bean.setScience_type(Science_type);
                bean.setPublish_date(Publish_date);
                bean.setBook_price(Book_price);
                bean.setBook_state(Book_state);
                bean.setLocation(Location);

                classList.add(bean);  

            }  

        } catch (SQLException e) {  

            e.printStackTrace();  

        }  

        return classList;  

    }

    public List<AddMessageBean> SearchName1(String author) {  

    	  

        Connection conn = null;  

        Statement stmt = null;  

        List<AddMessageBean> classList= new ArrayList<AddMessageBean>();  

        try {  

            // ��ȡ����  

        	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bibliosoft","root",""); 

            // ����һ��SQL���  

            String sql = "select * from booklisttable where author ='";

            sql += author + "'";
            

            // ����ִ��sql�Ķ��� 

            stmt = conn.createStatement();  

            //ִ��sql���  

            ResultSet rs =stmt.executeQuery(sql);  

            //���������  

            while(rs.next()){  

            	  String Book_ID =rs.getString("id");  
                  String Title=rs.getString("title"); 
                  String Author=rs.getString("author");
                  String ISBN=rs.getString("isbn");  
                  String Publisher=rs.getString("publisher");  
                  String Book_info=rs.getString("book_info");  
                  String China_type=rs.getString("china_type");  
                  String Science_type=rs.getString("science_type");  
                  String Publish_date=rs.getString("publish_date");  
                  String Book_price=rs.getString("book_price");  
                  String Book_state=rs.getString("book_state");
                  String Location =rs.getString("location");
                  AddMessageBean bean = new AddMessageBean();  

                  bean.setId(Book_ID);  
                  bean.setTitle(Title);
                  bean.setAuthor(Author);
                  bean.setIsbn(ISBN);
                  bean.setPublisher(Publisher);
                  bean.setBook_info(Book_info);
                  bean.setChina_type(China_type);
                  bean.setScience_type(Science_type);
                  bean.setPublish_date(Publish_date);
                  bean.setBook_price(Book_price);
                  bean.setBook_state(Book_state);
                  bean.setLocation(Location);

                  classList.add(bean);
            }  

        } catch (SQLException e) {  

            e.printStackTrace();  

        }  

        return classList;  

    }

  
    public List<AddMessageBean> SearchName2(String isbn) {  

    	  

        Connection conn = null;  

        Statement stmt = null;  

        List<AddMessageBean> classList= new ArrayList<AddMessageBean>();  

        try {  

            // ��ȡ����  

        	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bibliosoft","root",""); 

            // ����һ��SQL���  

            String sql = "select * from booklisttable where isbn ='";

            sql += isbn + "'";
            

            // ����ִ��sql�Ķ��� 

            stmt = conn.createStatement();  

            //ִ��sql���  

            ResultSet rs =stmt.executeQuery(sql);  

            //���������  

            while(rs.next()){  

            	  String Book_ID =rs.getString("id");  
                  String Title=rs.getString("title"); 
                  String Author=rs.getString("author");
                  String ISBN=rs.getString("isbn");  
                  String Publisher=rs.getString("publisher");  
                  String Book_info=rs.getString("book_info");  
                  String China_type=rs.getString("china_type");  
                  String Science_type=rs.getString("science_type");  
                  String Publish_date=rs.getString("publish_date");  
                  String Book_price=rs.getString("book_price");  
                  String Book_state=rs.getString("book_state");
                  String Location =rs.getString("location");
                  AddMessageBean bean = new AddMessageBean();  

                  bean.setId(Book_ID);  
                  bean.setTitle(Title);
                  bean.setAuthor(Author);
                  bean.setIsbn(ISBN);
                  bean.setPublisher(Publisher);
                  bean.setBook_info(Book_info);
                  bean.setChina_type(China_type);
                  bean.setScience_type(Science_type);
                  bean.setPublish_date(Publish_date);
                  bean.setBook_price(Book_price);
                  bean.setBook_state(Book_state);
                  bean.setLocation(Location);

                  classList.add(bean);  

            }  

        } catch (SQLException e) {  

            e.printStackTrace();  

        }  

        return classList;  

    }


    public void addClassInfo(AddMessageBean Bean) {  

        Connection conn = null;  

        Statement stmt = null;  

        try {  

            // ��ȡ���ݿ����ӣ���������Ϊ��"���ݿ�����","�û���","����"��

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bibliosoft","root","");  

            // дһ��SQL�Ĳ�����䣬���ձ��˳�����ε��ö�Ӧ��get�������õ�ֵ

            String sql = "insert into booklisttable() values ('"+Bean.getId()+"','"+ Bean.getTitle() +"','"+ Bean.getAuthor()+"','"

                    + Bean.getIsbn() +"','"+ Bean.getPublisher()+"','"+ Bean.getBook_info()+"','"+ Bean.getChina_type()+"','"+Bean.getScience_type()+"','"+Bean.getPublish_date()+"','"+Bean.getBook_price()+"','"+Bean.getBook_state()+"','"+Bean.getLocation()+"')";

            // ����SQLִ�ж���  

            stmt = conn.createStatement();  

            // ִ��sql���  

            stmt.executeUpdate(sql);

        } catch (SQLException e) {  //ץȡ�쳣

            e.printStackTrace();  

        } finally {  				//���Ҫ�ص����ݿ��statement����

            if (conn != null) {  

                try {  

                    conn.close();  

                } catch (SQLException e) {  

                    e.printStackTrace();  

                }  

            }  

            if (stmt != null) {  

                try {  

                    stmt.close();  

                } catch (SQLException e) {  

                    e.printStackTrace();  

                }  

            }  

        }  

    }}
