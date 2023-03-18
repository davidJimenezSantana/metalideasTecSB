package com.metalideas.metalideastec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.metalideas.metalideastec.persistencia.serv.EstadoUsuarioServ;
import com.metalideas.metalideastec.persistencia.serv.MovilServ;
import com.metalideas.metalideastec.persistencia.serv.RolServ;
import com.metalideas.metalideastec.persistencia.serv.UsuarioServ;
import com.metalideas.metalideastec.entity.EstadoUsuario;
import com.metalideas.metalideastec.entity.Movil;
import com.metalideas.metalideastec.entity.Rol;
import com.metalideas.metalideastec.entity.Usuario;

@Controller
public class usuarioController {

    @Autowired
    private UsuarioServ usuarioServ;
    @Autowired
    private RolServ rolServ;
    @Autowired
    private EstadoUsuarioServ estadoUsuarioServ;
    @Autowired
    private MovilServ movilServ;

    // Ver lista de usuarios
    @GetMapping(value = "/verUsuarios")
    public String verUsuarios(Model model) {

        List<Usuario> listaUsuarios = usuarioServ.listarUsuarios();
        List<Rol> roles = rolServ.verRoles();
        List<EstadoUsuario> estados = estadoUsuarioServ.verEstadosUsuario();
        Usuario nuevoUsuario = new Usuario();

        model.addAttribute("usuarios", listaUsuarios);
        model.addAttribute("estados", estados);
        model.addAttribute("roles", roles);
        model.addAttribute("nuevoUsuario", nuevoUsuario);

        return "vista/gestion de usuarios/gestionUsuarios";
    }

    // Agregar usuario
    @PostMapping(value = "/agregarUsuario")
    public String agregarUsuarios(@ModelAttribute("nuevoUsuario") Usuario usuario,
            @RequestParam("NumMovil") Integer numMovil,
            @RequestParam("confirmaClaveCliente") String confirmaClave) {

        String url = "";
        if (usuario.getClave().equals(confirmaClave)) {
            try {
                Usuario nuevoUsuario = usuarioServ.guardar(usuario);
                Movil movil = new Movil(numMovil, nuevoUsuario);
                movilServ.guardar(movil);
                url = "?agregarTrue";
            } catch (Exception e) {
                url = "?agregarFalse";
            }
        } else {
            url = "?invalidClave";
        }

        return "redirect:/verUsuarios" + url;
    }

    // Agregar usuario
    @PostMapping(value = "/editarUsuario")
    public String editarUsuario(@ModelAttribute("nuevoUsuario") Usuario usuario) {

        String url = "";
        Usuario user = usuarioServ.buscarUsuario(usuario.getIdusuario());
        user.setNombre(usuario.getNombre());
        user.setApellido(usuario.getApellido());
        user.setCorreo(usuario.getCorreo());
        user.setDireccion(usuario.getDireccion());
        user.setRolIdrol(usuario.getRolIdrol());
        user.setEstadoUsuarioIdestadoCliente(usuario.getEstadoUsuarioIdestadoCliente());
        try {
            usuarioServ.actualizar(user);
            url = "?actualizarTrue";
        } catch (Exception e) {
            url = "?actualizarFalse";
        }

        return "redirect:/verUsuarios" + url;
    }

}
