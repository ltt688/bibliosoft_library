package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Address;
import dao.AddressDao;

/**
 * Servlet implementation class AddressServlet
 */
public class AddressServlet extends HttpServlet {
	// ע��daoprivate 
	AddressDao addressDao = new AddressDao();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//���ñ��룬����Ҫ������ҳ���ύ�����Ļ��������
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("utf-8");
		//����·��
		String path = "list.jsp";
		String method = request.getParameter("method");
		//�������url��list
		if (("list").equals(method)) {
			List<Address> list = addressDao.findAll();
			request.setAttribute("list", list);
			}else if (method.equals("add")) {
				//ע��Addressʵ����
				Address address = new Address();
				//��ȡ����
				String name = request.getParameter("name");
				String street = request.getParameter("street");
				String city = request.getParameter("city");
				String state = request.getParameter("state");
				String zip = request.getParameter("zip");
				//�������ӵ�����
				address.setName(name);
				address.setStreet(street);
				address.setCity(city);
				address.setState(state);
				address.setZip(zip);
				addressDao.add(address);

				path = "AddressServlet?method=list";
	
   }else if (method.equals("delete")) {
	   int id = Integer.parseInt(request.getParameter("id"));
	   addressDao.delete(id);
	   path = "AddressServlet?method=list";
   }else if (method.equals("toedit")) {
			int id = Integer.parseInt(request.getParameter("id"));
			Address address = addressDao.findById(id);
			path = "edit.jsp";
			request.setAttribute("address", address);
			}else if (method.equals("edit")) {
				//����id�޸�
				int id = Integer.parseInt(request.getParameter("id"));
				String name = request.getParameter("name");
				String street = request.getParameter("street");
				String city = request.getParameter("city");
				String state = request.getParameter("state");
				String zip = request.getParameter("zip");
				Address address = new Address();
				address.setId(id);address.setName(name);
				address.setStreet(street);
				address.setCity(city);
				address.setState(state);
				address.setZip(zip);
				addressDao.update(address);
				//���¼�����������¼���
				path = "AddressServlet?method=list"; }  
		request.getRequestDispatcher(path).forward(request, response);
		}
		
}
			


