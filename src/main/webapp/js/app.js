$.validator.setDefaults( {
    submitHandler: function () {
		      crearCapacitacion();
    }
 });

$(document).ready(function() {
  $("#form-crear-capacitacion").validate({
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
      },
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
      },
     },
  });

  $("#date").datepicker();
});

function crearCapacitacion() {
	
  let nombre = $("#name").val();
  let detalle = $("#detail").val();

  
    $.ajax({
    type: "POST",
    dataType: "html",
    url: "./ServletCrearCapacitacion",
    data: $.param({
      nombre: nombre,
      detalle: detalle
    }),
    success: function() {
     window.location.href="ServletListarCapacitaciones"
    }
  });
  
}