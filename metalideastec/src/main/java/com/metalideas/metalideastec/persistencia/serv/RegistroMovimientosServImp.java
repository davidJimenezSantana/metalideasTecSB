package com.metalideas.metalideastec.persistencia.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.metalideas.metalideastec.entity.RegistroMovimientos;
import com.metalideas.metalideastec.persistencia.Repo.RegistroMovimientosDAO;

@Service
public class RegistroMovimientosServImp implements RegistroMovimientosServ {

    @Autowired
    private RegistroMovimientosDAO registroMovimientosDAO;
    
    public List<RegistroMovimientos> listarRegistroMovimientos() {
        return registroMovimientosDAO.findAll();
    }

    @Override
    public void agregarRegistroMovimientos(RegistroMovimientos registro) {       
        registroMovimientosDAO.save(registro);
    }

}
