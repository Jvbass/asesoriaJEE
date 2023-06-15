<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"  rel="stylesheet">
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
                <form id="form-student-register">
                    <div class="mb-4">
                        <input
                       		placeholder="Nombre Capacitacion"
                            type="text"
                            class="form-control"
                            id="name"
                            name="name"
                            required
                        />
                    </div>

                    <div class="mb-4">
                        <input
                        	placeholder="Lugar"
                            type="text"
                            class="form-control"
                            id="place"
                            name="place"
                            required
                        />
                    </div>
                    <div class="mb-4">
                        <input
                        	placeholder="Hora"
                            type="text"
                            class="form-control"
                            id="hour"
                            name="hour"
                            required
                        />
                    </div>
                    <div class="mb-4">
                        <input
                        	placeholder="Duracion"
                            type="text"
                            class="form-control"
                            id="duration"
                            name="duration"
                            required
                        />
                    </div>
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
		<!-- <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script src="js/script.js"></script>  -->

<!-- bootstrap -->
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" ></script>
	
</body>
</html>