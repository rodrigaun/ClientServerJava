package center.rodrigo.client;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import center.rodrigo.model.Mensagem;

public class TCPClient {

    private String IPServer = "192.168.1.192";
    private int port = 15000;
    private Socket socket;
    private String resposta;
    private ObjectInputStream objectIn;
    private ObjectOutputStream objectOut;

    public void envia(Mensagem m) {
        try {
            // Enviando
            socket = new Socket(IPServer, port);
            objectOut = new ObjectOutputStream(socket.getOutputStream());
            objectOut.writeObject(m);

            // Recebendo
            objectIn = new ObjectInputStream(socket.getInputStream());
            resposta = (String) objectIn.readObject();
            System.out.println("STATUS: " + (resposta.equals("OK") ? "ENVIADO" : "ERRO"));

            objectIn.close();
            objectOut.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
