/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.metalideas.metalideastec.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author david
 */
@Entity
@Table(name = "producto_has_venta")
@NamedQueries({
    @NamedQuery(name = "ProductoHasVenta.findAll", query = "SELECT p FROM ProductoHasVenta p"),
    @NamedQuery(name = "ProductoHasVenta.findByProductoCod", query = "SELECT p FROM ProductoHasVenta p WHERE p.productoHasVentaPK.productoCod = :productoCod"),
    @NamedQuery(name = "ProductoHasVenta.findByVentaIdventa", query = "SELECT p FROM ProductoHasVenta p WHERE p.productoHasVentaPK.ventaIdventa = :ventaIdventa"),
    @NamedQuery(name = "ProductoHasVenta.findByCantidad", query = "SELECT p FROM ProductoHasVenta p WHERE p.cantidad = :cantidad")})
public class ProductoHasVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductoHasVentaPK productoHasVentaPK;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;
    @JoinColumn(name = "producto_cod", referencedColumnName = "idproducto", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Producto producto;
    @JoinColumn(name = "venta_idventa", referencedColumnName = "idventa", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Venta venta;

    public ProductoHasVenta() {
    }

    public ProductoHasVenta(ProductoHasVentaPK productoHasVentaPK) {
        this.productoHasVentaPK = productoHasVentaPK;
    }

    public ProductoHasVenta(ProductoHasVentaPK productoHasVentaPK, int cantidad) {
        this.productoHasVentaPK = productoHasVentaPK;
        this.cantidad = cantidad;
    }

    public ProductoHasVenta(int productoCod, int ventaIdventa) {
        this.productoHasVentaPK = new ProductoHasVentaPK(productoCod, ventaIdventa);
    }

    public ProductoHasVentaPK getProductoHasVentaPK() {
        return productoHasVentaPK;
    }

    public void setProductoHasVentaPK(ProductoHasVentaPK productoHasVentaPK) {
        this.productoHasVentaPK = productoHasVentaPK;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productoHasVentaPK != null ? productoHasVentaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        //  this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoHasVenta)) {
            return false;
        }
        ProductoHasVenta other = (ProductoHasVenta) object;
        if ((this.productoHasVentaPK == null && other.productoHasVentaPK != null) || (this.productoHasVentaPK != null && !this.productoHasVentaPK.equals(other.productoHasVentaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.entity.ProductoHasVenta[ productoHasVentaPK=" + productoHasVentaPK + " ]";
    }
    
}
