package com.metalideas.metalideastec.persistencia.serv;

import java.util.List;

import com.metalideas.metalideastec.entity.TipoMovimiento;

public interface TipoMovimientoServ {
    public List<TipoMovimiento> listarTipoMovimientos();
    /* public void agregar(TipoMovimiento tipoMovimiento);
    public void actualizar(TipoMovimiento tipoMovimiento);
    public void borrar(TipoMovimiento tipoMovimiento); */
    public TipoMovimiento buscarTipoMovimiento(int id);
}
