package beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Ciudad {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@PostConstruct
	private void init(){
		System.out.println("Antes de inicializar el bean");
	}
	
	@PreDestroy
	private void destroy(){
		System.out.println("A punto de ser destruido");
	}
	
}
