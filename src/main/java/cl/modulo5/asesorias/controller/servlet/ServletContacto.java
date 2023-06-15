package cl.modulo5.asesorias.controller.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletContacto")
public class ServletContacto extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletContacto() {
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		
		if (cookies!= null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("credenciales")) {        
					response.sendRedirect("contacto.jsp");
					return;
				} else {
					request.getRequestDispatcher("login.jsp").forward(request, response);
					return;
				}
			}
	}
	}
}
