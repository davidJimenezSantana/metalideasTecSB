package com.metalideas.metalideastec.persistencia.serv;

import java.util.List;

import com.metalideas.metalideastec.entity.TelefonoProveedor;

public interface TelefonoProveedorServ {
    public List<TelefonoProveedor> listarTelefonoProveedor();
    public void agregar(TelefonoProveedor telefonoProveedor);
    public void actualizar(TelefonoProveedor telefonoProveedor);
    public void borrar(TelefonoProveedor telefonoProveedor);
}
