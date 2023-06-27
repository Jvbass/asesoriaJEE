<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./css/styles.css">

<title>AsesoriasJEE - Login</title>
</head>
<body>

	<!-- main -->
	<div class="container main-login vh-100">
	<!-- card login-->
	<div class="d-flex flex-column justify-content-center align-items-center h-100">
		<h1 class="text-center mb-5">Sistema Asesorias <span class="text-danger"> JEE </span></h1>
		<div class="card p-5 mb-5 shadow-lg" style="width: 30rem;">		
			<div class="card-body">
			<!-- Codigo del Formulario Login -->
				<form action="ServletAuth" method="post">
					<h3 class="mb-4">Inicia sesión</h3>
					<div class="my-3">
					<input
						placeholder="Nombre de usuario"
						type="text"
						class="form-control"
						id="user"
						name="usuario"
						required
					/>
					</div>
					<div class="mb-3">
					<input
						placeholder="Contraseña"
						type="password"
						class="form-control"
						id="password"
						name="password"
						required
					/>
				
					</div>
					<span id="error-msg" class="text-danger">${errorMessage}</span>
					
					<div class="d-grid gap-2">
					<button type="submit" class="opacity-50 fs-4 btn btn-primary mt-3 rounded-pill p-2">Entrar</button>
					</div>
					
					<div class="d-flex justify-content-end">
					<span class="mt-4 text-secondary">¿No tienes cuenta?. &nbsp;</span>
					<a class="mt-4" href="#"> <span class=" text-danger"> Registrate</span></a>
					</div>					
				</form>
			<!-- /form login -->
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