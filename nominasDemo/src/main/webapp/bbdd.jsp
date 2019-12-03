<%@ page import="Laboral.Backup" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	
	Backup.backups();
	out.println("Copia de seguridad realizada.");
	
	%>
<br><br>
<a href="index.jsp"><input type="button" value="Volver" /></a>
</body>
</html>