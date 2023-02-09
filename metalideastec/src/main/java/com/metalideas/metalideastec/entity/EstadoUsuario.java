/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.metalideas.metalideastec.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author david
 */
@Entity
@Table(name = "estado_usuario")
public class EstadoUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idestado_cliente")
    private Integer idestadoCliente;
    @Basic(optional = false)
    @Column(name = "nombre_estado")
    private String nombreEstado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estadoUsuarioIdestadoCliente", fetch = FetchType.LAZY)
    private List<Usuario> usuarioList;

    public EstadoUsuario() {
    }

    public EstadoUsuario(Integer idestadoCliente) {
        this.idestadoCliente = idestadoCliente;
    }

    public EstadoUsuario(Integer idestadoCliente, String nombreEstado) {
        this.idestadoCliente = idestadoCliente;
        this.nombreEstado = nombreEstado;
    }

    public Integer getIdestadoCliente() {
        return idestadoCliente;
    }

    public void setIdestadoCliente(Integer idestadoCliente) {
        this.idestadoCliente = idestadoCliente;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idestadoCliente != null ? idestadoCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoUsuario)) {
            return false;
        }
        EstadoUsuario other = (EstadoUsuario) object;
        if ((this.idestadoCliente == null && other.idestadoCliente != null) || (this.idestadoCliente != null && !this.idestadoCliente.equals(other.idestadoCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.entity.EstadoUsuario[ idestadoCliente=" + idestadoCliente + " ]";
    }
    
}
