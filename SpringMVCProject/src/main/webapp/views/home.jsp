<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="../bootstrap/bootstrap.css">
</head>
<body>
	<h2>Welcome to Home</h2>
	<div class="container">

	<table class="table table-bordered">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Email Id</th>
				<th>Mob No</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="person" items="${personlist}">
				<tr>
					<td>${person.id} </td>
					<td>${person.name}</td>
					<td>${person.email_id}</td>
					<td>${person.mob_no}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>

</body>
</html>