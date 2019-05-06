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
public class PedidoBBDD {
     public void nuevoPedido(Pedidos p){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(p);
        tx.commit();
        session.close();
        sesion.close();
     
    }
    public Pedidos buscarPedido(int numPedido){
        Pedidos pedido;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        pedido = (Pedidos) session.get(Pedidos.class, numPedido);
        tx.commit();
        session.close();
        sesion.close();
        return pedido;
    }
    
    public List<Pedidos> obtenerTodosPedidos(){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Pedidos");
        List<Pedidos> lista = q.list();
        tx.commit();
        session.close();
        sesion.close();

        return lista;
    }
    
      public void eliminarPedido(int numPedido){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Pedidos p;
        p = (Pedidos) session.get(Pedidos.class, numPedido);
        if(p != null){
            session.delete(p);
        }
        
        tx.commit();
        session.close();
        sesion.close();
     
    }
}