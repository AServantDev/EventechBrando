<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>header</title>
<link rel="stylesheet" href="mathilde.css">
<link href="https://fonts.googleapis.com/css?family=Roboto"
	rel="stylesheet">
</head>

<body id="headerBar">




	<header class="container "> <nav class="row wrap-header">

	<div class="col-md-3">
		<img src="images/logorong.png" id="image-logo"> <a href="#"
			id="logo">EVENTECH</a>
	</div>

	<div class="col-md-2">
		<a href="accueil.jsp">Home</a>
	</div>

	<div class="col-md-2">
		<a href="HubEvent.jsp">Événements</a>
	</div>

	<div class="col-md-3">
		<a href="register.jsp">Créer un événement</a>
	</div>


	<c:choose>

		<c:when test="${isConnected == true }">
			<div class="col-md-2">
				<a href="deco.jsp"><button type="button"
						class="btn DeconnexionButton btn-outline-primary">Se
						déconnecter</button></a>
			</div>
		</c:when>

		<c:when test="${isConnected == null }">
			<div class="col-md-2">
				<a href="connection.jsp"><button type="button"
						class="btn ConnexionButton btn-outline-primary">Se
						connecter</button></a>
			</div>
		</c:when>

		<c:otherwise></c:otherwise>

	</c:choose> 
	
	<c:choose>

		<c:when test="${isConnected == true }">
			<div class="col-md-2">Bienvenue ${prenom} ${nom}</div>
		</c:when>

		<c:otherwise></c:otherwise>

	</c:choose> </nav> </header>
	<hr>

</body>
</html>