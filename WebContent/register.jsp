<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New event</title>
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>


<H2>Création d'évenement</H2>



   <form action="CreateEvent" method="post" onsubmit="return validate()">
    
    	<table><tr> <td>Nom:</td><td><input type="text" name="nom" required><td></tr>
		<tr> <td>Lieu:</td><td><input type="text" name="lieu" required></td></tr>
		<tr> <td>Date:</td><td><input type="date" name="date" required>></td></tr>
		<tr> <td>Heure de début:</td><td><input type="time" name="heure" required></td></tr>
		<tr> <td>Brève description:</td><td><textarea class="form-control" width = 100% name="descriptionBreve" required></textarea></td></tr>
		<tr> <td>theme:</td><td><input type="text" name="theme" required></td></tr>
		<tr> <td>place max:</td><td><input type="text" name="placeMax" required></td></tr>
		<tr> <td>Image:</td><td><input type="file" name="imageEvent" required></td></tr>
		<tr> <td>Desc:</td><td><textarea class="form-control"  name="description" required></textarea></td></tr>
		
		<tr><td><input type="submit" value="Submit"></td></tr>
		</table>
    
    </form>

  <HR>
           
            <jsp:include page="footer.html"></jsp:include>



</body>
</html>