<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Borrar Pel�cula</title>
</head>
<body>
<h2>Borrar Pel�cula</h2>
<form method="POST" action="borrarPelicula2">

ID: <input type="text" name="id"/></br></br>
<p>----------------------------</p>

<input type="submit" value="Borrar"/></br></br>
<input name="action" value="borrarPelicula" style="visibility: hidden; display: none;">

</form>
<p>${men }</p>


<a href="http://localhost:8080/springapp/filmografia/welcome">
<input type="button" value="Volver" />
</a>
</body>
</html>