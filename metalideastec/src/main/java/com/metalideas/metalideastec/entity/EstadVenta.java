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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author david
 */
@Entity
@Table(name = "estad_venta")
@NamedQueries({
    @NamedQuery(name = "EstadVenta.findAll", query = "SELECT e FROM EstadVenta e"),
    @NamedQuery(name = "EstadVenta.findByIdestado", query = "SELECT e FROM EstadVenta e WHERE e.idestado = :idestado"),
    @NamedQuery(name = "EstadVenta.findByNombre", query = "SELECT e FROM EstadVenta e WHERE e.nombre = :nombre")})
public class EstadVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idestado")
    private Integer idestado;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estadoIdestado", fetch = FetchType.LAZY)
    private List<Venta> ventaList;

    public EstadVenta() {
    }

    public EstadVenta(Integer idestado) {
        this.idestado = idestado;
    }

    public EstadVenta(Integer idestado, String nombre) {
        this.idestado = idestado;
        this.nombre = nombre;
    }

    public Integer getIdestado() {
        return idestado;
    }

    public void setIdestado(Integer idestado) {
        this.idestado = idestado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Venta> getVentaList() {
        return ventaList;
    }

    public void setVentaList(List<Venta> ventaList) {
        this.ventaList = ventaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idestado != null ? idestado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // this method won't work in the case the id fields are not set
        if (!(object instanceof EstadVenta)) {
            return false;
        }
        EstadVenta other = (EstadVenta) object;
        if ((this.idestado == null && other.idestado != null) || (this.idestado != null && !this.idestado.equals(other.idestado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.entity.EstadVenta[ idestado=" + idestado + " ]";
    }
    
}
