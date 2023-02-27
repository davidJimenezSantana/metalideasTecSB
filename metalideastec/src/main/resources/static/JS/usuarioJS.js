$(document).ready(function () {

    //cargarDatosTabla();

    $('#tabla_Usuarios').DataTable({
        dom: 'Bfrtip',
        paging: false,
        scrollY: 400,
        language: { url: '//cdn.datatables.net/plug-ins/1.13.1/i18n/es-MX.json' },

        buttons: [
            'copy', 'csv', 'excel', 'pdf', 'print'
        ]
    });
});

async function cargarDatosTabla() {
    const rawResponse = await fetch('/verUsuarios', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    });
    const content = await rawResponse.json();

    console.log(content);

    var tablaHTML = "";

    content.forEach(usu => {

        tablaHTML += "<tr>" +
                        "<td>" + usu.nombre + " " + usu.apellido + "</td>" +
                        "<td>" + usu.correo + "</td>" +
                        "<td>" + usu.estadoUsuarioIdestadoCliente.nombreEstado + "</td>" +
                        "<td>" + usu.rolIdrol.nombre + "</td>" +
                        "<td valign='middle'>" +
                            "<div class='opc-tabla'>" +
                                "<i class='bx bx-cog iconos abrirCerrarFormEdit' id='opc-form' onclick='cargar("+ usu.idusuario +",'"+ usu.nombre + "','"+ usu.apellido + "','"+ usu.correo + "'," + usu.estadoUsuarioIdestadoCliente.idestadoCliente + "," + usu.rolIdrol.idrol + ")'></i>" +
                                "<i class='bx bx-search-alt-2 iconos'></i>" +
                            "</div>" +                
                        "</td>"+
                    "</tr>";
    });

    document.querySelector('#tabla_Usuarios tbody').outerHTML = tablaHTML;
}

function cargar(id, nombre, apellido, correo, rol, estado) {
    /* document.getElementById("nombreUsuario").value = Number(id); */
    document.getElementById("nombreUsuario").value = nombre;
    document.getElementById("apellidoUsuario").value = apellido;
    document.getElementById("correoUsuario").value = correo;
    /* document.getElementById("formularioEditarUser:rol").value = rol; */
    document.getElementById("tipoUsuario").value = estado;
}