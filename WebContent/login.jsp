<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Login Form Design</title>
	<link rel="stylesheet" href="stylelogin.css">
</head>
<body>
	<div class="box">
		<h2>Login</h2>
		<form action="loginservlet" method="post">
			<div class="inputBox">
				<input type="text" name="uname" required="">
				<label for="">Username</label>
			</div>
			<div class="inputBox">
				<input type="password" name="psw" required="">
				<label for="">Password</label>
			</div>
			<input type="submit" name="" value="Submit">
		</form>
	</div>
</body>
</html>