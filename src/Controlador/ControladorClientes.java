/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Clientes;
import Modelo.ClientesBBDD;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ControladorClientes {
    ClientesBBDD vbbdd = new ClientesBBDD();
    public List<Clientes> getTodosDisponibles(){
          List<Clientes> listaOficial = vbbdd.obtenerTodosClientes();
          return listaOficial;
    }
    
    public byte introducirCliente(String marcaCoche, String modeloCoche, String apellidos, String correo, String direccion, String nombre, String nif, String telefono){
        byte idCliente = 0;
        List<Clientes> listaC = vbbdd.obtenerTodosClientes();
        int existe = existeCliente(Integer.valueOf(nif), listaC);
        String historial = "";
        if(existe != -1){
            if(listaC.get(existe).getClienHistorialCompras().isEmpty()){
                historial = marcaCoche+" "+modeloCoche;
                vbbdd.actualizarHistorialCompras(listaC.get(existe).getClienId(), historial);
            }else{
                historial = listaC.get(existe).getClienHistorialCompras() + "," + marcaCoche+" "+modeloCoche;
                vbbdd.actualizarHistorialCompras(listaC.get(existe).getClienId(), historial);
            }
            idCliente = listaC.get(existe).getClienId();
        }else{
            Clientes c = new Clientes();    
            idCliente = (byte) ((byte) (Math.random() * 100) + 1);

            while(checkID(listaC, idCliente)){
                idCliente = (byte) ((byte) (Math.random() * 100) + 1);
            }
            c.setClienApellido(apellidos);
            c.setClienId(idCliente);
            c.setClienCorreo(correo);
            c.setClienDireccion(direccion);
            c.setClienEdad((byte)23);
            c.setClienNombre(nombre);
            c.setClienPasaporte(Integer.valueOf(nif));
            c.setTelefono(telefono);
            c.setClienHistorialCompras(marcaCoche+" "+modeloCoche);
            vbbdd.nuevoCliente(c);
        }
    
       return idCliente;
    }
    
    private int existeCliente(int dni, List<Clientes> lista){
        int indice = -1;
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getClienPasaporte() == dni){
                indice = i;
                break;
            }
        }
        return indice;
    }
    
    private boolean checkID(List<Clientes> lista, byte id){
        boolean res = false;
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getClienId() == id){
                    res = true;
                    }
        }
        return res;
    }
    
    public void actualizarCliente( String seleccionado, byte id){
        String op = null;
        switch(seleccionado){
               case "Teléfono":
                   op = JOptionPane.showInputDialog(null, "Introduce el nuevo teléfono: ");
                   this.vbbdd.actualizarTelefono(id, op);
                   break;
               case "Correo":
                   op = JOptionPane.showInputDialog(null, "Introduce el nuevo correo: ");
                    this.vbbdd.actualizarCorreo(id, op);
                   break;
               case "Direccion":
                   op = JOptionPane.showInputDialog(null, "Introduce la nueva direccion: ");
                   this.vbbdd.actualizarDireccion(id, op);
                   break;
           
           }
    }
    
    public List<Clientes> getTodosFiltrado(String opcionFiltrado, String busqueda){
         List<Clientes> l = null;
             
        switch(opcionFiltrado){
            case "ID Cliente":
                l = new ArrayList<Clientes>();
                l.add(vbbdd.buscarCliente(Byte.parseByte(busqueda)));
                break;
            case "NIF":
                 l = vbbdd.buscarClienteNIF(Integer.parseInt(busqueda));
                 break;
            case "Nombre":
                 l = vbbdd.buscarClienteNombre(busqueda);
                 break; 
            case "Apellidos":
                l = vbbdd.buscarClienteApellido(busqueda);
                break;
            case "Teléfono":
                l = vbbdd.buscarClienteTelefono(busqueda);
                break;
        }
        return l;
    }
    
    public void eliminarCliente(byte id){
        vbbdd.eliminarCliente(id); 
    }
}
