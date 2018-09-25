<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="mathilde.css">

<title>${event.nom }</title>

</head>
<body>

	<center>
		<h2>BIENVENUE AU ${event.nom } ${event.id_event }</h2>
	</center>







	</center>
	<div class="container row wrap-header">

		<div class="col-md-3">
			<img src="${event.img }" width=130% height=auto>
		</div>


		<div class="col-md-6 row-md-1">Lieu: ${event.lieu }</div>
		<div class="col-md-6 row-md-2">Date: ${event.dateEvenement }</div>
		<div class="col-md-6 row-md-3">Heure de début: ${event.heure }</div>
		<div class="col-md-6 row-md-3">Places max: ${event.placeMax }</div>
		<div class="col-md-6 row-md-3">Places restante: ${event.placeRestante }</div>
		<div class="col-md-6 row-md-3">Nombre de participants: ${event.nbParticipant }</div>


	</div>

	<c:choose>
		<c:when test="${ isConnected == true}">
			<a href="InscriptionEvent?idEvent=${event.id_event }"> <input
				id="inscriptionBtn" class="btn btn-outline-danger" type="submit"
				value="S'inscrire"></a>
		</c:when>
		<c:when test="${ isConnected == null || isConnected == false}">
			<a href="InscriptionEvent?idEvent=${event.id_event }"> <input
				id="inscriptionBtn" class="btn btn-outline-danger" disabled
				type="submit" value="Connectez vous pour vous inscrire"></a>
		</c:when>
	</c:choose>







<br>
<br>
<br>			
<div class="row">
		<div class="col"></div>
		<div class="col" id="containerMessageEnvoye">

		<a href="pageCollecte.jsp?idEvent=${event.idEvent}"><input  id="inscriptionBtn" class="btn btn-outline-danger" value="Participer à la collecte"></a>

		</div>

		<div class="col"></div>

	</div>		

</body>
</html>