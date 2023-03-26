package com.metalideas.metalideastec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.metalideas.metalideastec.entity.Movil;
import com.metalideas.metalideastec.entity.Usuario;
import com.metalideas.metalideastec.persistencia.serv.EstadoUsuarioServ;
import com.metalideas.metalideastec.persistencia.serv.MovilServ;
import com.metalideas.metalideastec.persistencia.serv.RolServ;
import com.metalideas.metalideastec.persistencia.serv.UsuarioServ;

@Controller
public class AutenticacionController {

    @Autowired
    private UsuarioServ usuarioServ;
    @Autowired
    private MovilServ movilServ;
    @Autowired
    private RolServ rolServ;
    @Autowired
    private EstadoUsuarioServ estadoUsuarioServ;

    @GetMapping("/Bienvenido")
    public String verIndex(Model model) {
        Usuario usuario = new Usuario();
        model.addAttribute("usuario", usuario);
        return "index";
    }

    @GetMapping("/")
    public String perfil() {
        return "redirect:/Inicio?inicioSession";
    }

    @PostMapping("/registrarse")
    public String registrarse(@ModelAttribute("usuario") Usuario usuario,
            @RequestParam("NumMovil") Long numMovil,
            @RequestParam("confirmaClaveCliente") String confirmaClave) {

        if (usuario.getClave().equals(confirmaClave)) {
            try {
                usuario.setRolIdrol(rolServ.buscarRol(2));
                usuario.setEstadoUsuarioIdestadoCliente(estadoUsuarioServ.buscarEstadosUsuario(1));
                Usuario nuevoUsuario = usuarioServ.guardar(usuario);
                Movil movil = new Movil(numMovil, nuevoUsuario);
                movilServ.guardar(movil);

                return "registroTrue";
            } catch (Exception e) {
                System.out.println(e);
                return "registroFalse";
            }
        } else {
            return "registroFalse";
        }

    }

    @GetMapping("/errorPermiso")
    public String errorAuth() {
        return "errorPermiso";
    }
}
