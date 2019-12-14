<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.util.Scanner" %>
<%@page import="mvc.cinemvc4.domain.Empleado" %>
<%@page import="mvc.cinemvc4.domain.CalculaNominas" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>


<form method="POST" id="formulario" action="sueldos">
<p>Introduzca el dni del empleado a consultar: </p>
<input type="text" name="dni"/>
<input name="action" value="mostrarSueldo" style="visibility: hidden; display: none;">
<input type="submit" value="Enviar" id="enviar"/>

</form>

<h4>El sueldo del empleado es: ${salarioEmp}</h4>


<a href="http://localhost:8080/springapp/nominas/index">
<input type="button" value="Salir" style="height: 28px; width: 70px;"/>
</a>

</body>
</html>