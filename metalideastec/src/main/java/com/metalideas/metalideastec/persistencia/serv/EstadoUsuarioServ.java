package com.metalideas.metalideastec.persistencia.serv;

import java.util.List;

import com.metalideas.metalideastec.entity.EstadoUsuario;

public interface EstadoUsuarioServ {
    public List<EstadoUsuario> verEstadosUsuario();
    public EstadoUsuario buscarEstadosUsuario(int id);
}
