package clases;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class cliente implements Runnable {

    private int host;
    private int puerto;//variable privada
    private String mensaje;//variable privada
    //constructor

    public cliente(int puerto, String mensaje) {
        this.puerto = puerto;
        this.mensaje = mensaje;
    }

    @Override
    public void run() {
        final String HOST = "192.168.43.165"; //la direccion IP de la maquina a conectar 127.0.0.1
        // los datastream crean puentes para la conexion.
        DataOutputStream out;//datos de salida//servidor-cliente
        try {
            Socket sc = new Socket(HOST, puerto);//socket para conectar debe llevar la direccion y el puerto

            //se crean los puentes que dan sockets los datos ya se obtiene del socket
            out = new DataOutputStream(sc.getOutputStream());

            out.writeUTF(mensaje);//mensaje que envia el cliente

            sc.close();//cierra la conexion 
        } catch (IOException ex) {
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
