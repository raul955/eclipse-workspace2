<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.util.Scanner" %>
<%@ page import="Laboral.Nomina" %>
<%@ page import="Laboral.Persona" %>
<%@ page import="Laboral.Empleado" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<form>
<p>Introduzca el dni de la persona a modificar: </p>
<input type="text" name="dni"/><br>
<p>Introduzca una nueva categoría: </p>
<input type="text" name="categoria"/><br>
<p>Introduzca unos nuevos anyos: </p>
<input type="text" name="anyos"/><br><br>
<input type="submit" value="Enviar"/>
<br>




</form>

	<%
	
	
	/*
	*Me toma los valores categoria y anyos de los inputs como nulos, por lo que no puedo castearlos a 
	*integer para utilizar el método de Nomina.sueldo
	*/
	
	String dni = request.getParameter("dni");	
	String categoria =request.getParameter("categoria");
	String anyo = request.getParameter("anyos");
	
	try{
	

	Class.forName("oracle.jdbc.driver.OracleDriver");

	String url = "jdbc:oracle:thin:@192.168.56.101:1521:xe";
	Connection miConexion = DriverManager.getConnection(url, "empleado", "empleado");

	Statement miStatement = miConexion.createStatement();

	String instruccionSQL = "UPDATE EMPLEADOS set categoria = '" + categoria + "' where dni='" + dni + "'";

	miStatement.executeUpdate(instruccionSQL);

	String instruccionSQL3 = "UPDATE EMPLEADOS set anyos = " + anyo + " where dni='" + dni + "'";

	miStatement.executeUpdate(instruccionSQL3);

	
	
	}catch(SQLException e){
		
		out.print("No ha sido posible conectar con la BBDD (recalcularUno.jsp)");
		
	}
	
	
	%>
	
	<%
	
	try{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url = "jdbc:oracle:thin:@192.168.56.101:1521:xe";
		Connection miConexion = DriverManager.getConnection(url, "empleado", "empleado");
		
		//int cat = Integer.parseInt(categoria);
		//int an = Integer.parseInt(anyo);
		
		Statement miStatement = miConexion.createStatement();
		
		String instruccionSQL2 = "UPDATE nominas set sueldo = " + Nomina.sueldo(3,3) + " where dni='" + dni
				+ "'";

		miStatement.executeUpdate(instruccionSQL2);
		
	}catch(SQLException e){
		out.print("Se fue a la puta");
	}
	
	%>


<a href="index.jsp"><input type="button" value="Volver" style="height: 28px; width: 500px;"/></a>
</body>
</html>