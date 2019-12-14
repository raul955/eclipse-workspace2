<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.util.Scanner" %>
<%@ page import="mvc.cinemvc4.domain.Nomina" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



<form method="POST" action="modificar">
<p2>Introduzca el DNI del empleado a modificar:</p2><br>
DNI<input type="text" name="dnibase"/><br>
<p2>----------------------------------------</p2><br>
<p2>Nuevos datos</p2><br>
NUEVO NOMBRE<input type="text" name="nombre" value="${empleado.nombre}"/><br>
NUEVO DNI<input type="text" name="dni" value="${empleado.dni}"/><br>
NUEVO SEXO(M/F)<input type="text" name="sexo" value="${empleado.sexo}"/><br>
NUEVA CATEGORIA<input type="text" name="categoria" value="${empleado.categoria}"/><br>
NUEVO ANYO<input type="text" name="anyos" value="${empleado.anyos}"/><br>
<input name="action" value="modificar" style="visibility: hidden; display: none;">
<input type="submit" value="Enviar"/>




</form>
	
	

<a href="/nominas/index">
<input type="button" value="Salir" style="height: 28px; width: 70px;"/>
</a>
</body>
</html>