package com.ifpb.edu.jpa.mapeamento.bidirecional;

import com.ifpb.edu.jpa.mapeamento.bidirecional.Departamento;
import com.ifpb.edu.jpa.mapeamento.bidirecional.Empregado;
import com.ifpb.edu.jpa.mapeamento.bidirecional.Projeto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-02-19T23:19:08")
@StaticMetamodel(TrabalhaEmProjeto.class)
public class TrabalhaEmProjeto_ { 

    public static volatile SingularAttribute<TrabalhaEmProjeto, Integer> horas;
    public static volatile SingularAttribute<TrabalhaEmProjeto, Empregado> empregado;
    public static volatile SingularAttribute<TrabalhaEmProjeto, Projeto> projeto;
    public static volatile SingularAttribute<TrabalhaEmProjeto, Departamento> departamento;
    public static volatile SingularAttribute<TrabalhaEmProjeto, Integer> id;

}