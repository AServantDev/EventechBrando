<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="fr-FR">

<head>
<meta charset="utf-8">
<title>Accueil</title>
<link rel="stylesheet" href="mathilde.css">
<html lang="en" dir="ltr">
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>

<body>

	<jsp:include page="header.jsp"></jsp:include>



	<div id="carouselWrap">
		<div id="carouselExampleControls" class="carousel slide"
			data-ride="carousel">

			<!-- buttons -->
			<ol class="carousel-indicators">
				<a href="HubEvent.jsp" type="button" id="buttonSlide"
					class="btn btn-secondary">Liste des événements </a>
				<a href="register.jsp" type="button" id="buttonSlide"
					class="btn btn-light">Créer un événement </a>

			</ol>

			<!-- Wrapper for slides -->
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img class="d-block w-100" src="images/formation.png"
						alt="First slide">

				</div>
				<div class="carousel-item">
					<img class="d-block w-100" src="images/art.png" alt="Second slide">

				</div>
				<div class="carousel-item">
					<img class="d-block w-100" src="images/code.png" alt="Third slide">
				</div>
			</div>

		</div>
	</div>

	<!-- Left and right controls -->
	<a class="carousel-control-prev" href="#carouselExampleControls"
		role="button" data-slide="prev"> <span
		class="carousel-control-prev-icon" aria-hidden="true"></span> <span
		class="sr-only">Previous</span>
	</a>
	<a class="carousel-control-next" href="#carouselExampleControls"
		role="button" data-slide="next"> <span
		class="carousel-control-next-icon" aria-hidden="true"></span> <span
		class="sr-only">Next</span>
	</a>
	</div>
	</div>

	<!-- titre -->

	<div class="container">
		<h1 class="titre">Explorer les thèmes</h1>
	</div>

	<!-- liste des thèmes -->

	<div id="listeEvents" class="container">


		<div class="row">

			<!-- Premiere vignette -->

			<div class="col">
				<div class="hovereffect">
					<a href="register.jsp"> <img
						class="img-responsive d-block w-100" src="images/code.png" alt="">
					</a>
					<h5 class="sousTitre">Hackathons</h5>
				</div>
			</div>


			<!-- Deuxième vignette -->

			<div class="col">
				<div class="hovereffect">
					<a href="register.jsp"> <img
						class="img-responsive d-block w-100"
						src="images/conferences-2.png" alt="">
					</a>
					<h5 class="sousTitre">Conférences</h5>
				</div>
			</div>


			<!-- Troisième vignette -->

			<div class="col">
				<div class="hovereffect">
					<a href="register.jsp"> <img
						class="img-responsive d-block w-100" src="images/art.png" alt="">
					</a>
					<h5 class="sousTitre">Arts numériques</h5>
				</div>
			</div>
		</div>
	</div>

	<div id="listeEvents" class="container">
		<div class="row">
			<div class="col">
				<div class="hovereffect">
					<a href="register.jsp"> <img
						class="img-responsive d-block w-100" src="images/gaming.png"
						alt="">
					</a>
					<h5 class="sousTitre">Gaming</h5>
				</div>
			</div>

			<div class="col">
				<div class="hovereffect">
					<a href="register.jsp"> <img
						class="img-responsive d-block w-100" src="images/ecology.png"
						alt="">
					</a>
					<h5 class="sousTitre">Numérique et écologie</h5>
				</div>
			</div>


			<div class="col">
				<div class="hovereffect">
					<a href="register.jsp"> <img
						class="img-responsive d-block w-100" src="images/formation.png"
						alt="">
					</a>
					<h5 class="sousTitre">Formation</h5>
				</div>
			</div>
		</div>
	</div>


	<jsp:include page="footer.html"></jsp:include>


	<!-- Liens vers jQuery et bootstrap.js pour création du carroussel -->

	<script src="https://code.jquery.com/jquery-3.3.1.min.js"
		integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
		crossorigin="anonymous"></script>
	<script type="text/javascript" src="bootstrap.js"></script>
</body>
</html>