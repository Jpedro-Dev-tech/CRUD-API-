# API REST de Produtos

API REST desenvolvida com **Java e Spring Boot**, com o objetivo de praticar o desenvolvimento de aplicações backend, operações CRUD e integração com banco de dados MySQL.

## Sobre o projeto

Esta aplicação permite gerenciar produtos por meio de requisições HTTP, utilizando a arquitetura em camadas para separar as responsabilidades da aplicação.

O projeto foi desenvolvido como parte dos meus estudos em Java e Spring Boot, buscando aprofundar meus conhecimentos em desenvolvimento backend.

## Tecnologias utilizadas

- **Java 25**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **MySQL**
- **Maven**
- **IntelliJ IDEA**
- **Linux (Ubuntu)**

## Funcionalidades

A aplicação segue o padrão CRUD:

| Método HTTP | Funcionalidade | Endpoint |
|---|---|---|
| GET | Listar produtos | `/produtos` |
| POST | Cadastrar produto | `/produtos` |
| PUT | Atualizar produto | `/produtos/{id}` |
| DELETE | Excluir produto | `/produtos/{id}` |

## Exemplo de cadastro

Requisição:

`POST /produtos`

Corpo JSON:

```json
{
  "nome": "Notebook",
  "preco": "2000",
  "quantidade": "10"
}
```

## Arquitetura do projeto

A aplicação utiliza a separação em camadas:

- **Controller:** recebe e responde às requisições HTTP.
- **Service:** concentra as regras de negócio.
- **Repository:** realiza as operações de persistência utilizando Spring Data JPA.
- **Model:** representa a entidade Produto.

Fluxo da aplicação:

```text
Cliente HTTP
     |
     v
 Controller
     |
     v
  Service
     |
     v
 Repository
     |
     v
    MySQL
```

## Banco de dados

A aplicação utiliza MySQL para armazenar os dados dos produtos.

A integração é realizada por meio do Spring Data JPA e Hibernate.

As configurações de conexão devem ser definidas no arquivo `application.properties`.

## Como executar o projeto

1. Clone o repositório:

```bash
git clone URL_DO_REPOSITORIO
```

2. Entre na pasta do projeto:

```bash
cd nome-do-projeto
```

3. Configure a conexão com o MySQL no arquivo `application.properties`.

4. Execute a aplicação pelo IntelliJ IDEA ou utilizando o Maven:

```bash
./mvnw spring-boot:run
```

5. A API estará disponível em:

`http://localhost:8080`

## Objetivos de aprendizagem

Durante o desenvolvimento deste projeto, pratiquei:

- Criação de APIs REST.
- Utilização de anotações do Spring Boot.
- Mapeamento de requisições HTTP.
- Injeção de dependências.
- Separação entre Controller, Service e Repository.
- Operações CRUD.
- Integração entre Spring Boot e MySQL.
- Persistência de dados com Spring Data JPA.
- Testes de requisições HTTP utilizando o IntelliJ HTTP Client.

## Status do projeto

Em desenvolvimento.

O projeto faz parte da minha jornada de aprendizado em Java e desenvolvimento backend.

## Aceito melhorias e sugestões 