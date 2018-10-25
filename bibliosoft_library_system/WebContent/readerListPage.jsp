<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<%@taglib uri="http://jsptags.com/tags/navigation/pager" prefix="pg" %>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<form  action="readerListPageWeb" method="post" name="f" onsubmit="return chkForm(this)" id="f">  
	<div class="baidu" id="fix">
  
      <div class="search_bgimg">
              <input type="hidden" id="historyCount" name="historyCount" value="1" />
          <span class="sone">
          Please input the phone of reader
		  <input  type="text" name="reader_phone_search" class="sou" style ="width:500px ;heigh:400px" style="center">
		  </span>
			 <span>
			<input class="btn" type="submit" value="search">
		    </span>
             
              <br>
              <p><span id="msg" style="color:red"></span><br></p>
       
    					
                       
    	</div>
</div>

<pg:pager url="readerListPageWeb" maxPageItems = "5" maxIndexPages="10" export="offset,currentPageNumber=pageNumber" isOffset="false"  index="half-full"  >
	<div class="panel admin-panel">
   
		<table class="table table-hover text-center">
			<tr>
				<th width="9%" style="text-align: left;">Reader ID</th>
				<th width="9%">Reader name</th>
				<th width="9%">Reader password</th>
				<th width="9%">Reader phone</th>
				<th width="10%">Reader banzheng_date</th>
				<th width="10%">Reader shengxiao_date</th>
				<th width="9%">Reader daoqi_date</th>
				<th width="9%">Reader yj</th>
				<th width="9%">Reader Email</th>
				<th width="9%">Reader ljjs</th>
				<th width="9%">Reader rule_id</th>
			</tr>
			<c:forEach items="${readers}" var="reader" varStatus="bo">
			<pg:item>
				<tr>
					<td style="text-align: left;"><input type="checkbox" name="focus" value="${Read.getID()}" />
					${reader.getID()}</td>
					<td>${reader.name}</td>
					<td>${reader.password}</td>
					<td>${reader.phone}</td>
					<td>${reader.getBanZheng_date()}</td>
					<td>${reader.getShengXiao_date()}</td>
					<td>${reader.getDaoQi_date()}</td>
					<td>${reader.getYj()}</td>
					<td>${reader.getEmail()}</td>
					<td>${reader.getLjjs()}</td>
					<td>${reader.getRule_id()}</td>
					<td>
					<form action="editReaderPageWeb" method="post">
					<a href="#"><button class="button" name="edit_id" value="${reader.getID()}">Edit</button></a> 
					</form>
					<form action="readerListPageWeb" method="post">
					<a href="#"><button class="button" name="delete_id" value="${reader.getID()}">Delete</button></a>
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
     <a href="addReaderPageWeb"><button class="button">Create</button></a>
</body>
</html>