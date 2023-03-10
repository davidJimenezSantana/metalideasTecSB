package com.metalideas.metalideastec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.metalideas.metalideastec.entity.Categoria;
import com.metalideas.metalideastec.entity.Marca;
import com.metalideas.metalideastec.entity.Producto;
import com.metalideas.metalideastec.entity.Proveedor;
import com.metalideas.metalideastec.entity.TelefonoProveedor;
import com.metalideas.metalideastec.persistencia.serv.CategoriaServ;
import com.metalideas.metalideastec.persistencia.serv.MarcaServ;
import com.metalideas.metalideastec.persistencia.serv.ProductoServ;
import com.metalideas.metalideastec.persistencia.serv.ProveedorServ;
import com.metalideas.metalideastec.persistencia.serv.TelefonoProveedorServ;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    private TelefonoProveedorServ telefonoProveedorServ;

    // Ver lista de productos
    @GetMapping(value = "/VerInventario")
    public String verUsuarios(Model model) {

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
        model.addAttribute("nuevoProducto", nuevoProducto);
        model.addAttribute("nuevoProveedor", nuevoProveedor);

        return "vista/gestion inventario/gestionInventario";
    }

    // agregar producto
    @PostMapping(value = "/agregarProducto")
    public String agregarProducto(@ModelAttribute("nuevoProducto") Producto producto,
            @RequestParam("proveedorId") Integer proveedorId) {

        Proveedor proveedor = proveedorServ.BuscarProveedor(proveedorId);
        
        producto.agregarProveedor(proveedor);   
        productoServ.agregar(producto);     

        proveedor.agregarProducto(producto);
        proveedorServ.actualizar(proveedor);
        

        return "redirect:/VerInventario";
    }

    // Actualizar producto
    @PutMapping(value = "/actualizarProducto")
    public void actualizarProducto(@RequestBody Producto producto) {
        productoServ.actualizar(producto);
    }

    // Ver lista de productos
    @DeleteMapping(value = "/eliminarProducto")
    public void eliminarProducto(@RequestBody Producto producto) {
        productoServ.borrar(producto);
    }

    // agregar producto
    @PostMapping(value = "/agregarProveedor")
    public String agregarProveedor(@ModelAttribute("nuevoProveedor") Proveedor proveedor,
            @RequestParam("telefonoProveedor") Integer telefonoProveedor) {

        proveedorServ.agregar(proveedor);

        TelefonoProveedor telefono = new TelefonoProveedor();

        telefono.setNumero(telefonoProveedor);

        telefono.setProveedorIdproveedor(proveedor);
        telefonoProveedorServ.agregar(telefono);

        return "redirect:/VerInventario";
    }

}
