<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="Author" contect="http://www.webqin.net">
<title>forgot passwrd</title>
<link rel="shortcut icon" href="images/favicon.ico" />
<link type="text/css" href="css/css.css" rel="stylesheet" />
</head>
<body background="images/pwd.jpg">
 <div class="content">
   <div class="web-width">
     <div class="for-liucheng">
      <div class="liulist for-cur"></div>
      <div class="liulist for-cur"></div>
      <div class="liulist for-cur"></div>
      <div class="liulist"></div>
      <div class="liutextbox">
       <div class="liutext for-cur"><em>1</em><br /><strong>Fill in the account</strong></div>
       <div class="liutext for-cur"><em>2</em><br /><strong>Verification of Identity</strong></div>
       <div class="liutext for-cur"><em>3</em><br /><strong>set new password</strong></div>
       <div class="liutext"><em>4</em><br /><strong style="color:white">finish</strong></div>
      </div>
     </div><!--for-liucheng/-->
	   <br><br><br><br><br>
     <form action="ReaderForgetpwd4.jsp" method="get" class="forget-pwd">
       <dl>
        <dt><strong style="width: auto;color:white">Newpassword：</dt>
        <dd><input type="password" /></dd>
        <div class="clears"></div>
       </dl> 
       <dl>
        <dt><stong style="width: auto;color:white" >re-confirm：</dt>
        <dd><input type="password" /></dd>
        <div class="clears"></div>
       </dl> 
       <div class="subtijiao"><input type="submit" value="next" /></div> 
      </form><!--forget-pwd/-->
   </div><!--web-width/-->
  </div><!--content/-->
</body>
</html>