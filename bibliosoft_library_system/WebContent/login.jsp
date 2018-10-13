<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<script src="js/jquery.min.js"></script>
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="js/bootstrap.min.js"></script>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script>
	$(function() {
		$("a").addClass("btn btn-default btn-xs");

	});
</script>
<head>
<meta charset="utf-8">
<title>login</title>
<link rel="stylesheet" type="text/css" href="style/register-login.css">
<style>
.drag {
	width: 300px;
	height: 46px;
	line-height: 46px;
	background-color: #e8e8e8;
	position: relative;
	margin: 0 auto;
}

.bg {
	width: 46px;
	height: 100%;
	position: absolute;
	background-color: #75CDF9;
}

.text {
	position: absolute;
	width: 100%;
	height: 100%;
	text-align: center;
	user-select: none;
}

.btn {
	width: 46px;
	height: 46px;
	position: absolute;
	border: 1px solid #ccc;
	cursor: move;
	font-family: "Authentication is success！";
	text-align: center;
	background-color: #fff;
	user-select: none;
	color: #666;
}
</style>
</head>
<body>
	<div id="box"></div>
	<div class="cent-box">
		<div class="cent-box-header">
			<i><h1 style="color: deepskyblue">Bibliosoft</h1>
			<p >Manager Login</p>
				<i>
					<h2 class="sub-title"></h2>
		</div>

		<div class="cont-main clearfix">
			<div class="index-tab">
				<div class="index-slide-nav">
					<a href="login.jsp" class="active">login</a>
					<div class="slide-bar"></div>
				</div>
			</div>

			<div class="login form">
				<div class="group">
					<form action="login" method="post">
						<div class="group-ipt email">
							<input type="text" name="account" id="account" class="ipt"
								placeholder="please input your account number" required>
						</div>
						<div class="group-ipt password">
							<input type="password" name="password" id="password" class="ipt"
								placeholder="please input your password" required>
						</div>
						<div class="drag">
							<div class="bg"></div>
							<div class="text" onselectstart="return false;">Slide the block</div>
							<div class="btn">&gt;&gt;</div>
						</div>
				</div>
			</div>

			<div class="button">
				<button type="submit" class="login-btn register-btn" id="button">Login</button>
			</div>
			</form>
			<div class="remember clearfix">
				<label class="remember-me"><span class="icon"><span
						class="zt"></span></span><input type="checkbox" name="remember-me"
					id="remember-me" class="remember-mecheck" checked>remember me</label> <label
					class="forgot-password"> <a href="">forget password?</a>
				</label>
			</div>
		</div>
	</div>

	<div class="footer">
		<p>Biliosoft</p>
		<p>Designed By B2 team 2018</p>
	</div>

	<script src='js/particles.js' type="text/javascript"></script>
	<script src='js/background.js' type="text/javascript"></script>
	<script src='js/jquery.min.js' type="text/javascript"></script>
	<script src='js/layer/layer.js' type="text/javascript"></script>
	<script src='js/index.js' type="text/javascript"></script>
	<script>
        var $ = function(selector){
                return  document.querySelector(selector);
            },
            box = $(".drag"),
            bg = $(".bg"),
            text = $(".text"),
            btn = $(".btn"),
            success = false,
            distance = box.offsetWidth - btn.offsetWidth;
        btn.onmousedown = function(e){

            btn.style.transition = "";
            bg.style.transition ="";
            var e = e || window.event;
            var downX = e.clientX;

            document.onmousemove = function(e){

                var e = e || window.event;
                var moveX = e.clientX;
                var offsetX = moveX - downX;

                if( offsetX > distance){
                    offsetX = distance;
                }else if( offsetX < 0){
                    offsetX = 0;
                }

                
                btn.style.left = offsetX + "px";
                bg.style.width = offsetX + "px";

                
                if( offsetX == distance){

                    text.innerHTML = "Authentication is success";
                    text.style.color = "#fff";
                    btn.innerHTML = "&radic;";
                    btn.style.color = "green";
                    bg.style.backgroundColor = "lightgreen";
                    success = true;
                    btn.onmousedown = null;
                    document.onmousemove = null;
                    setTimeout(function(){
                        alert('Authentication success!');
                    },100);
                }
            }

            document.onmouseup = function(e){

                if(success){
                    return;
                }else{
                   
                    btn.style.left = 0;
                    bg.style.width = 0;
                    btn.style.transition = "left 1s ease";
                    bg.style.transition = "width 1s ease";
                }
                document.onmousemove = null;
                document.onmouseup = null;
            }


        }
    </script>
	<script>
            function mySubmit()
            </script>
	<script> 
            var errori ='<%=request.getParameter("error")%>';
            if(errori=='yes'){
             alert("Account or password wrong!");
            }
          </script>
</body>
</html>