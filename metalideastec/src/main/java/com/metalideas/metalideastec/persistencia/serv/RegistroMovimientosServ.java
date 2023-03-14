package com.metalideas.metalideastec.persistencia.serv;

import java.util.List;

import com.metalideas.metalideastec.entity.RegistroMovimientos;

public interface RegistroMovimientosServ {
    public List<RegistroMovimientos> listarRegistroMovimientos();
    public void agregarRegistroMovimientos(RegistroMovimientos registro);
}
