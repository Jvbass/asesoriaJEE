<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="cl.modulo5.asesorias.model.entity.Usuario"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css"
	integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<!-- /Font Awesome -->
<link rel="stylesheet" type="text/css" href="./css/styles.css">
<title>AsesoriasJEE - Listar Usuarios</title>
</head>
<body>
	<!-- navbar -->
	<jsp:include page="navbar.jsp" />
	<!-- /navbar -->
	<!-- main -->
	<div class="container mt-5 main-login">
		<h2 class="text-center">Listar Usuarios</h2>
		<hr class="bg-dark">
		<div class="row mt-5">
			<div class="col-10 offset-1 col-md-8 offset-md-2 p-3">

				<table class="table text-center">
					<thead class="bg-info text-light">
						<tr>
							<th scope="col">Rut</th>
							<th scope="col">Nombre</th>
							<th scope="col">Tipo</th>
							<th scope="col">Acciones</th>
						</tr>
					</thead>

					<tbody class="table-group-divider">
						<!-- el ciclo for recorremos la lista y pintamos en html con el metodo get de cada atributo -->
						<%
						List<Usuario> usuarios = (List<Usuario>) request.getAttribute("usuarios");
						if (usuarios != null) {
							for (Usuario s : usuarios) {
						%>
						<tr>
							<td><%=s.getRut()%></td>
							<td><%=s.getNombre()%> <%=s.getApellido()%></td>
							<td><%=s.getTipo()%></td>
							<td><a class="text-success" href="#"><i
									class="fa-solid fa-pen-to-square mx-3"></i></a> 
								<a class="text-danger"
								href="ServletCrudUsuarios?option=deleteUsuario&Rut=<%=s.getRut()%>"><i
									class="fa-solid fa-trash"></i></a></td>
						</tr>
						<!-- fin del for de java -->
						<%
						}
						}
						%>
					</tbody>
				</table>
				<div>
					<a class="btn btn-outline-success mt-3" href="ServletCrearUsuario">Nuevo
						Usuario</a>
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
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>

</body>
</html>