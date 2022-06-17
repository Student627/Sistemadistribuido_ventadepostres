package clases;

public class SetGet_Pagos {
     //variables
    int idPago;
    int idEmpleado;
    int monto;
    int horasExtras;
    String fecha;
    
    //constructor
    public SetGet_Pagos(){
    }
    //get
     public int getPago() {
        return idPago;
    }
     
      public int getEmpleado() {
        return idEmpleado;
    }
      
    public int getmonto() {
        return monto;
    }
    
     public int getHorasExtras() {
        return idEmpleado;
    }
     
     
     public String getFecha() {
        return fecha;
    }
  
    //set 
     public void setIdPago(int idPago) {
        this.idPago = idPago;
    }
     
     public void setidEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
     
     public void setIdmonto(int monto) {
        this.monto = monto;
    }
     
     public void sethorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }
     
     public void setfecha(String fecha) {
        this.fecha = fecha;
    }
}
