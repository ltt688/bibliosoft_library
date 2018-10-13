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
			</c:forEach>
		</table>
	</div>
     <a href="addBookPageWeb"><button class="button">Add</button></a>
</body>
</html>