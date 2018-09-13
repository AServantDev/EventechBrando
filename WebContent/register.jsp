<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New event</title>
</head>
<body>

<jsp:include page="header.html"></jsp:include>


<H2>Création d'évenement</H2>



   <form action="CreateEvent" method="post" onsubmit="return validate()">
    
    	<table><tr> <td>Nom:</td><td><input type="text" name="nom"></td></tr>
		<tr> <td>Lieu:</td><td><input type="text" name="lieu"></td></tr>
		<tr> <td>Date:</td><td><input type="date" name="date"></td></tr>
		<tr> <td>Heure de début:</td><td><input type="time" name="heure"></td></tr>
		<tr> <td>Desc:</td><td><textarea name="description"></textarea></td></tr>
		<tr> <td>theme:</td><td><input type="text" name="theme"></td></tr>
		<tr> <td>place max:</td><td><input type="text" name="placeMax"></td></tr>
		<tr> <td>Lien de votre image:</td><td><input type="text" name="imageEvent"></td></tr>
		
		<tr><td><input type="submit" value="Submit"></td></tr>
		</table>
    
    </form>

  <HR>
           
            <jsp:include page="footer.html"></jsp:include>



</body>
</html>