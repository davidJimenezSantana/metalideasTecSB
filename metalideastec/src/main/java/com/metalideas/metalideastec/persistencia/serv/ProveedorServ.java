package com.metalideas.metalideastec.persistencia.serv;

import java.util.List;

import com.metalideas.metalideastec.entity.Proveedor;

public interface ProveedorServ {
    public List<Proveedor> listarProveedores();
    public Proveedor BuscarProveedor(int id);
    public void agregar(Proveedor proveedor);
    public void actualizar(Proveedor proveedor);
    public void borrar(Proveedor proveedor);
}
