$(document).ready(function () {
    $('#tabla_ventas').DataTable({
        dom: 'Bfrtip',
        paging: false,
        scrollY: 400,
        language: { url: '//cdn.datatables.net/plug-ins/1.13.1/i18n/es-MX.json' },

        buttons: [
            'copy', 'csv', 'excel', 'pdf', 'print'
        ]
    });
})

 function cargarEdit(id,estado,destino) {
    $("#idVentaEdit").val(id);
    $("#estadoVentaEdit").val(estado);
    $("#destinoVentaEdit").val(destino);
}
/*function cargarDetalles(id,nombre,precioVenta,precioCompra,cantidad,descripcion,img,idmarca,idcategoria) {
    $("#idProductoModal").html(id); 
    $("#nombreProductoModal").html(nombre);
     $("#precioVentaProductoModal").html(precioVenta);
    $("#precioCompraProductoModal").html(precioCompra);
    $("#cantidadProductoModal").html(cantidad);
    $("#detalleProductoModal").html(descripcion);
    $("#imgProductoModal").html(img);
    $("#marcaProductoModal").html(idmarca); 
    $("#tipoProductoModal").html(idcategoria);  
}
 */

function setProveedorId(input) {
    var proveedorId = input.value;
    var hiddenInput = document.getElementById("proveedorId");
    hiddenInput.value = proveedorId;
}