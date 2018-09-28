<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Paiement</title>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>

	<div class="row">

		<div class="col"></div>
		<div class="col" id="colored containerMessageEnvoye">

			<h2 class="sousTitre">Récapitulatif</h2>
			<hr>
			<p class="sousTitre"> ${prenomCollecte}, </p>
			<p class="sousTitre">Vous allez participer à la collecte de l'événement : ${nomEvent}  </p>
			<p class="sousTitre"> pour un montant de  ${montant}(€)</p>
			<p class="sousTitre"> Veuillez entrer vos coordonnées bancaires pour procéder au payement.  </p>
			<hr>

			<!--Service stripe -->

			<center><form action="your-server-side-code" method="POST">
				<script src="https://checkout.stripe.com/checkout.js"
					class="stripe-button" data-key="pk_test_TYooMQauvdEDq54NiTphI7jx"
					data-amount="0" data-name="Stripe.com"
					data-description="Example charge"
					data-image="https://stripe.com/img/documentation/checkout/marketplace.png"
					data-locale="auto" data-zip-code="true">
						
					</script>
			</form></center>
			<!--Service stripe -->

		</div>

		<div class="col"></div>

	</div>

	<jsp:include page="footer.html"></jsp:include>

</body>
</html>