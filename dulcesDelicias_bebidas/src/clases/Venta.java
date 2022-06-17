/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class Venta extends javax.swing.JInternalFrame {

    /**
     * Creates new form Venta
     */
    public Venta() {
        initComponents();
        Tablas xd = new Tablas();
        xd.verProductos(tabla, "");
    }

    public void agregarventa(int idventa, int idProducto, int idpedido, int totaventa) {
        SetGet_Venta vo = new SetGet_Venta();
        conectar cc = new conectar();
        Connection cn = cc.conexion();

        vo.setidventa(idventa);
        vo.setidpedido(idProducto);
        vo.setidproducto(idpedido);
        vo.setventa(totaventa);

        cc.guardaVenta(vo);
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
        txt_idventa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_idproducto = new javax.swing.JTextField();
        txt_pedido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        venta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        total = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Nueva Venta");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ID venta>");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 22, -1, -1));
        getContentPane().add(txt_idventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 22, 92, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID producto>");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 68, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("ID pedido>");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 106, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Total venta>");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 182, -1, -1));
        getContentPane().add(txt_idproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 68, 92, -1));

        txt_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pedidoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_pedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 106, 92, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Cantidad>");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 144, -1, -1));
        getContentPane().add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 144, 92, -1));

        venta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 182, 91, 24));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 22, -1, 352));

        total.setText("Calcular total");
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 224, 100, 35));

        registrar.setText("Registrar venta");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        getContentPane().add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 277, 107, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dulcesdeliciasadsasda.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 140, 110));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/f9.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-330, -50, 1120, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        String precio = "", cantidad = "";
        String idproducto = txt_idproducto.getText();
        String idpedido = txt_pedido.getText();
        String cantt = txt_cantidad.getText();
        int total;
        if (idpedido.equals("")) {
            try {
                conectar cc = new conectar();
                Connection cn = cc.conexion();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM productos where idProducto=?");
                pst.setString(1, txt_idproducto.getText());
                ResultSet r = pst.executeQuery();

                if (r.next()) {
                    precio = r.getString("PrecioUnitario");
                } else {
                    JOptionPane.showMessageDialog(null, "producto no registrado");
                }
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Error");
            }


        } else {
            if (idproducto.equals("") && cantt.equals("")) {
                try {
                    conectar cc = new conectar();
                    Connection cn = cc.conexion();
                    PreparedStatement pst = cn.prepareStatement("SELECT * FROM pedidos where idPedido=?");
                    pst.setString(1, txt_pedido.getText());
                    ResultSet r = pst.executeQuery();

                    if (r.next()) {
                        cantidad = r.getString("Cantidad");
                    } else {
                        JOptionPane.showMessageDialog(null, "sin cantidad");
                    }
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error");
                }

                try {
                    conectar cc = new conectar();
                    Connection cn = cc.conexion();
                    PreparedStatement pst = cn.prepareStatement("SELECT * FROM pedidos where idPedido=?");
                    pst.setString(1, txt_pedido.getText());
                    ResultSet r = pst.executeQuery();

                    if (r.next()) {
                        idproducto = r.getString("idProducto");
                    } else {
                        JOptionPane.showMessageDialog(null, "sin cantidad");
                    }
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error");
                }

                try {
                    conectar cc = new conectar();
                    Connection cn = cc.conexion();
                    PreparedStatement pst = cn.prepareStatement("SELECT * FROM productos where idProducto=?");
                    pst.setString(1, idproducto);
                    ResultSet r = pst.executeQuery();

                    if (r.next()) {
                        precio = r.getString("PrecioUnitario");
                    } else {
                        JOptionPane.showMessageDialog(null, "producto no registrado");
                    }
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error");
                }

                int canti = Integer.parseInt(cantidad);
                int pre = Integer.parseInt(precio);
                total = pre * canti;
                String totall = Integer.toString(total);
                venta.setText(totall);
            }
        }


    }//GEN-LAST:event_totalActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        dispose();

        Tablas xd = new Tablas();
        xd.verProductos(tabla, "");
    }//GEN-LAST:event_SalirActionPerformed

    private void txt_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pedidoActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        //verificacion de los campos
        String idventa1=txt_idventa.getText();
        String idpedido1=txt_pedido.getText();
        if(!idventa1.equals("") || !idpedido1.equals("")){
           //Tomar el id del producto que necesitamos y la cantidad del pedido
           String idproducto1="";
           String cantidad1="";
            try {
                conectar cc = new conectar();
                Connection cn = cc.conexion();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM pedidos where idPedido=?");
                pst.setString(1, txt_pedido.getText());
                ResultSet r = pst.executeQuery();

                if (r.next()) {
                    idproducto1 = r.getString("idProducto");
                    cantidad1 =r.getString("Cantidad");                    
                } else {
                    JOptionPane.showMessageDialog(null, "sin pedido");
                }
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Error");
            }
            //Tomar cantidad de inventario
            String cantidadinventario="";
            try {
                conectar cc = new conectar();
                Connection cn = cc.conexion();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM inventario where idProducto=?");
                pst.setString(1, idproducto1);
                ResultSet r = pst.executeQuery();

                if (r.next()) {
                    cantidadinventario =r.getString("Cantidad");                    
                } else {
                    JOptionPane.showMessageDialog(null, "sin cantidad");
                }
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Error");
            }
            
            //verificar si no excede el inventario el pedido
            int cantidadpedido= Integer.parseInt(cantidad1);
            int cantidadinven= Integer.parseInt(cantidadinventario);
           if(cantidadpedido>cantidadinven){
                JOptionPane.showMessageDialog(null, "error la cantidad del pedido excede el inventario");
            }else{
               int idventa2=Integer.parseInt(idventa1);
               int idproducto2=Integer.parseInt(idproducto1);
               int idpedido2=Integer.parseInt(idpedido1);
               int totalventa=Integer.parseInt(venta.getText());
                this.agregarventa(idventa2, idproducto2, idpedido2, totalventa);
                
                //modificamos inventario
                int cantidadtotal=cantidadinven - cantidadpedido;
                try {

            String ID = idproducto1;
             conectar cc = new conectar();
             Connection cn = cc.conexion();
            PreparedStatement pc = cn.prepareStatement("UPDATE inventario SET Cantidad = ? WHERE idProducto =" + ID + "");

            pc.setInt(1, cantidadtotal);           

            pc.executeUpdate();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error base de datos");
        }
                
                //fin de modificar inventario
                
                
                //ticket
                Document documento = new Document();
                String totalventaa="";
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Dulces Delicias.pdf"));
            documento.open();
            //experimento
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Dulces Delicias \n Localidad: Iguala Guerrero \n Domicilio: Manuel Doblado #56 \n ");
            parrafo.setFont(FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.DARK_GRAY));
            //fin experimento
            
            //experimento fecha
            Date fecha=new Date();                 
            String strDateFormat = "hh: mm: ss a dd-MMM-yyyy"; // El formato de fecha está especificado  
            SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); // La cadena de formato de fecha se pasa como un argumento al objeto                                         
            Paragraph parrafofecha = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add(objSDF.format(fecha) + " \n ");
            parrafo.setFont(FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.DARK_GRAY));
            //fin experiento fecha
            
            //conseguir precio unitarios
            String precio="";
                try {
                    conectar cc = new conectar();
                    Connection cn = cc.conexion();
                    PreparedStatement pst = cn.prepareStatement("SELECT * FROM productos where idProducto=?");
                    pst.setString(1, idproducto1);
                    ResultSet r = pst.executeQuery();

                    if (r.next()) {
                        precio = r.getString("PrecioUnitario");
                    } else {
                        JOptionPane.showMessageDialog(null, "producto no registrado");
                    }
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error");
                }         
                                
            documento.add(parrafo);
            documento.add(parrafofecha);            
            PdfPTable tabla = new PdfPTable(4);
            tabla.addCell("ID venta");
            tabla.addCell("ID producto");
            tabla.addCell("ID pedido");
            tabla.addCell("Total de la venta");

            try {
                conectar cc = new conectar();
                Connection cn = cc.conexion();
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM ventas where idVenta=" + idventa1 + "");                
                ResultSet r = pst.executeQuery();

                if (r.next()) {
                    do{
                    tabla.addCell(r.getString(1));
                    tabla.addCell(r.getString(2));
                    tabla.addCell(r.getString(3));
                    tabla.addCell(r.getString(4));
                    }while(r.next());
                    documento.add(tabla);
                } else {
                    JOptionPane.showMessageDialog(null, "no tabla");
                }
                //experimento
                    Paragraph parrafo1 = new Paragraph();
                    parrafo1.setAlignment(Paragraph.ALIGN_CENTER);
                    parrafo1.add("\n Cantidad de productos llevandos: " + cantidad1 + "\n subtotal: " +precio + "\n Total= " + totalventa);
                    parrafo1.setFont(FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.DARK_GRAY));
                    //fin experimento                    
                    documento.add(parrafo1);                    
            documento.close();
                
            } catch (DocumentException | HeadlessException | SQLException e) {

            }
            
            JOptionPane.showMessageDialog(null, "Ticket creado");
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {

        }
                
                
                
           }   
        }else{
            JOptionPane.showMessageDialog(null, "Error por favor llene los campos id pedido y idventa");
        }
        
    }//GEN-LAST:event_registrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton registrar;
    private javax.swing.JTable tabla;
    private javax.swing.JButton total;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_idproducto;
    private javax.swing.JTextField txt_idventa;
    private javax.swing.JTextField txt_pedido;
    private javax.swing.JLabel venta;
    // End of variables declaration//GEN-END:variables
}