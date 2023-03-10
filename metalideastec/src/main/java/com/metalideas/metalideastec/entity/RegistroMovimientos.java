/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.metalideas.metalideastec.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author david
 */
@Entity
@Table(name = "registro_movimientos")
public class RegistroMovimientos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idregistro_movimientos")
    private Integer idregistroMovimientos;
    @Basic(optional = false)
    @Column(name = "detalle")
    private String detalle;
    @Basic(optional = false)
    @Column(name = "fecha_movimiento")
    private int fechaMovimiento;
    @Basic(optional = false)
    @Column(name = "cantidad_prod")
    private int cantidadProd;

    @JoinColumn(name = "tipo_movimiento_idtipo_movimiento")
    @ManyToOne()
    private TipoMovimiento tipoMovimientoIdtipoMovimiento;
    
    @JoinColumn(name = "usuario_idusuario")
    @ManyToOne()
    private Usuario usuarioIdusuario;

    public RegistroMovimientos() {
    }

    public RegistroMovimientos(Integer idregistroMovimientos) {
        this.idregistroMovimientos = idregistroMovimientos;
    }

    public RegistroMovimientos(Integer idregistroMovimientos, String detalle, int fechaMovimiento, int cantidadProd) {
        this.idregistroMovimientos = idregistroMovimientos;
        this.detalle = detalle;
        this.fechaMovimiento = fechaMovimiento;
        this.cantidadProd = cantidadProd;
    }

    public Integer getIdregistroMovimientos() {
        return idregistroMovimientos;
    }

    public void setIdregistroMovimientos(Integer idregistroMovimientos) {
        this.idregistroMovimientos = idregistroMovimientos;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(int fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public int getCantidadProd() {
        return cantidadProd;
    }

    public void setCantidadProd(int cantidadProd) {
        this.cantidadProd = cantidadProd;
    }


    public TipoMovimiento getTipoMovimientoIdtipoMovimiento() {
        return tipoMovimientoIdtipoMovimiento;
    }

    public void setTipoMovimientoIdtipoMovimiento(TipoMovimiento tipoMovimientoIdtipoMovimiento) {
        this.tipoMovimientoIdtipoMovimiento = tipoMovimientoIdtipoMovimiento;
    }

    public Usuario getUsuarioIdusuario() {
        return usuarioIdusuario;
    }

    public void setUsuarioIdusuario(Usuario usuarioIdusuario) {
        this.usuarioIdusuario = usuarioIdusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idregistroMovimientos != null ? idregistroMovimientos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // this method won't work in the case the id fields are not set
        if (!(object instanceof RegistroMovimientos)) {
            return false;
        }
        RegistroMovimientos other = (RegistroMovimientos) object;
        if ((this.idregistroMovimientos == null && other.idregistroMovimientos != null) || (this.idregistroMovimientos != null && !this.idregistroMovimientos.equals(other.idregistroMovimientos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.entity.RegistroMovimientos[ idregistroMovimientos=" + idregistroMovimientos + " ]";
    }
    
}
