package com.metalideas.metalideastec.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.metalideas.metalideastec.entity.Categoria;
import com.metalideas.metalideastec.entity.Marca;
import com.metalideas.metalideastec.entity.Producto;
import com.metalideas.metalideastec.entity.Proveedor;
import com.metalideas.metalideastec.entity.RegistroMovimientos;
import com.metalideas.metalideastec.entity.TipoMovimiento;
import com.metalideas.metalideastec.entity.Usuario;
import com.metalideas.metalideastec.persistencia.serv.CategoriaServ;
import com.metalideas.metalideastec.persistencia.serv.MarcaServ;
import com.metalideas.metalideastec.persistencia.serv.ProductoServ;
import com.metalideas.metalideastec.persistencia.serv.ProveedorServ;
import com.metalideas.metalideastec.persistencia.serv.RegistroMovimientosServ;
import com.metalideas.metalideastec.persistencia.serv.TipoMovimientoServ;
import com.metalideas.metalideastec.persistencia.serv.UsuarioServ;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductoController {

    @Autowired
    private ProductoServ productoServ;
    @Autowired
    private MarcaServ marcaServ;
    @Autowired
    private CategoriaServ categoriaServ;
    @Autowired
    private ProveedorServ proveedorServ;    
    @Autowired
    private RegistroMovimientosServ registroMovimientosServ;
    @Autowired
    private TipoMovimientoServ tipoMovimientoServ;
    @Autowired
    private UsuarioServ usuarioServ;

    // Ver lista de productos
    @GetMapping(value = "/VerInventario")
    public String VerInventario(Model model) {

        List<Producto> listaProductos = productoServ.listarProductos();
        List<Marca> listaMarcas = marcaServ.listarMarcas();
        List<Categoria> listaCategoria = categoriaServ.listarCategorias();
        List<Proveedor> listaProveedores = proveedorServ.listarProveedores();
        Producto nuevoProducto = new Producto();
        Proveedor nuevoProveedor = new Proveedor();

        model.addAttribute("Productos", listaProductos);
        model.addAttribute("listaMarcas", listaMarcas);
        model.addAttribute("listaCategoria", listaCategoria);
        model.addAttribute("listaProveedores", listaProveedores);
        model.addAttribute("Producto", nuevoProducto);
        model.addAttribute("nuevoProveedor", nuevoProveedor);

        return "vista/gestion inventario/gestionInventario";
    }

    // agregar producto
    @PostMapping(value = "/agregarProducto")
    public String agregarProducto(@ModelAttribute("Producto") Producto producto,
            @RequestParam("proveedorId") Integer proveedorId,
            @RequestParam("obsProducto") String obsRegistro) {

        Proveedor proveedor = proveedorServ.BuscarProveedor(proveedorId);

        producto.agregarProveedor(proveedor);
        Producto productoNuevo = productoServ.agregar(producto);

        proveedor.agregarProducto(producto);
        proveedorServ.actualizar(proveedor);

        TipoMovimiento tipoMovimiento = tipoMovimientoServ.buscarTipoMovimiento(2);
        Usuario usuario = usuarioServ.buscarUsuario(3);// usuario temporal
        Date fechaActual = new Date();
        Timestamp timestamp = new Timestamp(fechaActual.getTime());
        RegistroMovimientos registro = new RegistroMovimientos(obsRegistro, timestamp,
                productoNuevo.getCantidad(), tipoMovimiento, usuario, productoNuevo);
        registroMovimientosServ.agregarRegistroMovimientos(registro);

        return "redirect:/VerInventario";
    }

    // Actualizar producto
    @PostMapping(value = "/actualizarProducto")
    public String actualizarProducto(@ModelAttribute("Producto") Producto producto) {

        Producto productoActualiza = productoServ.buscarProductoId(producto.getIdproducto());

        productoActualiza.setNombre(producto.getNombre());
        productoActualiza.setPrecioVenta(producto.getPrecioVenta());
        productoActualiza.setTipoIdtipo(producto.getTipoIdtipo());
        productoActualiza.setCantidad(producto.getCantidad());
        productoActualiza.setPrecioCompra(producto.getPrecioCompra());
        productoActualiza.setMarcaIdmarca(producto.getMarcaIdmarca());
        productoActualiza.setDescripcion(producto.getDescripcion());
        productoActualiza.setImg(producto.getImg());

        productoServ.actualizar(productoActualiza);
        return "redirect:/VerInventario";
    }

    // Ver lista de productos
    @DeleteMapping(value = "/eliminarProducto")
    public void eliminarProducto(@RequestBody Producto producto) {
        productoServ.borrar(producto);
    }
    
}
