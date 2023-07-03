package cl.modulo5.asesorias.controller.servlet.capacitaciones;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.modulo5.asesorias.controller.UsuarioController;
import cl.modulo5.asesorias.model.entity.Cliente;
import cl.modulo5.asesorias.model.entity.Profesional;
import cl.modulo5.asesorias.model.entity.Administrativo;


@WebServlet("/ServletCrudUsuarios")
public class ServletCrudUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//obtenemos la opcion y tipo desde el jsp
	String tipo = request.getParameter("tipo"); 
	String option = request.getParameter("option"); 
	String url = "index.jsp";
	
	UsuarioController usuarioController = new UsuarioController();

	
		switch (option) {
		case "saveUsuario":
			if (tipo.equals("cliente")) {
		        int rut = Integer.parseInt(request.getParameter("rut"));
			    String nombre = request.getParameter("name");
		        String apellido = request.getParameter("lastname");
			    String contrasena = request.getParameter("password");
			    String telefono = request.getParameter("phone");
			    
			    Cliente cliente = new Cliente(rut, nombre, apellido, contrasena, tipo, telefono);
			    usuarioController.saveCliente(cliente);
			    
			} else if(tipo.equals("profesional")){
		        int rut = Integer.parseInt(request.getParameter("rut"));
			    String nombre = request.getParameter("name");
		        String apellido = request.getParameter("lastname");
			    String contrasena = request.getParameter("password");
			    String profesion = request.getParameter("profession");
			    
			    Profesional profesional = new Profesional(rut, nombre, apellido, contrasena, tipo, profesion);
			    
			    usuarioController.saveProfesional(profesional);
				
			} else if (tipo.equals("administrativo")) {
		        int rut = Integer.parseInt(request.getParameter("rut"));
			    String nombre = request.getParameter("name");
		        String apellido = request.getParameter("lastname");
			    String contrasena = request.getParameter("password");
			    String area = request.getParameter("area");
			    
			    Administrativo administrativo = new Administrativo(rut, nombre, apellido, contrasena, tipo, area);
			    
			    usuarioController.saveAdministrativo(administrativo);
			}		
			url = "listar-usuarios.jsp";
			
			break;
			
		case "deleteUsuario": {
	    	int idDelete = Integer.parseInt(request.getParameter("Rut"));
	    	usuarioController.deleteUsuarioByRut(idDelete);
	    	
	    	url = "listar-usuarios.jsp";
	    	request.setAttribute("usuarios", usuarioController.findAllUsuarios());
	    	break;
	    }
		default:
			break;
		}
		request.getRequestDispatcher(url).forward(request, response);
	
	}
}
