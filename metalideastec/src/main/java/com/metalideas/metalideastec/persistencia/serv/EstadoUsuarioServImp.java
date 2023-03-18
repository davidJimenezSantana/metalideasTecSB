package com.metalideas.metalideastec.persistencia.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metalideas.metalideastec.entity.EstadoUsuario;
import com.metalideas.metalideastec.persistencia.Repo.EstadoUsuarioDAO;

@Service
public class EstadoUsuarioServImp implements EstadoUsuarioServ{
    
    @Autowired
    private EstadoUsuarioDAO estadoUsuarioDAO;

    @Override
    public List<EstadoUsuario> verEstadosUsuario() {
        return estadoUsuarioDAO.findAll();
    }
}
