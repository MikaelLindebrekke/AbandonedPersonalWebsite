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
			<input name="firstname" type="text" value="${keepFN}">
			<font class="errorText"> ${errorFN} </font>
		</div>
		<div class="formElement">
			<label> Your lastname: </label>
			<input name="lastname" type="text" value="${keepLN}">
			<font class="errorText"> ${errorLN} </font>
		</div>
		<div class="formElement">
			<label> Create username: </label>
			<input name="newUsername" type="text" value="${keepUN}">
			<font class="errorText"> ${errorUN} </font>
		</div>
		<div class="formElement">
			<label> Create password: </label>
			<input name="newPassword" type="password" value="${keepPWD}">
			<font class="errorText"> ${errorPWD} </font>
		</div>
		<div class="formElement">
			<label> Repeat password: </label>
			<input name="passwordRepeated" type="password" value="${keepPWDRep}">
			<font class="errorText"> ${errorPWDRep} </font>
		</div>
		
		
	
	</form>
	
	<div class="button">
		<button type="submit" form="registrationForm" value="Register">Register</button>
	</div>
	
	<br></br><br></br>
	<p class="smallText"> <a href="login"> Do you want to login instead?</a>
	
</body>
</html>