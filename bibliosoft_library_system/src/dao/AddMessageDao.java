
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

        // 加载数据库驱动  ，也就是jdbc

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

            // 获取连接  

        	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root",""); 

            // 整理一条SQL语句  

            String sql = "select * from stumessage where Title like '%"+ title+"%'";
            

            // 创建执行sql的对象 

            stmt = conn.createStatement();  

            //执行sql语句  

            ResultSet rs =stmt.executeQuery(sql);  

            //遍历结果集  

            while(rs.next()){  

                String Book_ID =rs.getString("Book_ID");  
                String Title=rs.getString("Title"); 
                String Author=rs.getString("Author");
                String ISBN=rs.getString("ISBN");  
                String Publisher=rs.getString("Publisher");  
                String Book_ifo=rs.getString("Book_ifo");  
                String China_type=rs.getString("China_type");  
                String Science_type=rs.getString("Science_type");  
                String Publish_date=rs.getString("Publish_date");  
                String Book_price=rs.getString("Book_price");  
                String Book_state=rs.getString("Book_state");  
                AddMessageBean bean = new AddMessageBean();  

                bean.setBook_ID(Book_ID);  
                bean.setTitle(Title);
                bean.setAuthor(Author);
                bean.setISBN(ISBN);
                bean.setPublisher(Publisher);
                bean.setBook_ifo(Book_ifo);
                bean.setChina_type(China_type);
                bean.setScience_type(Science_type);
                bean.setPublish_date(Publish_date);
                bean.setBook_price(Book_price);
                bean.setBook_state(Book_state);

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

            // 获取连接  

        	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root",""); 

            // 整理一条SQL语句  

            String sql = "select * from stumessage where Author ='";

            sql += author + "'";
            

            // 创建执行sql的对象 

            stmt = conn.createStatement();  

            //执行sql语句  

            ResultSet rs =stmt.executeQuery(sql);  

            //遍历结果集  

            while(rs.next()){  

                String Book_ID =rs.getString("Book_ID");  
                String Title=rs.getString("Title"); 
                String Author=rs.getString("Author");
                String ISBN=rs.getString("ISBN");  
                String Publisher=rs.getString("Publisher");  
                String Book_ifo=rs.getString("Book_ifo");  
                String China_type=rs.getString("China_type");  
                String Science_type=rs.getString("Science_type");  
                String Publish_date=rs.getString("Publish_date");  
                String Book_price=rs.getString("Book_price");  
                String Book_state=rs.getString("Book_state");  
                AddMessageBean bean = new AddMessageBean();  

                bean.setBook_ID(Book_ID);  
                bean.setTitle(Title);
                bean.setAuthor(Author);
                bean.setISBN(ISBN);
                bean.setPublisher(Publisher);
                bean.setBook_ifo(Book_ifo);
                bean.setChina_type(China_type);
                bean.setScience_type(Science_type);
                bean.setPublish_date(Publish_date);
                bean.setBook_price(Book_price);
                bean.setBook_state(Book_state);

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

            // 获取连接  

        	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root",""); 

            // 整理一条SQL语句  

            String sql = "select * from stumessage where ISBN ='";

            sql += isbn + "'";
            

            // 创建执行sql的对象 

            stmt = conn.createStatement();  

            //执行sql语句  

            ResultSet rs =stmt.executeQuery(sql);  

            //遍历结果集  

            while(rs.next()){  

                String Book_ID =rs.getString("Book_ID");  
                String Title=rs.getString("Title"); 
                String Author=rs.getString("Author");
                String ISBN=rs.getString("ISBN");  
                String Publisher=rs.getString("Publisher");  
                String Book_ifo=rs.getString("Book_ifo");  
                String China_type=rs.getString("China_type");  
                String Science_type=rs.getString("Science_type");  
                String Publish_date=rs.getString("Publish_date");  
                String Book_price=rs.getString("Book_price");  
                String Book_state=rs.getString("Book_state");  
                AddMessageBean bean = new AddMessageBean();  

                bean.setBook_ID(Book_ID);  
                bean.setTitle(Title);
                bean.setAuthor(Author);
                bean.setISBN(ISBN);
                bean.setPublisher(Publisher);
                bean.setBook_ifo(Book_ifo);
                bean.setChina_type(China_type);
                bean.setScience_type(Science_type);
                bean.setPublish_date(Publish_date);
                bean.setBook_price(Book_price);
                bean.setBook_state(Book_state);

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

            // 获取数据库连接，三个参数为（"数据库名字","用户名","密码"）

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");  

            // 写一条SQL的插入语句，按照表的顺序，依次调用对应的get方法，得到值

            String sql = "insert into stumessage() values ('"+Bean.getBook_ID()+"','"+ Bean.getTitle() +"','"+ Bean.getAuthor()+"','"

                    + Bean.getISBN() +"','"+ Bean.getPublisher()+"','"+ Bean.getBook_ifo()+"','"+ Bean.getChina_type()+"','"+Bean.getScience_type()+"','"+Bean.getPublish_date()+"','"+Bean.getBook_price()+"','"+Bean.getBook_state()+"')";

            // 创建SQL执行对象  

            stmt = conn.createStatement();  

            // 执行sql语句  

            stmt.executeUpdate(sql);

        } catch (SQLException e) {  //抓取异常

            e.printStackTrace();  

        } finally {  				//最后要关掉数据库和statement对象

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
