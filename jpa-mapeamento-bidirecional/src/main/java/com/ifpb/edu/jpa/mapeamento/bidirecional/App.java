package com.ifpb.edu.jpa.mapeamento.bidirecional;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author jozimar
 */
public class App {

    public static void main(String[] args) {

        EntityManager em = Persistence
                .createEntityManagerFactory("persistencia")
                .createEntityManager();

        Projeto projeto = new Projeto(1, "DAC", "IFPB");
        Projeto projeto2 = new Projeto(2, "Segurança", "IF");

        Endereco endereco = new Endereco("Cachoeira PB", "Pedras Pretas", "Zona Rural", 0);
        Endereco endereco2 = new Endereco("Cajazeiras PB", "Agrovila", "Zona Urbana", 30);

        Departamento departamento = new Departamento(1, "Vendas");
        Departamento departamento2 = new Departamento(2, "Finanças");

        Empregado empregado = new Empregado("João", 11111, endereco, 500D, Sexo.MASCULINO, LocalDate.now());
        Empregado empregado2 = new Empregado("Maria", 22222, endereco2, 800D, Sexo.FEMININO, LocalDate.now());

        TrabalhaEmProjeto trabalhaEmProjeto = new TrabalhaEmProjeto(20, empregado, departamento, projeto);
        TrabalhaEmProjeto trabalhaEmProjeto2 = new TrabalhaEmProjeto(25, empregado2, departamento2, projeto2);

        empregado.addTrabalhaEmProjetos(trabalhaEmProjeto);
        empregado.setDepartamento(departamento);
        empregado2.addTrabalhaEmProjetos(trabalhaEmProjeto2);
        empregado2.setDepartamento(departamento2);

        departamento.setGerente(empregado);
        departamento.addProjeto(projeto);
        departamento.addEmpregado(empregado);

        departamento2.setGerente(empregado2);
        departamento2.addProjeto(projeto2);
        departamento2.addEmpregado(empregado2);

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(empregado2);
        em.persist(departamento);
        em.persist(departamento2);
        em.persist(empregado);
        em.persist(projeto);
        em.persist(projeto2);
        em.persist(trabalhaEmProjeto);
        em.persist(trabalhaEmProjeto2);
        transaction.commit();

    }

}
