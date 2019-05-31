/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.AlmacenBBDD;
import Controlador.Impresora;
import Controlador.PedidoBBDD;
import Controlador.VehiculosDisponiblesBBDD;
import Modelo.Almacen;
import Modelo.Empleados;
import Modelo.Pedidos;
import Modelo.VehiculosDisponibles;
import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class InterfazPedidoPiezas extends javax.swing.JFrame{

    /**
     * Creates new form InterfazPedidoVehiculo
     */
    public InterfazPedidoPiezas(Empleados e,String modelo, String marca) {
       this.e = e;
        this.setResizable(false);
        initComponents();
        this.marca = marca;
        this.tfMarca.setText(marca);
        this.tfMarca.setEditable(false);
        this.tfModelo.setText(modelo);
        this.tfModelo.setEditable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pbbdd = new PedidoBBDD();
        this.idCliente = (int) ( (Math.random() * 200) + 1);
        List<Pedidos> listaC = pbbdd.obtenerTodosPedidos();
        while(checkID(listaC, this.idCliente)){
            this.idCliente = (int)((Math.random() * 200) + 1);
        }
      this.tfColor1.setEditable(false);
      this.tfColor1.setText(String.valueOf(this.idCliente));
                this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfMarca = new javax.swing.JTextField();
        tfModelo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfColor1 = new javax.swing.JTextField();
        tfColor2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jbConfirmarPedido = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tfPieza1 = new javax.swing.JTextField();
        tfPieza2 = new javax.swing.JTextField();
        tfPieza4 = new javax.swing.JTextField();
        tfPieza3 = new javax.swing.JTextField();
        jsPieza1 = new javax.swing.JSpinner();
        jsPieza3 = new javax.swing.JSpinner();
        jsPieza2 = new javax.swing.JSpinner();
        jsPieza4 = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Marca");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Modelo");

        tfMarca.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tfModelo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Datos del vehículo");

        tfColor1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tfColor2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Número de pedido");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Fecha de Expedición");

        jbConfirmarPedido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbConfirmarPedido.setText("Confirmar");
        jbConfirmarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarPedidoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Pieza 1");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("Pieza 2");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("Pieza 4");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setText("Pieza 3");

        tfPieza1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tfPieza2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tfPieza4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tfPieza3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel15)
                            .addComponent(jLabel10)
                            .addComponent(tfColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(207, 207, 207)
                        .addComponent(tfColor2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(tfPieza3, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jsPieza3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(tfPieza1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jsPieza1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(534, 534, 534)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tfModelo)
                        .addGap(95, 95, 95))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13)
                            .addComponent(jLabel4)
                            .addComponent(jLabel14)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tfPieza2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jsPieza2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tfPieza4, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jsPieza4))
                            .addComponent(jLabel11))
                        .addGap(0, 58, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbConfirmarPedido)
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsPieza1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfPieza1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfPieza2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jsPieza2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPieza3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPieza4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsPieza3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsPieza4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfColor2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jbConfirmarPedido)
                .addGap(48, 48, 48))
        );

        jPanel3.setForeground(new java.awt.Color(102, 0, 204));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Expedición de pieza");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jButton1))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbConfirmarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarPedidoActionPerformed
        // TODO add your handling code here:
        AlmacenBBDD vbbdd = new AlmacenBBDD();
        List<Almacen> l = vbbdd.obtenerTodasPiezas();
        int aux = (int) ( (Math.random() * 800) + 1);
        ArrayList<Integer> used = new ArrayList<Integer>();
        if(this.tfPieza1.getText().length() > 1){
            for(int i = 0; i < (Integer)this.jsPieza1.getValue(); i++){
                Almacen a = new Almacen();
                a.setDescrPieza(this.tfPieza1.getText());
                a.setMarcaPieza(this.marca);
                a.setNumPedido(idCliente);
                while(checkIDPiezas(l, aux) || usado(aux, used)){
                    aux = (int) ( (Math.random() * 800) + 1);
                }
                a.setNumPieza(String.valueOf(aux));
                used.add(aux);
                vbbdd.nuevaPieza(a);
            }
        } 
         if(this.tfPieza2.getText().length() > 1){
            for(int i = 0; i < (Integer)this.jsPieza2.getValue(); i++){
                Almacen a = new Almacen();
                a.setDescrPieza(this.tfPieza2.getText());
                a.setMarcaPieza(this.marca);
                a.setNumPedido(idCliente);
                while(checkIDPiezas(l, aux) || usado(aux, used)){
                    aux = (int) ( (Math.random() * 800) + 1);
                }
                a.setNumPieza(String.valueOf(aux));
                used.add(aux);
                vbbdd.nuevaPieza(a);
            }
        }
          if(this.tfPieza3.getText().length() > 1){
            for(int i = 0; i < (Integer)this.jsPieza3.getValue(); i++){
                Almacen a = new Almacen();
                a.setDescrPieza(this.tfPieza3.getText());
                a.setMarcaPieza(this.marca);
                a.setNumPedido(idCliente);
                while(checkIDPiezas(l, aux) || usado(aux, used)){
                    aux = (int) ( (Math.random() * 800) + 1);
                }
                a.setNumPieza(String.valueOf(aux));
                used.add(aux);
                vbbdd.nuevaPieza(a);
            }
        }
           if(this.tfPieza4.getText().length() > 1){
            for(int i = 0; i < (Integer)this.jsPieza4.getValue(); i++){
                Almacen a = new Almacen();
                a.setDescrPieza(this.tfPieza4.getText());
                a.setMarcaPieza(this.marca);
                a.setNumPedido(idCliente);
                while(checkIDPiezas(l, aux) || usado(aux, used)){
                    aux = (int) ( (Math.random() * 800) + 1);
                }
                a.setNumPieza(String.valueOf(aux));
                used.add(aux);
                vbbdd.nuevaPieza(a);
            }
        }
        Pedidos p = new Pedidos();
        
        p.setDescrPedido("Piezas para "+this.tfMarca.getText());
        p.setLoginEmpleado(this.e.getEmUsuario());
       p.setNumPedido(idCliente);
       p.setTipoPedido("Piezas");
       pbbdd.nuevoPedido(p);
        JOptionPane.showMessageDialog(null, "Operación confirmada");

    }//GEN-LAST:event_jbConfirmarPedidoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                 PrinterJob pjob = PrinterJob.getPrinterJob();
