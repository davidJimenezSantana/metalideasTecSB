package com.metalideas.metalideastec.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "proveedor_has_producto")
public class ProveedorProducto implements Serializable {

    @EmbeddedId
    private ProveedorProductoId id;


    public ProveedorProducto() {
    }

    public ProveedorProducto(ProveedorProductoId id) {
        this.id = id;
    }

    public ProveedorProductoId getId() {
        return id;
    }

    public void setId(ProveedorProductoId id) {
        this.id = id;
    }

}