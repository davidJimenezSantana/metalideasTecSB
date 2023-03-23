package com.metalideas.metalideastec.persistencia.serv;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.metalideas.metalideastec.entity.Usuario;
import com.metalideas.metalideastec.persistencia.Repo.UsuarioDAO;

@Service
public class UsuarioServImp implements UsuarioServ {

    @Autowired
    private UsuarioDAO usuarioDAO;

    @Autowired
	private BCryptPasswordEncoder encoder;

    @Override
    public List<Usuario> listarUsuarios() {        
        return usuarioDAO.findAll();
    }

    @Override
    public Usuario buscarUsuario(int id) {
        return usuarioDAO.findById(id).get();
    }

    @Override
    public Usuario guardar(Usuario usuario) {
        usuario.setClave(encoder.encode(usuario.getClave()));
        return usuarioDAO.saveAndFlush(usuario);
    }

    @Override
    public void actualizar(Usuario usuario) {
        usuarioDAO.save(usuario);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioDAO.findByCorreo(username);
        if(usuario == null){ 
            throw new UsernameNotFoundException("Correo o contraseña incorrecta.");
        }
        return new User(usuario.getCorreo(), usuario.getClave(), Collections.singletonList(new SimpleGrantedAuthority(usuario.getRolIdrol().getNombre())));
    }

    @Override
    public Usuario buscarUserName(String username) {
        return usuarioDAO.findByCorreo(username);
    }

    
    
    
    
}
