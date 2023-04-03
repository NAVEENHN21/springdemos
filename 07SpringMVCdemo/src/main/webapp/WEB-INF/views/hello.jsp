<%@ page language="java" contentType="text/html" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Spring MVC</title>
</head>
<body>
	<h1>Hello!! Welcome to Spring MVC</h1>
	<%
	out.println("ID: " + request.getAttribute("id") + "<br/>");
	out.println("Name: " + request.getAttribute("name") + "<br/>");
	out.println("Salary: " + request.getAttribute("salary") + "<br/>");
	%>
	<!-- - 
	<p>
		Id:<b>${id}</b>
	</p>
	<p>
		Name:<b>${name}</b>
	</p>
	<p>
		Salary:<b>${salary}</b>
	</p>
	
	<p>${employee}</p> -->
	

</body>
</html>