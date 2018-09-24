<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Merci pour votre participation</title>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>

	<div id="containerMessageEnvoye">

		<h2 class="sousTitre">Merci pour votre participation !</h2>
		<p class="sousTitre">Votre don a bien été enregistré.</p>
		
			<!--Service stripe -->

				<form action="your-server-side-code" method="POST">
					<script src="https://checkout.stripe.com/checkout.js"
						class="stripe-button" data-key="pk_test_TYooMQauvdEDq54NiTphI7jx"
						data-amount="0" data-name="Stripe.com"
						data-description="Example charge"
						data-image="https://stripe.com/img/documentation/checkout/marketplace.png"
						data-locale="auto" data-zip-code="true">
						
					</script>
				</form>
				<!--Service stripe -->
		
	</div>

	<jsp:include page="footer.html"></jsp:include>

</body>
</html>