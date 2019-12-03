package controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Laboral.CalculaNominas;
import Laboral.Empleado;
import Laboral.DatosIncorrectosException;

/**
 * Servlet implementation class mostrarSalarioDni
 */
public class mostrarSalarioDniController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public mostrarSalarioDniController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
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
		
		
		
	}

}
