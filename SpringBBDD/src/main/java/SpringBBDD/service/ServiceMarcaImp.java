package SpringBBDD.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringBBDD.beans.Marca;
import SpringBBDD.dao.DAOMarca;

@Service
public class ServiceMarcaImp implements ServiceMarca {

	@Autowired
	private DAOMarca daoMarca;
	
	@Override
	public void registrar(Marca marca) throws Exception {
		// TODO Auto-generated method stub
		try{
			daoMarca.registrar(marca);
		}catch(Exception e){
			throw e;
		}

	}

}
