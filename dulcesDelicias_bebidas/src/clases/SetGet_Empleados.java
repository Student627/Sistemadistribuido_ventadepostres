package clases;

public class SetGet_Empleados {
    
     //variables
    int idEmpleado;
    String Nombre;
    String Direccion;
    String telefono;
    String RFC;
    String NombreUsuario;
    String contraseña;
    
//constructor
    public SetGet_Empleados(){
    }
    //metodos get
    
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }
    
    public String getTelefono() {
        return telefono;
    }   
    
    public String getRFC() {
        return RFC;
    } 
    
    //metodos set
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
   
   public void setTelefono(String telefono) {
        this.telefono= telefono;
    }
    
 public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    
}
