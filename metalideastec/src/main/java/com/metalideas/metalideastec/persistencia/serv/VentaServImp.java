package com.metalideas.metalideastec.persistencia.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metalideas.metalideastec.entity.Venta;
import com.metalideas.metalideastec.persistencia.Repo.VentaDAO;

@Service
public class VentaServImp implements VentaServ {

    @Autowired
    private VentaDAO ventaDAO;
    
    @Override
    public List<Venta> listarVenta() {
        return ventaDAO.findAll();
    }

    @Override
    public Venta buscarVentaId(int id) {
        return ventaDAO.findById(id).get();
    }

    @Override
    public Venta agregar(Venta venta) {
        return ventaDAO.saveAndFlush(venta);
    }

    @Override
    public void actualizar(Venta venta) {
        ventaDAO.save(venta);
    }
    
}
