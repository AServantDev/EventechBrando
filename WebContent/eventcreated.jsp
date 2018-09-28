<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="greg.css" rel="stylesheet" type="text/css">
<title>Event Created</title>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>

	<div id="backgroundEventCreated">
		<h2 class="sousTitreeC">${prenom}, Votre événement ${event.nom} </h2>
		<h2 class="sousTitreeC">A bien été crée.</h2>
		<p class="sousTitreeC"><a href=HubEvent.jsp>Retourner à la liste des événements</a></p>
		
		

	</div>
	
	
	
	
	
	 
 
  
 

	<jsp:include page="footer.html"></jsp:include>

</body>
</html>