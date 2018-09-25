<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="mathilde.css">
<title>Insert title here</title>
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

		<div class="col-md-6 row-md-1">${event.lieu }</div>
		<div class="col-md-6 row-md-2">${event.dateEvenement }</div>
		<div class="col-md-6 row-md-3">${event.heure }</div>

	</div>

	<c:choose>
		<c:when test="${ isConnected == true}">
			<a href="InscriptionEvent?idEvent=${event.id_event }"> <input
				id="inscriptionBtn" class="btn btn-outline-danger" type="submit"
				value="S'inscrire"></a>
		</c:when>
		<c:when test="${ isConnected == null}">
			<a href="InscriptionEvent?idEvent=${event.id_event }"> <input
				id="inscriptionBtn" class="btn btn-outline-danger" disabled
				type="submit" value="S'inscrire"></a>
		</c:when>
	</c:choose>




	<div>
		<h1>Vous allez participer à la cagnotte de l'événement : ${event.nom } ${event.id_event }</h1>


		<form action="CagnotteServlet?idEvent=${event.id_event}" method="post">
			<input type="text" name="champsDon" placeholder="votre don">
			<input type="submit" value="valider">

		</form>
	</div>

</body>
</html>