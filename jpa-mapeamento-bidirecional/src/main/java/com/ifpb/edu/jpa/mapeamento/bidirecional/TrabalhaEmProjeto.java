package com.ifpb.edu.jpa.mapeamento.bidirecional;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author jozimar
 */
@Entity
public class TrabalhaEmProjeto implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    
    private int horas;

    @ManyToOne
    private Empregado empregado;

    @ManyToOne
    private Departamento departamento;

    @ManyToOne
    private Projeto projeto;

    public TrabalhaEmProjeto() {
    }

    public TrabalhaEmProjeto(int horas, Empregado empregado, Departamento departamento, Projeto projeto) {
        this.horas = horas;
        this.empregado = empregado;
        this.departamento = departamento;
        this.projeto = projeto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public Empregado getEmpregado() {
        return empregado;
    }

    public void setEmpregado(Empregado empregado) {
        this.empregado = empregado;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
}
