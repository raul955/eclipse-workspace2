package mvc.cinemvc4.domain;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Backup {

	String url = "jdbc:oracle:thin:@192.168.0.16:1521:xe";
	
	public static void backups() {
		
		String url = "jdbc:oracle:thin:@192.168.0.16:1521:xe";

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 1. Crear conexion

			Connection miConexion = DriverManager.getConnection(url, "empleado", "empleado");

			// 2. Crear objeto statement

			Statement miStatement = miConexion.createStatement();

			// 3. Ejecutar SQL

			ResultSet miResultSet = miStatement.executeQuery("SELECT * FROM empleados");

			// 4. Recorrer el resultSet e introducir cada registro en un fichero

			while (miResultSet.next()) {

				String contenido = (miResultSet.getString("nombre") + " " + miResultSet.getString("dni") + " "
						+ miResultSet.getString("categoria") + " " + miResultSet.getString("anyos"));
				String contenido2 = " \n ";
				try {
					FileWriter escritura = new FileWriter("backup.txt", true);

					escritura.write(contenido);
					escritura.append("\r\n");

					escritura.close();

				} catch (IOException e) {

					e.printStackTrace();

				}
			}	
			
			ResultSet miResultSet2 = miStatement.executeQuery("SELECT * FROM nominas");

			// 4. Recorrer el resultSet e introducir cada registro en un fichero

			while (miResultSet2.next()) {

				String contenido = (miResultSet2.getString("sueldo") + " "
						+ miResultSet2.getString("dni"));
				String contenido2 = " \n ";
				try {
					FileWriter escritura = new FileWriter("backupnominas.txt", true);

					escritura.write(contenido);
					escritura.append("\r\n");

					escritura.close();

				} catch (IOException e) {

					e.printStackTrace();

				}
			}
			
		} catch (Exception e) {

			System.out.println("No ha sido posible la conexi�n.");

			e.printStackTrace();

		}
	}
}
