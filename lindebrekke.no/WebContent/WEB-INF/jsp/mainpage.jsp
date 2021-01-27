<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/mainpage.css" rel="stylesheet" type="text/css">
<link href="css/general.css" rel="stylesheet" type="text/css">
<title> Main page</title>
</head>
<body class="background">

	<div class="title"> This is the main page. </div>
	<p class="text"> I am currently working on it. </p>
	<p class="text"> Here is a list of all users on the site. </p>
	<br></br> <br></br>
	
	<div class="table-wrapper">
		<table>
			<tr class="text">
				<th> Username </th>
				<th> Firstname </th>
				<th> Lastname </th>
			</tr>
			
				
			<c:forEach var="user" items="${allUsers}">
				<tr class="smallText">
					<td>${user.username}</td>
					<td>${user.firstname}</td>
					<td>${user.lastname}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>