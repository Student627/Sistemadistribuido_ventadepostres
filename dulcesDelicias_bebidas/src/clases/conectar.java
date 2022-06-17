package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conectar {

    //conectar la base de datos
    Connection conectar = null;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/bebidasdulcesdelicias?user=root&password=");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.print(e.getMessage());
        }
        return conectar;
    }

    

    //Guarda Productos
    public void guardaProductos(SetGet_Productos uwu) {
        Connection cn = conexion();
        PreparedStatement pst = null;
        String sql = "INSERT INTO productos (idProducto, NombreProducto, PrecioUnitario, FechaCaducidad, Imagen) "
                + "VALUES (?,?,?,?,?)";
        try {
            pst = cn.prepareStatement(sql);
            pst.setInt(1, uwu.getIdProducto());
            pst.setString(2, uwu.getNombreProducto());
            pst.setInt(3, uwu.getPrecioUnitario());
            pst.setString(4, uwu.getFecha());
            pst.setBytes(5, uwu.getFoto());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Ingresado Correctamente");
        } catch (SQLException ex) {
            System.out.println("A " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Este producto ya se encuentra registrado");
        } catch (Exception e) {
            System.out.println("B " + e.getMessage());
        }
    }

    //Modificar Producto
    public void modificaProducto1(SetGet_Productos vo) {
        Connection cn = conexion();
        PreparedStatement pst = null;
        String sql = "UPDATE productos SET NombreProducto = ?, PrecioUnitario = ?, FechaCaducidad = ?, Imagen = ?\n"
                + "WHERE idProducto = ?";
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, vo.getNombreProducto());
            pst.setInt(2, vo.getPrecioUnitario());
            pst.setString(3, vo.getFecha());
            pst.setBytes(4, vo.getFoto());
            pst.setInt(5, vo.getIdProducto());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Modificado Correctamente");
        } catch (SQLException ex) {
            System.out.println("A " + ex.getMessage());
        } catch (Exception e) {
            System.out.println("B " + e.getMessage());
        }
    }

    public void modificaProducto2(SetGet_Productos vo) {
        Connection cn = conexion();
        PreparedStatement pst = null;
        String sql = "UPDATE productos SET NombreProducto = ?, PrecioUnitario = ?, FechaCaducidad = ?\n"
                + "WHERE idProducto = ?";
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, vo.getNombreProducto());
            pst.setInt(2, vo.getPrecioUnitario());
            pst.setString(3, vo.getFecha());
            pst.setInt(4, vo.getIdProducto());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Modificado Correctamente");
        } catch (SQLException ex) {
            System.out.println("A " + ex.getMessage());
        } catch (Exception e) {
            System.out.println("B " + e.getMessage());
        }
    }

    //Elimina un producto
    public void Eliminar_Producto(SetGet_Productos vo) {
        Connection cn = conexion();
        String sql = "DELETE FROM productos WHERE idProducto = ?;";
        PreparedStatement ps = null;
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, vo.getIdProducto());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se elimino correctamente");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
            } catch (Exception ex) {
            }
        }
    }
    
    
    
    //guardar empleado
    public void guardaEmpleados(SetGet_Empleados uwu) {
        Connection cn = conexion();
        PreparedStatement pst = null;
        String sql = "INSERT INTO empleados (idEmpleado, Nombre, Direccion, Telefono, RFC) "
                + "VALUES (?,?,?,?,?)";
        try {
            pst = cn.prepareStatement(sql);
            pst.setInt(1, uwu.getIdEmpleado());
            pst.setString(2, uwu.getNombre());
            pst.setString(3, uwu.getDireccion());
            pst.setString(4, uwu.getTelefono());
            pst.setString(5, uwu.getRFC());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Ingresado Correctamente");
        } catch (SQLException ex) {
            System.out.println("A " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Este empleado ya se encuentra registrado");
        } catch (Exception e) {
            System.out.println("B " + e.getMessage());
        }
    }
    
        //Modificar Empleado
    public void modificaEmpleado(SetGet_Empleados vo) {
        Connection cn = conexion();
        PreparedStatement pst = null;
        String sql = "UPDATE empleados SET Nombre = ?, Direccion = ?, Telefono = ?, RFC = ?\n"
                + "WHERE idEmpleado = ?";
        try {
            pst = cn.prepareStatement(sql);            
            pst.setString(1, vo.getNombre());
            pst.setString(2, vo.getDireccion());
            pst.setString(3, vo.getTelefono());
            pst.setString(4, vo.getRFC());
            pst.setInt(5, vo.getIdEmpleado());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Modificado Correctamente");
        } catch (SQLException ex) {
            System.out.println("A " + ex.getMessage());
        } catch (Exception e) {
            System.out.println("B " + e.getMessage());
        }
    }
    
        //dale matarile al empleado xD
    public void Eliminar_Empleados(SetGet_Empleados vo) {
        Connection cn = conexion();
        String sql = "DELETE FROM empleados WHERE idEmpleado = ?;";
        PreparedStatement ps = null;
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, vo.getIdEmpleado());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se elimino correctamente");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
            } catch (Exception ex) {
            }
        }
    }
    
    //guardar pago
    public void guardaPago(SetGet_Pagos uwu) {
        Connection cn = conexion();
        PreparedStatement pst = null;
        String sql = "INSERT INTO pagos (idPago, idEmpleado, Monto, HorasExtra, fecha) "
                + "VALUES (?,?,?,?,?)";
        try {
            pst = cn.prepareStatement(sql);
            pst.setInt(1, uwu.getPago());
            pst.setInt(2, uwu.getEmpleado());
            pst.setInt(3, uwu.getmonto());
            pst.setInt(4, uwu.getHorasExtras());
            pst.setString(5, uwu.getFecha());            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Ingresado Correctamente");
        } catch (SQLException ex) {
            System.out.println("A " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Este pago ya se encuentra registrado");
        } catch (Exception e) {
            System.out.println("B " + e.getMessage());
        }
    }
    
     //Guarda Pedidos
    public void guardaPedidos(SetGet_Pedidos uwu) {
        Connection cn = conexion();
        PreparedStatement pst = null;
        String sql = "INSERT INTO pedidos (idPedido, idProducto, Cantidad, NombreProducto) "
                + "VALUES (?,?,?,?)";
        try {
            pst = cn.prepareStatement(sql);
            pst.setInt(1, uwu.getidpedido());
            pst.setInt(2, uwu.getidproducto());
            pst.setInt(3, uwu.getcantidad());
            pst.setString(4, uwu.getnombre());            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Ingresado Correctamente");
        } catch (SQLException ex) {
            System.out.println("A " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Este pedido ya se encuentra registrado");
        } catch (Exception e) {
            System.out.println("B " + e.getMessage());
        }
    }
    
     //Guarda venta
    public void guardaVenta(SetGet_Venta uwu) {
        Connection cn = conexion();
        PreparedStatement pst = null;
        String sql = "INSERT INTO ventas (idVenta, idProducto, idPedido, TotalVenta) "
                + "VALUES (?,?,?,?)";
        try {
            pst = cn.prepareStatement(sql);
            pst.setInt(1, uwu.getidventa());
            pst.setInt(2, uwu.getidpedido());
            pst.setInt(3, uwu.getidproducto());
            pst.setInt(4, uwu.getventa());            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Ingresado Correctamente");
        } catch (SQLException ex) {
            System.out.println("A " + ex.getMessage());
        } catch (Exception e) {
            System.out.println("B " + e.getMessage());
        }
    }

}
