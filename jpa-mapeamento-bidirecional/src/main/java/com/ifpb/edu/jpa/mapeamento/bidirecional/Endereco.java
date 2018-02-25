package com.ifpb.edu.jpa.mapeamento.bidirecional;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author jozimar
 */
@Embeddable
public class Endereco implements Serializable {

    private String cidade;
    private String rua;
    private String bairro;
    private int numero;

    public Endereco() {
    }

    public Endereco(String cidade, String rua, String bairro, int numero) {
        this.cidade = cidade;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
