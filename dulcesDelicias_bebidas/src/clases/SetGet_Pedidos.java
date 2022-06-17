
package clases;


public class SetGet_Pedidos {
    
    int idpedido, idproducto, cantidad;
    String nombre;
    
    //constructor
    public SetGet_Pedidos(){    
    }
    
    //Metodos Get
    public int getidpedido(){
    return idpedido;
    }
    
    public int getidproducto(){
    return idproducto;
    }
    
    public int getcantidad(){
    return cantidad;
    }
    
    public String getnombre(){
    return nombre;
    }
    
    //Metodos Set
    
    public void setidpedido(int idpedido) {
        this.idpedido = idpedido;
    }
    
    public void setidproducto(int idproducto) {
        this.idproducto = idproducto;
    }
    
    public void setcantidad(int cantidad){
        this.cantidad= cantidad;
    }
    
    public void setnombre(String nombre){
        this.nombre= nombre;
    }
}
