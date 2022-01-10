<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@page isELIgnored ="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
		<h3 class = "text-center">${Header}</h3>
   		<p class ="text-center">${Desc}</p>
   		<form action = "processform" method ="post">
	<%-- 	when using RequestParam
	 <h1>Email : ${email}</h1>
	 <h1>Name  : ${name}</h1>
	 <h1>Password : ${password}</h1> --%>
	 
	<!--  using ModelAttribue -->
	 <h1>Email : ${user.email}</h1>
	 <h1>Name  : ${user.userName}</h1>
	 <h1>Password : ${user.password}</h1>
</body>
</html>