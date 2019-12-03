package Laboral;

public class Nomina {

	private static final int SUELDO_BASE[] =
		{50000, 70000, 90000, 110000, 130000,150000, 170000, 190000, 210000, 230000};
	
	
	public static int sueldo(Empleado emp) {
		
		int sueldo = SUELDO_BASE[emp.getCategoria()-1]+5000*emp.anyos;
			
		return sueldo;
		
	}
	
	//necesario para la opción 4 del menú del ejercicio 5.
	public static int sueldo(int cat, int anyos) {
		int sueldo = SUELDO_BASE[cat-1]+5000*anyos;
			
		return sueldo;
	}
	
}
