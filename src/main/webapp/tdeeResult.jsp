<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>tdee calc</title>
</head>
<body>
	<%
		Double tdee = (Double) request.getAttribute("tdee");
	%>
	<h1>Your tdee is : <%= tdee %></h1>
	
	<a href="logout">Logout</a>
	<a href="Dashboard.jsp">Dashboard</a>
</body>
</html>