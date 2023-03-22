package com.metalideas.metalideastec.persistencia.serv;

import java.util.List;

import com.metalideas.metalideastec.entity.Rol;

public interface RolServ {
    public List<Rol> verRoles();
    public Rol buscarRol(int id);
}
