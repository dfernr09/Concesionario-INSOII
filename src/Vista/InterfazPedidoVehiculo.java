/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Impresora;
import Controlador.PedidoBBDD;
import Controlador.VehiculosDisponiblesBBDD;
import Modelo.Empleados;
import Modelo.Pedidos;
import Modelo.VehiculosDisponibles;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class InterfazPedidoVehiculo extends javax.swing.JFrame {

    /**
     * Creates new form InterfazPedidoVehiculo
     */
    public InterfazPedidoVehiculo(Empleados e) {
        this.e = e;
        this.setResizable(false);
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfNumeroBastidor = new javax.swing.JTextField();
        tfMatricula = new javax.swing.JTextField();
        tfPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfMarca = new javax.swing.JTextField();
        tfModelo = new javax.swing.JTextField();
        tfColor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfExtras = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jbGenerarBastidor = new javax.swing.JButton();
        jbGenerarMatricula = new javax.swing.JButton();
        tfColor1 = new javax.swing.JTextField();
        tfColor2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jbEstimarPrecio = new javax.swing.JButton();
        jbConfirmarPedido = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Número de Bastidor");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Matrícula");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Marca");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Modelo");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Precio");

        tfNumeroBastidor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tfMatricula.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tfPrecio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Color");

        tfMarca.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tfModelo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tfColor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Datos del vehículo");

        tfExtras.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfExtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfExtrasActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Extras");

        jbGenerarBastidor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbGenerarBastidor.setText("Generar");
        jbGenerarBastidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGenerarBastidorActionPerformed(evt);
            }
        });

        jbGenerarMatricula.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbGenerarMatricula.setText("Generar");
        jbGenerarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGenerarMatriculaActionPerformed(evt);
            }
        });

        tfColor1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tfColor2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Número de pedido");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Fecha de Expedición");

        jbEstimarPrecio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbEstimarPrecio.setText("Estimar");
        jbEstimarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEstimarPrecioActionPerformed(evt);
            }
        });

        jbConfirmarPedido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbConfirmarPedido.setText("Confirmar");
        jbConfirmarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tfColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                        .addComponent(tfColor2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(229, 229, 229))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfExtras)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel6)
                                            .addComponent(tfMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                            .addComponent(tfPrecio))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jbGenerarMatricula)
                                            .addComponent(jbEstimarPrecio))
                                        .addGap(108, 108, 108)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfModelo)
                                            .addComponent(tfColor)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel5))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(tfNumeroBastidor, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jbGenerarBastidor)))
                                        .addGap(108, 108, 108)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfMarca)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addGap(59, 59, 59)))
                        .addGap(36, 36, 36))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbConfirmarPedido)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbGenerarBastidor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfNumeroBastidor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGenerarMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfColor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEstimarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfExtras, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfColor2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jbConfirmarPedido)
                .addContainerGap())
        );

        jPanel3.setForeground(new java.awt.Color(102, 0, 204));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Expedición de vehículo");

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
                .addGap(364, 364, 364)
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
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfExtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfExtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfExtrasActionPerformed

    private void jbGenerarBastidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGenerarBastidorActionPerformed
        // TODO add your handling code here:
         Random r = new Random();
        int nBastidor = r.nextInt(100000)+10000;
        String nBast = Integer.toString(nBastidor);
        this.tfNumeroBastidor.setText(nBast);
    }//GEN-LAST:event_jbGenerarBastidorActionPerformed

    private void jbGenerarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGenerarMatriculaActionPerformed
        // TODO add your handling code here:
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
        this.tfMatricula.setText(matricula);
    }//GEN-LAST:event_jbGenerarMatriculaActionPerformed

    private void jbEstimarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEstimarPrecioActionPerformed
        // TODO add your handling code here:
        int precio = 10000;
       if(this.tfMarca.equals("BMW")){
           precio+=15000;
           switch(this.tfModelo.getText()){
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
       if(this.tfMarca.equals("Audi")){
           precio += 12000;
           switch(this.tfModelo.getText()){
               case "A5":
                   precio += 8500;
                   break;
               case "A7":
                   precio += 17000;
                   break;
               case "Q5":
                   precio += 15000;
                   break;
               case "X7":
                   precio += 22000;
                   break;
           }
       }
          if(this.tfMarca.equals("Seat")){
           precio += 2000;
           switch(this.tfModelo.getText()){
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
          if(this.tfMarca.equals("Volswaguen")){
           precio += 8000;
           switch(this.tfModelo.getText()){
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
          
       String p = Integer.toString(precio);
       this.tfPrecio.setText(p);
    }//GEN-LAST:event_jbEstimarPrecioActionPerformed

    private void jbConfirmarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarPedidoActionPerformed
        // TODO add your handling code here:
        try{
        VehiculosDisponiblesBBDD vbbdd = new VehiculosDisponiblesBBDD();
        VehiculosDisponibles v = new VehiculosDisponibles();
        v.setColor(this.tfColor.getText());
        v.setExtras(this.tfExtras.getText());
        v.setMarca(this.tfMarca.getText());
        v.setMatricula(this.tfMatricula.getText());
        v.setModelo(this.tfModelo.getText());
        v.setNumBastidor(Integer.valueOf(this.tfNumeroBastidor.getText()));
        v.setPrecio(Integer.valueOf(this.tfPrecio.getText()));
        vbbdd.nuevoVehiculoDisponible(v);
        
        Pedidos p = new Pedidos();
        
        p.setDescrPedido(this.tfMarca.getText());
        p.setLoginEmpleado(this.e.getEmUsuario());
       p.setNumPedido(idCliente);
       p.setTipoPedido("Vehiculo");
       pbbdd.nuevoPedido(p);
        JOptionPane.showMessageDialog(null, "Operación confirmada");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error",  "Por favor, comprueba tus datos", JOptionPane.ERROR_MESSAGE);
        }

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

    private boolean checkID(List<Pedidos> lista, int id){
        boolean res = false;
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getNumPedido() == id){
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbConfirmarPedido;
    private javax.swing.JButton jbEstimarPrecio;
    private javax.swing.JButton jbGenerarBastidor;
    private javax.swing.JButton jbGenerarMatricula;
    private javax.swing.JTextField tfColor;
    private javax.swing.JTextField tfColor1;
    private javax.swing.JTextField tfColor2;
    private javax.swing.JTextField tfExtras;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfMatricula;
    private javax.swing.JTextField tfModelo;
    private javax.swing.JTextField tfNumeroBastidor;
    private javax.swing.JTextField tfPrecio;
    // End of variables declaration//GEN-END:variables
}
