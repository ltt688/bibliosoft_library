<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Bibliosoft Reader Login</title>

        <!-- CSS -->
 
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="assets/css/form-elements.css">
        <link rel="stylesheet" href="assets/css/style.css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Favicon and touch icons -->
        <link rel="shortcut icon" href="assets/ico/logo.png">
    </head>

    <body>

		<!-- Top menu -->
		<nav class="navbar navbar-inverse navbar-no-bg" role="navigation">
			<div class="container">
			
				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="top-navbar-1">
					<ul class="nav navbar-nav navbar-right">
						<li>
						<h4>
						<img src="assets/img/logo2.png" style="width:45px;height:18px" >
							
								If you have not registered your account, please click  
							
							<a href="ReaderUsermain1.jsp"><strong>Bibliosoft</strong></a> 
							
								to log in. 
							</h4>
						</li>
					</ul>
				</div>
			</div>
		</nav>

        <!-- Top content -->
        <div class="top-content">
        	
            <div class="inner-bg">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-7 text">
    
                             <h1><strong>Bibliosoft Reader login rules</strong> </h1>
                            <div class="description">
                            	<h4>
	                            	 Login – only after Librarian Register Reader Account with Deposit 300 Yuan<br>
 				                     Default reader Login password 12345678 
                            	</h4>
                            </div>   
                        </div>
                        <div class="col-sm-5 form-box">
                        
                            <div class="form-bottom">
			            <form action="login" method="post" class="fh5co-form animate-box" data-animate-effect="fadeInRight">
						<div class="form-top-left">
                        			<h3>Sign up now</h3>
                            		<p>Please fill in your account and password in the form below.</p>
                        		</div>
                        		<div class="form-top-right">
                        			<i class="fa fa-pencil"></i>
                        		</div>
						<div class="form-group">
							<label for="username" class="sr-only">Username</label>
							<input type="text" class="form-control" id="reader_phone"  name="reader_phone"   placeholder="reader_phone" autocomplete="off"value="${reader_phone}"/>
						</div>
						<div class="form-group">
							<label for="password" class="sr-only">Password</label>
							<input type="password" class="form-control" id="reader_password" placeholder="reader_password" autocomplete="off"name="reader_password" value="${reader_password}"/ >
		                <br>
		               
		               
						<div class="form-group">
						    <a href="ReaderForgetpwd1.jsp" class="btn btn-info">RetrievePassword</a>
							<td><input type="submit" value="Sign In" class="btn btn-primary"/></td>
			                <br>
			                <td><font size="2" color="red">${ error }</font></td>
							
						</div>
					</form>
		                    </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="copyrights">Maked By<a href=""  title="Bibliosoft">Bibliosoft</a></div>
        </div>


        <!-- Javascript -->
        <script src="assets/js/jquery-1.11.1.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/js/jquery.backstretch.min.js"></script>
        <script src="assets/js/retina-1.1.0.min.js"></script>
        <script src="assets/js/scripts.js"></script>
        
        <!--[if lt IE 10]>
            <script src="assets/js/placeholder.js"></script>
        <![endif]-->

    </body>

</html>