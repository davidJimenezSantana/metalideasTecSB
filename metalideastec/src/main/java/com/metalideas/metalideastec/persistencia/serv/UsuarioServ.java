package com.metalideas.metalideastec.persistencia.serv;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.metalideas.metalideastec.entity.Usuario;

public interface UsuarioServ extends UserDetailsService{

    public Usuario buscarUserName(String username);
    public List<Usuario> listarUsuarios();
    public Usuario buscarUsuario(int id);
    public Usuario guardar(Usuario usuario);
    public void actualizar(Usuario usuario);
    
}
