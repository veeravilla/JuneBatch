<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Emp Login</title>
</head>
<body>
	<h1> Employee Login </h1>
	<form  action="mvc/sendData" method="post"> <!-- HTTP GET -->
		User Name : <input type="text" name="username" />
		Password  : <input type="password" name="password" />
		<input type="submit" name="login" value="Login" />
	</form>
</body>
</html>