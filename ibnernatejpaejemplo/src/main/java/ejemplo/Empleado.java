package ejemplo;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLEADO")
public class Empleado implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "cod_empleado")
	private long codigo;
	
	@Column(name = "apellido")
	private String apellidos;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "fecha")
	private LocalDate fechaNacimiento;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="id_direccion")
	private Direccion direccion;
	
	public Direccion getDireccion() {
		return direccion;
	}



	public Empleado(){
		
	}

	public Empleado(long codigo, String apellidos, String nombre, LocalDate fechaNacimiento) {

		this.codigo = codigo;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}



	@Override
	public String toString() {
		return "Empleado [codigo=" + codigo + ", apellidos=" + apellidos + ", nombre=" + nombre + ", fechaNacimiento="
				+ fechaNacimiento + ", direccion=" + direccion + "]";
	}


	
	
	
	
	
	
}
