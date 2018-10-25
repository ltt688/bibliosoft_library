<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;meta charset="utf-8">
<title>borrow history</title>
<style>
table,td,th
{
	border:1px solid black;
}
table
{
	width:60%;
}
th
{
	height:50px;
}
p.pos_fixed
{
	position:fixed;
	top:100px;
	right:5px;
}
</style>
</head>
<body background="images/bibliosoft background1.PNG"
style="background-repeat:no-repeat;background-size:100% 100%;background-attachment: fixed;">

<form>
        <select onchange="window.location=this.value;">
            <option value="BorrowServlet">Borrowed books </option>
            <option value="RetuenServlet">Returned books </option>
        </select>
    </form>


<div>


<table cellpadding="10"  style="border-collapse:collapse;" background="images/timg.jpg" align="center">
	<tr>
		 					<td>borrow_id</td>
							<td>reader_phone</td>
							<td>book_id</td>
							<td>borrow_date</td>
							<td>deadline_date</td>
							<td>return_date</td>
							<td>borrow_state</td>
	</tr>
	<c:forEach items="${students}" var="student" varStatus="st">
	<c:if test="${student.borrow_state eq 'borrow'}">
		<tr>
			<td>${student.borrow_id}</td>
			<td>${student.reader_phone}</td>
			<td>${student.book_id}</td>
			<td>${student.borrow_date}</td>
			<td>${student.deadline_date}</td>
			<td>${student.return_date}</td>
			<td>${student.borrow_state}</td>
		</tr>
		</c:if>
	</c:forEach>

</table>

</div>


</body>
</html>