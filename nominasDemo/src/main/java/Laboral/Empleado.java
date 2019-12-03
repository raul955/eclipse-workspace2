package Laboral;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Empleado extends Persona {

	private int categoria;
	public int anyos;

	public Empleado(String nombre, String dni, char sexo, int categoria, int anyos) throws DatosIncorrectosException {
		super(nombre, dni, sexo);
		this.categoria = categoria;
		this.anyos = anyos;

		if (categoria < 0 || categoria > 10) {
			throw new DatosIncorrectosException();
		} else {
			this.categoria = categoria;
		}

		if (anyos < 0) {
			throw new DatosIncorrectosException();
		} else {
			this.anyos = anyos;
		}

	}

	public Empleado(String nombre, String dni, char sexo) throws DatosIncorrectosException {
		super(nombre, dni, sexo);
		this.categoria = 1;
		this.anyos = 0;

	}
	
	public Empleado(String dni) throws DatosIncorrectosException {
		super(dni);
		

	}
	

	/**
	 * @return the categoria
	 */
	public int getCategoria() {
		return categoria;
	}
	
	public int getAnyos() {
		return anyos;
	}

	/**
	 * @param categoria the categoria to set
	 * @throws DatosIncorrectosException
	 */
	public void setCategoria(int categoria) throws DatosIncorrectosException {
		this.categoria = categoria;

		if (categoria < 0 || categoria > 10) {
			throw new DatosIncorrectosException();
		} else {
			this.categoria = categoria;
		}

	}

	public void incranyos() {
		anyos++;
	}

	public String toString() {
		return dni;
	}

	public String imprime() {

		String separador = ";";
		String datosempleado = super.imprime() + separador + categoria + separador + anyos;

		return datosempleado;
	}

	public static void altaEmpleado(Empleado emp) {

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@192.168.56.101:1521:xe";
			Connection miConexion = DriverManager.getConnection(url, "empleado", "empleado");

			Statement miStatement = miConexion.createStatement();

			String query1 = "INSERT INTO EMPLEADOS (NOMBRE, DNI, SEXO, CATEGORIA, ANYOS) VALUES('" + emp.nombre + "', '"
					+ emp.dni + "', '" + emp.sexo + "', '" + emp.categoria + "', " + emp.anyos + ")";

			miStatement.executeUpdate(query1);
			miStatement.executeUpdate(
					"INSERT INTO NOMINAS (SUELDO, DNI) VALUES(" + Nomina.sueldo(emp) + ", '" + emp.dni + "')");

			miStatement.close();
			miConexion.close();
		} catch (SQLException e) {
			System.out.println("Error al dar de alta.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	
	//3.1
	public static void altaEmpleado(String nombre, String dni, char sexo, int categoria, int anyos)
			throws SQLException, IOException, ClassNotFoundException, DatosIncorrectosException {

		String frase = "'" + nombre + "', '" + dni + "', '" + sexo + "', '" + categoria + "', " + anyos + "";
		String c;

		FileWriter escritura = new FileWriter("empleadosNuevos.txt", false);

		escritura.write(frase);
		escritura.append("\r\n");
		escritura.close();

		FileReader entrada = new FileReader("empleadosNuevos.txt");

		BufferedReader miBR = new BufferedReader(new FileReader("empleadosNuevos.txt"));
		while ((c = miBR.readLine()) != null) {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@192.168.56.101:1521:xe";

			Connection miConexion = DriverManager.getConnection(url, "empleado", "empleado");

			Statement miStatement = miConexion.createStatement();

			miStatement.executeUpdate("INSERT INTO EMPLEADOS (NOMBRE, DNI, SEXO, CATEGORIA, ANYOS) VALUES(" + c + ")");

		}

		entrada.close();
	}

}
