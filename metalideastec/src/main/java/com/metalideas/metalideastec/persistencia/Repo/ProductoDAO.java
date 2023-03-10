package com.metalideas.metalideastec.persistencia.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metalideas.metalideastec.entity.Producto;


public interface ProductoDAO extends JpaRepository <Producto,Integer>{
    
}