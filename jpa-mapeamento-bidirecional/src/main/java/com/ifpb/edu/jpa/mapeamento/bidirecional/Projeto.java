package com.ifpb.edu.jpa.mapeamento.bidirecional;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author jozimar
 */
@Entity
public class Projeto implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column(unique = true)
    private int numero;

    @Column(unique = true)
    private String nome;

    @Column(unique = true)
    private String localizacao;

    public Projeto() {
    }

    public Projeto(int numero, String nome, String localizacao) {
        this.numero = numero;
        this.nome = nome;
        this.localizacao = localizacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
