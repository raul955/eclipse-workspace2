package controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Laboral.CalculaNominas;
import Laboral.DatosIncorrectosException;
/**
 * Servlet implementation class modificarEmpleadoController
 */
public class modificarEmpleadoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public modificarEmpleadoController() {
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
