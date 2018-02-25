package com.ifpb.edu.jpa.mapeamento.bidirecional;

import com.ifpb.edu.jpa.mapeamento.bidirecional.Empregado;
import com.ifpb.edu.jpa.mapeamento.bidirecional.Projeto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-02-19T23:19:08")
@StaticMetamodel(Departamento.class)
public class Departamento_ { 

    public static volatile SingularAttribute<Departamento, Integer> numero;
    public static volatile ListAttribute<Departamento, Projeto> projetos;
    public static volatile SingularAttribute<Departamento, String> nome;
    public static volatile ListAttribute<Departamento, Empregado> empregados;
    public static volatile SingularAttribute<Departamento, Empregado> gerente;

}