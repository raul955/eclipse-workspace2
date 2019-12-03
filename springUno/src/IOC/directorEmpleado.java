package IOC;

public class directorEmpleado implements Empleados {

	//Creación de campo tio creacionInforme(interfaz de antes)
	private creacionInformes informeNuevo;
	
	//Creación de constructor que inyecta la dependencia
	public directorEmpleado(creacionInformes informeNuevo){
		
		this.informeNuevo=informeNuevo;
		
	}
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Il capo di tutti i capi";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "Informe creado con el director: " +informeNuevo.getInformes();
	}

	private String email;
	private String nombreEmpresa;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	//metodo init. Encargado de ejecutar tareas antes de que el bean esté disponible
	public void metodoInicial(){
		
		System.out.println("Dentro del metodo init, aquí irian las tareas a ejecutar antes de que el bean esté listo");		
		
	}
	
	public void metodoFinal(){
		
		System.out.println("Dentro del metodo destroy, aquí irian las tareas a ejecutar después de que el bean se use");		
		
	}
	
	
	
	//método destroy, encargado de ejecutar tareas después de que el bean halla sido ejecutado.
}
