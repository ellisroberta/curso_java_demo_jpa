# Projeto de Estudos sobre JPA

Este projeto é um exemplo básico de uso da Java Persistence API (JPA) com Hibernate e MySQL.
O objetivo é demonstrar a criação, persistência, busca e remoção de entidades usando JPA.

## Tecnologias Utilizadas

- **Java 17**: Linguagem de programação utilizada.
- **Maven**: Sistema de gerenciamento de projetos usado para gerenciar dependências.
- **Hibernate**: Implementação de JPA para persistência de dados.
- **MySQL**: Sistema de gerenciamento de banco de dados relacional utilizado para armazenamento.

## Estrutura do Projeto

```
curso_java_demo_jpa/
├── .idea/
├── application/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   ├── org/
│   │   │   │   │   ├── example/
│   │   │   │   │   │   ├── aplicacao/
│   │   │   │   │   │   │   └── Programa.java
│   │   │   │   │   │   └── dominio/
│   │   │   │   │   │       └── Pessoa.java
│   │   │   ├── resources/
│   │   │   │   └── META-INF/
│   │   │   │       └── persistence.xml
│   ├── pom.xml
├── target/
└── README.md
```

## Configuração do Ambiente

1. **Clone o Repositório**:

   ```bash
   git clone https://github.com/ellisroberta/curso_java_demo_jpa.git
   cd curso_java_demo_jpa
   ```

2. **Configuração do Banco de Dados**:
   - Crie um banco de dados no MySQL chamado `aulajpa`.
   - Atualize as credenciais (usuário e senha) no arquivo `persistence.xml`.

3. **Compilação do Projeto**:
   - Navegue até o diretório do projeto e use o Maven para compilar:

    ```bash
   mvn clean install
   ```
       
4. **Execução do Projeto**:
   - Após a compilação, você pode executar a classe `Programa` para ver as operações de persistência em ação.
   - O programa inclui exemplos comentados de como criar, buscar e remover entidades `Pessoa`.
    

## Exemplos de Uso:

- Criação de novas instâncias da classe `Pessoa`.
- Persistência de instâncias no banco de dados.
- Busca de instâncias por ID.
- Remoção de instâncias do banco de dados.