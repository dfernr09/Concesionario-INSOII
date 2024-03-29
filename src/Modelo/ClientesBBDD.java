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
import java.util.List;

public class ClientesBBDD {
    public void nuevoCliente(Clientes c){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(c);
        tx.commit();
       
     
    }
    public Clientes buscarCliente(byte clienId){
        Clientes c;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        c = (Clientes) session.get(Clientes.class, clienId);
        tx.commit();
        
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
       ;

        return lista;
    }
        public List<Clientes> buscarClienteNIF(int nif){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Clientes where clienPasaporte='"+nif+"'");
        List<Clientes> lista = q.list();
        tx.commit();
    
        return lista;
    }
         public List<Clientes> buscarClienteNombre(String nombre){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Clientes where clienNombre='"+nombre+"'");
        List<Clientes> lista = q.list();
        tx.commit();
    
        return lista;
    }
       public List<Clientes> buscarClienteApellido(String apellido){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Clientes where clienApellido='"+apellido+"'");
        List<Clientes> lista = q.list();
        tx.commit();
    
        return lista;
    }
           public List<Clientes> buscarClienteTelefono(String telefono){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Clientes where telefono='"+telefono+"'");
        List<Clientes> lista = q.list();
        tx.commit();
    
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
   
     }
      
     
     
}
