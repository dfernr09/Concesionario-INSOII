/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Empleados;
import Modelo.EmpleadosBBDD;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ControladorEmpleados {
    EmpleadosBBDD abbdd = new EmpleadosBBDD();
    
    public Empleados obtenerEmpleadoLogin(List<Empleados> lista, String usuario, String pass){
        Empleados e = null;
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getEmUsuario().equals(usuario)){
                for(int j = 0; j < lista.size(); j++){
                    if(lista.get(j).getEmPassword().equals(pass)){
                        if(lista.get(i).getEmUsuario().equals(lista.get(j).getEmUsuario())){
                            e = lista.get(i);
                            break;
                        }
                    }
                }
            }
        }
        return e;
    }
    
    public void introducirEmpleado(byte edad, String nombre, int nomina, String pass, String poblacion
                            ,String rol, int id, int telefono, String usuario){
        Empleados e = new Empleados();
        e.setEmAntiguedad((byte)0);      
        e.setEmEdad(edad);
        e.setEmNombre(nombre);
        e.setEmNominaBase(nomina);
        e.setEmPassword(pass);
        e.setEmPoblacion(poblacion);
        e.setEmRol(rol);
        e.setEmSsn(id);
        e.setEmTelefono(telefono);
        e.setEmUsuario(usuario);
        this.abbdd.nuevoEmpleado(e);
    }
    
    public int getID(List<Empleados> l){
        int idCliente = (int)(Math.random() * 12000) + 1;
        
        while(checkID(l, idCliente) ){
           idCliente = (int)(Math.random() * 12000) + 1;
        }
        
        return idCliente;
    }
    
   
    private boolean checkID(List<Empleados> lista, int id){
        boolean res = false;
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getEmSsn() == id){
                    res = true;
                    }
        }
        return res;
    }
    
    public List<Empleados> getTodosEmpleados(){
        List<Empleados> l = null;
        l = abbdd.obtenerTodosEmpleados();
        return l;
    }
    
    public List<Empleados> getFiltrado(String busqueda, String opcionFiltrado){
         List<Empleados> l = null;
          
        switch(opcionFiltrado){
            case "SSN":
            l = new ArrayList<Empleados>();
            l.add(this.abbdd.buscarEmpleado(Integer.parseInt(busqueda)));
            break;
            case "Nombre":
            l = abbdd.buscarEmpleadoNombre(busqueda);
            break;
            case "Usuario":
            l = abbdd.buscarEmpleadoUsuario(busqueda);
            break;
            
        }
        return l;
    }
    
    public void actualizarEmpleado(String seleccionado, int ssn){
        String op = null;
         switch(seleccionado){
               case "Teléfono":
                   op = JOptionPane.showInputDialog(null, "Introduce el nuevo teléfono: ");
                   this.abbdd.actualizarTelefono(ssn, Integer.parseInt(op));
                   break;
               case "Contraseña":
                   op = JOptionPane.showInputDialog(null, "Introduce la nueva contraseña: ");
                   this.abbdd.actualizarPassword(ssn, op);
                   break;
               case "Usuario":
                   op = JOptionPane.showInputDialog(null, "Introduce el nuevo nombre de usuario: ");
                   this.abbdd.actualizarUsuario(ssn, op);
                   break;
               case "Nómina":
                   op = JOptionPane.showInputDialog(null, "Introduce la nueva nómina: ");
                   this.abbdd.actualizarNomina(ssn, Integer.parseInt(op));
                   break;
               case "Población":
                   op = JOptionPane.showInputDialog(null, "Introduce la nueva población: ");
                   this.abbdd.actualizarPoblacion(ssn, op);
                   break;
           }
    }
    
    public void eliminarEmpleado(int ssn){
        this.abbdd.eliminarEmpleado(ssn);
    }
}
