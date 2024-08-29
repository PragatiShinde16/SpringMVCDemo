<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="../bootstrap/bootstrap.css">
</head>
<body>
	<br>
	<h2>Welcome to Login Page</h2>
	<div class = "container">
		<div class = "row">
			<div class = "col">
				<form action = "api/login" method = "post">
					<div class = "mt-2 mb-2">
						<label>Username :</label>
						<input type = "text" name = "username" class = "form-control" placeholder = "Enter Username"><br>
						
						<label>Password :</label>
						<input type = "password" name = "password" class = "form-control" placeholder = "Enter Password"><br>
						
						<button type ="submit" class = "btn btn-success form-control">Login</button>
					</div> 
				</form>
			</div> 
		</div> 
	</div> 

</body>
</html>