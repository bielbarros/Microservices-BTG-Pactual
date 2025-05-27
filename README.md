
# 💼 Microservices BTG Pactual - Backend Challenge

Este projeto é a implementação técnica do desafio proposto pelo BTG Pactual para backend developers. A aplicação foi desenvolvida com foco em boas práticas de microsserviços, utilizando as tecnologias **Spring Boot**, **MongoDB**, **RabbitMQ** e **Docker**.

---

## 🚀 Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3**
- **Spring Web**
- **Spring Data MongoDB**
- **MongoDB (via Docker)**
- **RabbitMQ (via Docker)**
- **Lombok**
- **SLF4J (Logging)**
- **Docker & Docker Compose**

---

## 📦 Funcionalidades Implementadas

- ✅ Criação de uma **API RESTful** com Spring Boot
- ✅ Estruturação de um **microsserviço independente**
- ✅ Comunicação assíncrona via **RabbitMQ**
- ✅ Integração com **MongoDB** via Spring Data
- ✅ **Mapeamento de collections** MongoDB
- ✅ Utilização de **aggregations avançadas**
- ✅ Geração de logs profissionais com **SLF4J**
- ✅ Contêineres isolados e reproduzíveis com **Docker Compose**

---

## 🗂️ Estrutura do Projeto

```bash
Microservices-BTG-Pactual/
├── .docker/                 # Configurações dos serviços (MongoDB, RabbitMQ)
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/btg/     # Pacotes da aplicação
│   │   └── resources/       # application.yml, configs, etc.
├── docker-compose.yml       # Orquestração dos containers
├── README.md
├── pom.xml
```

---

## 🐳 Como Executar o Projeto com Docker

Certifique-se de ter o **Docker** e **Docker Compose** instalados.

```bash
# Suba os containers de MongoDB e RabbitMQ
docker-compose up -d

# Execute a aplicação Spring Boot
./mvnw spring-boot:run
```

A aplicação estará disponível em:
```
http://localhost:8080
```

---

## 📨 Configuração do RabbitMQ

- Host: `localhost`
- Porta: `5672`
- User: `guest`
- Senha: `guest`

---

## 📊 MongoDB

- Host: `localhost`
- Porta: `27017`
- Banco: `btg-challenge`
- Collections configuradas diretamente via Spring Data

---

## 🔍 Exemplos de Endpoints

```http
GET /api/v1/relatorio
POST /api/v1/evento
```

(Os endpoints reais devem ser descritos conforme a implementação.)

---

## 📈 Aggregations com MongoDB

As operações de agregação foram implementadas utilizando `Aggregation Framework` do Spring Data, possibilitando cálculos avançados, agrupamentos e projeções diretamente no banco de dados.

---

## 📝 Logs

Todos os eventos relevantes da aplicação são registrados usando **SLF4J**, garantindo rastreabilidade e fácil manutenção.

---

## 📌 Requisitos

- Java 17+
- Maven
- Docker & Docker Compose

---

## 🧑‍💻 Autor

Desenvolvido por [Gabriel Barros](https://github.com/bielbarros)  
Contato profissional: [LinkedIn](https://www.linkedin.com/in/gabriel-sbarros)

---