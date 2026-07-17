<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hybrid-X</title>
</head>
<body>
	<h1>HybridX - Smart Athlete Training System</h1>
	<form action="login" method="post">
		<input type="email" name="email" id="email" placeholder="Email" required >
		<input type="password" name="password" id="password" placeholder="Password" required>
		<input type="submit" value="Login">
	</form>
	
	<a href="signup.jsp">Register Athlete</a>
	
	<% 
		String success = (String)request.getAttribute("Success");
		if(success !=null){
	%>
		<p style="color:green">Athlete Created</p>
	<%
		}
	%>
</body>
</html>