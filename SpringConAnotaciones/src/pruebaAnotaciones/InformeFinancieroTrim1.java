package pruebaAnotaciones;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim1 implements creacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentaci�n de informe financiero";
	}

}
