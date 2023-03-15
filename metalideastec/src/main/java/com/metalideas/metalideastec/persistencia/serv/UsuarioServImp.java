package com.metalideas.metalideastec.persistencia.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metalideas.metalideastec.entity.Usuario;
import com.metalideas.metalideastec.persistencia.Repo.UsuarioDAO;

@Service
public class UsuarioServImp implements UsuarioServ {

    @Autowired
    private UsuarioDAO usuarioDAO;

    @Override
    public List<Usuario> listarUsuarios() {        
        return usuarioDAO.findAll();
    }

    @Override
    public Usuario buscarUsuario(int id) {
        return usuarioDAO.findById(id).get();
    }
    
    
}
