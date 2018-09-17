<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="javax.servlet.http.HttpSession" %>
    <%@page import="javax.servlet.http.HttpServlet" %>
	<%@page import="javax.servlet.http.HttpServletRequest" %>
	<%@page import="javax.servlet.http.HttpServletResponse" %>
	<%@page import="javax.servlet.http.HttpSession" %>
	<%@page import="eventechPackage.ConnectUser" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
session.invalidate();
HttpSession sessionstart = request.getSession(true);
sessionstart.setAttribute("isConnected", false);
%> 
<jsp:forward page="accueil.jsp"> 
<jsp:param name="msg" value="msg"/>
</jsp:forward> 
</body>
</html>