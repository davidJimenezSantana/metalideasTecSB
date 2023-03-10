package com.metalideas.metalideastec.persistencia.serv;

import java.util.List;

import com.metalideas.metalideastec.entity.Producto;

public interface ProductoServ {
    
    public List<Producto> listarProductos();
    public void agregar(Producto producto);
    public void actualizar(Producto producto);
    public void borrar(Producto producto);
}
