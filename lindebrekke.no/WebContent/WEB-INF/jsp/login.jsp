<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/login.css" rel="stylesheet" type="text/css">
<title>Login</title>
</head>
<body class="background">
	<div class="title"> Welcome to the site. </div>
	
	<p class="text"> Then you may login here. </p>
	
	<form action="login" method="post" id="loginForm">
		
		<div class="loginstyle"> 
			<label> Username: </label>
			<input name="username" type="text">
		</div>	
		<div class="loginstyle"> 
			<label> Password: </label>
			<input name="password" type="text">
		</div>	

		<div class="errorText"> ${errorMessage}</div>
			
	</form>
	<div class="button">
		<button type="submit" form="loginForm" value="Login">Login</button>
	</div>
	
</body>
</html>