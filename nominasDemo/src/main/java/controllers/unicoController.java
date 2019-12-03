package controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Laboral.CalculaNominas;
import Laboral.DatosIncorrectosException;
import Laboral.Empleado;
import Laboral.Nomina;

/**
 * Servlet implementation class unicoController
 */
public class unicoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Nomina n = new Nomina();
	Connection con;
	PreparedStatement pst;
	Statement st;
	ResultSet rs;
	int result;
	
	String url = "jdbc:oracle:thin:@192.168.56.101:1521:xe";
	String user = "empleado";
	String pass = "empleado";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public unicoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String value = request.getParameter("action");
		
		if(value.equals("mostrarSueldo")) {
			
			CalculaNominas calcula = new CalculaNominas();
			RequestDispatcher rd;
			Empleado emp;
			String salario = null;
			
			try {
				
				emp = calcula.mostrarEmpleadoDni(request.getParameter("dni"));
				
				request.setAttribute("dniEmp", emp.getDni());
				
				salario = calcula.mostrarSalarioPorEmpleado(request.getParameter("dni"));
				
				rd = request.getRequestDispatcher("sueldos.jsp");
				
				request.setAttribute("salarioEmp", salario);
				
				rd.forward(request, response);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (DatosIncorrectosException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
						
		}else if(value.equals("mostrarInformacion")) {
			
			CalculaNominas calcula = new CalculaNominas();
			RequestDispatcher rd;
			
			try {
				
				List<Empleado> emp = calcula.mostrarTablaEmpleados();			
				request.setAttribute("listaEmp", emp);
				
				rd = request.getRequestDispatcher("informacion.jsp");
				
				
				rd.forward(request, response);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (DatosIncorrectosException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(value.equals("modificar")) {
			
			CalculaNominas cal = new CalculaNominas();
			
			RequestDispatcher rd;
			
			String dni = request.getParameter("dni");
			
			String nombre = request.getParameter("nombre");
			
			String sexo = request.getParameter("sexo");
			
			String categoria = request.getParameter("categoria");
			
			String anyos = request.getParameter("anyos");
			
			
			try {
				
				cal.modificarEmpelado(dni, nombre, sexo, categoria, anyos);
				
				rd = request.getRequestDispatcher("modificar.jsp");
				
				rd.forward(request, response);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (DatosIncorrectosException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
			
			
			
		}
		
		
		
		
		
	}
	
	


