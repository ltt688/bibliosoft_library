<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import ="java.util.List" %>
<%@ page import ="bean.Student"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="js/jquery.min.js"></script>
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="js/bootstrap.min.js"></script>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script>
	$(function() {
		$("a").addClass("btn btn-default btn-xs");

	});
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Order</title>
<style type="text/css">
#bNav{
margin-top:10px;
background:#F0F8FF;
position:relative;
left:560px;
top:42px;
width:400px;
height:400px;
}
#bNav ul{
padding:4px 0;
margin:0;
overflow:hidden;
}
#bNav ul li{
list-style:none;
padding:0;
}
</style> 
</head>
<body background="images/disy1.jpg">
<%String id=request.getParameter("id");
List<Student> order=(List<Student>)request.getAttribute("students");%>
<table style="width: 500px; margin: 44px auto"
	class="table table-striped table-bordered table-hover  table-condensed"
	align='center' border='1' cellspacing='0'>
	
	<%for(Student e : order){
	if(e.getId().equals(id)){ %>
	<div id="bNav" class="bNav">
		<ul >
			<li>ID:<%=e.getId()%></li>
			<li>Title:<%=e.getTitle()%></li>
			<li>Author:<%=e.getAuthor()%></li>
			<li>ISBN:<%=e.getIsbn()%></li>
			<li>Publisher:<%=e.getPublisher()%></li>
			<li>Book_info:<%=e.getBook_info()%></li>
			<li>China_type:<%=e.getChina_type()%></li>
			<li>Science_type:<%=e.getScience_type()%></li>
			<li>Publish_date:<%=e.getPublish_date()%></li>
			<li>Book_price:<%=e.getBook_price()%></li>
			<li>Book_state:<%=e.getBook_state()%></li>
			<li>Location:<%=e.getLocation()%></li>	
		</ul>	
		<h4 align="justify"><a href="Order1.jsp"><button  type="button" class="btn btn-info">  Order  </button></a></h4>
</div>
<%}
	}%>
</table>
<nav>
	<ul class="pager">
    
   <h4 align=center><a href="ReaderSearchMain.jsp"><button  type="button" class="btn btn-primary">Return</button></a></h4> 
		
	</ul>
</nav>

</body>
</html>
