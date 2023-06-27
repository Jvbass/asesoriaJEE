<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<nav class="navbar navbar-expand-lg bg-light shadow-sm" data-bs-theme="light">
  <div class="container-fluid">
    <a class="navbar-brand ms-3" href="ServletIndex">Asesorias <span class="text-danger"> JEE </span></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link" aria-current="page" href="ServletContacto">Contacto</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Capacitaciones
          </a>
          <ul class="dropdown-menu">
	        <li class="nav-item">
	          <a class="nav-link" href="ServletCrearCapacitacion">Crear Capacitacion</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="ServletListarCapacitaciones">Listar Capacitaciones</a>
	        </li>
	       </ul>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Usuarios
          </a>
          <ul class="dropdown-menu">
	        <li class="nav-item">
	          <a class="nav-link" href="ServletCrearUsuario">Crear Usuario</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="ServletListarUsuarios">Listar Usuarios</a>
	        </li>
          </ul>
        </li>
       </ul>
     	<c:if test="${not empty sessionScope.usuario}">
     	<div class="d-flex justify-content-between align-items-center">
    	<p class="text-dark-50 mx-3 my-2"> Bienvenido <span class="fw-bold text-capitalize">${sessionScope.usuario}</span></p>

	    <form class="form-inline" action="ServletLogout" method="post">
	        <button class="btn btn-outline-danger my-2 my-sm-0" type="submit">Cerrar sesión</button>
	    </form>
		</div>
     
     </c:if>
     	<c:if test="${empty sessionScope.usuario}">
		   <a class="btn btn-outline-success me-3" href="login.jsp"> Inicie sesion</a>
		</c:if>
		   
		</div>    
    </div>
</nav>