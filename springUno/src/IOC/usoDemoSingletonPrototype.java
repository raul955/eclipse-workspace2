package IOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class usoDemoSingletonPrototype {

	public static void main(String[] args) {
		
		//carga del xml tipo empleado
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicantionContext2.xml");

		//peticion de beans al contenedor Spring
		secretarioEmpleado maria=contexto.getBean("miSecretarioEmpleado", secretarioEmpleado.class);
		secretarioEmpleado pedro=contexto.getBean("miSecretarioEmpleado", secretarioEmpleado.class);
		secretarioEmpleado fernando=contexto.getBean("miSecretarioEmpleado", secretarioEmpleado.class);
		secretarioEmpleado raul=contexto.getBean("miSecretarioEmpleado", secretarioEmpleado.class);
		secretarioEmpleado abraham=contexto.getBean("miSecretarioEmpleado", secretarioEmpleado.class);
		
		
		//Al usar prototype en el xml (scope) los objetos apuntan a un punto diferente de la memoria
		//Si usamos singleton, los objetos son los mismos ya que apuntan al mismo sitio
		System.out.println(maria);
		System.out.println(pedro);
		System.out.println(fernando);
		System.out.println(raul);
		System.out.println(abraham);
		
		
	}

}
