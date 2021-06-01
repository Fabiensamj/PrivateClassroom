<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">   
<html>
<head>
<meta charset="UTF-8">
<title>Private Classroom</title>
</head>
<body>
<h1> Voici la liste des cours disponibles</h1>


<c:forEach var="list" items="${list}">
    <c:out value="${list.title}"/> = <c:out value="${list.code}"/></br>
</c:forEach>


<ul>
<c:forEach var="i" begin="1" end="5" step="1">
    <c:out value="${ name}" /><br/>
</c:forEach>


<%for(int i=0; i < 5; i++)
		{
		
		%>
		
		<p><%= i %></p>
	<%}%>
</ul>
</body>
</html>