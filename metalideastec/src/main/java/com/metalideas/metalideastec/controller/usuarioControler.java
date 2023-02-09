package com.metalideas.metalideastec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metalideas.metalideastec.entity.Rol;
import com.metalideas.metalideastec.entity.Usuario;
import com.metalideas.metalideastec.persistencia.RolDAO;
import com.metalideas.metalideastec.persistencia.UsuarioDAO;

@RestController
public class usuarioControler {
    
    @Autowired
    private UsuarioDAO usuarioDAO;

    @Autowired
    private RolDAO rolDAO;
    

    @RequestMapping(value = "/verRoles")
    public List<Rol> verRoles(){
        return rolDAO.findAll();
    }

    @RequestMapping(value = "/verUsuarios")
    public List<Usuario> verUsusario(){
        return usuarioDAO.findAll();
    }

}
