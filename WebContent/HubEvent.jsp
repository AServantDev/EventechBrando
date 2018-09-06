<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>

<%@page import="eventechPackage.Evenement"%>
<%@page import="eventechPackage.CreateConnection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*"%>

<%
	ArrayList<Evenement> eventList = new ArrayList<Evenement>();
	Connection con = null;
	PreparedStatement preparedStatement = null;

	try {
		Class.forName("com.mysql.jdbc.Driver");

		con = (Connection) CreateConnection.createConnection();
		String sqlRequete = "SELECT * FROM evenement";

		Statement st = (Statement) con.createStatement();
		ResultSet result = (ResultSet) st.executeQuery(sqlRequete);

		while (result.next()) {
			Evenement event = new Evenement();

			event.setId_event(result.getInt("id_event"));
			event.setNom(result.getString("nom"));
			event.setLieu(result.getString("lieu"));
			event.setDateEvenement(result.getDate("date_evenement"));
			event.setPlaceMax(result.getInt("place_max"));
			event.setTheme(result.getString("theme"));
			event.setImg(result.getString("img"));

			eventList.add(event);

		}

	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link rel="stylesheet" href="main.css">
<title>Hub evenement</title>
</head>
<body>

	<%
		out.print("<div class=\"container\">");
		
		out.print("<div class=\"row\">");
		
		
		for (int i = 0; i < eventList.size(); i++) {
			
			
			out.print("<div class=\"col-sm\">");
			

			out.print("<div class=\"card\" style=\"width: 250px\">");
			
			out.print("<a href=pageType.jsp><img class=\"card-img-top\" style=\"height: 300px\" src=\"" + eventList.get(i).getImg()
					+ "\"alt=\"Card image cap\"></a>");
			
			
			out.print("<div class=\"card-body\">");
			
			out.print("<h6 class=\"card-title\"><strong>" + eventList.get(i).getNom() + "</strong></h6>");
			
			out.print("<p class=\"card-text\">" + eventList.get(i).getTheme() + "</p>");
			
			out.print("<a href=\"pageType.jsp\" class=\"btn btn-outline-danger\">Plus d'infos!</a>");
			
			out.print("</div>");

			out.print("</div>");
			out.print("</div>");
			
		}
		
		
		out.print("</div>");
		
		out.print("</div>");
		out.print("<a href=register.jsp>Créer un evénement </a>");
	%>





</body>
</html>