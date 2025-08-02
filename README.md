<h1 align="center">Vollmed-API</h1>

<p align="center"><i>Transform Healthcare Data into Seamless Patient Care</i></p>

<p align="center">
  <img src="https://img.shields.io/badge/last%20commit-today-blue" />
  <img src="https://img.shields.io/badge/java-99.5%25-orange" />
  <img src="https://img.shields.io/badge/languages-2-lightgrey" />
</p>

<p align="center"><b>Built with the tools and technologies:</b></p>

<p align="center">
  <img src="https://img.shields.io/badge/-Markdown-000000?logo=markdown&logoColor=white" />
  <img src="https://img.shields.io/badge/-Spring-6DB33F?logo=spring&logoColor=white" />
  <img src="https://img.shields.io/badge/-Docker-2496ED?logo=docker&logoColor=white" />
  <img src="https://img.shields.io/badge/-XML-blue?logo=xml&logoColor=white" />
</p>

---

## 📚 Sumário

- [📄 Descrição do Projeto](#-descrição-do-projeto)
- [🔗 Funcionalidades (Endpoints)](#-funcionalidades-endpoints)
- [⚙️ Tecnologias e Dependências](#-tecnologias-e-dependências)
- [▶️ Como Rodar o Projeto](#-como-rodar-o-projeto)
    - [🔧 Pré-requisitos](#-pré-requisitos)
    - [📥 Instruções](#-instruções)
- [📚 Documentação da API (Swagger)](#-documentação-da-api-swagger)

---

## 📄 Descrição do Projeto

A **Voll.med API** é uma aplicação backend construída com **Spring Boot**, projetada para gerenciar uma clínica médica.  
O projeto implementa funcionalidades como:

- Sistema de **agendamento de consultas**
- **CRUD completo** para médicos e pacientes
- Estrutura de **segurança robusta baseada em JWT**

Este projeto segue as melhores práticas de desenvolvimento, incluindo:

-  Arquitetura **RESTful**
-  Mapeamento de objetos (ORM) com **Spring Data JPA** e **Hibernate**
-  Gerenciamento de banco de dados com migrações usando **Flyway**
-  Validação de dados com **Bean Validation**
-  Autenticação e autorização com **Spring Security** e **JWT**
-  **Containerização com Docker** para ambiente de desenvolvimento reproduzível

---

## 🔗 Funcionalidades (Endpoints)

### 🔐 Autenticação

- `POST /login`: Autentica um usuário e retorna um token JWT

### 🩺 Gerenciamento de Médicos

- `POST /medicos`: Cadastra um novo médico
- `GET /medicos`: Lista todos os médicos ativos com paginação
- `GET /medicos/{id}`: Detalha as informações de um médico específico
- `PUT /medicos`: Atualiza informações de um médico
- `DELETE /medicos/{id}`: Exclusão lógica de um médico

### 👥 Gerenciamento de Pacientes

- `POST /pacientes`: Cadastra um novo paciente
- `GET /pacientes`: Lista todos os pacientes ativos com paginação
- `GET /pacientes/{id}`: Detalha as informações de um paciente específico
- `PUT /pacientes`: Atualiza informações de um paciente
- `DELETE /pacientes/{id}`: Exclusão lógica de um paciente

### 📅 Gerenciamento de Consultas

- `POST /consultas`: Agenda uma nova consulta (com regras de negócio aplicadas)
- `DELETE /consultas`: Cancela uma consulta agendada

---

## ⚙️ Tecnologias e Dependências

- **Linguagem:** Java 17
- **Framework:** Spring Boot 3.5.3
- **Persistência:** Spring Data JPA, Hibernate
- **Banco de Dados:** MySQL 8.0 (via container Docker)
- **Migrações:** Flyway
- **Segurança:** Spring Security 6.5.1, java-jwt (Auth0)
- **Validação:** Bean Validation
- **Documentação:** Springdoc OpenAPI (Swagger UI)
- **Build:** Maven 3.8.5
- **Ambiente:** Docker + Docker Compose

---

## ▶️ Como Rodar o Projeto

O projeto está configurado para ser executado facilmente com Docker. No terminal rode o comando abaixo:


    docker-compose up -d --build

### 🔧 Pré-requisitos

- Docker
- Docker Compose

### 📥 Instruções

Clone o repositório:

```bash
git clone git@github.com:gqroga/vollmed-api.git
cd vollmed-api
```

---

## 📚 Documentação da API (Swagger)

Com a aplicação rodando, a documentação interativa estará disponível em:

👉 http://localhost:8080/swagger-ui.html

Utilize o Swagger UI para:
- Testar endpoints
- Visualizar estruturas de requisição e resposta
- Obter tokens de autenticação para chamadas protegidas

---

