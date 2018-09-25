<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Collecte</title>

<link rel="stylesheet" href="mathilde.css">
<link rel="stylesheet" href="greg.css">

<!--captcha script  -->
<script src="https://www.google.com/recaptcha/api.js"></script>

</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>

	<div class="container">
		<h2 class="sousTitre">Participer à la collecte</h2>
		<br>

		<!--Inclure method avant action et nom servlet sans slash-->

		<form method="post" action="SubmitCollecte" style= "width: 20rem; margin: auto; " >

			<p class="titreBis">Choix du montant</p>

			<input id="focusInscription" type="text" name="nom"
				class="form-control" placeholder="Montant souhaité en €" required>

			<br>
			<p class="titreBis">Dites-nous en plus sur vous</p>

			<br>
			<div class="form-group">
				<label for="inputState">Vous êtes :</label> <select id="inputState"
					type="text" name="typeUser" class="form-control">
					<option selected>Une entreprise</option>
					<option selected>Un particulier</option>
				</select>
			</div>

			<br>
			<p>Vos coordonnées</p>

			<input id="focusInscription" type="text" name="nom"
				class="form-control" placeholder="Nom *" required> <br>
			<input id="focusInscription" type="text" name="prenom"
				class="form-control" placeholder="Prénom *" required> <br>
			<input id="focusInscription" type="text" name="entreprise"
				class="form-control" placeholder="Entreprise"> <br> <input
				id="focusInscription" type="text" name="email" class="form-control"
				placeholder="Email *" required> <br> <input
				id="focusInscription" type="text" name="naissance"
				class="form-control" placeholder="Date de naissance DD/MM/YYYY *"
				required> <br> <input id="focusInscription" type="text"
				name="rue" class="form-control" placeholder="N° et rue *" required>
			<br> <input id="focusInscription" type="text" name="codePostal"
				class="form-control" placeholder="Code postal *" required> <br>
			<input id="focusInscription" type="text" name="ville"
				class="form-control" placeholder="Ville *" required> <br>


			<div class="form-group">
				<label for="inputState">Pays *</label> <select id="inputState"
					type="text" name="typeUser" class="form-control">
					<option selected>...</option>
					<option selected>Allemagne</option>
					<option selected>Danemark</option>
					<option selected>Suède</option>
					<option selected>France</option>
				</select>
			</div>

			<div class="form-check">
				<input class="form-check-input" type="checkbox" value=""
					id="defaultCheck1"> <label class="form-check-label"
					id="validation" for="defaultCheck1"> J'accepte
					l'utilisation de mes données personnelles à des fins de validation
					et de suivi de mon don*. </label>
			</div>

			<br> <small id="passwordHelpInline" class="text-muted">*
				Champs obligatoires. </small> <br>

			<div class="pay">

				<br>
				<br> <input id="inscriptionBtn" class="btn btn-outline-danger"
					type="submit" value="Envoyer">

			</div>

		</form>

	</div>
	<jsp:include page="footer.html"></jsp:include>

</body>
</html>