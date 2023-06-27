<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./css/styles.css">

<title>AsesoriasJEE - Contacto</title>
</head>
<body>
<!-- navbar -->
<jsp:include page="navbar.jsp" />
<!-- /navbar -->

	<!-- main -->
	<div class="main-login container mt-5 mb-5" >
        <h2 class="text-center">Contactate con nosotros</h2>
        <hr class="bg-dark">

        <div class="row mt-5">
            <div class="col-10 offset-1 col-md-6 offset-md-3 p-3" >
                <form id="form-contact">
                    <div class="mb-4">
                        <input
                        	placeholder="Nombre"
                            type="text"
                            class="form-control"
                            id="name"
                            name="name"
                            required
                        />
                    </div>

                    <div class="mb-4">
                        <input
                        	placeholder="Apellido"
                            type="text"
                            class="form-control"
                            id="lastname"
                            name="lastname"
                            required
                        />
                    </div>

                    <div class="mb-4">
                        <input
                        	placeholder="Email"
                            type="email"
                            class="form-control"
                            id="email"
                            name="email"
                            required
                        />
                    </div>

                    <div class="mb-4">
                        <textarea
                        	placeholder="Mensaje"
                            class="form-control"
                            id="message"
                            name="message"
                            required
                        ></textarea>
                    </div>

                    <div class="d-grid gap-2">
                        <button type="submit" class="btn btn-danger">Enviar</button>
                    </div>
                </form>
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