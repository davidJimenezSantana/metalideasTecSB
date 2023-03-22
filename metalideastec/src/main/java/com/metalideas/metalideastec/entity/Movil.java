/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.metalideas.metalideastec.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "movil")

public class Movil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmovil")
    private Integer idmovil;
    @Column(name = "numero")
    private Long numero;
    @JoinColumn(name = "usuario_idusuario", referencedColumnName = "idusuario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuarioIdusuario;

    public Movil() {
    }

    public Movil(Integer idmovil) {
        this.idmovil = idmovil;
    }

    public Movil(Long  numero, Usuario usuarioIdusuario) {
        this.numero = numero;
        this.usuarioIdusuario = usuarioIdusuario;
    }

    public Integer getIdmovil() {
        return idmovil;
    }

    public void setIdmovil(Integer idmovil) {
        this.idmovil = idmovil;
    }

    public Long  getNumero() {
        return numero;
    }

    public void setNumero(Long  numero) {
        this.numero = numero;
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
        hash += (idmovil != null ? idmovil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        //  this method won't work in the case the id fields are not set
        if (!(object instanceof Movil)) {
            return false;
        }
        Movil other = (Movil) object;
        if ((this.idmovil == null && other.idmovil != null) || (this.idmovil != null && !this.idmovil.equals(other.idmovil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.entity.Movil[ idmovil=" + idmovil + " ]";
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    
}
