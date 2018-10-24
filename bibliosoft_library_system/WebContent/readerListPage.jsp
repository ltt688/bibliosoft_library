<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
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
			</c:forEach>
		</table>
	</div>
     <a href="addReaderPageWeb"><button class="button">Create</button></a>
</body>
</html>