package com.metalideas.metalideastec.persistencia.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metalideas.metalideastec.entity.TipoMovimiento;

public interface TipoMovimientoDAO extends JpaRepository<TipoMovimiento,Integer> {
    
}
