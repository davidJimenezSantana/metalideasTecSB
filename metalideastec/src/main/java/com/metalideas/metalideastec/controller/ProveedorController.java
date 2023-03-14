package com.metalideas.metalideastec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.metalideas.metalideastec.entity.Proveedor;
import com.metalideas.metalideastec.persistencia.serv.ProveedorServ;

@Controller
public class ProveedorController {
    
    @Autowired
    private ProveedorServ proveedorServ;

    @GetMapping(value = "/Proveedores")
    public String verProveedores(Model model){

        Proveedor nuevoProveedor = new Proveedor();

        model.addAttribute("proveedores", proveedorServ.listarProveedores());
        model.addAttribute("Proveedor", nuevoProveedor);

        return "vista/gestion inventario/proveedor";
    }

    // agregar proveedor
    @PostMapping(value = "/agregarProveedor")
    public String agregarProveedor(@ModelAttribute("Proveedor") Proveedor proveedor){

        proveedorServ.agregar(proveedor);
        return "redirect:/Proveedores";
    }

    // Actualizar proveedor
    @PostMapping(value = "/editaProveedor")
    public String editaProveedor(@ModelAttribute("Proveedor") Proveedor proveedor){

        proveedorServ.actualizar(proveedor);
        return "redirect:/Proveedores";
    }



    
}
