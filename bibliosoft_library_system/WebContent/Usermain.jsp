<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>系统管理中心</title>  
    <link rel="stylesheet" href="css/pintuer.css">
    <link rel="stylesheet" href="css/admin.css">
    <script src="js/jquery.js"></script>   
</head>
<body style="background-color:#f2f9fd;">
<div class="header bg-main">
  <div class="logo margin-big-left fadein-top">
    <h1><img src="images/logo1.jpg" class="radius-circle rotate-hover" height="50" alt="" />User</h1>
  </div>
  <div class="head-l"><a class="button button-little bg-green" href="SearchMain.jsp" target="_blank"> SearchBook</a> &nbsp;&nbsp;
  <a class="button button-little bg-red" href=index3.html"><span class="icon-power-off"></span> Logout</a> </div>
</div>
<div class="leftnav">
  <div class="leftnav-title"><strong><span class="icon-list"></span>User function</strong></div>
  <h2><span class="icon-pencil-square-o">Book settings</span></h2>
  <ul style="display:block">
    <li><a href="SearchName.jsp" target="right"><span class="icon-caret-right"></span>Search Books</a></li>   
    <li><a href="page-user.html" target="right"><span class="icon-caret-right"></span>Check out Books</a></li>   
    <li><a href="page-liuyan.html" target="right"><span class="icon-caret-right"></span>留言管理</a></li>    
  </ul>   
  <h2><span class="icon-user"></span>Personal Settings</h2>
  <ul>
    <li><a href="page-create.html" target="right"><span class="icon-caret-right"></span>Personal Information</a></li>
    <li><a href="page-delete.html" target="right"><span class="icon-caret-right"></span>删除账号</a></li>
    <li><a href="page-xiugai.html" target="right"><span class="icon-caret-right"></span>修改账号</a></li>
    <li><a href="page-search.html" target="right"><span class="icon-caret-right"></span>查找账号</a></li>
    <li><a href="page-pass.html" target="right"><span class="icon-caret-right"></span>修改密码</a></li>        
  </ul>  
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
  <li><a href="page-welcome.html" target="right" class="icon-home"> 首页</a></li>
  <li><a href="page-welcom.html" id="a_leader_txt">网站信息</a></li>
  <li><b>当前语言：</b><span style="color:red;">中文</php></span> </li>
</ul>
<div class="admin">
  <iframe scrolling="auto" rameborder="0" src="SearchMain.jsp" name="right" width="100%" height="100%"></iframe>
</div>
</body>
</html>