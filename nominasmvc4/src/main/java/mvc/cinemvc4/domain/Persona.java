package mvc.cinemvc4.domain;

public class Persona {

	public String nombre;
	public String dni;
	public char sexo;
	
	public Persona(String nombre, String dni, char sexo) throws DatosIncorrectosException{
		
		this.nombre = nombre;
		this.dni = dni;
		this.sexo = sexo;
		
		if(sexo != 'M' && sexo !='F') {
			throw new DatosIncorrectosException();
		}else {
			this.sexo = sexo;
		}
		
	}

	public Persona(String nombre, char sexo) {
		this.nombre = nombre;
		this.sexo = sexo;
	}

	public Persona(String dni) {
		
		this.dni = dni;
		
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String imprime() {
		return nombre+";"+dni;
	}

	public String getDni() {
		return dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public char getSexo() {
		return sexo;
	}

	
	
	
	
}
