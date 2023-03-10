package com.metalideas.metalideastec.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ProveedorProductoId  implements Serializable {

    @Column(name = "proveedor_idproveedor")
    private int proveedorId;

    @Column(name = "producto_idproducto")
    private int productoId;
    
    public ProveedorProductoId() {
    }

    public ProveedorProductoId(int proveedorId, int productoId) {
        this.proveedorId = proveedorId;
        this.productoId = productoId;
    }

    public ProveedorProductoId(int productoId) {
        this.productoId = productoId;
    }

    public int getProveedorId() {
        return proveedorId;
    }

    public void setProveedorId(int proveedorId) {
        this.proveedorId = proveedorId;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    
}
