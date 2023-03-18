package com.metalideas.metalideastec.persistencia.serv;

import java.util.List;

import com.metalideas.metalideastec.entity.Usuario;

public interface UsuarioServ {

    public List<Usuario> listarUsuarios();
    public Usuario buscarUsuario(int id);
    public Usuario guardar(Usuario usuario);
    public void actualizar(Usuario usuario);
    
}
