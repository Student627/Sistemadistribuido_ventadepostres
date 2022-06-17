package clases;

public class SetGet_Usuarios {
    
    //variables de la base de datos
    String user;
    String pass;
    
    //constructor
    public SetGet_Usuarios(){
    }
    
    //Metodos Get

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }
    
    //Metodos Sett

    public void setUser(String user) {
        this.user = user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
