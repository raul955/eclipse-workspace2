package IOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class usoEmpleados {

	public static void main(String[] args) {
		
//		//Creación de objetos de tipo empleado
//		
//		Empleados Empleado1 = new directorEmpleado();
//		
//		
//		
//		
//		//Uso de los objetos creados
//
//		System.out.println(Empleado1.getTareas());

		//Primer paso crear contexto(cargar archivo xml)
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicantionContext.xml");
		
		//Pedir el objeto al archivo xml
		directorEmpleado juan=contexto.getBean("miEmpleado", directorEmpleado.class);
		
		//Utilizar bean
		System.out.println(juan.getTareas());
		
		System.out.println(juan.getInformes());
		
		System.out.println(juan.getEmail());
		
		System.out.println(juan.getNombreEmpresa());
		
		System.out.println("------------------");
		
		secretarioEmpleado maria=contexto.getBean("miSecretarioEmpleado", secretarioEmpleado.class);
		
		System.out.println(maria.getTareas());
		
		System.out.println(maria.getInformes());
		
		System.out.println(maria.getEmail());
		
		System.out.println(maria.getNombreEmpresa());
				
		//cerrar xml
		contexto.close();
		
	}

}
