<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
<td>Trainee Id</td>
<td>Trainee Name</td>
<td>Trainee Location</td>
<td>Trainee Domain</td>

</tr>
<c:forEach var="tran" items="${tran}">
<tr>

<td>${tran.id}</td>
<td>${tran.name}</td>
<td>${tran.location}</td>
<td>${tran.domain}</td>
</tr>
</c:forEach>
</table>
</body>
</html>