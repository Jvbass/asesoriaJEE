package cl.modulo5.asesorias.controller.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.modulo5.asesorias.controller.UsuarioController;


@WebServlet("/ServletListarUsuarios")
public class ServletListarUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletListarUsuarios() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		
		if (cookies!= null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("credenciales")) {        
					response.sendRedirect("listar-usuarios.jsp");
					return;
				} else {
					request.getRequestDispatcher("login.jsp").forward(request, response);
					return;
				}
			}
		}
	}
	
	@Override
	  protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
  	UsuarioController usuarioController = new UsuarioController();
   System.out.println("estamos en Servlet listar users");
   System.out.println(usuarioController.findAllUsuarios());
    
    request.setAttribute("usuarios", usuarioController.findAllUsuarios());
    // reenviar esta informacion a un JSP
    RequestDispatcher dispatcher = request.getRequestDispatcher("/listar-usuarios.jsp");
    dispatcher.forward(request, response);
  }

}