/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import Modelo.*;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class VehiculosVendidosBBDD {
    public void nuevoVehiculoVendido(VehiculosVendidos vehiculo){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(vehiculo);
        tx.commit();
      
     
    }
    public VehiculosVendidos buscarVehiculoVendido(int bastidorNum){
        VehiculosVendidos vehiculo;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        vehiculo = (VehiculosVendidos) session.get(VehiculosVendidos.class, bastidorNum);
        tx.commit();
        
        return vehiculo;
    }
    
    public List<VehiculosVendidos> obtenerTodosVehiculosVendidos(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from VehiculosVendidos");
        List<VehiculosVendidos> lista = q.list();
        tx.commit();
 
        return lista;
    }
    
      public void eliminarVehiculoVendido(int bastidorNum){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        VehiculosVendidos vehiculo;
        vehiculo = (VehiculosVendidos) session.get(VehiculosVendidos.class, bastidorNum);
        if(vehiculo != null){
            session.delete(vehiculo);
        }
        
        tx.commit();
     
     
    }
      
     public void ponerEnTaller(int bastidorNum, boolean enTaller){
         SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        VehiculosVendidos vehiculo;
        vehiculo = (VehiculosVendidos) session.get(VehiculosVendidos.class, bastidorNum);
        if(vehiculo != null){
            vehiculo.setTaller(enTaller);
            session.update(vehiculo);
        }
        tx.commit();
    
     }
     
     
     
}
