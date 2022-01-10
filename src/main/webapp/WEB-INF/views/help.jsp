<%@page import="java.time.LocalDateTime"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <!-- Add directive to view SepL Language -->
<%@page isELIgnored="false" %>
<!--to use jstl use taglib uri  -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!--  Avoid using this using jsp SpeL-->
	<%-- <%String name = (String)request.getAttribute("name"); 
	Integer Id = (Integer)request.getAttribute("Id");
	LocalDateTime time =(LocalDateTime)request.getAttribute("time");
	%> --%>
	
	<%-- <h1>Hello ,My Name is <%=name %></h1>
	<h1>Id : <%=Id %></h1>
	<h1>Time and Date <%=time %></h1> --%>
	
	
	<!-- Using SPeL -->
	<h1>Hello ,My Name is  :: ${name }</h1>
	<h1>Id                 :: ${Id}</h1>
	<h1>Time and Date      :: ${time}</h1>
	<hr>
	${friend1}
	
	<!--To traverse we use jstl  -->
	<!-- install maven jstl dependency -->
	
	<c:forEach var="friend" items ="${friend1}" >
		<h1>${friend}</h1>
	</c:forEach>
	
</body>
</html>