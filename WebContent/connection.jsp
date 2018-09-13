<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="greg.css" rel="stylesheet" type="text/css">
<title>Page de Connexion</title>
</head>
<body>
	<jsp:include page="header.html"></jsp:include>


	<center>
		<div class="container rounded">
			<h2 id ="Connect">Connectez vous</h2><br>

			<form action="ConnectUser" style="width: 500px; margin: auto;">


				<div class="row">
				
					<div class="col">
					

						<input id="formCt" type="text" name="mailCo" class="form-control"
							placeholder="Email *">


					</div>
					<div class="col">

						<input id="formCt" type="password" name="passwordCo"
							class="form-control" placeholder="Mot de passe *">
					</div>
				</div>
		</div>

		<div class="row">
			<div class="col">
			<div>Pas encore inscrit? <a href="inscription.jsp">C'est par ici!</a></div><br>

				<input id="connectBtn" class="btn btn-outline-danger" type="submit"
					value="Valider">
			</div>
		</div>


		</form>
		</div>
	</center>




	<jsp:include page="footer.html"></jsp:include>

</body>
</html>