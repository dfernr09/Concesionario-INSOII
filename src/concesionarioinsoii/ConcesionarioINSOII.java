/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionarioinsoii;

import Controlador.VehiculosVendidosBBDD;
import Modelo.VehiculosVendidos;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ConcesionarioINSOII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        VehiculosVendidosBBDD vbbdd = new VehiculosVendidosBBDD();
        vbbdd.ponerEnTaller(65130, false);
           
    }
    
}
