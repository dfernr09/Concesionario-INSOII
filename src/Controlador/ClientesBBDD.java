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

public class ClientesBBDD {
    public void nuevoCliente(Clientes c){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(c);
        tx.commit();
        session.close();
        sesion.close();
     
    }
    public Clientes buscarCliente(byte clienId){
        Clientes c;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        c = (Clientes) session.get(Clientes.class, clienId);
        tx.commit();
        session.close();
        sesion.close();
        return c;
    }
    
    public List<Clientes> obtenerTodosClientes(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Clientes");
        List<Clientes> lista = q.list();
        tx.commit();
        session.close();
        sesion.close();

        return lista;
    }
    
      public void eliminarCliente(byte clienId){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Clientes c;
        c = (Clientes) session.get(Clientes.class,clienId);
        if(c != null){
            session.delete(c);
        }
        
        tx.commit();
        session.close();
        sesion.close();
     
    }
     public void actualizarHistorialCompras(byte clienId, String clienHistorialCompras){
         SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Clientes c;
        c = (Clientes) session.get(Clientes.class, clienId);
        if(c != null){
            c.setClienHistorialCompras(clienHistorialCompras);
            session.update(c);
        }
        tx.commit();
        session.close();
        sesion.close();
     }
       public void actualizarDireccion(byte clienId, String clienDireccion){
         SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Clientes c;
        c = (Clientes) session.get(Clientes.class, clienId);
        if(c != null){
            c.setClienDireccion(clienDireccion);
            session.update(c);
        }
        tx.commit();
        session.close();
        sesion.close();
     }
     
      public void actualizarTelefono(byte clienId, String telefono){
         SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Clientes c;
        c = (Clientes) session.get(Clientes.class, clienId);
        if(c != null){
            c.setTelefono(telefono);
            session.update(c);
        }
        tx.commit();
        session.close();
        sesion.close();
     }
      
      public void actualizarCorreo(byte clienId, String clienCorreo){
         SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Clientes c;
        c = (Clientes) session.get(Clientes.class, clienId);
        if(c != null){
            c.setClienCorreo(clienCorreo);
            session.update(c);
        }
        tx.commit();
        session.close();
        sesion.close();
     }
      
     
     
}
