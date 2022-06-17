
package clases;


public class SetGet_Inventario {
    int idproducto;
    int cantidadtotal;
    int preciototal;
    int idinventario;
//constructor
    public SetGet_Inventario(){
    }
    //metodos get
    public int getidinventario(){
    return idinventario;
    }
    public  int getidproducto(){
    return idproducto;
    }
    public int getcantidadtotal(){
    return cantidadtotal;
    }
    public int getpreciototal(){
    return preciototal;
    }
    //metodo set
    
    public void setidproducto(int idproducto){
    this.idproducto=idproducto;
    }
    
    public void setcantidadtotal(int cantidadtotal){
    this.cantidadtotal=cantidadtotal;
    }
    
    public void setpreciototal(int preciototal){
    this.preciototal=preciototal;
    }
    public void setidinventario(int idinventario){
    this.idinventario=idinventario;
    }
}
