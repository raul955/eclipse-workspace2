package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("pessi")
public class Jugador {

	
	private int numero;
	
	@Value("pulga")
	private String nombre;
	
	@Autowired
	@Qualifier("randomname")
	private IEquipo equipo;

	//La anotacion autowired se puede establecer tanto en el método como en la propiedad
	//La anotacion @Required no se inserta en el atributo, sino en su método set
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public IEquipo getEquipo() {
		return equipo;
	}
	
	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	}
	
}
