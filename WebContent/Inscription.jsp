<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html id="htmlGreg">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="bootstrap.css" rel="stylesheet" type="text/css">
<title>Page d'inscription</title>
</head>
<body id="bodyGreg">
	<img id="imgHeader" src="images/moutainHeader.jpeg">

	<center>
		<div class="container rounded">

			<form action="RegisterUser.java" style="width: 500px; margin: auto;">


				<div class="row">
					<div class="col">

						<input id="focusInscription" type="text" name="prenom"
							class="form-control" placeholder="Nom *">


					</div>

					<div class="col">
						<div class="col">

							<input id="focusInscription" type="text" name="nom" class="form-control"
								placeholder="Prénom *">
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col">

						<input id="focusInscription" type="text" name="mail" class="form-control"
							placeholder="Email *">
					</div>

					<div class="col">

						<input id="focusInscription" type="password" name="password" class="form-control"
							placeholder="Mot de passe *">
					</div>
				</div>
				<div class="row">
					<div class="col">
						<input type="checkbox" name="isPro"> <label for="isPro">Professionnel
							?*</label>
					</div>
				</div>
				<div class="row">
					<div class="col">
						<p>* Champs obligatoires.</p>
						<input id="inscriptionBtn" class="btn btn-outline-danger" type="submit"
							value="Valider">
					</div>
				</div>
			</form>
		</div>
	</center>



<%@include file="footer.html" %>
</body>
</html>
