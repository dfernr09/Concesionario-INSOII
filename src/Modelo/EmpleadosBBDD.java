/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.*;
import Modelo.*;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Usuario
 */
public class EmpleadosBBDD {
     public void nuevoEmpleado(Empleados c){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(c);
        tx.commit();
       
     
    }
    public Empleados buscarEmpleado(int emSsn){
        Empleados e;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        e = (Empleados) session.get(Empleados.class, emSsn);
        tx.commit();
        
        return e;
    }
   public List<Empleados> buscarEmpleadoNombre(String name){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Empleados where emNombre='"+name+"'");
        List<Empleados> lista = q.list();
        tx.commit();
    
        return lista;
    }
    public List<Empleados> buscarEmpleadoUsuario(String user){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Empleados where emUsuario='"+user+"'");
        List<Empleados> lista = q.list();
        tx.commit();
    
        return lista;
    }
    public List<Empleados> obtenerTodosEmpleados(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Empleados");
        List<Empleados> lista = q.list();
        tx.commit();
        

        return lista;
    }
    
      public void eliminarEmpleado(int emSsn){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Empleados e;
        e = (Empleados) session.get(Empleados.class,emSsn);
        if(e != null){
            session.delete(e);
        }
        
        tx.commit();
        
     
    }
     public void actualizarUsuario(int emSsn, String emUsuario){
         SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Empleados e;
        e = (Empleados) session.get(Empleados.class, emSsn);
        if(e != null){
            e.setEmUsuario(emUsuario);
            session.update(e);
        }
        tx.commit();
       
     }
       public void actualizarPassword(int emSsn, String emPassword){
         SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Empleados e;
        e = (Empleados) session.get(Empleados.class, emSsn);
        if(e != null){
            e.setEmPassword(emPassword);
            session.update(e);
        }
        tx.commit();
    
     }
  public void actualizarTelefono(int emSsn, int emTelefono){
         SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Empleados e;
        e = (Empleados) session.get(Empleados.class, emSsn);
        if(e != null){
            e.setEmTelefono(emTelefono);
            session.update(e);
        }
        tx.commit();
        
     }  
  public void actualizarNomina(int emSsn, int emNominaBase){
         SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Empleados e;
        e = (Empleados) session.get(Empleados.class, emSsn);
        if(e != null){
            e.setEmNominaBase(emNominaBase);
            session.update(e);
        }
        tx.commit();
       
     }
public void actualizarPoblacion(int emSsn, String emPoblacion){
         SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Empleados e;
        e = (Empleados) session.get(Empleados.class, emSsn);
        if(e != null){
            e.setEmPoblacion(emPoblacion);
            session.update(e);
        }
        tx.commit();
       
     }
}
