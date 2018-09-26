<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="mathilde.css">
<link rel="stylesheet" href="greg.css">

<title>New event</title>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>


	<div class="colored container">


		<h2 class="sousTitre">Création d'évenement</h2>

		<div class="row">

			<div class="col-3"></div>
			<div class="col-6">
				<form action="CreateEvent" method="post"
					onsubmit="return validate()">

					<table>
						<tr>
							<td class="margeTab">Nom :</td>
							<td class="margeTab"><input id="formCt" class="form-control" type="text" name="nom" required>
							</td>
						</tr>

						<tr>
							<td class="margeTab">Lieu :</td>
							<td class="margeTab"><input id="formCt" class="form-control" type="text" name="lieu" required></td>
						</tr>

						<tr>
							<td class="margeTab">Date :</td>
							<td class="margeTab"><input id="formCt" class="form-control" type="date" name="date" required></td>
						</tr>

						<tr>
							<td class="margeTab">Heure de début :</td>
							<td class="margeTab"><input id="formCt" class="form-control" type="time" name="heure"
								required></td>
						</tr>

						<tr>
							<td class="margeTab">Description brève :</td>
							<td class="margeTab"><textarea id="formCt" class="form-control"
									id="text" name="descriptionBreve" required maxlength="50"></textarea></td>
							<td class="margeTab"><h6 class="pull-right"
									id="count_message"></h6></td>
						</tr>

						<tr>
							<td class="margeTab">Thème :</td>
							<td class="margeTab"><select id="formCt" class="form-control" name="theme" required>
									<option value="Hackathon">Hackathon</option>
									<option value="Conference">Conférence</option>
									<option value="Arts Numerique">Arts Numériques</option>
									<option value="Gaming">Gaming</option>
									<option value="Numerique et ecologie">Numérique et
										écologie</option>
									<option value="Formation">Formation</option>
							</select></td>
						</tr>
						<tr>
							<td class="margeTab">Nombre de places :</td>
							<td class="margeTab"><input id="formCt" class="form-control" type="text" name="placeMax"
								required></td>
						</tr>


						<tr>
							<td class="margeTab">Image :</td>
							<td class="margeTab"><input id="formCt" class="form-control" type="file" name="imageEvent"
								required></td>
						</tr>
						<tr>
							<td class="margeTab">Description complète :</td>
							<td class="margeTab"><textarea id="formCt" class="form-control"
									name="description" required></textarea></td>
						</tr>
					</table>
					
					<div class="centered"><input id="inscriptionBtn"
								class="btn btn-outline-danger" type="submit" value="Envoyer"></div>

				</form>
			</div>
			<div class="col-3"></div>

		</div>

	</div>

	<jsp:include page="footer.html"></jsp:include>


	<script src="https://code.jquery.com/jquery-3.3.1.min.js"
		integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
		crossorigin="anonymous"></script>
	<script type="text/javascript" src="remain.js"></script>


</body>
</html>