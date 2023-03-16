package com.metalideas.metalideastec.persistencia.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metalideas.metalideastec.entity.MetodoPago;
import com.metalideas.metalideastec.persistencia.Repo.MetodoPagoDAO;

@Service
public class MetodoPagoServImp implements MetodoPagoServ {

    @Autowired
    private MetodoPagoDAO metodoPagoDAO;

    @Override
    public List<MetodoPago> listarMetodoPago() {
        return metodoPagoDAO.findAll();

    }

}
