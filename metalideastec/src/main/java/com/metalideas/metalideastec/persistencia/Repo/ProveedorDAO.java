package com.metalideas.metalideastec.persistencia.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metalideas.metalideastec.entity.Proveedor;


public interface ProveedorDAO extends JpaRepository<Proveedor,Integer>{
    
}
