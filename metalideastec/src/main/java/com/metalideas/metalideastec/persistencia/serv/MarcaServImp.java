package com.metalideas.metalideastec.persistencia.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metalideas.metalideastec.entity.Marca;
import com.metalideas.metalideastec.persistencia.Repo.MarcaDAO;

@Service
public class MarcaServImp  implements MarcaServ{

    @Autowired
    private MarcaDAO marcaDAO;

    @Override
    public List<Marca> listarMarcas() {
        return marcaDAO.findAll();
    }

    @Override
    public void agregar(Marca marca) {
        marcaDAO.save(marca);
    }

    @Override
    public void actualizar(Marca marca) {
        marcaDAO.save(marca);
    }

    @Override
    public void borrar(Marca marca) {
        marcaDAO.delete(marca);
    }
    
}
