package center.rodrigo.main;

import center.rodrigo.client.TCPClient;
import center.rodrigo.model.MensagemFakeFactory;

public class MainClient {

    public static void main(String[] args) {

        TCPClient tcpClient = new TCPClient();
        tcpClient.envia(MensagemFakeFactory.getMensagem());

    }

}
