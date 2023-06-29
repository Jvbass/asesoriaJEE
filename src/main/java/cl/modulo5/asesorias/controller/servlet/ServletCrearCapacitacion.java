package cl.modulo5.asesorias.controller.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.modulo5.asesorias.controller.CapacitacionController;
import cl.modulo5.asesorias.model.entity.Capacitacion;

@WebServlet("/ServletCrearCapacitacion")
public class ServletCrearCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletCrearCapacitacion() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 boolean cookieEncontrada = false;
		 Cookie[] cookies = request.getCookies();

		    if (cookies != null) {
		        for (Cookie cookie : cookies) {
		            if (cookie.getName().equals("credenciales")) {
		                cookieEncontrada = true;
		                break;
		            }
		        }
		    }
		    if (cookieEncontrada) {
		    	response.sendRedirect("crear-capacitacion.jsp");
		    } else {
		    request.getRequestDispatcher("login.jsp").forward(request, response);
		    }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    CapacitacionController capacitacionController = new CapacitacionController();
	    	    		
	    String nombre = request.getParameter("nombre");
	    String detalle = request.getParameter("detalle");

	    
	    System.out.println(nombre);
	    Capacitacion capacitacion = new Capacitacion(0, nombre, detalle);
	    
		capacitacionController.saveCapacitacion(capacitacion);

	}

}
