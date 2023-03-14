package com.metalideas.metalideastec.persistencia.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metalideas.metalideastec.entity.TipoMovimiento;
import com.metalideas.metalideastec.persistencia.Repo.TipoMovimientoDAO;

@Service
public class TipoMovimientoServImp implements TipoMovimientoServ{

    @Autowired
    private TipoMovimientoDAO tipoMovimientoDAO;

    @Override
    public List<TipoMovimiento> listarTipoMovimientos() {
        return tipoMovimientoDAO.findAll();
    }
/* 
    @Override
    public void agregar(TipoMovimiento tipoMovimiento) {

    }

    @Override
    public void actualizar(TipoMovimiento tipoMovimiento) {
        throw new UnsupportedOperationException("Unimplemented method 'actualizar'");
    }

    @Override
    public void borrar(TipoMovimiento tipoMovimiento) {
        tipoMovimientoDAO.delete(tipoMovimiento);
    }
 */
    @Override
    public TipoMovimiento buscarTipoMovimiento(int id) {
        return tipoMovimientoDAO.findById(id).get();
    }
    
}
