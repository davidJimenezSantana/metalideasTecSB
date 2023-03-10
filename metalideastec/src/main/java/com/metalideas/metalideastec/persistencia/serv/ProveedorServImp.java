package com.metalideas.metalideastec.persistencia.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metalideas.metalideastec.entity.Proveedor;
import com.metalideas.metalideastec.persistencia.Repo.ProveedorDAO;

@Service
public class ProveedorServImp implements ProveedorServ{

    @Autowired
    private ProveedorDAO proveedorDAO;

    @Override
    public List<Proveedor> listarProveedores() {
        return proveedorDAO.findAll();
    }

    @Override
    public void agregar(Proveedor proveedor) {
        proveedorDAO.save(proveedor);
    }

    @Override
    public void actualizar(Proveedor proveedor) {
        proveedorDAO.save(proveedor);
    }

    @Override
    public void borrar(Proveedor proveedor) {
        proveedorDAO.delete(proveedor);
    }

    @Override
    public Proveedor BuscarProveedor(int id) {
        return proveedorDAO.findById(id).orElseThrow(() -> new IllegalArgumentException("Proveedor no encontrado"));
    }
    
}
