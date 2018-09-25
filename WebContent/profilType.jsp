<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Profil</title>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>

	<div>Nom: ${Fnom}</div>
	<div>Prénom: ${prenom}</div>
	<div>Age: ${age}</div>
	<div>mail: ${mailCo}</div>
	<div>Password: ${password}</div>

	<c:choose>
		<c:when test="${prenom == 'Dio' }"><img alt="" src="https://steamuserimages-a.akamaihd.net/ugc/865111917380159024/6FBBE48A6CA7CAD010DF38D09C56F22333C114F2/"></c:when>
		<c:otherwise></c:otherwise>
	</c:choose>

	<a href="modifProfil.jsp"><button type="button"
			class="btn ConnexionButton btn-outline-primary">Modifier mes
			infos</button></a>


	<jsp:include page="footer.html"></jsp:include>

</body>
</html>