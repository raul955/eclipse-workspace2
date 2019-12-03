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
import Laboral.DatosIncorrectosException;
import Laboral.Empleado;

/**
 * Servlet implementation class mostrarEmpleado
 */
public class mostrarEmpleadosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public mostrarEmpleadosController() {
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
	}

}
