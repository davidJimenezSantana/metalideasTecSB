$(document).ready(function () {

    //cargarDatosTabla();

    $('#tabla_Inventario').DataTable({
        dom: 'Bfrtip',
        paging: false,
        scrollY: 400,
        language: { url: '//cdn.datatables.net/plug-ins/1.13.1/i18n/es-MX.json' },

        buttons: [
            'copy', 'csv', 'excel', 'pdf', 'print'
        ]
    });
})

function cargarEdit(id,nombre,precioVenta,precioCompra,cantidad,descripcion,idmarca,idcategoria) {
    $("#idProducto").val(id);
    $("#nombreProducto").val(nombre);
    $("#precioVentaProducto").val(precioVenta);
    $("#precioCompraProducto").val(precioCompra);
    $("#cantidadProducto").val(cantidad);
    $("#detalleProducto").val(descripcion);
    $("#marcaProducto").val(idmarca); 
    $("#tipoProducto").val(idcategoria); 
}

function setProveedorId(input) {
    var proveedorId = input.value;
    var hiddenInput = document.getElementById("proveedorId");
    hiddenInput.value = proveedorId;
}