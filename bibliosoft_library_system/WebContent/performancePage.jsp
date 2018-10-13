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
		<div class="panel-head" id="add">
			<strong><span class="icon-pencil-square-o"></span>Recordings</strong>
		</div>
		<div class="body-content">
			<table class="table table-hover text-center">
			<tr>
				<th style="text-align: left;">ID</th>
				<th >account</th>
				<th >performance</th>
				<th>object</th>
				<th >date</th>
			</tr>
			<c:forEach items="${pfs}" var="performance" varStatus="bo">
				<tr>
					 <td>  ${performance.getId()} </td>
					 <td> ${performance.getAccount()} </td>
					 <td>  ${performance.getPerformance()} </td>
					 <td> ${performance.getObject()} </td>
					 <td>  ${performance.getDate()}   </td>
				</tr>
			</c:forEach>
		</table>
		</div>
	</div>

</body>
</html>