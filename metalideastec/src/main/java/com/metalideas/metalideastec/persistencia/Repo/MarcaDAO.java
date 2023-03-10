package com.metalideas.metalideastec.persistencia.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metalideas.metalideastec.entity.Marca;

public interface MarcaDAO extends JpaRepository<Marca,Integer>{
    
}
