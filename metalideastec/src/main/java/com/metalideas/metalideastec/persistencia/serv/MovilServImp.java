package com.metalideas.metalideastec.persistencia.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metalideas.metalideastec.entity.Movil;
import com.metalideas.metalideastec.persistencia.Repo.MovilDAO;

@Service
public class MovilServImp implements MovilServ {

    @Autowired
    private MovilDAO movilDAO;

    @Override
    public List<Movil> verMoviles() {
        return movilDAO.findAll();
    }

    @Override
    public void guardar(Movil movil) {
        movilDAO.save(movil);
    }
    
}
