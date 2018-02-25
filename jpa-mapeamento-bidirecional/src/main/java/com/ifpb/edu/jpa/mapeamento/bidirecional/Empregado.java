package com.ifpb.edu.jpa.mapeamento.bidirecional;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author jozimar
 */
@Entity
public class Empregado implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false, length = 80)
    private String nome;

    @Column(nullable = false, length = 15)
    private int numeroSeguroSocial;

    @Embedded
    private Endereco endereco;

    @Column(nullable = false)
    private double salario;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @Convert(converter = LocalDateConverter.class)
    private LocalDate dataDeNascimento;

    @ManyToOne
    private Departamento departamento;

    @OneToMany(mappedBy = "empregado")
    private List<TrabalhaEmProjeto> trabalhaEmProjetos;

    public Empregado() {
    }

    public Empregado(String nome, int numeroSeguroSocial, Endereco endereco, double salario, Sexo sexo, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.endereco = endereco;
        this.salario = salario;
        this.sexo = sexo;
        this.dataDeNascimento = dataDeNascimento;
        this.trabalhaEmProjetos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(int numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<TrabalhaEmProjeto> getTrabalhaEmProjetos() {
        return trabalhaEmProjetos;
    }

    public void setTrabalhaEmProjetos(List<TrabalhaEmProjeto> trabalhaEmProjetos) {
        this.trabalhaEmProjetos = trabalhaEmProjetos;
    }

    public boolean addTrabalhaEmProjetos(TrabalhaEmProjeto trabalhaEmProjeto) {
        return trabalhaEmProjetos.add(trabalhaEmProjeto);
    }

}
