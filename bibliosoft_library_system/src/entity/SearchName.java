
package servlet;

import java.io.*;

import java.sql.*;

import java.util.List;

 

import javax.servlet.*;

import javax.servlet.http.*;

import dao.AddMessageDao;

import bean.AddMessageBean;

public class SearchName extends HttpServlet{

	private static final long serialVersionUID = 1L;  

	  

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  

            throws ServletException, IOException {  

        this.doPost(req, resp);  

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)  

            throws ServletException, IOException {

    	//设置编码，防止乱码

    	req.setCharacterEncoding("UTF-8"); 

    	resp.setCharacterEncoding("UTF-8");

    	//将JSP中name="name"的值赋给Sring类型的name
    	
  	   String select=req.getParameter("choice");
  	   String name=req.getParameter("strText");
 
    	System.out.println(select);
    	
    	
    	//新建一个AddMessageDao
    	if(select.equals("title")){
        
    	AddMessageDao dao = new AddMessageDao();

    	String sql = "select * from booklisttable where title like '%"+ name +"%'";

        //创建一个列表，调用dao的SearchName

    	List<AddMessageBean> SearchName = dao.SearchName(name);  

        //保存查询的信息用setAttribute将值给SearchName    

        req.setAttribute("SearchName", SearchName);

        //转发请求  
       req.getRequestDispatcher("/ReaderSearch.jsp").forward(req, resp);  }
       
    	if(select.equals("author")){
            
        AddMessageDao dao = new AddMessageDao();

        	String sql = "select * from booklisttable where author ='";

          sql += name + "'";

            //创建一个列表，调用dao的SearchName

        List<AddMessageBean> SearchName = dao.SearchName1(name);  

            //保存查询的信息用setAttribute将值给SearchName    

           req.setAttribute("SearchName", SearchName);

            //转发请求  
          req.getRequestDispatcher("/ReaderSearch.jsp").forward(req, resp);  }
           
       

    
    if(select.equals("isbn")){
        
    	AddMessageDao dao = new AddMessageDao();

    	String sql = "select * from booklisttable where isbn ='";

        sql += name + "'";

        //创建一个列表，调用dao的SearchName

    	List<AddMessageBean> SearchName = dao.SearchName2(name);  

        //保存查询的信息用setAttribute将值给SearchName    

       req.setAttribute("SearchName", SearchName);

        //转发请求  
       req.getRequestDispatcher("/ReaderSearch.jsp").forward(req, resp);  }
       
   

}


}
