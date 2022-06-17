/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Wendy
 */
public class Producto_Modifica extends javax.swing.JInternalFrame {

    /**
     * Creates new form Producto_Modifica
     */
    public Producto_Modifica() {
        initComponents();
        Tablas x = new Tablas();
        x.verProductos(tabla, "");
    }
    
    int codigo = 0;

    public void modificar(int id, String nombre, int precio, String fecha, File imagen){
        SetGet_Productos vo = new SetGet_Productos();
        conectar cc = new conectar();
        Connection cn = cc.conexion();
        
        vo.setIdProducto(id);
        vo.setNombreProducto(nombre);
        vo.setPrecioUnitario(precio);
        vo.setFecha(fecha);
        
        try{
            byte[] icono = new byte[(int) imagen.length()];
            InputStream input = new FileInputStream(imagen);
            input.read(icono);
            vo.setFoto(icono);
        }catch(Exception ex){
            vo.setFoto(null);
        }
        cc.modificaProducto1(vo);
    }
    
    public void modificar2(int id, String nombre, int precio, String fecha){
        SetGet_Productos vo = new SetGet_Productos();
        conectar cc = new conectar();
        Connection cn = cc.conexion();
        
        vo.setIdProducto(id);
        vo.setNombreProducto(nombre);
        vo.setPrecioUnitario(precio);
        vo.setFecha(fecha);

        cc.modificaProducto2(vo);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        seleccionar = new javax.swing.JButton();
        lbimagen = new javax.swing.JLabel();
        actualiza = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        lbruta = new javax.swing.JLabel();
        lblogo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Modifica un producto");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 20)); // NOI18N
        jLabel1.setText("Detalles del producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, -1));

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
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 16, 470, 520));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("idProducto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 57, -1, -1));

        txtid.setEditable(false);
        txtid.setBackground(new java.awt.Color(255, 204, 204));
        txtid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 54, 139, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 89, -1, -1));

        txtnom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 86, 139, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Precio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 121, -1, -1));

        txtprecio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 118, 139, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Imagen");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, -1));

        seleccionar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        seleccionar.setText("Seleccionar");
        seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(seleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, -1, -1));
        getContentPane().add(lbimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 210, 160));

        actualiza.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        actualiza.setText("Actualizar");
        actualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizaActionPerformed(evt);
            }
        });
        getContentPane().add(actualiza, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, -1, -1));

        limpiar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 510, -1, -1));

        exit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        exit.setText("Regresar");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 510, -1, -1));

        lbruta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(lbruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, 290, 29));

        lblogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dulcesdeliciasadsasda.jpg"))); // NOI18N
        getContentPane().add(lblogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 140, 120));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Fecha cad");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, -1, -1));

        txtfecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 140, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondooxD1.jpeg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-340, 0, 1150, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarActionPerformed
        // TODO add your handling code here:
        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fil = new FileNameExtensionFilter("JPG, PNG & GIF","jpg","png","gif");
        j.setFileFilter(fil);
        
        int s = j.showOpenDialog(this);
        if(s == JFileChooser.APPROVE_OPTION){
            String ruta = j.getSelectedFile().getAbsolutePath();
            lbruta.setText(ruta);
            
            Image imagen = getToolkit().getImage(lbruta.getText());
            imagen = imagen.getScaledInstance(lbimagen.getWidth(), lbimagen.getHeight(), Image.SCALE_DEFAULT);
            lbimagen.setIcon(new ImageIcon(imagen));
        }
    }//GEN-LAST:event_seleccionarActionPerformed

    private void actualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizaActionPerformed
        // TODO add your handling code here:
        Tablas xD = new Tablas();
        int id = Integer.parseInt(txtid.getText());
        String nombre = txtnom.getText();
        int precio = Integer.parseInt(txtprecio.getText());
        String fecha = txtfecha.getText();
        File imagen = new File(lbruta.getText());
        
        if(imagen!=null){
            this.modificar(id, nombre, precio, fecha, imagen);
            xD.verProductos(tabla, "");
        }else{
            this.modificar2(id, nombre, precio, fecha);
            xD.verProductos(tabla, "");
        }
    }//GEN-LAST:event_actualizaActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
        txtid.setText("");
        txtnom.setText("");
        txtprecio.setText("");
        lbimagen.setText("");
        lbruta.setText("");
        lbimagen.setIcon(null);
        txtfecha.setText("");
        Tablas x = new Tablas();
        x.verProductos(tabla, "");
    }//GEN-LAST:event_limpiarActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
        int clic = tabla.rowAtPoint(evt.getPoint());
        
        codigo = (int)tabla.getValueAt(clic, 0);
        String nombre = ""+tabla.getValueAt(clic, 1);
        int precio = (int)tabla.getValueAt(clic, 2);
        String fecha = ""+tabla.getValueAt(clic, 3);
        
        txtid.setText(String.valueOf(codigo));
        txtnom.setText(nombre);
        txtprecio.setText(String.valueOf(precio));
        txtfecha.setText(fecha);
        lbruta.setText("");
        lbimagen.setIcon(null);
        lbimagen.setText("");
    }//GEN-LAST:event_tablaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualiza;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbimagen;
    private javax.swing.JLabel lblogo;
    private javax.swing.JLabel lbruta;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton seleccionar;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}