
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Servidor_cliente {
    public String getMenss(String n){
    conectar cc = new conectar();
    Connection cn = cc.conexion();

            String sql = n;
            String mensaje = "";
            String nombre,precio;
        
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                nombre = rs.getString("NombreProducto");
                precio = rs.getString("PrecioUnitario");
                mensaje = "el producto es: " + nombre + " tiene un precio de: " + precio;
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
        
    return mensaje;
    }
}
