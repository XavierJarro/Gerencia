/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.services;

import ec.edu.ups.modelo.Factura;
import ec.edu.ups.negocio.GestionFacturaLocal;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Starman
 */
@Path("/gi")
public class ServiciosRest {

    @Inject
    private GestionFacturaLocal on;

    @POST
    @Path("/guardarPost")
    @Produces("application/json;charset=utf-8")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String guardar(@FormParam("nombre") String nombre,
            @FormParam("correo") String correo,
            @FormParam("peluche") String peluche,
            @FormParam("telefono") String telefono) {
        Factura informacion = new Factura();
        informacion.setCliente(nombre);
        informacion.setCorreo(correo);
        informacion.setPeluche(peluche);
        informacion.setTelefono(telefono);
        return on.guardarFactura(informacion);
    }

    @GET
    @Path("/guardar2")
    @Produces("application/json")
    public String guardar2(@QueryParam("nombre") String nombre, @QueryParam("correo") String correo, @QueryParam("peluche") String peluche, @QueryParam("telefono") String telefono) {
        Factura informacion = new Factura();
        informacion.setCliente(nombre);
        informacion.setCorreo(correo);
        informacion.setPeluche(peluche);
        informacion.setTelefono(telefono);
        return on.guardarFactura(informacion);

    }

}
