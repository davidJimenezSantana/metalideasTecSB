package com.metalideas.metalideastec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.metalideas.metalideastec.persistencia.serv.UsuarioServ;

import com.metalideas.metalideastec.entity.Usuario;

@Controller
public class usuarioController {
    
    @Autowired
    private UsuarioServ usuarioServ;

    //Ver lista de usuarios
     @GetMapping(value = "/verUsuarios")
    public String verUsuarios(Model model){
        List<Usuario> listaUsuarios = usuarioServ.listarUsuarios();

        Usuario nuevoUsuario = new Usuario();
        model.addAttribute("usuarios", listaUsuarios);
        model.addAttribute("nuevoUsuario", nuevoUsuario);

        return "vista/gestion de usuarios/gestionUsuarios";
    } 

    //Agregar usuario
    @PostMapping(value = "/agregarUsuario")
    public String agregarUsuarios(Model model){
        Usuario  usuario = new Usuario();
        model.addAttribute("usuario", usuario);
        return "vista/gestion de usuarios/gestionUsuarios";
    } 

    @GetMapping(value = "/verInventario")
    public String irInventario(Model model){
        List<Usuario> listaUsuarios = usuarioServ.listarUsuarios();
        model.addAttribute("usuarios", listaUsuarios);
        return "vista/gestion inventario/gestionInventario";
    } 

    /* @RequestMapping(value = "/verUsuarios")
    public List<Usuario> verUsusario(){
        return usuarioServ.listarUsuarios();
    } */


}
