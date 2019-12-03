package SpringMC.SpringMC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.AppConfig;
import beans.AppConfig2;
import beans.Barcelona;
import beans.Ciudad;
import beans.IEquipo;
import beans.Jugador;
import beans.Mundo;
import beans.Persona;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext contexto = new ClassPathXmlApplicationContext("xml/beans.xml");
//		contexto.register(AppConfig.class);
//		contexto.register(AppConfig2.class);
//		contexto.refresh();
		
		IEquipo bar = (IEquipo) contexto.getBean("randomname");
		System.out.println(bar.mostrar());
		
		Jugador dog = (Jugador) contexto.getBean("pessi");
		System.out.println(dog.getNombre()+" " +dog.getNumero()+" "+dog.getEquipo().mostrar());
		
//		Mundo m =  contexto.getBean("marte", Mundo.class);
		
//		System.out.println(m.getSaludo());
		
		Persona per =(Persona) contexto.getBean("persona");
		Persona per2 =(Persona) contexto.getBean("persona");
		Ciudad ciu = (Ciudad) contexto.getBean("ciudad");
		
		System.out.println(ciu.getNombre());
		
//		per.setId(1);
//		per.setNombre("Pepe");
//		per.setApodo("Peporro");
		
//		String nombreCiudades="";
//		for(Ciudad ciu : per.getPais().getCiudades()){
//			nombreCiudades += ciu.getNombre() + "-";
//		}
		//System.out.println(per.getId() + " " + per.getApodo() + " " + per.getNombre() + " " + per.getPais().getNombre() +" "+ per.getCiudad().getNombre());
		//System.out.println(per2.getId() + " " + per2.getApodo() + " " + per2.getNombre() + " " + per2.getPais().getNombre() +" "+ per2.getCiudad().getNombre());

		System.out.println(per.getApodo());
		
		
		((AbstractApplicationContext) contexto).close();
		
	}

}
