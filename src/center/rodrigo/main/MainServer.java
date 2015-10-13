package center.rodrigo.main;

import center.rodrigo.server.TCPServer;

public class MainServer {

    public static void main(String[] args) {
        
        TCPServer tcpServer = new TCPServer();
        tcpServer.run();

    }

}
