<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>Bibliosoft Reader </title>  
    <link rel="stylesheet" href="css/pintuer.css">
    <link rel="stylesheet" href="css/admin.css">
    <script src="js/jquery.js"></script> 
    <link rel="shortcut icon" href="assets/ico/logo.png">  
</head>
<body style="background-color:#f2f9fd;">
<div class="header bg-main">
  <div class="logo margin-big-left fadein-top">
    <h4><img src="images/logo1.png" class="radius-circle rotate-hover" height="50" alt="" />Not Login</h4>
  </div>

<div class="head-l">
<div class="col-lg-5  pull-right">
  <a class="button button-little bg-blue" href="ReaderLogin.jsp" target="_blank" >login</a>&nbsp;&nbsp;
  <a class="button button-little bg-green" href="ReaderSearchMain.jsp" target="_blank">Search</a> &nbsp;&nbsp;
  <a class="button button-little bg-red" href=ReaderUsermain1.jsp>Logout</a>
  </div>
</div>

<div class="leftnav">
  <div class="leftnav-title"><strong><span class="icon-list"></span>User function</strong></div>
  <h2><span class="icon-pencil-square-o">Book settings</span></h2>
  <ul style="display:block">
    <li><a href="Post.jsp" target="right"><span class="icon-caret-right"></span>System Posts</a></li>   
    <li><a href="ReaderSearch.jsp" target="right"><span class="icon-caret-right"></span>Search Books</a></li>   
    <li><a href="stuList" target="right"><span class="icon-caret-right"></span>Check out Books</a></li>   
  </ul>   
</div>
</div>
<script type="text/javascript">
$(function(){
  $(".leftnav h2").click(function(){
	  $(this).next().slideToggle(200);	
	  $(this).toggleClass("on"); 
  })
  $(".leftnav ul li a").click(function(){
	    $("#a_leader_txt").text($(this).text());
  		$(".leftnav ul li a").removeClass("on");
		$(this).addClass("on");
  })
});
</script>
<ul class="bread">
  <li><a href="ReaderSearchMain.jsp" target="right" class="icon-home">Home</a></li>
  <li><b>Language:</b><span style="color:red;">English</span> </li>
</ul>
<div class="admin">
  <iframe scrolling="auto" rameborder="0" src="ReaderSearchMain.jsp" name="right" width="100%" height="100%"></iframe>
</div>
</body>
</html>