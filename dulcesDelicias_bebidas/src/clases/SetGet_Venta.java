
package clases;


public class SetGet_Venta {
    int idventa,idproducto,idpedido,venta;    
    
    
    //constructor
    public SetGet_Venta(){

}
    
    //metodos get
    public int getidventa(){
    return idventa;
    }
    public int getidproducto(){
    return idproducto;
    }
    public int getidpedido(){
    return idpedido;
    }
    public int getventa(){
    return venta;
    }
    
    //metodos set
    
    public void setidventa(int idventa){
    this.idventa=idventa;
    }
    public void setidproducto(int idproducto){
    this.idproducto=idproducto;
    }
    public void setidpedido(int idpedido){
    this.idpedido=idpedido;
    }
    public void setventa(int venta){
    this.venta=venta;
    }
    
}
