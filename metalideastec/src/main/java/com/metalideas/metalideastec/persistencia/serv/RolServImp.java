package com.metalideas.metalideastec.persistencia.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metalideas.metalideastec.entity.Rol;
import com.metalideas.metalideastec.persistencia.Repo.RolDAO;

@Service
public class RolServImp implements RolServ{

    @Autowired
    private RolDAO rolDAO;

    @Override
    public List<Rol> verRoles() {
        return rolDAO.findAll();
    }

    @Override
    public Rol buscarRol(int id) {
        return rolDAO.findById(id).get();
    }
    
}
