<html>
<body>
<div align="center">
<h2>N�minas</h2>
<a href="http://localhost:8080/springapp/nominas/mostrarSueldo">
<input type="button" value="Mostrar sueldo por dni." style="height: 28px; width: 500px;"/>
</a>

<form method="POST" action="informacion">
<input type="submit" value="Mostrar la informaci�n de los empleados." style="height: 28px; width: 500px;"/>
<input name="action" value="mostrarInformacion" style="visibility: hidden; display: none;">
</form>

<a href="http://localhost:8080/springapp/nominas/modificar">
<input type="button" value="Modificar datos" style="height: 28px; width: 500px;"/>
</a>

<a href="http://localhost:8080/springapp/nominas/recalcularUno">
<input type="button" value="Recalcular y actualizar el sueldo de un empleado." style="height: 28px; width: 500px;"/>
</a>
<br><br>
<a href="http://localhost:8080/springapp/nominas/bbdd">
<input type="button" value="Realizar una copia de seguridad de la base de datos en ficheros." style="height: 28px; width: 500px;"/>
</a>
<br><br>
<a href="http://localhost:8080/springapp/nominas/salida">
<input type="button" value="Salir" style="height: 28px; width: 500px;"/>
</a>
</div>




<!-- 
<div align="center">
<h2>N�minas</h2>
<form method="POST" action="unicoController">
<a href="sueldos.jsp"><input type="button" value="Mostrar sueldo por dni." style="height: 28px; width: 500px;"/></a>
</form> 
<br>
<form method="POST" action="unicoController">
<a href="mostrarEmpleadosController"><input type="button" value="Mostrar la informaci�n de los empleados." style="height: 28px; width: 500px;"/></a>
</form>
<br>
<form method="POST" action="unicoController">
<a href="modificar.jsp"><input type="button" value="Modificar datos" style="height: 28px; width: 500px;"/></a>
</form>
<br>
<a href="recalcularUno.jsp"><input type="button" value="Recalcular y actualizar el sueldo de un empleado." style="height: 28px; width: 500px;"/></a>
<br>
<a href="bbdd.jsp"><input type="button" value="Realizar una copia de seguridad de la base de datos en ficheros." style="height: 28px; width: 500px;"/></a>
<br>
<a href="salida.jsp"><input type="button" value="Salir" style="height: 28px; width: 500px;"/></a>
</div>
 -->




</body>
</html>
