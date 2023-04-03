<%@ page language="java" contentType="text/html" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
</head>
<body>
	<h1>Manage Products</h1>

	<form action="products" method="post">
		<pre>
		
		Name:<input type="text" name="name" />
		Description:<input type="text" name="description" />
		Price:<input type="number" name="price" />
		 <input type="submit" value="submit" />
			</pre>
	</form>

	<p>${message }</p>

	<ul>
		<c:forEach items="${products}" var="product">
			<li>${product.id }| ${product.name } | ${product.description } | ${product.price }</li>
		</c:forEach>
	</ul>


</body>
</html>