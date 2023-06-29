package cl.modulo5.asesorias.controller.servlet.capacitaciones;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.modulo5.asesorias.controller.CapacitacionController;
import cl.modulo5.asesorias.model.entity.Capacitacion;

@WebServlet("/ServletCrudCapacitaciones")
public class ServletCrudCapacitaciones extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//obtenemos la opcion desde el jsp
	String option = request.getParameter("option"); 
	
    // creamos la instancia del controlador
    CapacitacionController capacitacionController = new CapacitacionController();
    String url = "index.jsp";
    //System.out.println(option);
    
    switch(option) {
    
    case "formUpdateCapacitacion" : {
        int idFormCapacitacion = Integer.parseInt(request.getParameter("idCapacitacion"));
        // ingresmos al objeto capacitacion los atributos obtenidos por el controlador
        Capacitacion capacitacion = capacitacionController.findByIdCapacitacion(idFormCapacitacion); // ya tenemos al estudiante que deseamos actualizar
        url = "editar-capacitacion.jsp";
        // ingresamos capacitacion a la request
        request.setAttribute("capacitacion", capacitacion);
        break;
     }
    
    case "updateCapacitacion" : {
        int id = Integer.parseInt(request.getParameter("id"));
        String nombre = request.getParameter("name");
        String detalle = request.getParameter("detail");
        
        Capacitacion updateCapacitacion = new Capacitacion(id, nombre, detalle);
        // llamar al controlador
        capacitacionController.updateCapacitacion(updateCapacitacion);
        
        url = "listar-capacitaciones.jsp";
        request.setAttribute("capacitaciones", capacitacionController.findAllCapacitaciones());
        
        break;
      }
    
    case "saveCapacitacion" : {
        String nombre = request.getParameter("nombre");
	    String detalle = request.getParameter("detalle");
	    
	    Capacitacion capacitacion = new Capacitacion(0, nombre, detalle);
		capacitacionController.saveCapacitacion(capacitacion);
		
        url = "listar-capacitaciones.jsp";
		request.setAttribute("capacitaciones", capacitacionController.findAllCapacitaciones());
        break;
    }
    
    case "deleteCapacitacion" : {
    	int idDelete = Integer.parseInt(request.getParameter("idCapacitacion"));
    	capacitacionController.deleteCapacitacionById(idDelete);
    	
    	url = "listar-capacitaciones.jsp";
    	request.setAttribute("capacitaciones", capacitacionController.findAllCapacitaciones());
        break;
    }
    default:
        break;

    }
    
    //enviamos a la url los datos de la request 
    request.getRequestDispatcher(url).forward(request, response);
}
}
