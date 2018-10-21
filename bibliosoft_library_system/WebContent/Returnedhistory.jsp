<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
<title>return history</title>
</head>
<body background="images/bibliosoft background1.PNG"
style="background-repeat:no-repeat;background-size:100% 100%;background-attachment: fixed;">

<p>
<form>
        <select onchange="window.location=this.value;">
        <option value="Returnedhistory.jsp">Returned books </option>
             <option value="Borrowhistory.jsp">Borrowed books </option>
        </select>
    </form>
</p>

<div>

<p>
<table cellpadding="10"  style="border-collapse:collapse;" background="images/timg.jpg" align="center">
<tr>
<th>Already borrowed </th>
<th>Hours of loan service </th>
<th>Expiry time </th>
<th>state </th>
<th>Fines(dollar)</th>
</tr>

<tr>
<td>百年孤独</td>
<td>1998.12.30</td>
<td>1999.1.29</td>
<td>延期归还</td>
<td>3</td>
</tr>

<tr>
<td>雷野的幸福生活</td>
<td>2018.10.18</td>
<td>2018.9.17</td>
<td>按时归还</td>
<td>0</td>
</tr>

<tr>
<td>李大娘带你健♂身</td>
<td>2016.9.8</td>
<td></td>
<td>未归还</td>
<td>72</td>
</tr>

<tr>
<td>当前待支付总罚金</td>
<td></td>
<td></td>
<td></td>
<td>75</td>
</tr>

</table>
</p>
</div>


</body>
</html>