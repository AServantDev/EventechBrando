<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Contact</title>
<link rel="stylesheet" href="mathilde.css">
<link rel="stylesheet" href="greg.css">
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>

	<center>
		<div class="container">
			<h2 class="sousTitre">Nous contacter</h2>
			<br>

			<form action="contactSave.jsp" style="width: 20rem; margin: auto;">

				<div class="form-group">
					<label for="inputState">Vous êtes :</label> <select id="inputState"
						type="text" name="typeUser" class="form-control">
						<option selected>Contact Presse / Media</option>
						<option selected>Une entreprise</option>
						<option selected>Un particulier</option>
					</select>
				</div>

				<input id="focusInscription" type="text" name="nom"
					class="form-control" placeholder="Nom *" required> <br> 
					<input
					id="focusInscription" type="text" name="prenom"
					class="form-control" placeholder="Prénom *"required> <br> 
					<input
					id="focusInscription" type="text" name="entreprise"
					class="form-control" placeholder="Entreprise"> <br> 
					<input
					id="focusInscription" type="text" name="email" class="form-control"
					placeholder="Email *" required> <br>

				<div class="form-group">
					<label for="exampleFormControlTextarea1"></label>
					<textarea id="focusInscription" type="text" name="message" placeholder="Message *" required
						class="form-control" id="exampleFormControlTextarea1" rows="5"></textarea>
				</div>

				<small id="passwordHelpInline" class="text-muted">* Champs
					obligatoires. </small> <br> <br> <input id="inscriptionBtn"
					class="btn btn-outline-danger" type="submit" value="Envoyer">
		</form>
		</div>
	</center>

	<jsp:include page="footer.html"></jsp:include>

</body>
</html>