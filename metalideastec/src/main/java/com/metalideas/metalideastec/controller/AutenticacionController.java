package com.metalideas.metalideastec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.metalideas.metalideastec.entity.Usuario;
import com.metalideas.metalideastec.persistencia.serv.UsuarioServ;

@Controller
public class AutenticacionController {
    
    @Autowired
    private UsuarioServ usuarioServ;

    @GetMapping("/")
    public String verIndex(Model model){
        Usuario usuario = new Usuario();
        model.addAttribute("usuario", usuario);
        return "index";
    }
    
}
