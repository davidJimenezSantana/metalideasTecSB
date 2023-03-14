$(document).ready(function () {


    $('#tabla_Proveedores').DataTable({
        dom: 'Bfrtip',
        paging: false,
        scrollY: 400,
        language: { url: '//cdn.datatables.net/plug-ins/1.13.1/i18n/es-MX.json' },

        buttons: [
            'copy', 'csv', 'excel', 'pdf', 'print'
        ]
    });
})

function cargarEdit(idproveedor,nombre,correo,ubicacion,tel) {
    $("#idProducto").val(idproveedor);
    $("#nombreProveedor").val(nombre);
    $("#correoProveedor").val(correo);
    $("#ubicacionProveedor").val(ubicacion);
    $("#telefonoProveedor").val(tel);
}



// -------------------------- VARIABLES -------------

//submenu
let arrow = document.querySelectorAll(".flecha");
//sidebar
let body = document.getElementById("body");
let sidebar = document.getElementById("sidebar");
let close__sidebar = document.querySelectorAll(".close__sidebar");
let nav_header = document.getElementById("header-administrador");

//formulario editar
let editarForm = document.getElementById("editarForm")
let editar = document.querySelectorAll(".abrirCerrarFormEdit")

// Scroll sección productos



// -------------------------- FUNCIONES --------------------------

// abrir cerrar sidebar
function abrirCerrar_menu() {    
    if (editarForm) {
        let clase = editarForm.classList.contains('formulario_move');
        if (clase) {
            abrirFormularioEdit();
        }
    }

    body.classList.toggle("body_move");
    sidebar.classList.toggle("sidebar_move");
    nav_header.classList.toggle("header_move");
}

//abrir cerrar formulario editar
function abrirFormularioEdit() {

    let clase = sidebar.classList.contains('sidebar_move');
    if (clase) {
        abrirCerrar_menu();
    }

    editarForm.classList.toggle("formulario_move");
}


//-------------------------------------------------------------

//ver submenu

for (let index = 0; index < arrow.length; index++) {
    arrow[index].addEventListener("click", (e) => {
        console.log(e);
        let padreflecha = e.target.parentElement.parentElement;
        console.log(padreflecha);
        padreflecha.classList.toggle("verMenu");
    })
}


//ver menu sidebar


for (let index = 0; index < close__sidebar.length; index++) {
    close__sidebar[index].addEventListener("click", abrirCerrar_menu);
}


//ver formulario editar 

for (let index = 0; index < editar.length; index++) {
    editar[index].addEventListener("click", abrirFormularioEdit);
}


//validacion
(function () {
    'use strict'

    // Fetch all the forms we want to apply custom Bootstrap validation styles to
    var forms = document.querySelectorAll('.needs-validation')

    // Loop over them and prevent submission
    Array.prototype.slice.call(forms)
        .forEach(function (form) {
            form.addEventListener('submit', function (event) {
                if (!form.checkValidity()) {
                    event.preventDefault()
                    event.stopPropagation()
                }

                form.classList.add('was-validated')
            }, false)
        })
})()



