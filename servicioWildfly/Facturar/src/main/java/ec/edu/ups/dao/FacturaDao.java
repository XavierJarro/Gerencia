/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Factura;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Starman
 */
@Stateless
public class FacturaDao {

    @PersistenceContext(name = "FacturarPersistenceUnit")
    private EntityManager em;

    public void insert(Factura c) {
        em.persist(c);
    }

    public List<Factura> getFacturas() {
        String jpql = "SELECT c FROM Factura c ";
        Query q = em.createQuery(jpql, Factura.class);
        return q.getResultList();
    }
}
