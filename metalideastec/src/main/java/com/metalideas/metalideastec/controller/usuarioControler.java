package com.metalideas.metalideastec.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.metalideas.metalideastec.persistencia.serv.UsuarioServImp;

@Controller
public class usuarioControler {
    
    @Autowired
    private UsuarioServImp usuarioServImp;

    @GetMapping(value = "/verUsuarios")
    public String verUsusarios(Model modelo){
        modelo.addAttribute("usuario", usuarioServImp.listarUsuarios());
        
        return "index.html";
    }


}
