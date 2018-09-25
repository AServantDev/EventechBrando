<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Page de participation Cagnotte</title>
</head>
<body>

<h1>Vous allez participer  à la cagnotte de l'événement : ${event.nom } ${event.id_event }</h1>


<form action="ParticiperCagnotteServlet">
  	<input type="text" name="champsDon" placeholder="votre don">
	<input type="submit" value="valider">

</form>



	

</body>
</html>