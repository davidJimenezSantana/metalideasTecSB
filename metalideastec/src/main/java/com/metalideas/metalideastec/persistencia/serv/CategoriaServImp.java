package com.metalideas.metalideastec.persistencia.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metalideas.metalideastec.entity.Categoria;
import com.metalideas.metalideastec.persistencia.Repo.CategoriaDAO;

@Service
public class CategoriaServImp implements CategoriaServ {

    @Autowired
    private CategoriaDAO categoriaDAO;

    @Override
    public List<Categoria> listarCategorias() {
        return categoriaDAO.findAll();
    }

    @Override
    public void agregar(Categoria categoria) {
        categoriaDAO.save(categoria);
    }

    @Override
    public void actualizar(Categoria categoria) {
        categoriaDAO.save(categoria);
    }

    @Override
    public void borrar(Categoria categoria) {
        categoriaDAO.delete(categoria);
    }
    
}
