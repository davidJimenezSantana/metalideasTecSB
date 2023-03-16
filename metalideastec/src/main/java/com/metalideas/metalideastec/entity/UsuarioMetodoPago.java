package com.metalideas.metalideastec.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;

public class UsuarioMetodoPago  implements Serializable{
    @EmbeddedId
    private UsuarioMetodoPagoId id;

    public UsuarioMetodoPago() {
    }

    public UsuarioMetodoPago(UsuarioMetodoPagoId id) {
        this.id = id;
    }

    public UsuarioMetodoPagoId getId() {
        return id;
    }

    public void setId(UsuarioMetodoPagoId id) {
        this.id = id;
    }
    
    
}
