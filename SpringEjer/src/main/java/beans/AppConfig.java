package beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Fábrica donde especifico los beans que voy a necesitar

@Configuration
public class AppConfig {

	@Bean
	public Jugador jugador1(){
		return new Jugador();
	}
	
	@Bean
	public Barcelona barcelona(){
		return new Barcelona();
	}
	
	@Bean
	public Juventus juventus(){
		return new Juventus();
	}
	
	@Bean
	public Camiseta camiseta(){
		return new Camiseta();
	}
	
	@Bean
	public Marca marca(){
		return new Marca();
	}
	
	
	
	
	
}
