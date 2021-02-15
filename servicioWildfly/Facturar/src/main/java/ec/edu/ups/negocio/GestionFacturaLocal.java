/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.negocio;

import ec.edu.ups.modelo.Factura;
import ec.edu.ups.services.Respuesta;
import javax.ejb.Local;

/**
 *
 * @author Starman
 */
@Local
public interface GestionFacturaLocal {

    public String guardarFactura(Factura c);
}
