<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>forgot password</title>
<link type="text/css" href="css/css.css" rel="stylesheet" />
</head>
<body  background="images/pwd.jpg">
 <div class="content">
   <div class="web-width">
     <div class="for-liucheng">
      <div class="liulist for-cur"></div>
      <div class="liulist for-cur"></div>
      <div class="liulist"></div>
      <div class="liulist"></div>
      <div class="liutextbox">
       <div class="liutext for-cur"><em>o</em><br /><strong></strong></div>
       <div class="liutext for-cur"><em>1</em><br /><strong>Fill in new password</strong></div>
       <div class="liutext"><em>o</em><br /><strong style="color:white"></strong></div>
       <div class="liutext"><em>2</em><br /><strong style="color:white">Finish</strong></div>
      </div>
     </div><!--for-liucheng/-->
	   <br><br><br><br><br>
     <form action="SetpwdServlet" method="get" class="forget-pwd" onsubmit="return chkForm(this)">
       <dl>
        <dt><h4 style="color:white"> YourPhone:</h4></dt>
        <dd><input type="text" name="reader_phone" style="width:300px; color:white"></dd>
        <div class="clears"></div>
       </dl> 
       <dl>
         <dl><div>
        <dt><h4 style="color:white"> NewPassword:</h4></dt>
        <dd><input type="text" name="reader_password" style="width:300px; color:white"></dd></div>
        <div class="clears"></div>
       </dl> 
       <dl>
       </dl>
       <div class="subtijiao"><input type="submit" value="submit" /></div> 
      </form><!--forget-pwd/-->
   </div><!--web-width/-->
  </div><!--content/-->
  

</body>
</html>
<script type="text/javascript">

    function chkForm(theForm){
      if (theForm.reader_phone.value==""|theForm.reader_password.value=="") {
        alert("Can't be empty ");
        theForm.strText.focus();
        return (false);
      }
    }

</script> 