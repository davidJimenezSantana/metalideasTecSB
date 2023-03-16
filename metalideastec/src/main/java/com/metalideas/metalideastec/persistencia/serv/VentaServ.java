package com.metalideas.metalideastec.persistencia.serv;

import java.util.List;

import com.metalideas.metalideastec.entity.Venta;

public interface VentaServ {
    public List<Venta> listarVenta();
    public Venta buscarVentaId(int id);
    public Venta agregar(Venta venta);
    public void actualizar(Venta venta);
}
