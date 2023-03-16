package com.metalideas.metalideastec.persistencia.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metalideas.metalideastec.entity.Venta;

public interface VentaDAO extends JpaRepository<Venta,Integer>{
    
}
