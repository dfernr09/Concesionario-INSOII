/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Almacen;
import Modelo.AlmacenBBDD;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ControladorAlmacen {
    AlmacenBBDD al = new AlmacenBBDD();
    private boolean checkIDPiezas(List<Almacen> lista, int id){
        String id2 = String.valueOf(id);
        boolean res = false;
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getNumPieza().equals(id2)){
                    res = true;
                    }
        }
        return res;
    }
    private void novaPieza(Almacen a){
        al.nuevaPieza(a);
    }
    private boolean usado(int id, ArrayList<Integer> numeros){
       boolean us = false;
       for(int i = 0; i < numeros.size(); i++){
           if(numeros.get(i) == id){
               us = true;
           }
       }
       return us;
   }
    public void realizarPedido(int idCliente, String pieza1, String pieza2, String pieza3, String pieza4, int n1, int n2, int n3, int n4, String marca){
        List<Almacen> l = getTodoAlmacen();
        
        int aux = (int) ( (Math.random() * 800) + 1);
        ArrayList<Integer> used = new ArrayList<Integer>();
        if(pieza1.length() > 1){
            for(int i = 0; i < n1; i++){
                Almacen a = new Almacen();
                a.setDescrPieza(pieza1);
                a.setMarcaPieza(marca);
                a.setNumPedido(idCliente);
                while(checkIDPiezas(l, aux) || usado(aux, used)){
                    aux = (int) ( (Math.random() * 800) + 1);
                }
                a.setNumPieza(String.valueOf(aux));
                used.add(aux);
                novaPieza(a);
            }
        } 
         if(pieza2.length() > 1){
            for(int i = 0; i < n2; i++){
                Almacen a = new Almacen();
                a.setDescrPieza(pieza2);
                a.setMarcaPieza(marca);
                a.setNumPedido(idCliente);
                while(checkIDPiezas(l, aux) || usado(aux, used)){
                    aux = (int) ( (Math.random() * 800) + 1);
                }
                a.setNumPieza(String.valueOf(aux));
                used.add(aux);
                novaPieza(a);
            }
        }
          if(pieza3.length() > 1){
            for(int i = 0; i < n3; i++){
                Almacen a = new Almacen();
                a.setDescrPieza(pieza3);
                a.setMarcaPieza(marca);
                a.setNumPedido(idCliente);
                while(checkIDPiezas(l, aux) || usado(aux, used)){
                    aux = (int) ( (Math.random() * 800) + 1);
                }
                a.setNumPieza(String.valueOf(aux));
                used.add(aux);
                novaPieza(a);
            }
        }
           if(pieza4.length() > 1){
            for(int i = 0; i < n4; i++){
                Almacen a = new Almacen();
                a.setDescrPieza(pieza4);
                a.setMarcaPieza(marca);
                a.setNumPedido(idCliente);
                while(checkIDPiezas(l, aux) || usado(aux, used)){
                    aux = (int) ( (Math.random() * 800) + 1);
                }
                a.setNumPieza(String.valueOf(aux));
                used.add(aux);
                novaPieza(a);
            }
        }
    }
    public List<Almacen> getTodoAlmacen(){
        List<Almacen> l = al.obtenerTodasPiezas();
        return l;
    }
    
    public List<Almacen> getAlmacenMarca(String marca){
        List<Almacen> l = al.buscarPiezasPorMarca(marca);
        return l;
    }
    
    private boolean estaAsignada(ArrayList<String> lista, String pieza){
        boolean asignada = false;
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).equals(pieza)){
                asignada = true;
            }
        }
        return asignada;
    }
    private void eliminarPieza(String numPieza){
        al.eliminarPieza(numPieza);
    }
      
      
    public void asignarPieza(ArrayList<String> nombrePieza, Almacen p, ArrayList<String> piezas){
        String pieza = p.getDescrPieza();
        String numPieza = p.getNumPieza();
        if(!estaAsignada(nombrePieza, numPieza)){
              piezas.add(pieza);
              eliminarPieza(numPieza);
              nombrePieza.add(numPieza);
            JOptionPane.showMessageDialog(null, "Pieza asignada");
        }else{
            JOptionPane.showMessageDialog(null, "Ya has asignado esta pieza");
        }
    }
  
}
