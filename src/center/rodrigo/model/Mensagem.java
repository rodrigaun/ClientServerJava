package center.rodrigo.model;

import java.io.Serializable;

public class Mensagem implements Serializable {

    private String nome;
    private String endereco;
    private int numero;
    private byte[] imagem;

    /* GETs and SETs */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        return this.nome + "\n" + this.endereco + " " + this.numero + 
                "\nImgSize: " + imagem.length;
    }
}
