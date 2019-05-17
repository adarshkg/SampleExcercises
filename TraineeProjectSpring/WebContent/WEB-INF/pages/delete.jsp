<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="delete" >
		<table>

			<tr>
				<td>Trainee ID</td>
				<td><input type="text" name="id" required="true"></td>
				<td><input type="submit" name="delete" value="DELETE"></td>
			</tr>

			<tr>
			<td>Trainee Id</td>
			<td>Trainee Name</td>
			<td>Trainee Location</td>
			<td>Trainee Domain</td>

			</tr>
			<tr>
				<td>${tran.id}</td>
				<td>${tran.name}</td>
				<td>${tran.location}</td>
				<td>${tran.domain}</td>
				
			</tr>
		</table>


	</form>
</body>
</html>