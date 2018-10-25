<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://jsptags.com/tags/navigation/pager" prefix="pg" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title></title>
<link rel="stylesheet" href="css/pintuer.css">
<link rel="stylesheet" href="css/admin.css">
<script src="js/jquery.js"></script>
<script src="js/pintuer.js"></script>
</head>
<body>
<form  action="bookListPageWeb" method="post" name="f" onsubmit="return chkForm(this)" id="f">  
	<div class="baidu" id="fix">
  
      <div class="search_bgimg">
              <input type="hidden" id="historyCount" name="historyCount" value="1" />
          <span class="sone">
          Please input the name of book
		  <input  type="text" name="book_name_search" class="sou" style ="width:500px ;heigh:400px" style="center">
		  </span>
			 <span>
			<input class="btn" type="submit" value="search">
		    </span>
             
              <br>
              <p><span id="msg" style="color:red"></span><br></p>
       
    					
                       
    	</div>
</div>


<pg:pager url="bookListPageWeb" maxPageItems = "5" maxIndexPages="10" export="offset,currentPageNumber=pageNumber" isOffset="false"  index="half-full"  >
	<div class="panel admin-panel">

		<table class="table table-hover text-center">
			<tr>
				<th style="text-align: left;">ID</th>
				<th >Title</th>
				<th >Author</th>
				<th >ISBN</th>
				<th >Publisher</th>
				<th >Book Info</th>
			    <th >China Type</th>
			    <th >Science Type</th>
			    <th >Publish date</th>
			    <th >Book Price</th>
			    <th >Book state</th>
			    <th >Location</th>
			</tr>
			<c:forEach items="${books}" var="book" varStatus="bo">
			<pg:item>
				<tr>
					<td style="text-align: left;"><input type="checkbox" name="focus" value="${book.getId()}" />
					${book.getId()}</td>
					<td>${book.getTitle()}</td>
					<td>${book.getAuthor()}</td>
					<td>${book.getIsbn()}</td>
					<td>${book.getPublisher()}</td>
					<td>${book.getBook_info()}</td>
					<td>${book.getChina_type()}</td>
					<td>${book.getScience_type()}</td>
					<td>${book.getPublish_date()}</td>
					<td>${book.getBook_price()}</td>
					<td>${book.getBook_state()}</td>
					<td>${book.getLocation()}</td>
					<td>
					<form action="editBookPageWeb" method="post">
					<a href="#"><button class="button" name="edit_id" value="${book.getId()}">Edit</button></a> 
					</form>
					<form action="bookListPageWeb" method="post">
					<a href="#"><button class="button" name="delete_id" value="${book.getId()}">Delete</button></a>
					</form>
					</td>
				</tr>
				</pg:item>
			</c:forEach>
		</table>
<div style="text-align:center">
						  <pg:index>
  <pg:first>  
    <div class="button"><a href="${pageUrl}">Home</a></div>  
  </pg:first>  
  <pg:prev>  
    <div class="button"><a href="${pageUrl }">Pre</a></div>  
  </pg:prev>  
  <pg:pages>  
    <c:choose>
         <%--当循环页码是当前页码，则该页码不可以导航，并显示为红色--%>
      <c:when test="${currentPageNumber eq pageNumber}">  
        <font color="red">[${pageNumber }]</font>  
      </c:when>
     
      <%-- 当循环页码不是当前页码，则该页码可以导航 --%>
      <c:otherwise>  
        <a href="${pageUrl }">[${pageNumber }]</a>  
      </c:otherwise>  
    </c:choose>  
  </pg:pages>  
  <pg:next>  
    <div class="button"><a href="${pageUrl }">Next</a></div>  
  </pg:next>  
  <pg:last>  
    <div class="button"><a href="${pageUrl }">Last</a></div>  
  </pg:last>
  </pg:index>
  </div>
	</div>
	</pg:pager>
			</form>
     <a href="addBookPageWeb"><button class="button">Add Without ISBN</button></a>
     <a href="addBookPage2Web"><button class="button">Add With ISBN</button></a>   

</body>
</html>