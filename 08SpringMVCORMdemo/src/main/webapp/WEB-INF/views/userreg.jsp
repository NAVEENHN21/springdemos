<%@ page language="java" contentType="text/html" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<h1>User Registration</h1>

	<form action="registeruser" method="post">
		<pre>
		
		Name:<input type="text" name="name" />
		Email:<input type="text" name="email" />
		Password:<input type="password" name="password" />
		 <input type="submit" value="SignUp" />
			</pre>
	</form>

	<p>${message }</p>

	<ul>
		<c:forEach items="${users}" var="user">
			<li>${user.id }| ${user.name } | ${user.email }</li>
		</c:forEach>
	</ul>


</body>
</html>