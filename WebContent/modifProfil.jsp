<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>

	<form action="modifProfil">

		<div>
			Nom: <input id="focusInscription" type="text" name="nom"
				class="form-control" value="${Fnom}" class="validity" required>
		</div>

		<div>
			Prénom: <input id="focusInscription" type="text" name="nom"
				class="form-control" value="${prenom}" class="validity" required>
		</div>

		<div>
			mail: <input id="focusInscription" type="text" name="nom"
				class="form-control" value="${mailCo}" class="validity" required>
		</div>

	</form>
	
	


	<jsp:include page="footer.html"></jsp:include>

</body>
</html>