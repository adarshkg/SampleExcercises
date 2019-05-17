<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="retrieve" >

		<table>
			<tr>
				<td>Trainee ID</td>
				<td><input type="text" name="id"></td>
				<td><input type="submit" name="retrieve" value="RETRIEVE"></td>
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