<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet">

<link rel="stylesheet"
	href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">

<link rel="stylesheet" type="text/css" href="./css/styles.css">
<title>AsesoriasJEE - Crear capacitacion</title>
</head>
<body>
	<!-- navbar -->
	<jsp:include page="navbar.jsp" />
	<!-- /navbar -->
	<!-- main -->
	<div class="main-login container mt-5">
		<h2 class="text-center">Crear capacitacion</h2>
		<hr class="bg-dark">
		<div class="row mt-5">
			<div class="col-10 offset-1 col-md-6 offset-md-3 p-3">
				<form id="form-capacitacion" class="crear-capacitacion"
					autocomplete="off">
					<div class="mb-4">
						<label for="name" class="form-label">Nombre</label> <input
							placeholder="minimo 8 caracteres, maximo 50" type="text"
							class="form-control" id="name" name="name" />
					</div>
					<div class="mb-4">
						<label for="detalle" class="form-label">Detalle</label> <input
							placeholder="minimo 6 caracteres, maximo 50" type="text"
							class="form-control" id="detail" name="detail" />
					</div>

					<!-- Input escondido que indica el valor option para que entre al case updateCapacitacion  -->
					<input id="option" type="hidden" name="option"
						value="saveCapacitacion">

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