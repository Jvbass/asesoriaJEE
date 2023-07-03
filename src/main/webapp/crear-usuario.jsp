<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" type="text/css" href="./css/styles.css">
<title>AsesoriasJEE - Crear usuario</title>
</head>
<body>
	<!-- navbar -->
	<jsp:include page="navbar.jsp" />
	<!-- /navbar -->
	<!-- main -->
	<div class="main-login container mt-5">
		<h2 class="text-center">Crear usuario</h2>
		<hr class="bg-dark">
		<div class="row mt-5">
			<div class="col-10 offset-1 col-md-6 offset-md-3 p-3">
				<form id="form-usuario" autocomplete="off">
					<div class="mb-4">
						<label for="rut" class="form-label">Rut</label>
						<input placeholder="mayor o igual a 10000000 y menor o igual a 99999999" type="text" class="form-control" id="rut"
							name="rut" />
					</div>
					<div class="mb-4">
						<label for="name" class="form-label">Nombre</label>
						<input placeholder="minimo 2 caracteres maximo 15" type="text" class="form-control"
							id="name" name="name" />
					</div>
					<div class="mb-4">
						<label for="lastname" class="form-label">Apellido</label>
						<input placeholder="minimo 2 caracteres maximo 15" type="text" class="form-control"
							id="lastname" name="lastname" />
					</div>
					<div class="mb-4">
						<label for="password" class="form-label">Contraseña</label>
						<input placeholder="minimo 6 caracteres maximo 50" type="password" class="form-control"
							id="password" name="password" />
					</div>
					<div class="mb-4">
						<label for="tipo" class="form-label">Tipo de usuario</label>
						<select id="tipo" class="form-select" name="tipo">
							<option selected>Tipo</option>
							<option value="cliente">Cliente</option>
							<option value="profesional">Profesional</option>
							<option value="administrativo">Administrativo</option>
						</select>
					</div>


					<!-- campos tipo usuario -->
					<!-- Campo adicional para Cliente -->
					<div class="mb-4" id="phoneField" style="display: none;">
						<label for="phone" class="form-label">Telefono</label>
						<input placeholder="9 digitos" type="text" class="form-control"
							id="phone" name="phone" />
					</div>

					<!-- Campo adicional para Profesional -->
					<div class="mb-4" id="professionField" style="display: none;">
						<label for="profession" class="form-label">Profesion</label>
						<input placeholder="minimo 5 caracteres maximo 20" type="text" class="form-control"
							id="profession" name="profession" />
					</div>

					<!-- Campo adicional para Administrativo -->
					<div class="mb-4" id="areaField" style="display: none;">
						<label for="area" class="form-label">Area</label>
						<input placeholder="mimino 4 caracteres maximo 15" type="text" class="form-control"
							id="area" name="area" />
					</div>
					<input id="option" type="hidden" name="option"
						value="saveUsuario">
						
					<!-- /fin campostipo usuario -->

					<div class="d-grid gap-2">
						<button type="submit" class="btn btn-danger">Crear</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- main -->
	<!-- footer -->
	<jsp:include page="footer.jsp" />
	<!-- /footer -->

	<!-- jquery -->
	<script src="https://code.jquery.com/jquery-1.12.4.min.js"
		integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ"
		crossorigin="anonymous"></script>

	<!-- bootstrap -->
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/jquery.validate.js"></script>
	<script src="./js/app.js"></script>
</body>
</html>