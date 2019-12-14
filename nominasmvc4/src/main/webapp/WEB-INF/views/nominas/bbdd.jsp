<%@ page import="mvc.cinemvc4.domain.Backup" %>
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
<a href="http://localhost:8080/springapp/nominas/index">
<input type="button" value="Salir" style="height: 28px; width: 70px;"/>
</a>
</body>
</html>