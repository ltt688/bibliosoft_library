<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title>Librarian Management System</title>
<link rel="stylesheet" href="css/pintuer.css">
<link rel="stylesheet" href="css/admin.css">
<script src="js/jquery.js"></script>
</head>
<body style="background-color: #f2f6fd;">
	<div class="header bg-main">
		<div class="logo margin-big-left fadein-top">
			<h1>
				<img src="#" class="radius-circle rotate-hover" height="50" alt="" />Librarian
				Management System
			</h1>
		</div>
	</div>

	<div class="leftnav">
		<div class="leftnav-title">
			<strong><span class="icon-list"></span>Menu list</strong>
		</div>
		<h2>
			<span class="icon-pencil-square-o"></span>Book Management
		</h2>
		<ul style="display: block">
			<li><a href="borrowPageWeb" target="right"><span
					class="icon-caret-right"></span>Borrow Book</a></li>
			<li><a href="returnBookPage.jsp" target="right"><span
					class="icon-caret-right"></span>Return Book</a></li>
			<li><a href="bookListPageWeb" target="right"><span
					class="icon-caret-right"></span>Add/Delete Book</a></li>
		</ul>
		<h2>
			<span class="icon-user"></span>Reader Management
		</h2>
		<ul style="display: block">
			<li><a href="readerListPageWeb" target="right"><span
					class="icon-caret-right"></span>Create/Delete Reader</a></li>
			<li><a href="borrowRecordsPageWeb" target="right"><span
					class="icon-caret-right"></span>Borrow Records</a></li>		
			<li><a href="readerRequrementsWeb" target="right"><span
					class="icon-caret-right"></span>Reader Requrements</a></li>
			<li><a href="punishWeb" target="right"><span
					class="icon-caret-right"></span>Reader Punishments</a></li>
		</ul>
			<h2>
			<span class="icon-user"></span>Account Information
		</h2>
		<ul style="display: block">
			<li><a href="" target="right"><span
					class="icon-caret-right"></span>Librarian Information</a></li>
			<li><a href="login.jsp" ><span
					class="icon-caret-right"></span>Logout</a></li>
			
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
		<li><a href="#" target="right" class="icon-home">WelcomePage</a></li>
		<li><b>Language</b><span style="color: red;">EN</span></li>
	</ul>
	<div class="admin">
		<iframe scrolling="auto" rameborder="0" src="#" name="right"
			width="100%" height="100%"></iframe>
	</div>
</body>
</html>