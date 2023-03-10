package com.metalideas.metalideastec.persistencia.serv;

import java.util.List;

import com.metalideas.metalideastec.entity.Categoria;

public interface CategoriaServ {
    
    public List<Categoria> listarCategorias();
    public void agregar(Categoria categoria);
    public void actualizar(Categoria categoria);
    public void borrar(Categoria categoria);
}
