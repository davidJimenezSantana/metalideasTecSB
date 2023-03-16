/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.metalideas.metalideastec.entity;

import java.io.Serializable;
import java.sql.Timestamp;
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
@Table(name = "comprobante_de_pago")

public class ComprobanteDePago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcomprobante_de_pago")
    private Integer idcomprobanteDePago;
    @Basic(optional = false)
    @Column(name = "fecha")
    private Timestamp fecha;
    @Basic(optional = false)
    @Column(name = "total")
    private int total;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "comprobanteDePagoIdcomprobanteDePago", fetch = FetchType.LAZY)
    private List<Venta> ventaList;

    public ComprobanteDePago() {
    }

    public ComprobanteDePago(Integer idcomprobanteDePago) {
        this.idcomprobanteDePago = idcomprobanteDePago;
    }

    public ComprobanteDePago(Integer idcomprobanteDePago, Timestamp fecha, int total) {
        this.idcomprobanteDePago = idcomprobanteDePago;
        this.fecha = fecha;
        this.total = total;
    }

    public ComprobanteDePago(Timestamp fecha, int total) {
        this.fecha = fecha;
        this.total = total;
    }


    public Integer getIdcomprobanteDePago() {
        return idcomprobanteDePago;
    }

    public void setIdcomprobanteDePago(Integer idcomprobanteDePago) {
        this.idcomprobanteDePago = idcomprobanteDePago;
    }

    public Timestamp getFecha() {
        return fecha;
    }
    


    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
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
        hash += (idcomprobanteDePago != null ? idcomprobanteDePago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        //this method won't work in the case the id fields are not set
        if (!(object instanceof ComprobanteDePago)) {
            return false;
        }
        ComprobanteDePago other = (ComprobanteDePago) object;
        if ((this.idcomprobanteDePago == null && other.idcomprobanteDePago != null) || (this.idcomprobanteDePago != null && !this.idcomprobanteDePago.equals(other.idcomprobanteDePago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.entity.ComprobanteDePago[ idcomprobanteDePago=" + idcomprobanteDePago + " ]";
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }
    
}
