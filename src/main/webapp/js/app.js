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
    
      submitHandler: function(form) {
       if ($(form).hasClass("crear-capacitacion")) {
        crearCapacitacion();
      } else if ($(form).hasClass("editar-capacitacion")) {
        editarCapacitacion();
      }
    }
  });  
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
     window.location.href="ServletListarCapacitaciones"
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
	  id : id,
      name: name,
      detail: detail,
      option: option
    }),
    success: function() {
     window.location.href="ServletListarCapacitaciones"
    }
  });
  
}