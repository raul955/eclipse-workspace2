package SpringBBDD.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import SpringBBDD.beans.Jugador;



@Repository
public class DAOJugadorImp implements DAOJugador {

	@Autowired
	private DataSource datasource;
	
	
	@Override
	public void registrar(Jugador jugador) throws Exception {
	
		String oracle = "INSERT INTO jugador(id,nombre,idequipo,idcamiseta) values(?,?,?,?)";	
		Connection con = null;
		
		try{			
			con = datasource.getConnection();
			
			PreparedStatement ps = con.prepareStatement(oracle);
			ps.setInt(1, jugador.getId());
			ps.setString(2,jugador.getNombre());
			ps.setInt(3, jugador.getEquipo().getId());
			ps.setInt(4, jugador.getCamiseta().getId());
			ps.executeUpdate();
			ps.close();
			
		}catch(Exception e){
			throw e;
		}finally{
			if(con != null){
				con.close();
			}
		}
		
	}

}
