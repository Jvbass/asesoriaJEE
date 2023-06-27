package cl.modulo5.asesorias.controller.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ServletLogout")
public class ServletLogout extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
      HttpSession session = request.getSession(false);
      
      if(session != null ) {
        session.invalidate();
      }
      
      Cookie[] cookies = request.getCookies();
      if (cookies != null) {
          for (Cookie cookie : cookies) {
              cookie.setMaxAge(0);
              response.addCookie(cookie);
          }
      }
      
      response.sendRedirect("login.jsp");
    }

}
