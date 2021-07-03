<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>This is home page</h1>
	<%for(int i = 0; i < 10; i ++) {%>
		<h2>This is line<%= i + 1%></h2>
	<%} %>
</body>
</html>