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
import javax.persistence.Table;

/**
 *
 * @author david
 */
@Entity
@Table(name = "tipo_movimiento")
public class TipoMovimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipo_movimiento")
    private Integer idtipoMovimiento;
    @Basic(optional = false)
    @Column(name = "nombre_movimiento")
    private String nombreMovimiento;

    public TipoMovimiento() {
    }

    public TipoMovimiento(Integer idtipoMovimiento) {
        this.idtipoMovimiento = idtipoMovimiento;
    }

    public TipoMovimiento(Integer idtipoMovimiento, String nombreMovimiento) {
        this.idtipoMovimiento = idtipoMovimiento;
        this.nombreMovimiento = nombreMovimiento;
    }

    public Integer getIdtipoMovimiento() {
        return idtipoMovimiento;
    }

    public void setIdtipoMovimiento(Integer idtipoMovimiento) {
        this.idtipoMovimiento = idtipoMovimiento;
    }

    public String getNombreMovimiento() {
        return nombreMovimiento;
    }

    public void setNombreMovimiento(String nombreMovimiento) {
        this.nombreMovimiento = nombreMovimiento;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoMovimiento != null ? idtipoMovimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // this method won't work in the case the id fields are not set
        if (!(object instanceof TipoMovimiento)) {
            return false;
        }
        TipoMovimiento other = (TipoMovimiento) object;
        if ((this.idtipoMovimiento == null && other.idtipoMovimiento != null) || (this.idtipoMovimiento != null && !this.idtipoMovimiento.equals(other.idtipoMovimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.entity.TipoMovimiento[ idtipoMovimiento=" + idtipoMovimiento + " ]";
    }
    
}
