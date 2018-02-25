package com.ifpb.edu.jpa.mapeamento.bidirecional;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author jozimar
 */
@Entity
public class Departamento implements Serializable {
    
    @Id
    @GeneratedValue
    private int id;
    
    @Column(unique = true)
    private int numero;
    
    @Column(unique = true)
    private String nome;
    
    @OneToMany(mappedBy = "departamento")
    private List<Empregado> empregados;
    
    @OneToOne
    private Empregado gerente;
    
    @OneToMany
    private List<Projeto> projetos;
    
    public Departamento() {
    }
    
    public Departamento(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        this.empregados = new ArrayList<>();
        this.projetos = new ArrayList<>();
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
    
    public List<Empregado> getEmpregados() {
        return empregados;
    }
    
    public void setEmpregados(List<Empregado> empregados) {
        this.empregados = empregados;
    }
    
    public Empregado getGerente() {
        return gerente;
    }
    
    public void setGerente(Empregado gerente) {
        this.gerente = gerente;
    }
    
    public List<Projeto> getProjetos() {
        return projetos;
    }
    
    public void setProjetos(List<Projeto> projetos) {
        this.projetos = projetos;
    }
    
    public boolean addProjeto(Projeto projeto) {
        return projetos.add(projeto);
    }
    
    public boolean addEmpregado(Empregado empregado) {
        return empregados.add(empregado);
    }
}
