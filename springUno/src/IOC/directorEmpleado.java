package IOC;

public class directorEmpleado implements Empleados {

	//Creaci�n de campo tio creacionInforme(interfaz de antes)
	private creacionInformes informeNuevo;
	
	//Creaci�n de constructor que inyecta la dependencia
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
	
	//metodo init. Encargado de ejecutar tareas antes de que el bean est� disponible
	public void metodoInicial(){
		
		System.out.println("Dentro del metodo init, aqu� irian las tareas a ejecutar antes de que el bean est� listo");		
		
	}
	
	public void metodoFinal(){
		
		System.out.println("Dentro del metodo destroy, aqu� irian las tareas a ejecutar despu�s de que el bean se use");		
		
	}
	
	
	
	//m�todo destroy, encargado de ejecutar tareas despu�s de que el bean halla sido ejecutado.
}
