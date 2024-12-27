package org.example.aplicacao; // Pacote onde a classe Programa está localizada

import jakarta.persistence.EntityManager; // Importa a classe EntityManager para gerenciar a persistência
import jakarta.persistence.EntityManagerFactory; // Importa a classe EntityManagerFactory para criar EntityManager
import jakarta.persistence.Persistence; // Importa a classe Persistence para acessar a unidade de persistência

import org.example.dominio.Pessoa; // Importa a classe Pessoa que representa a entidade

public class Programa {

    public static void main(String[] args) {
        // Comentado: Criação de instâncias da entidade Pessoa
        // Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
        // Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
        // Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
        // System.out.println(p1); // Exibe a representação em string de p1
        // System.out.println(p2); // Exibe a representação em string de p2
        // System.out.println(p3); // Exibe a representação em string de p3

        // Criação de uma fábrica de EntityManager a partir da unidade de persistência "exemplo-jpa"
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        // Criação de um EntityManager a partir da fábrica
        EntityManager em = emf.createEntityManager();

        // Comentado: Busca uma Pessoa pelo ID 2
        // Pessoa p = em.find(Pessoa.class, 2);
        // System.out.println(p); // Exibe a Pessoa encontrada

        // Comentado: Remoção da Pessoa com ID 2
        // Pessoa p = em.find(Pessoa.class, 2); // Busca a pessoa
        // em.getTransaction().begin(); // Inicia uma transação
        // em.remove(p); // Remove a pessoa encontrada
        // em.getTransaction().commit(); // Commit da transação

        // Comentado: Persistência de várias instâncias de Pessoa
        // em.getTransaction().begin(); // Inicia uma transação
        // em.persist(p1); // Persiste p1 no banco de dados
        // em.persist(p2); // Persiste p2 no banco de dados
        // em.persist(p3); // Persiste p3 no banco de dados
        // em.getTransaction().commit(); // Commit da transação

        // Mensagem de confirmação de que o programa foi executado até o final
        System.out.println("PRONTO !");
        // Fechamento do EntityManager para liberar os recursos
        em.close();
        // Fechamento da fábrica de EntityManager
        emf.close();
    }
}