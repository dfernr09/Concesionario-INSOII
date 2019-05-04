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

public class InfoCompraBBDD {
     public void nuevaCompra(InfoCompra c){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(c);
        tx.commit();
        session.close();
        sesion.close();
     
    }
    public InfoCompra buscarCompra(int numeroCompra){
        InfoCompra c;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        c = (InfoCompra) session.get(InfoCompra.class, numeroCompra);
        tx.commit();
        session.close();
        sesion.close();
        return c;
    }
    
    public List<InfoCompra> obtenerTodasCompras(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from InfoCompra");
        List<InfoCompra> lista = q.list();
        tx.commit();
        session.close();
        sesion.close();

        return lista;
    }
    
      public void eliminarCompra(int numeroCompra){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        InfoCompra c;
        c = (InfoCompra) session.get(InfoCompra.class, numeroCompra);
        if(c != null){
            session.delete(c);
        }
        
        tx.commit();
        session.close();
        sesion.close();
     
    }
      
}
