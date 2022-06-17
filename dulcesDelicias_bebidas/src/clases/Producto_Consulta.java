/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Wendy
 */
public class Producto_Consulta extends javax.swing.JInternalFrame {

    /**
     * Creates new form Producto_Consulta
     */
    public Producto_Consulta() {
        initComponents();
        
        Tablas xd = new Tablas();
        xd.verProductos(tabla, "");
    }
    int totalx = 0;

    public int total(){
        Tablas xd = new Tablas();
        this.totalx = xd.verProductos(tabla, "");
        return totalx;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txtbuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        verTablaxd = new javax.swing.JButton();
        total = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        imagen2 = new javax.swing.JLabel();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta un producto ");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        txtbuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 91, 85, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Código");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 94, -1, -1));

        buscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buscar.setText("Busca");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(666, 90, -1, -1));

        limpiar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 137, 147, -1));

        verTablaxd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        verTablaxd.setText("Ver Tabla");
        verTablaxd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verTablaxdActionPerformed(evt);
            }
        });
        getContentPane().add(verTablaxd, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 184, 147, -1));

        total.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        total.setText("Total de productos");
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 231, -1, -1));

        exit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        exit.setText("Regresar");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 278, 147, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dulcesdeliciasadsasda.jpg"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(539, 315, 140, 130));

        imagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondooxD1.jpeg"))); // NOI18N
        getContentPane().add(imagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 770, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        Tablas xD = new Tablas();
        String x = txtbuscar.getText();
        int busca = Integer.parseInt(txtbuscar.getText());
        int cont = xD.verProductos(tabla, "");
        if(busca <= cont)
            xD.verProductos(tabla, x);
        else
            JOptionPane.showMessageDialog(null, "El producto no existe");
//        String busca = txtbuscar.getText();
//        Tablas xD = new Tablas();
//        xD.verProductos(tabla, busca);

    }//GEN-LAST:event_buscarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
        txtbuscar.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void verTablaxdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verTablaxdActionPerformed
        // TODO add your handling code here:
        Tablas xd = new Tablas();
        xd.verProductos(tabla, "");
    }//GEN-LAST:event_verTablaxdActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
        Tablas xd = new Tablas();
        this.totalx = xd.verProductos(tabla, "");
        JOptionPane.showMessageDialog(null, "El total de productos es de: "+totalx);
    }//GEN-LAST:event_totalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JButton exit;
    private javax.swing.JLabel imagen2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiar;
    private javax.swing.JLabel logo;
    private javax.swing.JTable tabla;
    private javax.swing.JButton total;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JButton verTablaxd;
    // End of variables declaration//GEN-END:variables
}
