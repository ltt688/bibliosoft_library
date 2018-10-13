<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="Author" contect="http://www.webqin.net">
<title>forgot password</title>
<link rel="shortcut icon" href="images/favicon.ico" />
<link type="text/css" href="css/css.css" rel="stylesheet" />
<script type="text/javascript" src="js/jquery-1.8.3-min.js"></script>
<script type="text/javascript">
 //导航定位
 $(function(){
	// $(".nav li:eq(2) a:first").addClass("navCur")
	 //验证手机 邮箱 
	 $(".selyz").change(function(){
	   var selval=$(this).find("option:selected").val();
		 if(selval=="0"){
			 $(".sel-yzsj").show()
			 $(".sel-yzyx").hide()
			 }
		 else if(selval=="1"){
			 $(".sel-yzsj").hide()
			 $(".sel-yzyx").show()
			 }
		 })
	 })
</script>
</head>
<body background="images/pwd.jpg">
<div class="content">
   <div class="web-width">
     <div class="for-liucheng">
      <div class="liulist for-cur"></div>
      <div class="liulist for-cur"></div>
      <div class="liulist"></div>
      <div class="liutextbox">
       <div class="liutext for-cur"><em>1</em><br /><strong>Fill in the account</strong></div>
       <div class="liutext for-cur"><em>2</em><br /><strong>Verification of Identity</strong></div>
       <div class="liutext"><em>3</em><br /><strong style="color:white">finish</strong></div>
      </div>
     </div><!--for-liucheng/-->
	   <br><br><br><br><br>
     <form action="ReaderForgetpwd4.jsp" method="get" class="forget-pwd">
       <dl class="">
        <dt><strong style="width: auto ;color:white">E-mailaddress: </strong></dt>
        <dd><input type="text" style="width: 250px" value="" readonly /></dd>
        <div class="clears"></div>
       </dl>
       <dl>
        <dt><strong style="color:white">given code:</strong></dt>
        <dd><input type="text" style="width: 100px" /> 
			<button style="width: 70px">get code</button></dd>
        <div class="clears"></div>
       </dl>
       <div class="subtijiao"><input type="submit" value="next" /></div> 
      </form><!--forget-pwd/-->
   </div><!--web-width/-->
  </div><!--content/-->
  
</body>
</html>