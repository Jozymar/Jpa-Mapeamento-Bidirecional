package com.ifpb.edu.jpa.mapeamento.bidirecional;

import com.ifpb.edu.jpa.mapeamento.bidirecional.Departamento;
import com.ifpb.edu.jpa.mapeamento.bidirecional.Endereco;
import com.ifpb.edu.jpa.mapeamento.bidirecional.TrabalhaEmProjeto;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-02-19T23:19:08")
@StaticMetamodel(Empregado.class)
public class Empregado_ { 

    public static volatile SingularAttribute<Empregado, Endereco> endereco;
    public static volatile SingularAttribute<Empregado, Double> salario;
    public static volatile SingularAttribute<Empregado, Integer> numeroSeguroSocial;
    public static volatile SingularAttribute<Empregado, Departamento> departamento;
    public static volatile SingularAttribute<Empregado, String> nome;
    public static volatile SingularAttribute<Empregado, Integer> id;
    public static volatile SingularAttribute<Empregado, String> sexo;
    public static volatile ListAttribute<Empregado, TrabalhaEmProjeto> horasTrabalhadas;
    public static volatile SingularAttribute<Empregado, LocalDate> dataDeNascimento;

}