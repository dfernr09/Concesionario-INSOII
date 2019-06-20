/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.InfoRevisiones;
import Modelo.InfoRevisionesBBDD;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladorRevisiones {
    InfoRevisionesBBDD vbbdd = new InfoRevisionesBBDD();
    
    public void introRevision(int bastidor, String descripcion, String usuario, String piezas, int precio, byte id){
            InfoRevisiones ir = new InfoRevisiones();
            ir.setBastidorNum(bastidor);
            ir.setDescripcion(descripcion);
            ir.setFechaRev(new Date());
            ir.setLoginEmpleado(usuario);
            ir.setPiezas(piezas);
            ir.setPrecioRev(precio);
            ir.setRevId(id);
            this.vbbdd.nuevaRevision(ir);
    }
    
    
    public String componerPiezas(ArrayList<String> piezas){
       String piez = "";
        for(int i= 0; i < piezas.size(); i++){
            piez = piez+piezas.get(i)+",";
        }
        piez = piez.substring(0, piez.length()-1);
        return piez;
    }
    
    public int cocheEnReparacion(int numBastidor, List<InfoRevisiones> lista){
        int indice = -1;
        int i = 0;
        while(i < lista.size()){
            if(lista.get(i).getBastidorNum() == numBastidor){
                indice = i;
            }
            i++;
        }
        return indice;
    }
    
    public byte getID(List<InfoRevisiones> l){
        byte idCliente = (byte) ( (byte)(Math.random() * 120) + 1);
        
        while(checkID(l, idCliente) ){
            idCliente = (byte)((byte)(Math.random() * 120) + 1);
        }
        return idCliente;
    }
    
    private boolean checkID(List<InfoRevisiones> lista, byte id){
        boolean res = false;
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getRevId() == id){
                    res = true;
                    }
        }
        return res;
    }
    
    public List<InfoRevisiones> getTodasRevisiones(){
        List<InfoRevisiones> l = null;
        l = vbbdd.obtenerTodasRevisiones();
        return l;
    }
    
    public List<InfoRevisiones> getFiltrado(String busqueda, String opcionFiltrado){
        List<InfoRevisiones> l = null;
        switch(opcionFiltrado){
            case "ID Revision":
            l = new ArrayList<InfoRevisiones>();
            l.add(vbbdd.buscarRevision(Byte.parseByte(busqueda)));
            break;
            case "Empleado":
            l = vbbdd.buscarRevisionEmpleado(busqueda);
            break;
            case "Numero Bastidor":
            l = vbbdd.buscarRevisionBastidor(Integer.parseInt(busqueda));
            break;  
        }
        return l;
    }
    
    public void eliminarRev(byte id){
        this.vbbdd.eliminarRevision(id);
    }
}
