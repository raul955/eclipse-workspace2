<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="agregar.html" method="POST" commandName="cmdform">
		<form:label path="nombre">Nombre</form:label>
		<form:input path="nombre"></form:input>
		
		
		<form:label path="apellido">Apellido</form:label>
		<form:input path="apellido"></form:input>
		
		<input type="submit" value="Saludar">
	</form:form>
</body>
</html>