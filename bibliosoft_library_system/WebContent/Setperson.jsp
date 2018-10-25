<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import ="java.util.List" %>
<%@ page import ="bean.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Set Personal Information</title>
<link type="text/css" href="css/css.css" rel="stylesheet" />
</head>
<body background="images/6.png">
<%String phone=request.getParameter("phone");
System.out.println(phone);
List<User> d=(List<User>)request.getAttribute("students");%>
<% for(User c:d) {
if(c.getReader_phone().equals(phone)){%>
<div class="content">
   <div class="web-width">
   <br><br>
    <h1 align=center style="color:white">Modify personal information </h1>
	   <br><br><br><br><br>
     <form action="SetpersonServlet" method="get"class="forget-pwd" onsubmit="return chkForm(this)">
       <dl>
        <dt><h4 style="color:white"> YourPhone:</h4></dt>
        <dd><input type="text" name="reader_phone" style="width:300px; color:white"value="<%out.println(c.getReader_phone());%>"></dd>
        <div class="clears"></div>
       </dl> 
       <dl>
         <dl><div>
        <dt><h4 style="color:white"> Name:</h4></dt>
        <dd><input type="text" name="reader_name" style="width:300px; color:white"value="<%out.println(c.getReader_name());%>"></dd></div>
        <div class="clears"></div>
       </dl> 
       <dl>
       </dl>
        <dl><div>
        <dt><h4 style="color:white"> Birthday:</h4></dt>
        <dd><input type="text" name="reader_birthday" style="width:300px; color:white"value="<%out.println(c.getReader_birthday());%>"></dd></div>
        <div class="clears"></div>
       </dl> 
       <dl>
       </dl>
        <dl><div>
        <dt><h4 style="color:white"> Email:</h4></dt>
        <dd><input type="text" name="reader_email" style="width:300px; color:white"value="<%out.println(c.getReader_email());%>"></dd></div>
        <div class="clears"></div>
       </dl> 
       <dl>
       </dl>
        <dl><div>
        <dt><h4 style="color:white"> Adderss:</h4></dt>
        <dd><input type="text" name="reader_address" style="width:300px; color:white"value="<%out.println(c.getReader_address());%>"></dd></div>
        <div class="clears"></div>
       </dl> 
       <dl>
       </dl>
       <div class="subtijiao"><input type="submit" value="submit" /></div> 
      </form><!--forget-pwd/-->
   </div><!--web-width/-->
  </div><!--content/-->
</form>
</body>
</html>

<script type="text/javascript">

    function chkForm(theForm){
      if (theForm.reader_phone.value=="") {
        alert("Can't be empty ");
        theForm.strText.focus();
        return (false);
      }
    }

</script> 
<%}
}%>