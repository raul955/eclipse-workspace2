package pruebaAnotaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("comercialExperimentado")
public class comercialExperimentado implements Empleados {
	
	public comercialExperimentado(){
		
	}

	
	@Autowired
	public comercialExperimentado(creacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Josea";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return nuevoInforme.getInformeFinanciero();
	}

	private creacionInformeFinanciero nuevoInforme;
}
