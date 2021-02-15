/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.negocio;

import ec.edu.ups.dao.FacturaDao;
import ec.edu.ups.modelo.Factura;
import ec.edu.ups.services.Respuesta;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Starman
 */
@Stateless
public class GestionFactura implements GestionFacturaLocal{
    
    @Inject
    private FacturaDao facDao;
    
    public String guardarFactura(Factura c) {
        int cod =facDao.getFacturas().size()+1;
        c.setCodigo(cod);
        facDao.insert(c);
        return "guardado";
    }


    
    
}
