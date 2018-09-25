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

<jsp:include page="header.jsp"></jsp:include>


	</center>
	<div class="container row wrap-header">

		<div class="col-lg-4 row-lg-4">
			<img src="${event.img }" width=100% height=auto>
		</div>

		<div class="col-6 row-5">
			<div class="col row">Lieu: ${event.lieu }</div>
			<div class="col row">Date: ${event.dateEvenement }</div>
			<div class="col row">Heure de début: ${event.heure }</div>
			<div class="col row">Places max: ${event.placeMax }</div>
			<div class="col row">Places restante: ${event.placeRestante }</div>
			<div class="col row">Nombre de participants:
				${event.nbParticipant }</div>

		</div>


	</div>
	
	<div>${event.description}</div>

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


<jsp:include page="footer.html"></jsp:include>

</body>
</html>