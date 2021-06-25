
# PersonApiDIO

* [Português](#section-1)
* [English](#section-2)

## <a name="section-1"></a> Português (Brasil)

Projeto de API REST desenvolvido no bootcamp Java GFT/DIO.

O objetivo é construir uma API simples para cadastro de pessoa.
O repositório do projeto inicial se encontra [aqui](https://github.com/rpeleias/personapi_digital_innovation_one).

O projeto foi desenvolvido em Java 11 e possui as seguintes dependências:
* [**Spring Boot Dev tools**](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools)
* [**Spring Boot Web**](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools)
* [**Lombok**](https://mvnrepository.com/artifact/org.projectlombok/lombok)
* [**JPA**](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa)
* [**H2**](https://h2database.com/html/main.html)
* [**Mapstruct**](https://mapstruct.org/)

## Inicializar o Projeto

Se você já possui o Maven instalado, execute na linha de comando:
```shell script
mvn spring-boot:run 
```
Se não possui, você pode usar o arquivo **mvnw** para a plataforma Linux ou **mvnw.cmd** para Windows, usando o mesmo argumento: **spring-boot:run**. Ambos os arquivos encontram-se na raiz do projeto.

## Objetivo do projeto original

O objetivo do bootcamp é criar uma API REST para gerenciar pessoas, utilizando os seguintes *endpoints*:

| *Método HTTP* | *Endpoint*        | *Ação*                                                        |
| :-----------: |------------------ |  ------------------------------------------------------------ |
| GET           | api/v1/person     | Retorna todos os registros de pessoas                         |
| GET           | api/v1/person/{id}| Retorna o registro da pessoa com o id passado como argumento  |
| POST          | api/v1/person     | Cadastra uma pessoa nova                                      |
| PUT           | api/v1/person/{id}| Modifica o registro da pessoa com o id passado como argumento |
| DELETE        | api/v1/person/{id}| Deleta o registro da pessoa com o id passado como argumento   |

## Funcionalidades extras

As seguintes modificações foram feitas em relação ao projeto original:

1. O Stracktrace foi omitido nas mensagens de erro.
2. A exceção *NotFound* foi modificada para ser mais genérica.
3. Os seguintes *endpoints* foram adicionados:

| *Método HTTP* | *Endpoint*                           | *Ação*                                                                                   |
| :-----------: |------------------------------------- |  --------------------------------------------------------------------------------------- |
| GET           | api/v1/person/firstName/{lastName}   | Retorna todos os registros de pessoas cujo primeiro nome contém o argumento passado      |
| GET           | api/v1/person/lastName/{firstName}   | Retorna todos os registros de pessoas cujo último nome contém o argumento passado        |
| GET           | api/v1/person/cpf/{cpf}              | Retorna o registro da pessoa cujo cpf é igual ao argumento passado                       |
| GET           | api/v1/person/birthDate/before/{date}| Retorna todos os registros de pessoas que nasceram antes da data passada como parâmetro  |
| GET           | api/v1/person/birthDate/after/{date} | Retorna todos os registros de pessoas que nasceram depois da data passada como parâmetro |
| GET           | api/v1/person/birthDate/{date}       | Retorna todos os registros de pessoas que nasceram na data passada como parâmetro        |



## <a name="section-2"></a> English

REST API project  from the GFT/DIO Java bootcamp.

Template project in Java 11 for learning purposes. This project uses the following dependencies:
* [**Spring Boot Dev tools**](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools)
* [**Spring Boot Web**](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools)
* [**Lombok**](https://mvnrepository.com/artifact/org.projectlombok/lombok)
* [**JPA**](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa)
* [**H2**](https://h2database.com/html/main.html)
* [**Mapstruct**](https://mapstruct.org/)

## Getting Started

If you have Maven installed, run ***mvn spring-boot:run*** in the command line:
```shell script
mvn spring-boot:run 
```
If you don't, you can use the **mvnw** file for Linux or **mvnw.cmd** for Windows and the same argument: **spring-boot:run**. Both files can be found in the root directory.

## Original project goal

The bootcamp goal is create an REST API to manage people, using the following endpoints:

| *Método HTTP* | *Endpoint*        | *Action*                             |
| :-----------: |------------------ |  ----------------------------------- |
| GET           | api/v1/person     | Return all people entries            |
| GET           | api/v1/person/{id}| Return a person entry, using the id  |
| POST          | api/v1/person     | Register a new person                |
| PUT           | api/v1/person/{id}| changes a person entry, using the id |
| DELETE        | api/v1/person/{id}| Deletes a person entry, using the id |

## Extra functionalities

The following modifications were added to the origianl project:

1. Stracktrace is ommited from error mensages.
2. *NotFound* exception was modified in order to be more generic.
3. The following endpoints were added:

| *HTTP Method* | *Endpoint*                           | *Action*                                                                          |
| :-----------: |------------------------------------- |  ---------------------------------------------------------------------------------|
| GET           | api/v1/person/firstName/{lastName}   | Return all person entries whose first name contains the endpoint parameter        |
| GET           | api/v1/person/lastName/{firstName}   | Return all person entries whose last name contains the endpoint parameter         |
| GET           | api/v1/person/cpf/{cpf}              | Return a person entry whose cpf is the same as the endpoint parameter             |
| GET           | api/v1/person/birthDate/before/{date}| Return all entries of people born before the the date passed as endpoint parameter|
| GET           | api/v1/person/birthDate/after/{date} | Return all entries of people born after the date passed as endpoint parameter     |
| GET           | api/v1/person/birthDate/{date}       | Return all entries of people born in the date passed as endpoint parameter        |
