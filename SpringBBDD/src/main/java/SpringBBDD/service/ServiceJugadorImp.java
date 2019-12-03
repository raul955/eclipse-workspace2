package SpringBBDD.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringBBDD.beans.Jugador;
import SpringBBDD.dao.DAOJugador;

@Service
public class ServiceJugadorImp implements ServiceJugador {

	@Autowired
	private DAOJugador daoJugador;
	
	@Override
	public void registrar(Jugador jugador) throws Exception {
		// TODO Auto-generated method stub
		try{
			daoJugador.registrar(jugador);
		}catch(Exception e){
			throw e;
		}
		
	}

}
