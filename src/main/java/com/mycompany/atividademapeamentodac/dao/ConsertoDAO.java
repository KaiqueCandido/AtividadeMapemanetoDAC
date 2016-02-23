/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividademapeamentodac.dao;

import com.mycompany.atividademapeamentodac.entidade.Conserto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author kaique
 */
public class ConsertoDAO {
    
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
    EntityManager em = factory.createEntityManager();
    
    public void addConserto(Conserto c) {
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        em.close();
    }
    
    public void removeConserto(Conserto c) {
        em.getTransaction().begin();
        em.remove(c);
        em.getTransaction().commit();
        em.close();
    }
    
}
