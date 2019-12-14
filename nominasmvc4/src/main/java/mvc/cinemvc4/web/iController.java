package mvc.cinemvc4.web;
import java.beans.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mvc.cinemvc4.domain.CalculaNominas;
import mvc.cinemvc4.domain.DatosIncorrectosException;
import mvc.cinemvc4.domain.Empleado;
import mvc.cinemvc4.domain.pelicula;
import mvc.cinemvc4.domain.usuario;
import mvc.cinemvc4.repository.BBDD;
import mvc.cinemvc4.repository.BBDDDAO;


@Controller
@RequestMapping(value="/nominas")
public class iController {
	
	BBDD BBDD;
	CalculaNominas calcula;
	pelicula pel;
	Connection con;
	PreparedStatement pst;
	Statement st;
	ResultSet rs;
	int result;
	String forName = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@192.168.0.16:1521:xe";
	String user = "empleado";
	String pass = "empleado";
	String pagina=null;

    protected final Log logger = LogFactory.getLog(getClass());

    @RequestMapping(method=RequestMethod.GET,value="/mostrarSueldo")
    public ModelAndView mostrarSueldo(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    		
        return new ModelAndView("sueldos");
    }
    
    @RequestMapping(method=RequestMethod.GET,value="/modificar")
    public ModelAndView modificar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    		
        return new ModelAndView("modificar");
    }
    
    @RequestMapping(method=RequestMethod.GET,value="/recalcularUno")
    public ModelAndView recalcularUno(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    		
        return new ModelAndView("recalcularUno");
    }
    
    @RequestMapping(method=RequestMethod.GET,value="/bbdd")
    public ModelAndView bbdd(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    		
        return new ModelAndView("bbdd");
    }
    
    @RequestMapping(method=RequestMethod.GET,value="/salida")
    public ModelAndView salida(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    		
        return new ModelAndView("salida");
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/informacion")
    public ModelAndView informacion(HttpServletRequest request) throws ServletException, IOException, DatosIncorrectosException {

    	calcula = new CalculaNominas();
		
		try {
			
			List<Empleado> emp = calcula.mostrarTablaEmpleados();			
			request.setAttribute("listaEmp", emp);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new ModelAndView("informacion");
		
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/sueldos")
    public ModelAndView sueldos(HttpServletRequest request) throws ServletException, IOException, DatosIncorrectosException {

    	CalculaNominas calcula = new CalculaNominas();
		Empleado emp;
		String salario = null;
		
		try {
			
			emp = calcula.mostrarEmpleadoDni(request.getParameter("dni"));
			
			request.setAttribute("dniEmp", emp.getDni());
			
			salario = calcula.mostrarSalarioPorEmpleado(request.getParameter("dni"));
			
			request.setAttribute("salarioEmp", salario);
			
			
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
		
		return new ModelAndView("sueldos");
		
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/modificar")
    public ModelAndView modificar(HttpServletRequest request) throws ServletException, IOException, DatosIncorrectosException {

    	CalculaNominas cal = new CalculaNominas();		
		
		String dni = request.getParameter("dni");
		
		String nombre = request.getParameter("nombre");
		
		String sexo = request.getParameter("sexo");
		
		String categoria = request.getParameter("categoria");
		
		String anyos = request.getParameter("anyos");
		
		
		try {
			
			cal.modificarEmpelado(dni, nombre, sexo, categoria, anyos);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return new ModelAndView("modificar");
		
    }
    
    @RequestMapping(method=RequestMethod.GET,value="/index")
    public ModelAndView indexx(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    		
        return new ModelAndView("index");
    }
    
    /*
     * 
     */

    
    

}
