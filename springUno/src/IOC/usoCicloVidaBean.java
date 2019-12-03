package IOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class usoCicloVidaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Primer paso crear contexto(cargar archivo xml)
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicantionContext3.xml");
		
		//Uso solo de la interfaz
		//Pedir el objeto al archivo xml
		Empleados juan=contexto.getBean("miEmpleado", Empleados.class);
		
		//Utilizar bean
		System.out.println(juan.getTareas());
		
		System.out.println(juan.getInformes());
		
		
		//cerrar xml
		contexto.close();
		
		
	}

}
