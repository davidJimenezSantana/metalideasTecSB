package com.metalideas.metalideastec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.metalideas.metalideastec.persistencia.serv.RegistroMovimientosServ;

@Controller
public class RegistroInventarioController {
    
    @Autowired
    private RegistroMovimientosServ registroMovimientosServ;

    @GetMapping(value = "/verRegistro")
    public String verMovimientosInventario(Model model){
        model.addAttribute("Registros", registroMovimientosServ.listarRegistroMovimientos());
        return "vista/gestion inventario/registroInventario";
    }

}
