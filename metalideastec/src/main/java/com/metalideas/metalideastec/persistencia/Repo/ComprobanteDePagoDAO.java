package com.metalideas.metalideastec.persistencia.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metalideas.metalideastec.entity.ComprobanteDePago;

public interface ComprobanteDePagoDAO extends JpaRepository<ComprobanteDePago,Integer> {
    
}