PageFormat preformat = pjob.defaultPage();
preformat.setOrientation(PageFormat.LANDSCAPE);
PageFormat postformat = pjob.pageDialog(preformat);
//If user does not hit cancel then print.
if (preformat != postformat) {
    //Set print component
    pjob.setPrintable(new Impresora(this), postformat);
    if (pjob.printDialog()) {
        try {
            pjob.print();
        } catch (PrinterException ex) {
            Logger.getLogger(InterfazVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
      
    }//GEN-LAST:event_jButton1ActionPerformed
   private boolean usado(int id, ArrayList<Integer> numeros){
       boolean us = false;
       for(int i = 0; i < numeros.size(); i++){
           if(numeros.get(i) == id){
               us = true;
           }
       }
       return us;
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
    /**
     * @param args the command line arguments
     */
    
     private int idCliente;
     private PedidoBBDD pbbdd;
     private Empleados e;
     private String marca;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbConfirmarPedido;
    private javax.swing.JSpinner jsPieza1;
    private javax.swing.JSpinner jsPieza2;
    private javax.swing.JSpinner jsPieza3;
    private javax.swing.JSpinner jsPieza4;
    private javax.swing.JTextField tfColor1;
    private javax.swing.JTextField tfColor2;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfModelo;
    private javax.swing.JTextField tfPieza1;
    private javax.swing.JTextField tfPieza2;
    private javax.swing.JTextField tfPieza3;
    private javax.swing.JTextField tfPieza4;
    // End of variables declaration//GEN-END:variables

  
}
