<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./css/styles.css">

<title>AsesoriasJEE</title>
</head>
<body>
<!-- navbar -->
<jsp:include page="navbar.jsp" />
<!-- /navbar -->
	<!-- carousel -->
	<div class="row margin-carousel mt-5">
		<div id="carouselExampleCaptions" class="carousel slide mb-5 col-md-10 offset-md-1" data-bs-ride="carousel">
		  <div class="carousel-indicators">
		    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
		    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
		    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
		  </div>
		  <div class="carousel-inner d-flex align-items-center header-height">
		    <div class="carousel-item active">
		      <img src="https://hse.software/wp-content/uploads/2021/05/Prevencion-de-Riesgos-Laborales-3.jpg" class="d-block w-100" alt="prevencionistas">
		
		    </div>
		    <div class="carousel-item">
		      <img src="https://www.gestionaprevencion.com/wp-content/uploads/2021/04/Title-Page.png" class="d-block w-100" alt="prevencionistas">
		
		    </div>
		    <div class="carousel-item">
		      <img src="https://somos.duoc.cl/wp-content/uploads/2022/04/128-riesgos-1200x675.jpg" class="d-block w-100" alt="prevencionistas">
		
		    </div>
		  </div>
		  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
		    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
		    <span class="visually-hidden">Previous</span>
		  </button>
		  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
		    <span class="carousel-control-next-icon" aria-hidden="true"></span>
		    <span class="visually-hidden">Next</span>
		  </button>
		</div>
	</div>
	<!-- /carousel -->
	
	<!-- main -->
	
	<div class="main-login container mt-5 mb-5" >
	<div class="text-center mb-5">
		<h1>Asesorias <span class="text-danger">JEE</span> </h1>
		<p>Asesorias en prevención de riesgos nos preocupamos por tu seguridad. Confía en nuestra experiencia y protege tu entorno laboral.</p>
		<hr class="bg-dark">
	</div>
	  <div class="row justify-content-center mt-5 pt-4">
		<div class="card border-0 col-12 col-md-6 mb-4" style="width: 25rem;">
		  <div class="card-body">
		    <h4 class="card-title mb-3">Capacitación al personal</h4>
		    <h5 class="card-subtitle mb-2 text-muted">Asesoramiento permanente en higiene y seguridad en el trabajo</h5>
		    <p class="card-text mt-3">Buscamos que nuestros clientes cuiden a sus colaboradores por eso DIPREM le ayudará a diseñar y ejecutar el Plan Anual de Capacitación para el personal, también le ofrecemos cursos de capacitación teóricos y prácticos además de capacitaciones a medida de manera presencial y/u online.</p>

		  </div>
		</div>
		
		<div class="card border-0 col-12 col-md-6 mb-4" style="width: 25rem;">
		  <div class="card-body">
		    <h4 class="card-title mb-3">Gestion de accidentes</h4>
		    <h5 class="card-subtitle mb-2 text-muted">Sistemas de gestión en seguridad</h5>
		    <p class="card-text mt-3">Impulsar una cultura preventiva ayuda a mejorar el clima laboral, aumentar la competitividad y productividad de su empresa para esto DIPREM le ayuda a: elaborar políticas de seguridad, auditar e implementar programas de gestión de seguridad y salud ocupacional, análizar riesgos y procedimientos, planificar planes de evacuación, emergencia/contigencia a la medida.</p>

		  </div>
		</div>
		
		<div class="card border-0 col-12 col-md-6 mb-4" style="width: 25rem;">
		  <div class="card-body">
		    <h4 class="card-title mb-3">Reportes</h4>
		    <h5 class="card-subtitle mb-2 text-muted">Seguridad para obras en construcción</h5>
		    <p class="card-text mt-3">Queremos que nuestros clientes cuiden a sus colaboradores por eso le ofrecemos: representación y asistencia ante inspecciones, auditorías documental de gestión en seguridad y salud ocupacional adaptada a cada cliente, supervisión en materia seguridad y salud ocupacional, de personal propio y/o subcontratistas.</p>

		  </div>
		</div>
	 </div>
	</div>
	<!-- /main -->
<!-- footer -->
<jsp:include page="footer.jsp" />
<!-- /footer -->


<!-- jquery -->
	<!-- <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script src="js/script.js"></script>  -->
	<!-- bootstrap -->
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" ></script>
	
</body>
</html>