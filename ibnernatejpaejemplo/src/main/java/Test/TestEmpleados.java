package Test;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ejemplo.Direccion;
import ejemplo.Empleado;

public class TestEmpleados {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA");
	
	public static void main(String args[]){		
				
		insertInicial();
		
		imprimirTodo();	
				
		
		EntityManager man = emf.createEntityManager();
		man.getTransaction().begin();
		Empleado e = man.find(Empleado.class, 10L);		
		e.setNombre("Pedro");
		e.setApellidos("Rabanal");
		e.setDireccion(new Direccion(15L, "calle falsa, 123", "Springfield", "Springfield", "EEUU"));
		man.getTransaction().commit();
		imprimirTodo();	
		man.close();
		
		
		//Con el método merge para manejar entidades no administradas.
		man = emf.createEntityManager();
		man.getTransaction().begin();
		e.setNombre("Javier");
		e.setApellidos("Delgado");
		man.merge(e);
		man.getTransaction().commit();
		man.close();
		
		imprimirTodo();	
		
		borrar();	
		imprimirTodo();
					
		}
		
	private static void borrar(){		
		
		EntityManager man = emf.createEntityManager();
		man.getTransaction().begin();
		Empleado e = man.find(Empleado.class, 10L);
		man.remove(e);
		man.getTransaction().commit();
		man.close();
		
	}
	
	
	private static void insertInicial() {
		EntityManager man = emf.createEntityManager();
		Empleado e = new Empleado(10L, "Naranjo", "Raúl",LocalDate.of(1995, 9, 22));
		
		man.getTransaction().begin();
		man.persist(e);
		man.getTransaction().commit();
		man.close();
	}
	
	private static void imprimirTodo(){
		EntityManager man = emf.createEntityManager();
		
		List<Empleado> emps = (List<Empleado>) man.createQuery("FROM Empleado").getResultList();
		System.out.println("En esta base de datos hay " + emps.size() + " empleados.");
		for (Empleado emp : emps) {
			System.out.println(emp.toString());		
		}	
		man.close();
}
}