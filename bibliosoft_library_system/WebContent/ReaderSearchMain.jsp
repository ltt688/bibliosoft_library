<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Bibliosoft Search</title>
	<style type="text/css">
		.head{  color:#fff;position:absolute;right:0;top:0;margin:19px 0 5px;padding:0 96px 0 0;}
        .mav{float: left;color: #00BFFF;font-weight: 700;line-height: 24px;margin-left: 20px;font-size: 13px;text-decoration:underline;}
		.head a:hover{color:#00c}
		.centers{text-align: center;}
		.gen{position: absolute;right: 10px;width: 60px;height: 23px;float: left;color: #fff;background: #00BFFF;line-height: 24px;font-size: 13px;text-align: center;border-bottom: 1px solid #38f;margin-left: 19px;text-decoration: none}
		.imgs{margin-top: 30px}
		.sone{border: 1px solid #b6b6b6;background: #fff;display: inline-block;vertical-align:top;width: 539px;height:34px;border-color: #b8b8b8 #ccc #ccc #b8b8b8;overflow: hidden;}
		span{margin: 0;padding: 0}
		input{border: 0;padding: 0;}
		.sn{height: 16px;width: 18px;}
		.sou{width: 526px;height: 22px;font: 16px/18px arial;line-height: 18px;margin: 6px 0 0 7px;padding: 0;outline: 0;}
		.btn{width: 100px; height: 36px; color: #fff; font-size: 15px; letter-spacing: 1px; background: #00BFFF;} 
		.tail{text-align: center;}
		.one{height: 191.5px;}
		p,p>a{color: #999; line-height: 22px; font: 12px arial;}
		#lh a{margin-right:12px;}
		i{width: 14px;height: 17px;display: inline-block;}
	
	</style>
	<link rel="shortcut icon" href="assets/ico/logo.png">
</head>
<body background="images/back.png";>



<div class="baidu">
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
	<div class="centers">
		<div class="imgs">
			<img src="images/logo2.png" width="300" height="70">
		</div>
		<br>
		<br>
		<br>
		
		<form  action="SearchName" method="post" name="f" onsubmit="return chkForm(this)" id="f">    
      <div class="search_bgimg"><select class="option" name="choice" style="width:80px;height:35.78px;"BACKGROUND-COLOR: #FFFFF0;color: #003366;>
                                <option value="title">Title</option>
                                <option value="author">Author</option>
                                <option value="isbn">ISBN</option>
                              </select>
              <input type="hidden" id="historyCount" name="historyCount" value="1" />
          <span class="sone">
		  <input  type="text" name="strText"class="sou" maxlength="255">
		  </span>
			 <span>
			<input class="btn" type="submit" value="search">
		    </span>
             
              <br>
              <p><span id="msg" style="color:red"></span><br></p>
       
    					
                       
    	</div></form>
	</div>

	<div class="tail">
		<div class="one"></div>
		<div class="two">
			<img src="images/logo2.png" width="90" height="20">
		</div>
		<div class="thr">
			<p id="lh">
				<a href="http://ir.baidu.com">About  Bibliosoft</a>
				</p>
		</div>
		
	</div>
</div>

</body>
</html>