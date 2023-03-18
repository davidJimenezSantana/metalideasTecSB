package com.metalideas.metalideastec.persistencia.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metalideas.metalideastec.entity.Movil;

public interface MovilDAO extends JpaRepository<Movil,Integer> {
    
}
