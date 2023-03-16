package com.metalideas.metalideastec.persistencia.serv;

import java.util.List;

import com.metalideas.metalideastec.entity.ComprobanteDePago;


public interface ComprobanteDePagoServ {
    public List<ComprobanteDePago> listarComprobantes();
    public ComprobanteDePago crear(int total);
}
