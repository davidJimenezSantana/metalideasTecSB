package com.metalideas.metalideastec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.metalideas.metalideastec.entity.Usuario;

@Controller
public class AutenticacionController {
   /*  
    @Autowired
    private UsuarioServ usuarioServ; */

    @GetMapping({"/Bienvenido"})
    public String verIndex(Model model){
        Usuario usuario = new Usuario();
        model.addAttribute("usuario", usuario);
        return "index";
    }

    @GetMapping("/")
    public String perfil() {
        return "redirect:/Inicio?inicioSession";
    }

    

    @PostMapping("/registrarse")
    public String registrarse(){
        return "";
    }

    @GetMapping("/errorPermiso")
    public String errorAuth(){
        return "errorPermiso";
    }
}
