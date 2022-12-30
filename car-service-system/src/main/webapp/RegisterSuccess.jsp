<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	out.println("Dear " + session.getAttribute("name") + ", you have successfully registered");
	%>
	<br>
	<a href="/car-service-system/customerLogin.html">Login</a><br>
</body>
</html>