<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html>
<html>
<title>Private Classroom</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Karma">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<body>

<nav class="navbar navbar-inverse" style= "background-color: #0e1a57; margin-bottom: 0px;">
  <div class="container-fluid">
    <div class="navbar-header">
      <a style="color: #ffffff" class="navbar-brand" href="#">Private Classroom</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a style="color: #ffffff" href="/privateclassroom-web/homeServlet">Home</a></li>
      <li><a style="color: #ffffff" href="/privateclassroom-web/listServlet">Liste</a></li>
    </ul>
  <ul class="nav navbar-nav navbar-right">
      <li><a style="color: #ffffff" href="#"><span class="glyphicon glyphicon-user"></span>Inscription</a></li>
      <li><a style="color: #ffffff" href="#"><span class="glyphicon glyphicon-log-in"></span>Connection</a></li>
    </ul>
  </div>
</nav>

<div class="container-fluid" style= "background-color: #9aa1c1; margin-bottom: 20px">
		<div class=" col-xs-offset-3 col-xs-6">
			<h1 class="text-center" style= "margin-bottom:30px">Liste de nos cours disponibles</h1>
		</div>
</div>
<form>
  <div class="input-group col-xs-offset-3 col-xs-6" style="width:50%">
    <input type="text" class="form-control" placeholder="Mot clef"> 
 	<div class="input-group-btn">
		<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">DATE <span class="caret"></span></button>
		<ul class="dropdown-menu dropdown-menu-right">
			<li><a href="#">Action</a></li>
			<li><a href="#">Another action</a></li>
		</ul>
	</div>
	 	<div class="input-group-btn">
		<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">LIEU <span class="caret"></span></button>
		<ul class="dropdown-menu dropdown-menu-right">
			<li><a href="#">Action</a></li>
			<li><a href="#">Another action</a></li>
		</ul>
	</div>
    <div class="input-group-btn">
      <button class="btn btn-default" type="submit">
        <i class="glyphicon glyphicon-search"></i>
      </button>
    </div>
  </div>
</form>

<div class="container">
      <h1></h1>
      <table class="table table-hover">
        <thead class="light">
          <tr>
            <th>Code</th>
            <th>Titre</th>
          </tr>
        </thead>
        <tbody>
        <c:forEach var="list" items="${list}">
        <tr class="info">
           <td><c:out value="${list.code}"/></td>
           <td><c:out value="${list.title}"/></td>            
        </tr>
        </c:forEach>
		</tbody>
      </table>
</div>


<!-- <ul>
<c:forEach var="i" begin="1" end="5" step="1">
    <c:out value="${ name}" /><br/>
</c:forEach>


<%for(int i=0; i < 5; i++)
		{
		
		%>
		
		<p><%= i %></p>
	<%}%>
</ul>-->
</body>
</html>