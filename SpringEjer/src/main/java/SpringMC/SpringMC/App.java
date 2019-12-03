package SpringMC.SpringMC;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import beans.AppConfig;
import beans.Barcelona;
import beans.Jugador;
import beans.Juventus;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext contexto = new AnnotationConfigApplicationContext(AppConfig.class);

		Jugador jug = (Jugador) contexto.getBean("jugador1");
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Elija un equipo: 1- Barcelona 2-Juventus ");
		int respuesta = s.nextInt();
		
		if(respuesta==1){
			jug.setEquipo(new Barcelona());
		}else if(respuesta==2){
			jug.setEquipo(new Juventus());
		}else{
			System.out.println("Equipo erróneo");
		}
		
		
		
		System.out.println(jug.getNombre()+"-"+jug.getEquipo().mostrar()+"-"+jug.getCamiseta().getNumero()+"-"+jug.getCamiseta().getMarca().getNombre());
		
		((AbstractApplicationContext) contexto).close();
	}

}
