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


	<div class="colored container">


		<h2 class="sousTitre">Création d'évenement</h2>

		<div class="row">

			<div class="col"></div>
			<div class="col">
				<form action="CreateEvent" method="post"
					onsubmit="return validate()">

					<table>
						<tr>
							<td>Nom:</td>
							<td><input type="text" name="nom" required>
							<td>
						</tr>
						<tr>
							<td>Lieu:</td>
							<td><input type="text" name="lieu" required></td>
						</tr>
						<tr>
							<td>Date:</td>
							<td><input type="date" name="date" required></td>
						</tr>
						<tr>
							<td>Heure de début:</td>
							<td><input type="time" name="heure" required></td>
						</tr>
						<tr>
							<td>Brève description:</td>
							<td><textarea class="form-control" id="text"
									name="descriptionBreve" required maxlength="50"></textarea></td>
							<td><h6 class="pull-right" id="count_message"></h6></td>
						</tr>
						<tr>
							<td>Theme:</td>
							<td><select name="theme" required>
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
							<td>Place max:</td>
							<td><input type="text" name="placeMax" required></td>
						</tr>


						<tr>
							<td>Image:</td>
							<td><input type="file" name="imageEvent" required></td>
						</tr>
						<tr>
							<td>Description:</td>
							<td><textarea class="form-control" name="description"
									required></textarea></td>
						</tr>

						<tr>
							<td><input type="submit" value="Submit"></td>
						</tr>
					</table>

				</form>
			</div>
			<div class="col"></div>

		</div>




	</div>



	</div>



	<HR>

	<jsp:include page="footer.html"></jsp:include>


	<script src="https://code.jquery.com/jquery-3.3.1.min.js"
		integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
		crossorigin="anonymous"></script>
	<script type="text/javascript" src="remain.js"></script>


</body>
</html>