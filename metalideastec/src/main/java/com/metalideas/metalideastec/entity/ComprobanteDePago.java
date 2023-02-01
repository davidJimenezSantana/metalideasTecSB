/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author david
 */
@Entity
@Table(name = "comprobante_de_pago")
@NamedQueries({
    @NamedQuery(name = "ComprobanteDePago.findAll", query = "SELECT c FROM ComprobanteDePago c"),
    @NamedQuery(name = "ComprobanteDePago.findByIdcomprobanteDePago", query = "SELECT c FROM ComprobanteDePago c WHERE c.idcomprobanteDePago = :idcomprobanteDePago"),
    @NamedQuery(name = "ComprobanteDePago.findByFecha", query = "SELECT c FROM ComprobanteDePago c WHERE c.fecha = :fecha"),
    @NamedQuery(name = "ComprobanteDePago.findByHora", query = "SELECT c FROM ComprobanteDePago c WHERE c.hora = :hora"),
    @NamedQuery(name = "ComprobanteDePago.findByTotal", query = "SELECT c FROM ComprobanteDePago c WHERE c.total = :total")})
public class ComprobanteDePago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcomprobante_de_pago")
    private Integer idcomprobanteDePago;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "hora")
    private String hora;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total")
    private int total;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "comprobanteDePagoIdcomprobanteDePago", fetch = FetchType.LAZY)
    private List<Venta> ventaList;

    public ComprobanteDePago() {
    }

    public ComprobanteDePago(Integer idcomprobanteDePago) {
        this.idcomprobanteDePago = idcomprobanteDePago;
    }

    public ComprobanteDePago(Integer idcomprobanteDePago, Date fecha, String hora, int total) {
        this.idcomprobanteDePago = idcomprobanteDePago;
        this.fecha = fecha;
        this.hora = hora;
        this.total = total;
    }

    public Integer getIdcomprobanteDePago() {
        return idcomprobanteDePago;
    }

    public void setIdcomprobanteDePago(Integer idcomprobanteDePago) {
        this.idcomprobanteDePago = idcomprobanteDePago;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
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
        // TODO: Warning - this method won't work in the case the id fields are not set
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
    
}
