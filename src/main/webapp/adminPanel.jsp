<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ page import="com.hybridx.model.Admin" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>admin Panel</title>
</head>
<body>
	<%
		Admin admin = (Admin)session.getAttribute("admin");
		if(admin != null){
	%>
		<h2><%= admin.getName() %></h2>
		<h2><%= admin.getEmail() %></h2>
		<h2><%= admin.getId() %></h2>
	<%	
		}
	%>
	
	<a href="Home.jsp">Home</a>
	<a href="adminLogin.jsp">Admin Panel</a>
</body>
</html>