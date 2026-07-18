<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.hybridx.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
</head>
<body>
	<h1>DashBoard</h1>
	<%
		Athlete athlete = (Athlete)session.getAttribute("athlete");
	%>
	<H2>
	<%= athlete.getId() %>
	<%= athlete.getName() %>
	<%= athlete.getEmail() %>
	</H2>
	<a href="tdee.jsp">TDEE Calculator</a>
	<a href="logout">Logout</a>
</body>
</html>