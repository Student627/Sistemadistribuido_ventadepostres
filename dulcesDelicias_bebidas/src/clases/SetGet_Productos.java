package clases;


public class SetGet_Productos {
    
    //Variables de la base de datos
    int idProducto;
    String NombreProducto;
    int PrecioUnitario;
    String Categoria;
    String Fecha;
    private byte [] foto;
    
    //Constructor
    public SetGet_Productos(){
    }
    
    //Metodos Get

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public int getPrecioUnitario() {
        return PrecioUnitario;
    }

    public String getCategoria() {
        return Categoria;
    }

    public String getFecha() {
        return Fecha;
    }

    public byte[] getFoto() {
        return foto;
    }

    
    //metodos set

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public void setPrecioUnitario(int PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    
}
