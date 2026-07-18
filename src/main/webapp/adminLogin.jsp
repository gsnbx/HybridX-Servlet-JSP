<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>adminLogin</title>
</head>
<body>
	<h1>HybridX - Smart Hybrid Athlete Training System</h1>
	<h2>Admin Login</h2>
	<form action="admin" method="post">
		<input type="email" name="email" id="email" placeholder="Email" required >
		<input type="password" name="password" id="password" placeholder="Password" required>
		<input type="submit" value="Login">
	</form>
	
	<a href="Home.jsp">Home</a>
	
	<%
		String error = (String)session.getAttribute("error");
		if(error != null){
	%>
		<p style="color:red"><%= error %> </p>
	
	<%
		session.removeAttribute("error");
		}
	%>
</body>
</html>