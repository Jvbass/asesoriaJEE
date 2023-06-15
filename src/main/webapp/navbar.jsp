<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
        <li class="nav-item">
          <a class="nav-link" href="ServletCrearCapacitacion">Crear Capacitacion</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="ServletListarCapacitaciones">Listar Capacitaciones</a>
        </li>
       </ul>
     
     	<a href="ServletLogin"><button class="btn btn-outline-danger my-2 my-sm-0 me-3" type="submit">Inicia sesion</button></a> 
     
    </div>
  </div>
</nav>