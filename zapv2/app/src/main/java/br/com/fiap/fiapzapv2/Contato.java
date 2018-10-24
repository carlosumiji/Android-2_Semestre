package br.com.fiap.fiapzapv2;

import java.io.Serializable;

public class Contato implements Serializable{

    private String nome;
    private String telefone;
    private int imagem;
    private String status;

    public Contato() {
    }

    public Contato(String nome, String telefone, int imagem, String status) {
        this.nome = nome;
        this.telefone = telefone;
        this.imagem = imagem;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
