<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!--A Design by W3layouts
  Author: W3layout
  Author URL: http://w3layouts.com
  License: Creative Commons Attribution 3.0 Unported
  License URL: http://creativecommons.org/licenses/by/3.0/
  -->
<!DOCTYPE html>
<html lang="en">
<head>
<title>autolightlogin</title>
<!-- Meta tags -->
<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content=" Marvel Sign In Form Responsive Widget, Audio and Video players, Login Form Web Template, Flat Pricing Tables, Flat Drop-Downs, Sign-Up Web Templates, Flat Web Templates,
      Login Sign-up Responsive Web Template, Smartphone Compatible Web Template, Free Web Designs for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design" />
<script>
      
    
    </script>
<!-- Meta tags -->
<!-- font-awesome icons -->
<link
	href="css/fontawesome-all.min.css"
	rel="stylesheet" type="text/css" media="all">
<!-- //font-awesome icons -->
<!--stylesheets-->
<link href="css/style.css"
	rel='stylesheet' type='text/css' media="all">
<!--//style sheet end here-->
<link href="//fonts.googleapis.com/css?family=Tangerine:400,700"
	rel="stylesheet">
<link
	href="//fonts.googleapis.com/css?family=Montserrat:300,400,500,600"
	rel="stylesheet">
</head>
<body>
	<h1 class="header-w3ls">Autolight Sign In Form</h1>
	<div class="main">
		<div class="headder-icon">
			<div class="top-icon">
				<span class="fas fa-angle-double-down"></span>
			</div>
		</div>
		<div class="its-sign-in">
			<h2>Sign in Here</h2>
		</div>
		<form
			action="${pageContext.request.contextPath}/usercontroller/login.do"
			method="post">
			<div class="form-left-w3l">
				<input id="user_name" type="username" name="user_name"
					placeholder="用户名" required="">
			</div>
			<div class="form-left-w3l">
				<input id="user_password" type="password" name="user_password"
					placeholder="密码" required="">
			</div>
			<div class="rem-pass-agile">
				<div class="left-side">
					<input type="checkbox" class="checked"> <span class="span">Remember
						me </span>
				</div>
				<div class="right-side">
					<a href="#" class="for">Forgot password...?</a>
				</div>
				<div class="clear"></div>
			</div>
			<div class="btnn">
				<button type="submit">Sign in</button>
				<br>
				<div class="clear"></div>
			</div>
		</form>
</body>
</html>