package center.rodrigo.model;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.File;

import javax.imageio.ImageIO;

public class MensagemFakeFactory {

    public static Mensagem getMensagem() {
        Mensagem m = new Mensagem();
        try {
            m.setNome("Homer Simpson");
            m.setEndereco("Evergreen Terrace");
            m.setNumero(742);

            BufferedImage bufferedImage = ImageIO.read(new File("homer.png"));
            WritableRaster raster = bufferedImage.getRaster();
            DataBufferByte data = (DataBufferByte) raster.getDataBuffer();
            m.setImagem(data.getData());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return m;
    }
}
