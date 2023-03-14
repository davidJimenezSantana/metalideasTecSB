package com.metalideas.metalideastec.persistencia.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metalideas.metalideastec.entity.Producto;
import com.metalideas.metalideastec.persistencia.Repo.ProductoDAO;

@Service
public class ProductoServImp implements ProductoServ {

    @Autowired
    private ProductoDAO productoDAO;

    @Override
    public List<Producto> listarProductos() {
        return productoDAO.findAll();
    }

    @Override
    public Producto agregar(Producto producto) {
        return productoDAO.saveAndFlush(producto);
    }

    @Override
    public void actualizar(Producto producto) {
        productoDAO.save(producto);
    }

    @Override
    public void borrar(Producto producto) {
        productoDAO.delete(producto);
    }

    @Override
    public Producto buscarProductoId(int id) {
        return productoDAO.findById(id).get();
    }
    
    
}
