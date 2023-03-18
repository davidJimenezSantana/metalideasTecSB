package com.metalideas.metalideastec.persistencia.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metalideas.metalideastec.entity.EstadoUsuario;

public interface EstadoUsuarioDAO extends JpaRepository<EstadoUsuario,Integer> {
    
}
