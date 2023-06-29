package cl.modulo5.asesorias.controller.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.modulo5.asesorias.controller.UsuarioController;
import cl.modulo5.asesorias.model.entity.Usuario;


@WebServlet("/ServletListarUsuarios")
public class ServletListarUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
	        UsuarioController usuarioController = new UsuarioController();
	        List<Usuario> usuarios = usuarioController.findAllUsuarios();
	        request.setAttribute("usuarios", usuarios);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("/listar-usuarios.jsp");
	        dispatcher.forward(request, response);
	    } else {
	        response.sendRedirect("login.jsp");
	    }
	}

}