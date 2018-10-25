<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body background="images/disy1.jpg">
<table style="width: 500px; margin: 44px auto"
	class="table table-striped table-bordered table-hover  table-condensed"
	align='center' border='1' cellspacing='0'>
	<tr>
		 					<td>publish_id</td>
							<td>reader_phone</td>
							<td>book_id</td>
							<td>publish_reason</td>
							<td>publish_result</td>
							<td>publish_price</td>
	</tr>
	<c:forEach items="${students}" var="student" varStatus="st">
		<tr>
			<td>${student.publish_id}</td>
			<td>${student.reader_phone}</td>
			<td>${student.book_id}</td>
			<td>${student.publish_reason}</td>
			<td>${student.publish_result}</td>
			<td>${student.publish_price}</td>
			
		</tr>
	</c:forEach>

</table>
</body>
</html>