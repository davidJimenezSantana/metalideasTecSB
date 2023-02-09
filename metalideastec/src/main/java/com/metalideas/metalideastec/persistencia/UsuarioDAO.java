package com.metalideas.metalideastec.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metalideas.metalideastec.entity.Usuario;


public interface UsuarioDAO extends JpaRepository <Usuario,Integer>{
    
}
