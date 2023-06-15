package cl.modulo5.asesorias.controller.servlet;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ServletAuth")
public class ServletAuth extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user =request.getParameter("usuario");
		String pass =request.getParameter("password");
		//PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		if (user.equals("admin")&& pass.equals("1234")) {
			guardarCredenciales(user, pass, response);
			 HttpSession session = request.getSession();
			 session.setAttribute("usuario",user);
			
			response.sendRedirect("contacto.jsp");
		}
		else {
			request.setAttribute("errorMessage", "Usuario o contraseña incorrecta");
			//out.println("usuario o contraseña incorrecta");
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
	}
		
}
	private void guardarCredenciales(String user, String pass, HttpServletResponse response) {
		  Cookie cookie = new Cookie("credenciales", user); //nombramos a la cookies como credenciales
		  cookie.setMaxAge(1800); // 30 minutos
		  response.addCookie(cookie);
		  
		  
		}
}