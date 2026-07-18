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
	<a href="adminLogin.jsp">Admin Login</a>
	
	<%
		//To print Error message for login
		String error = (String)request.getAttribute("error");
		if(error != null){
	%>
		<p style="color:red"><%=error %></p>
	<%} %>
	
	<% 
		//To print User created alert message
		String success = (String)session.getAttribute("Success");
		if(success !=null){
	%>
		<p style="color:green"><%=success %></p>
	<%
		session.removeAttribute("Success");
		}
		
	%>
</body>
</html>