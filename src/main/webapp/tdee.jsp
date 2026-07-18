<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>tdee</title>
</head>
<body>
	<h1>TDEE Calculator</h1>
	<form action="tdee" method="post">
		<input type="number" name="weight" Placeholder="Weight" required>
		<input type="number" name="height" Placeholder="Height" required>
		<input type="number" name="age"    Placeholder="Age"    required>
		
		<select name="gender">
			<option value="">-Gender-</option>
			<option value="Male">Male</option>
			<option value="Female">Female</option>
		</select>
		
		<select name="activity">
			<option value="----">-Activity-</option>
			<option value="1.2">Sedentary</option>
			<option value="1.375">Lighly Active</option>
			<option value="1.55">Moderate Active</option>
			<option value="1.725">Highly Active</option>
			<option value="1.9">Athlete</option>
		</select>
		
		<input type="submit" value="Get TDEE">
	</form>
	<a href="Dashboard.jsp">Dashboard</a>
	<a href="logout">Logout</a>
</body>
</html>