package com.metalideas.metalideastec.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
/* import javax.persistence.FetchType; */
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
@Table(name = "usuario")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idusuario")
    private Integer idusuario;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "apellido")
    private String apellido;
    @Basic(optional = false)
    @Column(name = "clave")
    private String clave;
    @Basic(optional = false)
    @Column(name = "correo")
    private String correo;
    @Basic(optional = false)
    @Column(name = "direccion")
    private String direccion;

    
    @ManyToOne()
    @JoinColumn(name = "estado_usuario_idestado_cliente")    
    private EstadoUsuario estadoUsuarioIdestadoCliente;

    @ManyToOne()
    @JoinColumn(name = "rol_idrol")
    private Rol rolIdrol;

    public Usuario() {
    }

    public Usuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public Usuario(Integer idusuario, String nombre, String apellido, String clave, String correo, String direccion) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
        this.correo = correo;
        this.direccion = direccion;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public EstadoUsuario getEstadoUsuarioIdestadoCliente() {
        return estadoUsuarioIdestadoCliente;
    }

    public void setEstadoUsuarioIdestadoCliente(EstadoUsuario estadoUsuarioIdestadoCliente) {
        this.estadoUsuarioIdestadoCliente = estadoUsuarioIdestadoCliente;
    }

    public Rol getRolIdrol() {
        return rolIdrol;
    }

    public void setRolIdrol(Rol rolIdrol) {
        this.rolIdrol = rolIdrol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusuario != null ? idusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idusuario == null && other.idusuario != null)
                || (this.idusuario != null && !this.idusuario.equals(other.idusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.entity.Usuario[ idusuario=" + idusuario + " ]";
    }

}
