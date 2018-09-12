<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="fr-FR">

<head>
  <meta charset="utf-8">
  <title>Accueil</title>
  <link rel="stylesheet" href="bootstrap.css">
  <html lang="en" dir="ltr">
  <meta name="viewport" content="width=device-width, initial-scale=1">

</head>

<body>

<jsp:include page="header.html"></jsp:include>

  <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">

    <!-- buttons -->
    <ol class="carousel-indicators">
      <button type="button" id="buttonSlide" class="btn btn-secondary">Liste des événements</button >
        <button type="button" id="buttonSlide" class="btn btn-light">Créer un événement</button >
        </ol>

        <!-- Wrapper for slides -->
        <div class="carousel-inner">
          <div class="carousel-item active">
            <img class="d-block w-100" src="images/randonnee.png" alt="First slide">

          </div>
          <div class="carousel-item">
            <img class="d-block w-100" src="images/mer.png" alt="Second slide">

          </div>
          <div class="carousel-item" >
            <img class="d-block w-100" src="images/hackathon.png" alt="Third slide">
          </div>
        </div>

    </div>
  </div>


  <!-- Left and right controls -->
  <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>

<!-- titre -->

<div class="container">
  <h1 class="titre">Explorer les thèmes</h1>
</div>


<!-- liste des thèmes -->

<div id="listeEvents" class="container">


<div class="row">

  <div class="col">
    <img class="d-block w-100" src="images/randonnee.png" alt="First slide">

    <h5 class="sousTitre">Nature et aventure</h5>

  </div>
  <div class="col">
<img class="d-block w-100" src="images/hackathon.png" alt="Third slide">
    <h5 class="sousTitre">Technologies</h5>

  </div>
  <div class="col">
    <img class="d-block w-100" src="images/mer.png" alt="Second slide">

    <h5 class="sousTitre">Voyages</h5>

  </div>
</div>


</div>

<div id="listeEvents" class="container">


<div class="row">

  <div class="col">
    <img class="d-block w-100" src="images/conferences.png" alt="First slide">

    <h5 class="sousTitre">Conférences</h5>

  </div>
  <div class="col">
<img class="d-block w-100" src="images/dejeuner.png" alt="Third slide">
    <h5 class="sousTitre">Fooding</h5>

  </div>
  <div class="col">
    <img class="d-block w-100" src="images/sciences.png" alt="Second slide">

    <h5 class="sousTitre">Sciences</h5>

  </div>
</div>

</div>

	<jsp:include page="footer.html"></jsp:include>


<!-- Liens vers jQuery et bootstrap.js pour création du carroussel -->

<script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
<script type="text/javascript" src="bootstrap.js"></script>

</body>
</html>