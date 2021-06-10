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
      <li><a style="color: #ffffff" href="#"><span class="glyphicon glyphicon-log-in"></span>Connection</a></li>
    </ul>
  </div>
</nav>
<div class="container-fluid" style= "background-color: #9aa1c1; margin-bottom: 20px">
		<div class=" col-xs-offset-3 col-xs-6">
			<h1 class="text-center" style= "margin-bottom:30px">Private Classroom</h1>
			<p class="text-center" style= "font-size: 20px;margin-bottom:30px">Bienvenue dans Private Classroom ! <br /> 
			  Inscrivez-vous et venez découvrir un large catalogue de formation.  <br />
			  De nombreuses sessions sont disponibles portant sur des thèmes variés.
			</p>
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

<div class="text-center" style="margin-top: 100px" >
	<h2> Nos cours les plus demandés </h2>
</div>

<div class="container">
	<div class="row" >
	 	<div class="col-sm-4">
	 		<div class="panel panel-warning">
                <div class="panel-heading text-center"><h2><a href="#">Cours N°1</a></h2></div>
	 				<img src="https://fr.ccunesco.ca/-/media/Images/Unesco/Blog/2020/03/International-Day-of-Math.png" alt="event image" class="img-responsive"/>
				</div>
			<p class="text-center"> Description du cours ci-dessus. Toutes les infos possibles Dans un rayon de 100000 km aucunu limite n'est nécessaire</p>
		</div>
		<div class="col-sm-4">
	 		<div class="panel panel-info">
                <div class="panel-heading text-center"><h2><a href="#">Cours N°2</a></h2></div>
	 				<img src="https://fr.ccunesco.ca/-/media/Images/Unesco/Blog/2020/03/International-Day-of-Math.png" alt="event image" class="img-responsive"/>
				</div>
				<p class="text-center"> Description du cours ci-dessus. Toutes les infos possibles Dans un rayon de 100000 km aucunu limite n'est nécessaire</p>
		</div>
		<div class="col-sm-4">
	 		<div class="panel panel-success">
                <div class="panel-heading text-center"><h2><a href="#">Cours N°3</a></h2></div>
	 				<img src="https://fr.ccunesco.ca/-/media/Images/Unesco/Blog/2020/03/International-Day-of-Math.png" alt="event image" class="img-responsive"/>
				</div>
				<p class="text-center"> Description du cours ci-dessus. Toutes les infos possibles Dans un rayon de 100000 km aucunu limite n'est nécessaire</p>
		</div>
	</div>
</div>
	<a style="margin-top:30px; width:50%; background-color: #b0a7af; font-size:20px" href="/privateclassroom-web/listServlet" class="btn btn-primary col-xs-offset-3 col-xs-6">Liste des cours proposés</a>


</body>
</html>