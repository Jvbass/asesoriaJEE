

$(document).ready(function() {
	$("#form-capacitacion").validate({
		rules: {
			name: {
				required: true,
				minlength: 8,
				maxlength: 50
			},
			detail: {
				required: true,
				minlength: 6,
				maxlength: 50
			}
		},
		messages: {
			name: {
				required: "Por favor, ingresa nombre de la capacitacion",
				minlength: "El nombre debe tener al menos 8 caracteres",
				maxlength: "El nombre no puede exceder los 50 caracteres"
			},
			detail: {
				required: "Por favor, ingresa el detalle de la capacitación",
				minlength: "El detalle debe tener al menos 6 caracteres",
				maxlength: "El detalle no puede exceder los 50 caracteres"
			}
		},
		submitHandler: function(form) {
			if ($(form).hasClass("crear-capacitacion")) {
				crearCapacitacion();
			} else if ($(form).hasClass("editar-capacitacion")) {
				editarCapacitacion();
			}
		}
	});

	$("#form-usuario").validate({
		rules: {
			rut: {
				required: true,
				digits: true,
				min: 10000000,
				max: 99999999
			},
			name: {
				required: true,
				minlength: 2,
				maxlength: 15
			},
			lastname: {
				required: true,
				minlength: 2,
				maxlength: 15
			},
			password: {
				required: true,
				minlength: 6,
				maxlength: 50
			},
			tipo: {
				required: true
			},
			phone: {
				required: function(element) {
					return $("#tipo").val() === "cliente";
				},
				digits: true,
               	minlength: 9,
               	maxlength: 9
			},
			profession: {
                required: function(element) {
                    return $("#tipo").val() === "profesional";
                },
                minlength: 5,
                maxlength: 20
            },
			area: {
                required: function(element) {
                    return $("#tipo").val() === "administrativo";
                },
                minlength: 4,
                maxlength: 15
            }
		},
		messages: {
			rut: {
				required: "Por favor, ingresa el rut",
				digits: "Por favor, ingresa solo números",
				min: "El rut debe ser mayor o igual a 10000000",
				max: "El rut debe ser menor o igual a 99999999"
			},
			name: {
				required: "Por favor, ingresa el nombre",
				minlength: "El nombre debe tener al menos 2 caracteres",
				maxlength: "El nombre no puede exceder los 15 caracteres"
			},
			lastname: {
				required: "Por favor, ingresa el apellido",
				minlength: "El apellido debe tener al menos 2 caracteres",
				maxlength: "El apellido no puede exceder los 15 caracteres"
			},
			password: {
				required: "Por favor, ingresa la contraseña",
				minlength: "La contraseña debe tener al menos 6 caracteres",
				maxlength: "La contraseña no puede exceder los 50 caracteres"
			},
			tipo: {
				required: "Por favor, selecciona un tipo de usuario"
			},
			phone: {
                required: "Por favor, ingresa el número de teléfono",
                digits: "Por favor, ingresa solo números",
                minlength: "El número de teléfono debe tener 9 dígitos",
                maxlength: "El número de teléfono debe tener 9 dígitos"
            },
            profession: {
                required: "Por favor, ingresa la profesión",
                minlength: "La profesión debe tener al menos 5 caracteres",
                maxlength: "La profesión no puede exceder los 20 caracteres"
            },
            area: {
                required: "Por favor, ingresa el área",
                minlength: "El área debe tener al menos 4 caracteres",
                maxlength: "El área no puede exceder los 15 caracteres"
            }
		},

		errorPlacement: function(error, element) {
			if (
				element.attr("name") == "phone" ||
				element.attr("name") == "profession" ||
				element.attr("name") == "area"
			) {
				error.insertAfter("#tipo");
			} else {
				error.insertAfter(element);
			}
		},
		submitHandler: function() {
			crearUsuario();
		}
	});


	$("#tipo").change(function() {
		var selectedType = $(this).val();

		// Ocultar todos los campos adicionales
		$("#phoneField, #professionField, #areaField").hide();

		// Mostrar el campo adicional correspondiente al tipo de usuario seleccionado
		switch (selectedType) {
			case "cliente":
				$("#phoneField").show();
				break;
			case "profesional":
				$("#professionField").show();
				break;
			case "administrativo":
				$("#areaField").show();
				break;
		}
	});

	function crearCapacitacion() {

		let nombre = $("#name").val();
		let detalle = $("#detail").val();
		let option = $("#option").val();

		$.ajax({
			type: "POST",
			dataType: "html",
			url: "./ServletCrudCapacitaciones",
			data: $.param({
				nombre: nombre,
				detalle: detalle,
				option: option
			}),
			success: function() {
				window.location.href = "ServletListarCapacitaciones"
			}
		});
	}

	function editarCapacitacion() {
		let id = $("#id").val();
		let name = $("#name").val();
		let detail = $("#detail").val();
		let option = $("#option").val();
		$.ajax({
			type: "POST",
			dataType: "html",
			url: "./ServletCrudCapacitaciones",
			data: $.param({
				id: id,
				name: name,
				detail: detail,
				option: option
			}),
			success: function() {
				window.location.href = "ServletListarCapacitaciones"
			}
		});
	}

	function crearUsuario() {
		let rut = $("#rut").val();
		let name = $("#name").val();
		let lastname = $("#lastname").val();
		let password = $("#password").val();
		let tipo = $("#tipo").val();
		let option = $("#option").val();
		

		let data = {
			rut: rut,
			name: name,
			lastname: lastname,
			password: password,
			tipo: tipo,
			option: option
		};
		
		switch (tipo) {
			case "cliente":
				data.phone = $("#phone").val();
				break;
			case "profesional":
				data.profession = $("#profession").val();
				break;
			case "administrativo":
				data.area = $("#area").val();
				break;
		}
		$.ajax({
			type: "POST",
			dataType: "html",
			url: "./ServletCrudUsuarios",
			data: $.param(data),
			success: function() {
				window.location.href = "ServletListarUsuarios"
			}
		});
	}
});
