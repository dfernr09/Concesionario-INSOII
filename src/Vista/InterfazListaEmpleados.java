/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorEmpleados;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import Modelo.Empleados;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class InterfazListaEmpleados extends javax.swing.JFrame {

    /**
     * Creates new form InterfazAsignarPiezas
     */
    public InterfazListaEmpleados(Empleados e) {
        initComponents();
        this.e = e;
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.jTextField1.setText("");
        ce = new ControladorEmpleados();
        this.lista = ce.getTodosEmpleados();
        this.modelo =(DefaultTableModel) this.jTable1.getModel();
        Object[] fila = new Object[10];
        for(int i = 0; i < this.lista.size(); i++){
            fila[0] = this.lista.get(i).getEmSsn();
            fila[1] = this.lista.get(i).getEmNombre();
            fila[2] = this.lista.get(i).getEmPoblacion();
            fila[3] = this.lista.get(i).getEmPassword();
            fila[4] = this.lista.get(i).getEmAntiguedad();
            fila[5] = this.lista.get(i).getEmNominaBase();
            fila[6] = this.lista.get(i).getEmTelefono();
            fila[7] = this.lista.get(i).getEmEdad();
            fila[8] = this.lista.get(i).getEmUsuario();
            fila[9] = this.lista.get(i).getEmRol();
            this.modelo.addRow(fila);
        }
        this.jTable1.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SSN", "Nombre", "Poblacion", "Contraseña", "Antiguedad", "Nomina", "Teléfono", "Edad", "Usuario", "Rol"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("LISTA DE EMPLEADOS");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtrar por", "SSN", "Nombre", "Usuario" }));

        jTextField1.setText("jTextField1");

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton13.setText("Buscar");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 255, 102));
        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton13)
                        .addGap(184, 184, 184)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton13))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(jButton2)))))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        try{
        String opcionFiltrado = (String) this.jComboBox1.getSelectedItem();
        String busqueda = this.jTextField1.getText();
        this.modelo.setRowCount(0);
        List<Empleados> l = ce.getFiltrado(busqueda, opcionFiltrado);
        Object[] fila = new Object[10];
        for(int i = 0; i < l.size(); i++){
            fila[0] = l.get(i).getEmSsn();
            fila[1] = l.get(i).getEmNombre();
            fila[2] = l.get(i).getEmPoblacion();
            fila[3] = l.get(i).getEmPassword();
            fila[4] = l.get(i).getEmAntiguedad();
            fila[5] = l.get(i).getEmNominaBase();
            fila[6] = l.get(i).getEmTelefono();
            fila[7] = l.get(i).getEmEdad();
            fila[8] = l.get(i).getEmUsuario();
            fila[9] = l.get(i).getEmRol();
            this.modelo.addRow(fila);
        }
        this.lista = l;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error",  "No se pudo realizar la consulta", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        this.modelo.setRowCount(0);
        List<Empleados> l = ce.getTodosEmpleados();
        Object[] fila = new Object[10];
        for(int i = 0; i < l.size(); i++){
            fila[0] = l.get(i).getEmSsn();
            fila[1] = l.get(i).getEmNombre();
            fila[2] = l.get(i).getEmPoblacion();
            fila[3] = l.get(i).getEmPassword();
            fila[4] = l.get(i).getEmAntiguedad();
            fila[5] = l.get(i).getEmNominaBase();
            fila[6] = l.get(i).getEmTelefono();
            fila[7] = l.get(i).getEmEdad();
            fila[8] = l.get(i).getEmUsuario();
            fila[9] = l.get(i).getEmRol();
            this.modelo.addRow(fila);
        }

        this.lista = l;
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        InterfazNuevoEmpleado in = new InterfazNuevoEmpleado(this.e);
        in.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int r = this.jTable1.getSelectedRow();
         if(r == -1){
           JOptionPane.showMessageDialog(null, "Debes seleccionar un empleado");
       }else{
           
           String[] opciones = {"Teléfono", "Contraseña", "Usuario", "Nómina", "Población"};
           JComboBox jcb = new JComboBox(opciones);
           JOptionPane.showMessageDialog(null, jcb, "Especifica el valor que quieres modificar", JOptionPane.QUESTION_MESSAGE);
           ce.actualizarEmpleado((String)jcb.getSelectedItem(), this.lista.get(r).getEmSsn());
           JOptionPane.showMessageDialog(null, "Empleado actualizado!");
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int r = this.jTable1.getSelectedRow();
        
        if(r == -1){
            JOptionPane.showMessageDialog(null, "Debes seleccionar un empleado");
        }else{
            ce.eliminarEmpleado(this.lista.get(r).getEmSsn());
            JOptionPane.showMessageDialog(null, "Empleado eliminado");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    private List<Empleados> lista;
    DefaultTableModel modelo;
    ControladorEmpleados ce;
    private Empleados e;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
