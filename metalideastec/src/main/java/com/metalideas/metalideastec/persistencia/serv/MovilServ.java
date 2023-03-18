package com.metalideas.metalideastec.persistencia.serv;

import java.util.List;

import com.metalideas.metalideastec.entity.Movil;

public interface MovilServ {
    public List<Movil> verMoviles();
    public void guardar(Movil movil);
}
