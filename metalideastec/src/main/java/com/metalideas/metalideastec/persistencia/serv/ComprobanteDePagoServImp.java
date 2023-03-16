package com.metalideas.metalideastec.persistencia.serv;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metalideas.metalideastec.entity.ComprobanteDePago;
import com.metalideas.metalideastec.persistencia.Repo.ComprobanteDePagoDAO;

@Service
public class ComprobanteDePagoServImp implements ComprobanteDePagoServ{

    @Autowired
    private ComprobanteDePagoDAO comprobanteDePagoDAO;

    @Override
    public ComprobanteDePago crear(int total) {

        Date fechaActual = new Date();
        Timestamp timestamp = new Timestamp(fechaActual.getTime());
        ComprobanteDePago comprobanteDePago = new ComprobanteDePago(timestamp,total);        
        return comprobanteDePagoDAO.saveAndFlush(comprobanteDePago);
    }

    @Override
    public List<ComprobanteDePago> listarComprobantes() {
        return comprobanteDePagoDAO.findAll();
    }
    
}
