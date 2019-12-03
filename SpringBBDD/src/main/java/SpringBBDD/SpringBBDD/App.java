package SpringBBDD.SpringBBDD;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringBBDD.beans.Jugador;
import SpringBBDD.beans.Marca;
import SpringBBDD.service.ServiceJugador;
import SpringBBDD.service.ServiceMarca;

public class App {
    
	public static void main( String[] args ){


    
    ApplicationContext contexto = new ClassPathXmlApplicationContext("SpringBBDD1/SpringBBDD/xml/beans.xml");
    
    ServiceJugador sm = (ServiceJugador) contexto.getBean("serviceJugadorImp");
//    Marca mar3 = (Marca) contexto.getBean("marca3");
//    Equipo eq1 = (Equipo) contexto.getBean("equipo1");
    Jugador jugador= (Jugador) contexto.getBean("pedraso");
    
    try{
    	sm.registrar(jugador);
    }catch(Exception e){
    	System.out.println(e.getMessage());
    }
    	
}
}