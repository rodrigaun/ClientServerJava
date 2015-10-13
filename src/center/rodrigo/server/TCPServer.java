package center.rodrigo.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import center.rodrigo.model.Mensagem;

public class TCPServer {

    private int port = 15000;
    private Socket socket;
    private ServerSocket serverSocket;
    private ObjectInputStream objectIn;
    private ObjectOutputStream objectOut;
    private Mensagem msg;

    public TCPServer() {
        try {
            System.out.println("___S E R V I D O R___");
            System.out.println("IP: " + InetAddress.getLocalHost().getHostAddress() + "\n");
            this.serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        while (true) {
            try {
                socket = serverSocket.accept();
                objectIn = new ObjectInputStream(socket.getInputStream());
                msg = (Mensagem) objectIn.readObject();
                System.out.println(msg.toString());

                objectOut = new ObjectOutputStream(socket.getOutputStream());
                objectOut.writeObject(new String("OK"));
                objectOut.close();
                socket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
