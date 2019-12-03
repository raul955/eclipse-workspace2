package IOC;

public class jefeEmpleado implements Empleados{

	private creacionInformes informeNuevo;
	
	
	public jefeEmpleado(creacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	public String getTareas(){
		
		return "Aquí mando yo";
		
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "Informe presentado por el jefe: " +informeNuevo.getInformes();
	}
	
	
}
