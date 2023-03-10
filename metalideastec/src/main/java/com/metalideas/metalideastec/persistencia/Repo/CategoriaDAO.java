package com.metalideas.metalideastec.persistencia.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metalideas.metalideastec.entity.Categoria;

public interface CategoriaDAO extends JpaRepository<Categoria,Integer>{
    
}
