<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>

<%
	try {
		String typeUser = request.getParameter("typeUser");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String entreprise = request.getParameter("entreprise");
		String email = request.getParameter("email");
		String message = request.getParameter("message");

		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost/Eventech";
		String user = "root";
		String pwd = "SimplonMYSQL34";

		Connection con = DriverManager.getConnection(url, user, pwd);

		PreparedStatement ps = con.prepareStatement("insert into Eventech.contact values(?,?,?,?,?,?)");

		ps.setString(1,typeUser);
		ps.setString(2,nom);
		ps.setString(3,prenom);
		ps.setString(4,entreprise);
		ps.setString(5,email);
		ps.setString(6,message);

		int s = ps.executeUpdate();

		if (s > 0) {
%>
<jsp:forward page="messageEnvoye.jsp"></jsp:forward>
<%
	} else {
			out.print("Votre requête est incomplète. Merci de réitérer.");
		}

	} catch (Exception e) {
		e.printStackTrace();
		out.print("Votre requête est incomplète. Merci de réitérer.");
	}
%>
