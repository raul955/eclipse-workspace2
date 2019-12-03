package beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//las interfaces crean los métodos de abajo para prescinidir de los métodos con las anotaciones
public class Persona implements InitializingBean, DisposableBean{

	private int id;
	private String nombre;
	private String apodo;
	private Pais pais;
	private Ciudad ciudad;
	
	public Persona(int id, String nombre, String apodo) {
		this.id = id;
		this.nombre = nombre;
		this.apodo = apodo;
	}
	
//	@PostConstruct
//	private void init(){
//		System.out.println("Antes de inicializar el bean");
//	}
//	
//	@PreDestroy
//	private void destroy(){
//		System.out.println("A punto de ser destruido");
//	}
//	
	
	public Persona(){
		
	}
	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Antes de inicializar el bean");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("despues de usar el bean");
	}
	
	
	
	
	
}
