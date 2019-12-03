package pruebaAnotaciones;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class usoAnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//leer el xml de configuración
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicantionContext.xml");
		
		//pedir un bean
		Empleados Antonio = contexto.getBean("comercialExperimentado", Empleados.class);
		
		//Usar el bean
		System.out.println(Antonio.getInforme());
		
		System.out.println(Antonio.getTareas());
		
		contexto.close();
		
		
		
		
	}

}
