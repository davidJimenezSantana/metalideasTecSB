package com.metalideas.metalideastec.persistencia.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metalideas.metalideastec.entity.MetodoPago;

public interface MetodoPagoDAO extends JpaRepository <MetodoPago,Integer>{
    
}