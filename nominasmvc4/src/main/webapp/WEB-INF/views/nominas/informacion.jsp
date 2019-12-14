<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Información de los empleados:</h2>
	<table id="tabla">
		<tr>		
			<td style="height: 28px; width: 150px;">Nombre</td>
			<td style="height: 28px; width: 150px;">DNI</td>
			<td style="height: 28px; width: 150px;">Sexo</td>
			<td style="height: 28px; width: 150px;">Categoria</td>
			<td style="height: 28px; width: 150px;">Años</td>
		<tr>	
		<c:forEach items="${listaEmp}" var="info">
			<tr>
				<td>${info.nombre }</td>
				<td>${info.dni }</td>
				<td>${info.sexo }</td>
				<td>${info.categoria }</td>
				<td>${info.anyos }</td>
			</tr>
		</c:forEach>
	</table>

<a href="http://localhost:8080/springapp/nominas/index">
<input type="button" value="Salir" style="height: 28px; width: 70px;"/>
</a>

</body>
</html>