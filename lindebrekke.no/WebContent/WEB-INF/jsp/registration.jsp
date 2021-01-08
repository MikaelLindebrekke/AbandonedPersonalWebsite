<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/registrationForm.css" rel="stylesheet" type="text/css">
<link href="css/general.css" rel="stylesheet" type="text/css">
<title>Registration</title>
</head>
<body class="background">
	<div class="title"> Welcome to the site. </div>

	<form action="registration" method="post" id="registrationForm">
		
		
		<div class="formElement">
			<label> Your firstname: </label>
			<input name="firstname" type="text">
		</div>
		<div class="formElement">
			<label> Your lastname: </label>
			<input name="lastname" type="text">
		</div>
		<div class="formElement">
			<label> Create username: </label>
			<input name="newUsername" type="text">
		</div>
		<div class="formElement">
			<label> Create password: </label>
			<input name="newPassword" type="password">
		</div>
		<div class="formElement">
			<label> Repeat password: </label>
			<input name="repeatPassword" type="password">
		</div>
		
		<div class="errorText"> ${ToBeAdded}</div>
	
	</form>
	
	<div class="button">
		<button type="submit" form="registrationForm" value="Register">Register</button>
	</div>
	
	<br></br><br></br>
	<p class="smallText"> <a href="login"> Do you want to login instead?</a>
	
</body>
</html>