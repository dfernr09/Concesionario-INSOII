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
public class VehiculosDisponiblesBBDD {
    public void nuevoVehiculoDisponible(VehiculosDisponibles vehiculo){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(vehiculo);
        tx.commit();
        session.close();
        sesion.close();
     
    }
    public VehiculosDisponibles buscarVehiculoDisponible(int numBastidor){
        VehiculosDisponibles vehiculo;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        vehiculo = (VehiculosDisponibles) session.get(VehiculosDisponibles.class, numBastidor);
        tx.commit();
        session.close();
        sesion.close();
        return vehiculo;
    }
    
    public List<VehiculosDisponibles> obtenerTodosVehiculosDisponibles(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from VehiculosDisponibles");
        List<VehiculosDisponibles> lista = q.list();
        tx.commit();
        session.close();
        sesion.close();

        return lista;
    }
    
      public void eliminarVehiculoVendido(int numBastidor){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        VehiculosDisponibles vehiculo;
        vehiculo = (VehiculosDisponibles) session.get(VehiculosDisponibles.class, numBastidor);
        if(vehiculo != null){
            session.delete(vehiculo);
        }
        
        tx.commit();
        session.close();
        sesion.close();
     
    }
}
