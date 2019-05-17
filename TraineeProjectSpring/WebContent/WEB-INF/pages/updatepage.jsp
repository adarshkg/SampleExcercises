<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:form action="update" method="post" modelAttribute="tran">
	<table>

		<tr>
			<td>Trainee ID</td>
			<td><input type="text" name="id" required="true"></td>
		</tr>

		<tr>
			<td>Trainee Name</td>
			<td><input type="text" name="name" required="true"></td>
		</tr>

		<tr>
			<td>Trainee Location</td>
			<td><input type="radio" name="location" value="Chennai">Chennai</td>
			<td><input type="radio" name="location" value="Bangalore">Bangalore</td>
			<td><input type="radio" name="location" value="Pune">Pune</td>
			<td><input type="radio" name="location" value="Mumbai">Mumbai</td>
		</tr>
	<tr>
			<td>Trainee Domain</td>
	     	<td><c:select path="domain" items="${dom}" /></td>
		</tr> 
		<tr>
			<td><input type="submit" value="Update Trainee" name="updateButton"></td>
		</tr>
	</table>
	</c:form>
</body>
</html>