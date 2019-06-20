/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.PedidoBBDD;
import Modelo.Pedidos;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class ControladorPedidos {
    PedidoBBDD pbbdd = new PedidoBBDD();
    
    public void introPedido(String tipo, String marca, String usuario, int id){ 
        Pedidos p = new Pedidos();
        p.setDescrPedido(marca);
        p.setLoginEmpleado(usuario);
        p.setNumPedido(id);
        p.setTipoPedido(tipo);
        pbbdd.nuevoPedido(p);
    }
    public List<Pedidos> getPedidoFiltrado(String opcionFiltrado, String busqueda){
        List<Pedidos> l = null;
        
        switch(opcionFiltrado){
            case "Numero Pedido":
                l = new ArrayList<Pedidos>();
                l.add(pbbdd.buscarPedido(Integer.parseInt(busqueda)));
                break;
            case "Login Empleado":
                 l = pbbdd.buscarPedidoLogin(busqueda);
                 break;
          
        }
        return l;
    }
    public String generarMatricula(){
        Random r = new Random();
        String letras[] = { "B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S"
                ,"T", "V", "W", "X", "Y", "Z"};
        
        String lMatricula[] = new String[3];
        
        for(int i = 0; i < lMatricula.length; i++){
            lMatricula[i] = letras[r.nextInt(letras.length-1)];
        }
        
        int n = r.nextInt(8999)+1000;
        String ns = Integer.toString(n);
        
        String matricula = lMatricula[0]+lMatricula[1]+lMatricula[2]+"-"+ns;
        return matricula;
    }
    
    public int generarPrecio(String marca, String modelo){
         int precio = 10000;
       if(marca.equals("BMW")){
           precio+=15000;
           switch(modelo){
               case "330":
                   precio += 20000;
                   break;
               case "320":
                   precio += 10000;
                   break;
               case "X3":
                   precio += 15000;
                   break;
               case "X5":
                   precio += 25000;
                   break;
           }
       }
       if(marca.equals("Audi")){
           precio += 12000;
           switch(modelo){
               case "A5":
                   precio += 8500;
                   break;
               case "A7":
                   precio += 17000;
                   break;
               case "Q5":
                   precio += 15000;
                   break;
               case "A3":
                   precio += 6000;
                   break;
           }
       }
          if(marca.equals("Seat")){
           precio += 2000;
           switch(modelo){
               case "Ibiza":
                   precio += 2500;
                   break;
               case "Leon":
                   precio += 6000;
                   break;
               case "Ateca":
                   precio += 4500;
                   break;
               case "Arona":
                   precio += 4000;
                   break;
           }
       }
          if(marca.equals("Volswaguen")){
           precio += 8000;
           switch(modelo){
               case "Polo":
                   precio += 3000;
                   break;
               case "Golf":
                   precio += 7000;
                   break;
               case "Passat":
                   precio += 6000;
                   break;
               case "Tiguan":
                   precio += 5000;
                   break;
           }
       }
       
       return precio;
    }
    public void eliminarPedido(int numPedido){
        pbbdd.eliminarPedido(numPedido);
    }
    public int getID(List<Pedidos> lista){
        int idCliente = (int) ( (Math.random() * 200) + 1);
        while(checkID(lista, idCliente)){
            idCliente = (int)((Math.random() * 200) + 1);
        }
        return idCliente;
    }
    private boolean checkID(List<Pedidos> lista, int id){
        boolean res = false;
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getNumPedido() == id){
                    res = true;
                    }
        }
        return res;
    }
       
    public List<Pedidos> getTodosPedidos(){
        List<Pedidos> l = pbbdd.obtenerTodosPedidos();
        return l;
    }
    
}
