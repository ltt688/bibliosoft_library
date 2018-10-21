<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
            <option value="Borrowhistory.jsp">Borrowed books </option>
            <option value="Returnedhistory.jsp">Returned books </option>
        </select>
    </form>


<div>

<p>
<table cellpadding="10"  style="border-collapse:collapse;" background="images/timg.jpg" align="center">
<tr>
<th>Already borrowed </th>
<th>Hours of loan service </th>
<th>Expiry time </th>
<th>State </th>
</tr>

<tr>
<td>百年孤独</td>
<td>1998.12.30</td>
<td>1999.1.29</td>
<td>超期</td>
</tr>

<tr>
<td>雷野的幸福生活</td>
<td>2018.9.18</td>
<td>2018.10.17</td>
<td>期内</td>
</tr>

<tr>
<td>李大娘带你健♂身</td>
<td>2016.9.8</td>
<td>2016.10.7</td>
<td>超期</td>
</tr>

</table>
</p>
</div>


</body>
</html>