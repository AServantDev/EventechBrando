<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="mathilde.css">
<link rel="stylesheet" href="greg.css">
<title>${event.nom }</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>

	<div class="colored container">

		<div class="row">
			<div class="col">
				<img src="images/code.png" class="colored imageCentered" >
			</div>

			<div class="col">
				<div class="col row">Lieu : ${event.lieu }</div>
				<div class="col row">Date : ${event.dateEvenement }</div>
				<div class="col row">Heure de début : ${event.heure }</div>
				<div class="col row">Nombre de places : ${event.placeMax }</div>
				<div class="col row">Places restantes : ${event.placeRestante }</div>
				<div class="col row">Nombre de participants :
					${event.nbParticipant }</div>
				<div class="col row">Description : ${event.description}</div>
			</div>
      
		</div>
	</div>
  
	<div class="row">
		<div class="col"></div>
		<div class="centered col">

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


			<div class="centered col" id="colored containerMessageEnvoye">

				<a href="pageCollecte.jsp?idEvent=${event.id_event}"><input
					id="inscriptionBtn" class="btn btn-outline-danger"
					value="Participer à la collecte" type="submit"></a>
			</div>

		</div>
		<div class="col"></div>
	</div>

	<jsp:include page="footer.html"></jsp:include>
</body>
</html>