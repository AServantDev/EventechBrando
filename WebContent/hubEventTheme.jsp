<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="mathilde.css">
<title>Evenements "${event.theme }"</title>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>

	<div class="container" id="cardContainer">
		<div class="row" id="rowCard">
			<c:forEach items="${eventList }" var="event" varStatus="status">

				<div class="col-sm" id="Card">
					<div class="card" id="cardImg">
						<img class="card-img-top" id="konoDio"
							src="https://ih1.redbubble.net/image.346953171.1188/pp,550x550.jpg"
							alt="Card image cap">
						<div class="card-body">
							<h6 class="card-title">
								<strong><c:out value="${event.nom}"></c:out> <br>
								</strong> <strong>Date: <c:out value="${event.dateEvenement}"></c:out>
									<br>
								</strong>
								<strong>Theme: <c:out value="${event.theme}"></c:out>
									<br>
								</strong>

							</h6>
							<p class="card-text">
								<c:out value="${event.descriptionBreve}"></c:out>
							</p>
							<div id="cardBtn"><a  href="pageType?idEvent=${event.id_event }" class="btn btn-outline-danger">Plus d'infos...</a></div>
							

						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>

	<jsp:include page="footer.html"></jsp:include>
</body>
</html>