package com.metalideas.metalideastec.persistencia.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metalideas.metalideastec.entity.EstadVenta;
import com.metalideas.metalideastec.persistencia.Repo.EstadVentaDAO;

@Service
public class EstadVentaServImp implements EstadVentaServ{

    @Autowired
    private EstadVentaDAO estadVentaDAO;
    
    @Override
    public List<EstadVenta> listarEstados() {
        return estadVentaDAO.findAll();
    }
    
}
