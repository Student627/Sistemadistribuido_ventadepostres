package clases;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tablas {
    
    conectar cc = new conectar();
    Connection cn = cc.conexion();
    
    //Listar Productos
    public ArrayList<SetGet_Productos> ListarProducto(String valor){
        ArrayList<SetGet_Productos> lista = new ArrayList<SetGet_Productos>();
        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT * FROM productos";
        } else {
            sql = "SELECT * FROM productos WHERE idProducto ='" + valor + "'";
        }
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                SetGet_Productos vo = new SetGet_Productos();
                vo.setIdProducto(rs.getInt(1));
                vo.setNombreProducto(rs.getString(2));
                vo.setPrecioUnitario(rs.getInt(3));
                vo.setFecha(rs.getString(4));
                vo.setFoto(rs.getBytes(5));
                lista.add(vo);
            }
        }catch(SQLException ex){
            System.out.println("sql "+ex.getMessage());
        }catch(Exception ex){
            System.out.println("tabla "+ ex.getMessage());
        }finally{
            try{
                ps.close();
                rs.close();
            }catch(Exception ex){}
        }
        return lista;
    }
    //Tabla de Productos
    public int verProductos(JTable tabla, String valor){
        
        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        dt.addColumn("idProducto");
        dt.addColumn("NombreProducto");
        dt.addColumn("PrecioUnitario");
        dt.addColumn("FechaCaducidad");
        dt.addColumn("Imagen");
        
        ArrayList<SetGet_Productos> list = ListarProducto(valor);
        SetGet_Productos vo = new SetGet_Productos();
        
        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[5]; 
                vo = list.get(i);
                fila[0] = vo.getIdProducto();
                fila[1] = vo.getNombreProducto();
                fila[2] = vo.getPrecioUnitario();
                fila[3] = vo.getFecha();
                try{
                    byte[] bi = vo.getFoto();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(60, 60, 0));
                    fila[4] = new JLabel(imgi);

                }catch(Exception ex){
                    fila[4] = new JLabel("No imagen");
                }
                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(60);
        }
        int rows = tabla.getRowCount();
        return rows;
    }
    
    
    //Listar Pagos
    public ArrayList<SetGet_Pagos> ListarPagos(String valor){
        ArrayList<SetGet_Pagos> lista = new ArrayList<SetGet_Pagos>();
        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT * FROM pagos";
        } else {
            sql = "SELECT * FROM pagos WHERE idPago ='" + valor + "'";
        }
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                SetGet_Pagos vo = new SetGet_Pagos();
                vo.setIdPago(rs.getInt(1));
                vo.setidEmpleado(rs.getInt(2));
                vo.setIdmonto(rs.getInt(3));
                vo.sethorasExtras(rs.getInt(4));
                vo.setfecha(rs.getString(5));                
                lista.add(vo);
            }
        }catch(SQLException ex){
            System.out.println("sql "+ex.getMessage());
        }catch(Exception ex){
            System.out.println("tabla "+ ex.getMessage());
        }finally{
            try{
                ps.close();
                rs.close();
            }catch(Exception ex){}
        }
        return lista;
    } 
    
    //Tabla de pagos
    public int verPagos(JTable tabla, String valor){
        
        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        dt.addColumn("idPago");
        dt.addColumn("idEmpleado");
        dt.addColumn("Monto");
        dt.addColumn("HorasExtra");
        dt.addColumn("Fecha");        
        
        ArrayList<SetGet_Pagos> list = ListarPagos(valor);
        SetGet_Pagos vo = new SetGet_Pagos();
        
        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[5]; 
                vo = list.get(i);
                fila[0] = vo.getPago();
                fila[1] = vo.getEmpleado();
                fila[2] = vo.getmonto();
                fila[3] = vo.getHorasExtras();
                fila[4] = vo.getFecha();
                
                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(60);
        }
        int rows = tabla.getRowCount();
        return rows;
    }
    
   //Empleados
    public ArrayList<SetGet_Empleados> ListarEmpleado(String valor){
        ArrayList<SetGet_Empleados> lista = new ArrayList<SetGet_Empleados>();
        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT * FROM empleados";
        } else {
            sql = "SELECT * FROM empleados WHERE idEmpleado ='" + valor + "'";
        }
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                SetGet_Empleados vo = new SetGet_Empleados();
                vo.setIdEmpleado(rs.getInt(1));
                vo.setNombre(rs.getString(2));
                vo.setDireccion(rs.getString(3));
                vo.setTelefono(rs.getString(4));
                vo.setRFC(rs.getString(5));
                lista.add(vo);
            }
        }catch(SQLException ex){
            System.out.println("sql "+ex.getMessage());
        }catch(Exception ex){
            System.out.println("tabla "+ ex.getMessage());
        }finally{
            try{
                ps.close();
                rs.close();
            }catch(Exception ex){}
        }
        return lista;
    }
    
    public int verEmpleados(JTable tabla, String valor){
        
        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel de = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        de.addColumn("idEmpleado");
        de.addColumn("NombreEmpleado");
        de.addColumn("Direccion");
        de.addColumn("Telefono");
        de.addColumn("RFC");
        
        
        ArrayList<SetGet_Empleados> list = ListarEmpleado(valor);
        SetGet_Empleados vo = new SetGet_Empleados();
        
        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[5]; 
                vo = list.get(i);
                fila[0] = vo.getIdEmpleado();
                fila[1] = vo.getNombre();
                fila[2] = vo.getDireccion();
                fila[3] = vo.getTelefono();
                fila[4] = vo.getRFC();
                
                
                de.addRow(fila);
            }
            tabla.setModel(de);
            tabla.setRowHeight(60);
        }
        int rows = tabla.getRowCount();
        return rows;
    }
    
    //Listar Pedidos
    public ArrayList<SetGet_Pedidos> ListarPedidos(String valor){
        ArrayList<SetGet_Pedidos> lista = new ArrayList<SetGet_Pedidos>();
        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT * FROM pedidos";
        } else {
            sql = "SELECT * FROM productos WHERE idPedido ='" + valor + "'";
        }
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                SetGet_Pedidos vo = new SetGet_Pedidos();
                vo.setidpedido(rs.getInt(1));
                vo.setidproducto(rs.getInt(2));
                vo.setcantidad(rs.getInt(3));
                vo.setnombre(rs.getString(4));                
                lista.add(vo);
            }
        }catch(SQLException ex){
            System.out.println("sql "+ex.getMessage());
        }catch(Exception ex){
            System.out.println("tabla "+ ex.getMessage());
        }finally{
            try{
                ps.close();
                rs.close();
            }catch(Exception ex){}
        }
        return lista;
    }
    //Tabla de Productos
    public int verPedidos(JTable tabla, String valor){
        
        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        dt.addColumn("idPedido");
        dt.addColumn("idProducto");
        dt.addColumn("Cantidad");
        dt.addColumn("NombreProducto");                
        
        ArrayList<SetGet_Pedidos> list = ListarPedidos(valor);
        SetGet_Pedidos vo = new SetGet_Pedidos();
        
        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[6]; 
                vo = list.get(i);
                fila[0] = vo.getidpedido();
                fila[1] = vo.getidproducto();
                fila[2] = vo.getcantidad();
                fila[3] = vo.getnombre();                
                
                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(60);
        }
        int rows = tabla.getRowCount();
        return rows;
    }
    //Listar inventario
    public ArrayList<SetGet_Inventario> Listarinventario(String valor){
        ArrayList<SetGet_Inventario> lista = new ArrayList<SetGet_Inventario>();
        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT * FROM inventario";
        } else {
            sql = "SELECT * FROM inventario WHERE idProducto ='" + valor + "'";
        }
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                SetGet_Inventario vo = new SetGet_Inventario();
                vo.setidinventario(rs.getInt(1));                
                vo.setidproducto(rs.getInt(2));
                vo.setcantidadtotal(rs.getInt(3));
                vo.setpreciototal(rs.getInt(4));
                
                lista.add(vo);
            }
        }catch(SQLException ex){
            System.out.println("sql "+ex.getMessage());
        }catch(Exception ex){
            System.out.println("tabla "+ ex.getMessage());
        }finally{
            try{
                ps.close();
                rs.close();
            }catch(Exception ex){}
        }
        return lista;
    }
    //Tabla de Productos
    public int verInventario(JTable tabla, String valor){
        
        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };        
        dt.addColumn("idinventario");
        dt.addColumn("idProducto");
        dt.addColumn("Cantidad");
        dt.addColumn("PrecioTotal");
        
        
        ArrayList<SetGet_Inventario> list = Listarinventario(valor);
        SetGet_Inventario vo = new SetGet_Inventario();
        
        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[6]; 
                vo = list.get(i);
                fila[0] = vo.getidinventario();
                fila[1] = vo.getidproducto();
                fila[2] = vo.getcantidadtotal();
                fila[3] = vo.getpreciototal();
                
                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(60);
        }
        int rows = tabla.getRowCount();
        return rows;
    }
}
    
