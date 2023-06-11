<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"  rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="./css/styles.css">
	<title>Contacto</title>
</head>
<body>
 <!-- navbar -->
            <jsp:include page="navbar.jsp" />
<!-- /navbar -->
<!-- main -->
    <div class="main container mt-5">
        <h2 class="text-center">Crear capacitacion</h2>
        <hr class="bg-dark">
        <div class="row mt-5">
            <div class="col-10 offset-1 col-md-6 offset-md-3">
                <form id="form-student-register">
                    <div class="mb-3">
                        <label for="name" class="form-label">Nombre</label>
                        <input
                            type="text"
                            class="form-control"
                            id="name"
                            name="name"
                            required
                        />
                    </div>

                    <div class="mb-3">
                        <label for="place" class="form-label">Lugar</label>
                        <input
                            type="text"
                            class="form-control"
                            id="place"
                            name="place"
                            required
                        />
                    </div>
                    <div class="mb-3">
                        <label for="hour" class="form-label">Hora</label>
                        <input
                            type="text"
                            class="form-control"
                            id="hour"
                            name="hour"
                            required
                        />
                    </div>
                    <div class="mb-3">
                        <label for="duration" class="form-label">Duracion</label>
                        <input
                            type="text"
                            class="form-control"
                            id="duration"
                            name="duration"
                            required
                        />
                    </div>
                    <div class="d-grid gap-2">
                        <button type="submit" class="btn btn-success">Registrar</button>
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
	<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>

<!-- bootstrap -->
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" ></script>
	
</body>
</html>