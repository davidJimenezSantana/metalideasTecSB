package com.metalideas.metalideastec.persistencia.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metalideas.metalideastec.entity.TelefonoProveedor;
import com.metalideas.metalideastec.persistencia.Repo.TelefonoProveedorDAO;

@Service
public class TelefonoProveedorServImp implements TelefonoProveedorServ {

    @Autowired
    private TelefonoProveedorDAO telefonoProveedorDAO;

    @Override
    public List<TelefonoProveedor> listarTelefonoProveedor() {
        return telefonoProveedorDAO.findAll();
    }

    @Override
    public void agregar(TelefonoProveedor telefonoProveedor) {
        telefonoProveedorDAO.save(telefonoProveedor);
    }

    @Override
    public void actualizar(TelefonoProveedor telefonoProveedor) {
        telefonoProveedorDAO.save(telefonoProveedor);
    }

    @Override
    public void borrar(TelefonoProveedor telefonoProveedor) {
        telefonoProveedorDAO.delete(telefonoProveedor);
    }
    
}
