package com.metalideas.metalideastec.persistencia.serv;

import java.util.List;

import com.metalideas.metalideastec.entity.Marca;


public interface MarcaServ {
    public List<Marca> listarMarcas();
    public void agregar(Marca marca);
    public void actualizar(Marca marca);
    public void borrar(Marca marca);
}
