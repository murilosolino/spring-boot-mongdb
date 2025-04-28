# Spring Boot com MongoDB 🍃

Este projeto é uma aplicação básica utilizando Spring Boot integrada com MongoDB, demonstrando como configurar e executar uma aplicação simples com essas tecnologias.

## Requisitos

- Java 17 ou superior
- Maven 3.8+
- MongoDB em execução local na porta padrão (27017)

## Executando o projeto

1. Clone o repositório:

   ```bash
   git clone https://github.com/murilosolino/spring-boot-mongdb.git
   cd spring-boot-mongdb
   ```

2. Compile e execute a aplicação:

   ```bash
   ./mvnw spring-boot:run
   ```

   Ou, se preferir, gere o arquivo JAR:

   ```bash
   ./mvnw clean package
   java -jar target/spring-boot-mongdb-0.0.1-SNAPSHOT.jar
   ```

## Estrutura do Projeto

- `src/main/java` – Código-fonte da aplicação
- `src/main/resources` – Arquivos de configuração
- `pom.xml` – Gerenciamento de dependências e build com Maven

## Tecnologias Utilizadas

- Spring Boot
- Spring Data MongoDB
- MongoDB
- Maven
