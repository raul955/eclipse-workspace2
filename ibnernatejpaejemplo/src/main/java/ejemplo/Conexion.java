package ejemplo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
	
	public Conexion(){
	}
	
	public void conexion() throws ClassNotFoundException {

		Class.forName ("oracle.jdbc.driver.OracleDriver");
		Connection connection;

		try {

		String url = "jdbc:oracle:thin:@192.168.56.101:1521:xe";
		connection = DriverManager.getConnection(url ,"gestion", "gestion");

		Statement stmt=connection.createStatement(); 
		ResultSet rs = stmt.executeQuery("select * from articulos"); 

		while(rs.next()) {
			System.out.println(rs.getString(1)+ " " +rs.getString(2)+ " " +rs.getInt(3)+ " " +rs.getInt(4) + " " +rs.getInt(5));
		}

		connection.close();

		} catch (SQLException ex) {
		connection = null ;
		ex.printStackTrace();

		System.out.println(" SQLException : " + ex.getMessage () );
		System.out.println(" SQLState : " + ex.getSQLState () ) ;
		System.out.println(" VendorError : " + ex.getErrorCode () );
		}
	}
}
