$(document).ready(function () {

    //cargarDatosTabla();

    $('#tabla_Carrito_producto').DataTable({
        paging: false,
        scrollY: 400,
        language: { url: '//cdn.datatables.net/plug-ins/1.13.1/i18n/es-MX.json' },
    });
})


//AGREGAR AL CARRITO
function agregarProductoAlCarrito(id, nombre, Venta, Compra, cant, desc, imagen, marcanombre, tiponombre, marcaIdmarca, tipoIdtipo) {
    let nuevoProducto = {
        idproducto: id,
        nombre: nombre,
        precioVenta: Venta,
        precioCompra: Compra,
        cantidad: cant,
        descripcion: desc,
        img: imagen,
        marcaIdmarca: {
            idmarca: marcaIdmarca,
            nombre: marcanombre
        },
        tipoIdtipo: {
            idcategoria: tipoIdtipo,
            nombre: tiponombre
        }
    };

    item = { idproducto: nuevoProducto.idproducto, valorCantidad: 1 };
    miArreglo.push(item);
    productos.push(nuevoProducto);
    mostrarProductosEnCarrito();
}


//ELIMINAR DEL CARRITO
function eliminarProductoDelCarrito(idProducto) {
    for (let i = 0; i < productos.length; i++) {
        if (productos[i].idproducto === idProducto) {
            productos.splice(i, 1);
            miArreglo.splice(i, 1);
            break;
        }
    }
    // Actualizar el HTML del carrito
    mostrarProductosEnCarrito();
}

//MOSTRAR PRODUCTOS EN EL CARRITO 
function mostrarProductosEnCarrito(cantNueva, idproductoN) {

    let listaCarrito = document.getElementById("listaCarrito");

    var valorCantidad = 1;
    listaCarrito.innerHTML = "";

    if (productos.length != 0) {
        listaCarrito.innerHTML += `<div class="row">
            <div class="col-9">
            </div>
            <div class="col-3">
                <a data-bs-toggle="modal" data-bs-target="#modalVenta">
                    <button onclick=calcularVenta() class="btn btn-remove-carrito">
                        Calcular venta
                    </button> 
                </a>                 
            </div>
        </div>`;
    }

    productos.forEach(element => {
        if (element.idproducto == idproductoN) {

            miArreglo.forEach(item => {
                if (item.idproducto == idproductoN) {
                    item.valorCantidad = cantNueva;
                }
            });
        }

        miArreglo.forEach(item => {
            if (item.idproducto == element.idproducto) {
                if (item.valorCantidad > element.cantidad) {
                    valorCantidad = element.cantidad;
                    item.valorCantidad = element.cantidad;
                } else {
                    valorCantidad = item.valorCantidad;
                }
            }
        });

        // Actualizar la lista de productos en el HTML
        listaCarrito.innerHTML += `<div class="row producto-carrito">
            <div class="col-2 cont-prod">
                ${element.img}
            </div>
            <div class="col-5 cont-prod">
                <h2>${element.nombre}</h2>
                <p> Precio por unidad: $ ${element.precioVenta}</p>
            </div>
            <div class="col-2 cont-prod justify-content-center">                
                <label for="cantidadProducto">Cantidad: </label>
                <input type="number" min="1" max="${element.cantidad}" value="` + valorCantidad + `" id="cantidadProducto${element.idproducto}">    
                <button class="btn btn-remove-carrito "
                    onclick="cantProducto(cantidadProducto${element.idproducto},${element.idproducto})">
                    Aceptar <i class='bx bx-check'></i>
                </button>                    
            </div>
            <div class="col-3 cont-prod">
                <button class="btn btn-remove-carrito"
                    onclick="eliminarProductoDelCarrito(${element.idproducto})">
                    <i class='bx bxs-trash'></i> Eliminar del Carrito
                </button>
            </div>
        </div>`;
    });

}


function cantProducto(idInputHTML, idproducto) {

    var cantNueva = idInputHTML.value;
    mostrarProductosEnCarrito(cantNueva, idproducto);
}


function calcularVenta() {
    let listadoProductos = document.getElementById("listadoProductos");
    listadoProductos.innerHTML = "";
    let total = 0;
    productos.forEach(element => {
        miArreglo.forEach(item => {
            if (item.idproducto == element.idproducto) {
                if (item.valorCantidad > 1) {
                    total += item.valorCantidad * element.precioVenta;
                } else {
                    total += element.precioVenta;
                }
            }
        });
    });

    $("#inputTotal").val(total);

    productos.forEach(producto => {

        let valorCantidad = 1;

        miArreglo.forEach(item => {
            if (item.idproducto == producto.idproducto) {
                valorCantidad = item.valorCantidad;
            }
        });

        listadoProductos.innerHTML += `<tr >                                                    
            <td>${producto.idproducto}</td>
            <td>${producto.nombre}</td>
            <td>$ ${producto.precioVenta}</td>                                                    
            <td>`+ valorCantidad + `</td>
        </tr>`;
    });
}