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
      <li><a style="color: #ffffff" href="/privateclassroom-web/index.jsp">Home</a></li>
      <li><a style="color: #ffffff" href="/privateclassroom-web/listServlet">Liste</a></li>
    </ul>
  <ul class="nav navbar-nav navbar-right">
      <li><a style="color: #ffffff" href="#"><span class="glyphicon glyphicon-user"></span>Inscription</a></li>
      <li><a style="color: #ffffff" href="/privateclassroom-web/loginServlet"><span class="glyphicon glyphicon-log-in"></span>Connection</a></li>
    </ul>
  </div>
</nav>

<div class="container-fluid" style= "background-color: #9aa1c1; margin-bottom: 20px">
		<div class=" col-xs-offset-3 col-xs-6">
			<h1 class="text-center" style= "margin-bottom:30px">Liste de nos cours disponibles</h1>
		</div>
</div>


<form action="listFilter" method="get">
  <div class="input-group col-xs-offset-3 col-xs-6" style="width:50%">
    <input type="text" class="form-control" placeholder="Mot clef" name="keyword"> 
 	<div class="form-group-inline">
		
		<input type="date" class="form-control" placeholder="YYYY-MM-dd">

	</div>
	 	<div class="form-group-inline">
	 	
	
		<select class="form-control" id="exampleFormControlSelect1" name="location">
	      <option>Belfort</option>
	      <option>Sevenans</option>
	      <option>Montbéliard</option>
    	</select>
		
	</div>
    <div class="form-group-inline">
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
            <th>Date</th>
            <th>Heure de début</th>
            <th>Heure de fin</th>
            <th>Nombre de places</th>
            <th>Remplissage</th>
           	<th>Lieu</th>
            <th>Inscription</th>            
          </tr>
        </thead>
        <tbody>
        <c:forEach var="list" items="${list}">
        <tr class="info">
           <td><c:out value="${list.courseCode}"/></td>
           <td><c:out value="${list.date}"/></td>
           <td><c:out value="${list.start_h}"/></td>
           <td><c:out value="${list.end_h}"/></td>  
           <td><c:out value="${list.max}"/></td>
            
           <td><c:out value="${(list.place/list.max)*100}%"/></td> 
          
           <c:choose>
           		<c:when test = "${list.locationId == 1 }">
           			<td>Belfort</td>	
           		
           		</c:when>
           		<c:when test = "${list.locationId == 2 }">
           			<td>Sevenans</td>	
           		
           		</c:when>
           		<c:when test = "${list.locationId == 3 }">
           			<td>Montbéliard</td>	
           		
           		</c:when>
           		
           
           </c:choose>
           
           
              
           <td><button type="button" class="btn btn-default dropdown-toggle" data-toggle="modal" data-target="#ModalInscription">submit</button></td>

           <div class="modal fade" id="ModalInscription" tabindex="-1" role="dialog">
		  <div class="modal-dialog" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <h5 class="modal-title">Inscription</h5>
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		          <span aria-hidden="true">&times;</span>
		        </button>
		      </div>
		      <div class="modal-body">
		      <ul class="list-group">
		      	<li class="list-group-item list-group-item-info">Code : <c:out value="${list.courseCode}"/></li>
		      	<li class="list-group-item list-group-item-info">Date : <c:out value="${list.date}"/></li>
		      	<li class="list-group-item list-group-item-info">Heure de début : <c:out value="${list.start_h}"/></li>
		      	<li class="list-group-item list-group-item-info">Heure de fin : <c:out value="${list.end_h}"/></li>
		      	<li class="list-group-item list-group-item-info">Nombre de places : <c:out value="${list.max}"/></li>
		      	<li class="list-group-item list-group-item-info">Remplissage : <c:out value="${list.place}"/></li>

		      	<c:choose>
           		<c:when test = "${list.locationId == 1 }">
           			<li class="list-group-item list-group-item-info">Lieux: Belfort</li>	
           		
           		</c:when>
           		<c:when test = "${list.locationId == 2 }">
           			<li class="list-group-item list-group-item-info">Lieux: Sevenans</li>	
           		
           		</c:when>
           		<c:when test = "${list.locationId == 3 }">
           			<li class="list-group-item list-group-item-info">Lieux: Montbéliard</li>	
           		
           		</c:when>
           		
           
           </c:choose>

		      </ul>
		      <form>
		      	<div class="form-group">
			    	<label for="InputNom">Nom</label>
			    	<input type="text" class="form-control" id="InputNom" placeholder="Nom">
			  	</div>
			  	<div class="form-group">
			    	<label for="InputPrenom">Prénom</label>
			    	<input type="text" class="form-control" id="InputPrenom" placeholder="Prénom">
			  	</div>
			  	<div class="form-group">
			    	<label for="InputAdresse">Adresse</label>
			    	<input type="text" class="form-control" id="InputAdresse" placeholder="Adresse">
			  	</div>
			  	<div class="form-group">
			    	<label for="InputTelephone">Téléphone</label>
			    	<input type="text" class="form-control" id="InputTelephone" placeholder="Téléphone">
			  	</div>
			  	<div class="form-group">
			    	<label for="InputMail">E-mail</label>
			    	<input type="text" class="form-control" id="InputMail" placeholder="E-mail">
			  	</div>
		        </form>
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-primary">S'inscrire</button>
		        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
		      </div>
		    </div>
		  </div>

		</div>
         

		</div>        

        </tr>
        </c:forEach>
		</tbody>
      </table>
</div>


</body>
</html>