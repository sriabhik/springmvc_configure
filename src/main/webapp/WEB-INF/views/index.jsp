<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index JSP</title>
</head>
<body>
	<h1>This is Home Page</h1>
	<h1>called By homeController</h1>
	<%
		String name = (String)request.getAttribute("name");//HttpServlet
		Integer Id = (Integer)request.getAttribute("Id");//HttpServlet
		
		List<String> list = (List<String>)request.getAttribute("list");
	%>
	<h1>Name is :: <%= name %></h1>
	
	<h1>ID is :: <%= Id %></h1>
	
	<%
		out.println("Friend List are :: ");
	
		for(String s: list){
		%>
	
			<h1><%=s%></h1>
			<%
		}
	%>
	
</body>
</html>

