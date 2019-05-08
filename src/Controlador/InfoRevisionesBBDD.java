/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Usuario
 */

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import Modelo.*;
import java.util.List;

public class InfoRevisionesBBDD {
    public void nuevaRevision(InfoRevisiones r){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(r);
        tx.commit();
     
     
    }
    public InfoRevisiones buscarRevision(byte revId){
        InfoRevisiones r;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        r = (InfoRevisiones) session.get(InfoRevisiones.class, revId);
        tx.commit();
       
        return r;
    }
    
    public List<InfoRevisiones> obtenerTodasRevisiones(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from InfoRevisiones");
        List<InfoRevisiones> lista = q.list();
        tx.commit();
        

        return lista;
    }
    
      public void eliminarRevision(byte revId){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        InfoRevisiones r;
        r = (InfoRevisiones) session.get(InfoRevisiones.class,revId);
        if(r != null){
            session.delete(r);
        }
        
        tx.commit();
        
    }
     public void actualizarDescripcion(byte revId, String descripcion){
         SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        InfoRevisiones r;
        r = (InfoRevisiones) session.get(InfoRevisiones.class, revId);
        if(r != null){
            r.setDescripcion(descripcion);
            session.update(r);
        }
        tx.commit();
        
     }
     
       public void actualizarPiezas(byte revId, String piezas){
         SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        InfoRevisiones r;
        r = (InfoRevisiones) session.get(InfoRevisiones.class, revId);
        if(r != null){
            r.setPiezas(piezas);
            session.update(r);
        }
        tx.commit();
        
     }
}
