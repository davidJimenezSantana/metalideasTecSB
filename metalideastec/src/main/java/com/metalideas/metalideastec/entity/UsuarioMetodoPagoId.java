package com.metalideas.metalideastec.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UsuarioMetodoPagoId  implements Serializable{
    
    @Basic(optional = false)
    @Column(name = "usuario_idusuario")
    private int usuarioidusuario;
    @Basic(optional = false)
    @Column(name = "metodo_pago_idmetodo_pago")
    private int metodopagoidmetodopago;

    public UsuarioMetodoPagoId() {
    }

    public UsuarioMetodoPagoId(int usuarioidusuario, int metodopagoidmetodopago) {
        this.usuarioidusuario = usuarioidusuario;
        this.metodopagoidmetodopago = metodopagoidmetodopago;
    }

    public int getUsuarioidusuario() {
        return usuarioidusuario;
    }

    public void setUsuarioidusuario(int usuarioidusuario) {
        this.usuarioidusuario = usuarioidusuario;
    }

    public int getMetodopagoidmetodopago() {
        return metodopagoidmetodopago;
    }

    public void setMetodopagoidmetodopago(int metodopagoidmetodopago) {
        this.metodopagoidmetodopago = metodopagoidmetodopago;
    }

    

}
