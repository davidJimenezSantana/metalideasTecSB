package com.metalideas.metalideastec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.metalideas.metalideastec.entity.ComprobanteDePago;
import com.metalideas.metalideastec.entity.Usuario;
import com.metalideas.metalideastec.entity.Venta;
import com.metalideas.metalideastec.persistencia.serv.ComprobanteDePagoServ;
import com.metalideas.metalideastec.persistencia.serv.EstadVentaServ;
import com.metalideas.metalideastec.persistencia.serv.MetodoPagoServ;
import com.metalideas.metalideastec.persistencia.serv.UsuarioServ;
import com.metalideas.metalideastec.persistencia.serv.VentaServ;

@Controller
public class GestionVentaController {
    
    @Autowired
    private VentaServ ventaServ;    
    @Autowired
    private EstadVentaServ estadVenta;    
    @Autowired
    private ComprobanteDePagoServ comprobanteDePagoServ;
    @Autowired
    private UsuarioServ usuarioServ;
    @Autowired
    private MetodoPagoServ metodoPagoServ;

    @GetMapping(value = "/gestionVentas")
    public String gestionVentas(Model model){
        Venta venta = new Venta();
        model.addAttribute("ventas", ventaServ.listarVenta());
        model.addAttribute("estadosVenta", estadVenta.listarEstados());
        model.addAttribute("venta", venta);
        model.addAttribute("metodosPago", metodoPagoServ.listarMetodoPago());
        return "vista/ventas/gestionVentas";
    }

    @PostMapping(value = "/actualizarVenta")
    public String actualizarVenta(@ModelAttribute("venta") Venta venta){

        Venta nuevaVenta = ventaServ.buscarVentaId(venta.getIdventa());
        nuevaVenta.setEstadoIdestado(venta.getEstadoIdestado());
        nuevaVenta.setDestino(venta.getDestino());
        String url = "";
        try {
            ventaServ.actualizar(nuevaVenta);
            url = "?actualizarTrue";
        } catch (Exception e) {
            url = "?actualizarFalse";
        }
        return "redirect:/gestionVentas" + url;
    }

    @PostMapping(value = "/registrarVenta")
    public String registrarVenta(@ModelAttribute("venta") Venta venta){

        ComprobanteDePago comprobante = comprobanteDePagoServ.crear(venta.getTotal());
        venta.setComprobanteDePagoIdcomprobanteDePago(comprobante);
        venta.setFecha(comprobante.getFecha());

        //usuario temporal
        Usuario usuario = usuarioServ.buscarUsuario(4);
        venta.setUsuarioIdusuario(usuario);

        String url = "";
        try {
            ventaServ.agregar(venta);
            url = "?registroTrue";
        } catch (Exception e) {
            url = "?registroFalse";
        }
        return "redirect:/gestionVentas" + url;
    } 

}
