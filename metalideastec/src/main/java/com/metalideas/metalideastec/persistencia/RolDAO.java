package com.metalideas.metalideastec.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metalideas.metalideastec.entity.Rol;

public interface RolDAO extends JpaRepository <Rol,Integer>{
    
}

