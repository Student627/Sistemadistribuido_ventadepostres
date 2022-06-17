
package clases;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class servidor extends Observable implements Runnable{ //extends Observable implements Runnable es para que el metodo sea observable
    //siempre tiene que llevar el metodo override
    private int puerto; //variable privada
    
    //constructor
    public servidor(int puerto){
    this.puerto=puerto; //puerto por el cual se conectara
    }
    
    @Override
    public void run() {
        ServerSocket servidor = null; // libreria de servidor
        Socket sc = null; //libreria para socket ademas del socket del cliente
        // los datastream crean puentes para la conexion.
        DataInputStream in;//datos de entrada//cliente-servidor
        

        try {
            servidor = new ServerSocket(puerto); //sentencia que conecta el servidor con el puerto
            System.out.println("Servidor iniciado"); //mensaje de si se conecto
            //while para que el servidor siempre este escuchando
            while (true) {
                sc = servidor.accept();// hace que el servidor se quede a la espera ademas es el socket del cliente

                System.out.println("cliente conectado");
                //se crean los puentes que dan sockets los datos ya se obtiene del socket
                in = new DataInputStream(sc.getInputStream());
                

                String mensaje = in.readUTF(); //mensaje se queda en la espera

                System.out.println(mensaje);//mensaje que se recibe de parte del cliente
                // aqui mandamos lo que se ha notificado 
                this.setChanged(); //avisa que habra un cambio
                this.notifyObservers(mensaje);//manda el mensaje
                this.clearChanged();//limpia los cambio
                

                sc.close();//se cierra el cliente
                System.out.println("cliente desconectado");

            }
        } catch (IOException ex) {
            Logger.getLogger(servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

