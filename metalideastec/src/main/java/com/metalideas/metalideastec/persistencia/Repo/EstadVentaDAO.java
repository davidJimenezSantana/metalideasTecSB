package com.metalideas.metalideastec.persistencia.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metalideas.metalideastec.entity.EstadVenta;

public interface EstadVentaDAO  extends JpaRepository<EstadVenta,Integer>{
    
}
