<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.util.Scanner" %>
<%@ page import="Laboral.Nomina" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	
	<p>Categorías y sueldos actualizados</p>
	<%
	
	Scanner s = new Scanner(System.in);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduzca nueva categoria para TODOS los empleados.");
	int cat = s.nextInt();
	System.out.println("Introduzca nuevos anyos para TODOS los empleados.");
	int an = s.nextInt();

	Class.forName("oracle.jdbc.driver.OracleDriver");

	String url = "jdbc:oracle:thin:@192.168.0.16:1521:xe";
	Connection miConexion = DriverManager.getConnection(url, "empleado", "empleado");

	Statement miStatement = miConexion.createStatement();

	String instruccionSQL = "UPDATE EMPLEADOS set categoria = '" + cat + "'";

	miStatement.executeUpdate(instruccionSQL);

	String instruccionSQL3 = "UPDATE EMPLEADOS set anyos = " + an;

	miStatement.executeUpdate(instruccionSQL3);

	String instruccionSQL2 = "UPDATE nominas set sueldo = " + Nomina.sueldo(cat, an);

	miStatement.executeUpdate(instruccionSQL2);
	
	
	%>



<br><br>
<a href="index.jsp"><input type="button" value="Volver" style="height: 28px; width: 500px;"/></a>
</body>
</html>