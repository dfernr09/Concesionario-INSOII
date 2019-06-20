/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.VehiculosDisponibles;
import Modelo.VehiculosDisponiblesBBDD;
import Modelo.VehiculosVendidos;
import Modelo.VehiculosVendidosBBDD;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ControladorVehiculos {
    VehiculosDisponiblesBBDD vbbdd = new VehiculosDisponiblesBBDD();
    VehiculosVendidosBBDD vvbbdd = new VehiculosVendidosBBDD();
    public List<VehiculosDisponibles> getTodosDisponibles(){
          List<VehiculosDisponibles> listaOficial = vbbdd.obtenerTodosVehiculosDisponibles();
          return listaOficial;
    }
     public List<VehiculosVendidos> getTodosVendidos(){
          List<VehiculosVendidos> listaOficial = vvbbdd.obtenerTodosVehiculosVendidos();
          return listaOficial;
    }
     public VehiculosVendidos ponerEnTaller(List<VehiculosVendidos> l, int pos){
         VehiculosVendidos v = l.get(pos);
         vvbbdd.ponerEnTaller(v.getBastidorNum(), true);
         return v;
     }
       public void ponerEnTaller(int t, int pos){
         vvbbdd.ponerEnTaller(t, false);
       
     }
    
    public void IntroducirVehiculo(String color, String extras, String marca, String matricula, String modelo, String bastidor, String precio){   
        VehiculosDisponibles v = new VehiculosDisponibles();
        v.setColor(color);
        v.setExtras(extras);
        v.setMarca(marca);
        v.setMatricula(matricula);
        v.setModelo(modelo);
        v.setNumBastidor(Integer.valueOf(bastidor));
        v.setPrecio(Integer.valueOf(precio));
        vbbdd.nuevoVehiculoDisponible(v);
    }
     public void IntroducirVehiculoVendido(String color,byte id, String marca, String matricula, String modelo, int bastidor){   
        VehiculosVendidos v = new VehiculosVendidos();
        v.setColor(color);
        v.setMarca(marca);
        v.setMatricula(matricula);
        v.setModelo(modelo);
        v.setBastidorNum(bastidor);
        v.setClienId(id);
        v.setFechaCompra(new Date());
        v.setTaller(false);
        vvbbdd.nuevoVehiculoVendido(v);
    }
    public void eliminarVehiculo(int numBastidor){
        vbbdd.eliminarVehiculoVendido(numBastidor);
    }
    public List<VehiculosVendidos> buscarPorMarca(String marca){
        List<VehiculosVendidos> l = vvbbdd.buscarVehiculoDisponibleMarca(marca);
        return l;
    }
     public int obtenerNumeroVendidos(List<VehiculosVendidos> lista, int year, int mes){
        ArrayList<Date> fechas = new ArrayList<Date>();
        int cont = 0;
        for(int i = 0; i < lista.size(); i++){
            fechas.add(lista.get(i).getFechaCompra());
        }
        year = year - 1900;
            for(int i = 0; i < fechas.size(); i++){
                if(fechas.get(i).getMonth() == mes  && fechas.get(i).getYear() == year){
                    cont++;
                }
            }
            return cont;
    }
     public int obtenerNumeroVendidos(List<VehiculosVendidos> lista, int year, int mes, String modelo){
        ArrayList<Date> fechas = new ArrayList<Date>();
        int cont = 0;
        for(int i = 0; i < lista.size(); i++){
            fechas.add(lista.get(i).getFechaCompra());
        }
        year = year - 1900;
            for(int i = 0; i < fechas.size(); i++){
                if(fechas.get(i).getMonth() == mes  && fechas.get(i).getYear() == year && lista.get(i).getModelo().equals(modelo)){
                    cont++;
                }
            }
            return cont;
    }
     public int obtenerNumeroVendidos(String color,List<VehiculosVendidos> lista, int year, int mes){
        ArrayList<Date> fechas = new ArrayList<Date>();
        int cont = 0;
        for(int i = 0; i < lista.size(); i++){
            fechas.add(lista.get(i).getFechaCompra());
        }
        year = year - 1900;
            for(int i = 0; i < fechas.size(); i++){
                if(fechas.get(i).getMonth() == mes  && fechas.get(i).getYear() == year && lista.get(i).getColor().equals(color)){
                    cont++;
                }
            }
            return cont;
    }
    
    public List<VehiculosVendidos> getFiltradoVendidos(String opcionFiltrado, String busqueda){
        List<VehiculosVendidos> l = null;     
        switch(opcionFiltrado){
            case "Marca":
            l = vvbbdd.buscarVehiculoDisponibleMarca(busqueda);
            break;
            case "Modelo":
            l = vvbbdd.buscarVehiculoDisponibleModelo(busqueda);
            break;
            case "Color":
            l = vvbbdd.buscarVehiculoDisponibleColor(busqueda);
            break;
            case "Matricula":
            l = vvbbdd.buscarVehiculoDisponibleMatricula(busqueda);
            break;
            case "Numero Bastidor":
            l = new ArrayList<VehiculosVendidos>();
            l.add(vvbbdd.buscarVehiculoVendido(Integer.valueOf(busqueda)));
            break;
        }
        
        return l;
    }
    
    public List<VehiculosDisponibles> getFiltrado(String opcionFiltrado, String busqueda){
        List<VehiculosDisponibles> l = null;
        
        switch(opcionFiltrado){
            case "Marca":
                l = vbbdd.buscarVehiculoDisponibleMarca(busqueda);
                break;
            case "Modelo":
                l = vbbdd.buscarVehiculoDisponibleModelo(busqueda);
                break;
            case "Color":
                l = vbbdd.buscarVehiculoDisponibleColor(busqueda);
                break;
        }
        return l;
    }
    public void backUp(JFrame jf){
              int res;
              JFileChooser chooser = new JFileChooser();
              res = chooser.showSaveDialog(jf);
              if(res == JFileChooser.APPROVE_OPTION){
               try {
                   File bu = new File(String.valueOf(chooser.getSelectedFile().toString()+".sql"));
                   FileWriter fw = new FileWriter(bu);

            Process p = Runtime
                  .getRuntime()
                  .exec("C:/wamp64/bin/mysql/mysql5.7.19/bin/mysqldump --opt --password= --user=root --databases concesionario -R");

           InputStreamReader is = new InputStreamReader(p.getInputStream());
           BufferedReader br = new BufferedReader(is);
           String line;
           while((line=br.readLine()) != null){
               fw.write(line + "\n");
           }
           fw.close();
           is.close();
           br.close();
         } catch (Exception e) {
            e.printStackTrace();
         }
          }
              JOptionPane.showMessageDialog(null, "Backup realizado!");
    }
}
