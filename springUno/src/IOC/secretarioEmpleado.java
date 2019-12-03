package IOC;

public class secretarioEmpleado implements Empleados {

	public void setInformeNuevo(creacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	
	@Override
	public String getTareas() {
		
		return "Soy un mandao";
	}

	@Override
	public String getInformes() {
		
		return "Informe generado por el secretario: " +informeNuevo.getInformes();
	}

	private creacionInformes informeNuevo;

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
	
	
	
	
	
}
