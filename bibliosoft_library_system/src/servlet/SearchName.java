
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

    	//���ñ��룬��ֹ����

    	req.setCharacterEncoding("UTF-8"); 

    	resp.setCharacterEncoding("UTF-8");

    	//��JSP��name="name"��ֵ����Sring���͵�name
    	
  	   String select=req.getParameter("choice");
  	   String name=req.getParameter("strText");
 
    	System.out.println(select);
    	
    	
    	//�½�һ��AddMessageDao
    	if(select.equals("title")){
        
    	AddMessageDao dao = new AddMessageDao();

    	String sql = "select * from booklisttable where title like '%"+ name +"%'";

        //����һ���б�����dao��SearchName

    	List<AddMessageBean> SearchName = dao.SearchName(name);  

        //�����ѯ����Ϣ��setAttribute��ֵ��SearchName    

        req.setAttribute("SearchName", SearchName);

        //ת������  
       req.getRequestDispatcher("/ReaderSearch.jsp").forward(req, resp);  }
       
    	if(select.equals("author")){
            
        AddMessageDao dao = new AddMessageDao();

        	String sql = "select * from booklisttable where author ='";

          sql += name + "'";

            //����һ���б�����dao��SearchName

        List<AddMessageBean> SearchName = dao.SearchName1(name);  

            //�����ѯ����Ϣ��setAttribute��ֵ��SearchName    

           req.setAttribute("SearchName", SearchName);

            //ת������  
          req.getRequestDispatcher("/ReaderSearch.jsp").forward(req, resp);  }
           
       

    
    if(select.equals("isbn")){
        
    	AddMessageDao dao = new AddMessageDao();

    	String sql = "select * from booklisttable where isbn ='";

        sql += name + "'";

        //����һ���б�����dao��SearchName

    	List<AddMessageBean> SearchName = dao.SearchName2(name);  

        //�����ѯ����Ϣ��setAttribute��ֵ��SearchName    

       req.setAttribute("SearchName", SearchName);

        //ת������  
       req.getRequestDispatcher("/ReaderSearch.jsp").forward(req, resp);  }
       
   

}


}
