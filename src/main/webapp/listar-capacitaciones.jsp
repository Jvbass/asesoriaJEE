<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"  rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="./css/styles.css">
	<title>AsesoriasJEE - Listar Capacitaciones</title>
</head>
<body>
 <!-- navbar -->
            <jsp:include page="navbar.jsp" />
<!-- /navbar -->
<!-- main -->
    <div class="container mt-5 main-login">
        <h2 class="text-center">Listar Capacitaciones</h2>
        <hr class="bg-dark">
        <div class="row mt-5">
            <div class="col-10 offset-1 col-md-8 offset-md-2 p-3">
            
				<table class="table">
                    <thead class="bg-info text-light text-center">
                      <tr>
                        <th scope="col">Nombre Capacitacion</th>
                        <th scope="col">Fecha</th>
                        <th scope="col">Lugar</th>
                        <th scope="col">Hora</th>
                        <th scope="col">Duracion</th>
                        <th scope="col">Cantidad asistentes</th>
                      </tr>
                    </thead>
				</table>
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