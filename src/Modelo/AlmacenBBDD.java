/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
import Controlador.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import Modelo.*;
import java.util.ArrayList;
import java.util.List;
public class AlmacenBBDD {

    
     public void nuevaPieza(Almacen a){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(a);
        tx.commit();
        
     
    }
    public Almacen buscarPieza(String numPieza){
        Almacen a;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        a = (Almacen) session.get(Almacen.class, numPieza);
        tx.commit();
        
        return a;
    }
     public List<Almacen> buscarPiezasPorMarca(String marca){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Almacen where marcaPieza='"+marca+"'");
        List<Almacen> lista = q.list();
        tx.commit();
    
        return lista;
    }
    public List<Almacen> obtenerTodasPiezas(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Almacen");
        List<Almacen> lista = q.list();
        tx.commit();
        

        return lista;
    }
    
      public void eliminarPieza(String numPieza){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Almacen a;
        a = (Almacen) session.get(Almacen.class, numPieza);
        if(a != null){
            session.delete(a);
        }
        
        tx.commit();
   
     
    }
      public void asignarPedido(String numPieza, int numPedido){
         SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Almacen a;
        a = (Almacen) session.get(Almacen.class,numPieza);
        if(a != null){
            a.setNumPedido(numPedido);
            session.update(a);
        }
        tx.commit();
   
     }
}
