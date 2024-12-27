package org.example.dominio; // Pacote onde a classe Pessoa está localizada

import jakarta.persistence.*; // Importa todas as anotações do pacote Jakarta Persistence
import java.io.Serial; // Importa a classe Serial
import java.io.Serializable; // Importa a interface Serializable

@Entity // Indica que esta classe é uma entidade JPA
public class Pessoa implements Serializable { // Implementa Serializable para a classe ser serializável

    @Serial // Anotação para indicar que o campo é a versão de serialização
    private static final long serialVersionUID = 1L; // Versão da serialização

    @Id // Indica que este campo é a chave primária da entidade
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Geração da chave primária pelo banco de dados
    @Column(name = "ID") // Mapeia o campo para a coluna "ID" na tabela
    private Integer id; // Identificador da pessoa

    @Column(name = "Nome Completo") // Mapeia o campo para a coluna "Nome Completo" na tabela
    private String nome; // Nome completo da pessoa

    @Column(name = "E-mail") // Mapeia o campo para a coluna "E-mail" na tabela
    private String email; // E-mail da pessoa

    // Construtor padrão (necessário para JPA)
    public Pessoa() {
    }

    // Construtor que inicializa os campos da entidade
    public Pessoa(Integer id, String name, String email) {
        this.id = id;
        this.nome = name;
        this.email = email;
    }

    // Métodos getters e setters para acessar e modificar os campos
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método toString para representar a entidade como uma string
    @Override
    public String toString() {
        return "Pessoa {" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}