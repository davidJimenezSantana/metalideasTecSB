package com.metalideas.metalideastec.persistencia.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metalideas.metalideastec.entity.RegistroMovimientos;

public interface RegistroMovimientosDAO extends JpaRepository<RegistroMovimientos,Integer>{
    
}
