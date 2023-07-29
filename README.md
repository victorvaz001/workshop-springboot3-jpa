## Projeto Spring Boot 1

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/victorvaz001/workshop-springboot3-jpa/edit/main/LICENSE) 

## Sobre o Projeto
Projeto Spring Boot 1 foi construido durante o curso  (Java COMPLETO 2023 Programação Orientada a Objetos +Projetos) ministrado no site (https://www.udemy.com/course/java-curso-completo/),
aplicação consiste no aprendizado basico de utilização do Spring Boot com uma base de dados, utilizando metodos como GET, POST, PUT e Delete.

## Objetivo do projeto
  - Criar o projeto Spring Boot utilizando o initializr (https://start.spring.io/)
  - Implementar um modelo Conceitual
  - Estruturar camadas lógicas: resource, service, repository
  - Configurar o Banco de dados H2
  - Desenvolver Banco de dados com os metodos create, Retrieve, Update, Delete
  - Tratar de exceções
  - Utilizar o Hibernate

## Tecnologias
  - Java 17
  - Spring Boot 3
  - Maven
  - Base de dados (H2)

## Modelo relacional
![Modelo-Relacional](https://github.com/victorvaz001/workshop-springboot3-jpa/assets/42657636/eccf13ff-6553-4e22-a87b-67b7a8178dda)


  ## Teste Endpoint com o Postman

  - Recuperando Usuários
  - Metodo GET
  - Endpoint: http://localhost:8080/users

![Recuperando-Usuarios](https://github.com/victorvaz001/workshop-springboot3-jpa/assets/42657636/e38272de-5bf2-485a-9bb3-2bc3e4655ef3)

  - Recuperando categorias
  - Metodo GET
  - Endpoint: http://localhost:8080/categories
    
![RecuperandoCategorias](https://github.com/victorvaz001/workshop-springboot3-jpa/assets/42657636/b5da3766-56fd-4fd3-90e3-e2fa168fc28c)

  - Cadastro de Usuários, passando parametros no Body
  - Metodo Post
  - Endpoint: http://localhost:8080/users

![CadastroUusuario](https://github.com/victorvaz001/workshop-springboot3-jpa/assets/42657636/2883ae2d-9dad-46d3-affc-1e6850ec82c1)

  - Deletando de Usuário, passando um id
  - Metodo Delete
  - Endpoint: http://localhost:8080/users/3

![Delete](https://github.com/victorvaz001/workshop-springboot3-jpa/assets/42657636/bfded5b6-333f-47f8-b0ab-79e3e99695ab)

  - Atualização de Usuário, passando parametros no Body
  - Metodo Put
  - Endpoint: http://localhost:8080/users/1

![Update](https://github.com/victorvaz001/workshop-springboot3-jpa/assets/42657636/12fe4895-8110-4e40-8d27-8d152f81be67)

## Como executar o projeto - Windows
### Neste exemplo estou utilizando a IDE, Spring Tools Suite 4
- 1  - Instalar o Git com a ferramenta **Git Bash**
- 2  - Criar uma pasta para armazenar o projeto
- 3  - Ir no GitHub onde esta o projeto Ex: (https://github.com/victorvaz001/workshop-springboot3-jpa)
- 4  - Cilicar no botão (**<> Code**)
- 5  - Clicar em SSH
- 6  - Copiar a url Ex: (git@github.com:victorvaz001/workshop-springboot3-jpa.git)
- 7  - Ir na pasta criada, clicar com o botão direito do mouse, clicar em Git Bash Here
- 8  - Executar o comando git clone 'colar a url copiada no item 6' sem aspas
- 9  - Abrir a IDEA
- 10 - Clicar em File, Open Project from file System
- 11 - Clicar em **Directory**, ir até a pasta que esta o projeto e selecionar ele
- 12 - Clicar em Finish
- 13 - Para testar o projeto, basta ir no pacote src/main/java -> com.victorvazweb.course
- 14 - Clicar com o botão direto na classe CourseApplication.java -> Run As -> Spring Boot App
- 15 - Abrir o Navegador e digitar a url (http://localhost:8080/h2-console)
- 16 - Apos abrir a url a base de dados H2 ira apracer
- 17 - Clicar em connect, após isso as tabelas irão aparecer

## Tabelas criadas
 - TB_CATEGORY
 - TB_ORDER
 - TB_ORDER_ITEM
 - TB_PAYMENT
 - TB_PRODUCT
 - TB_PRODUCT_CATEGORY
 - TB_USER

## Autor

- Victor Gonçalves Vaz

https://www.linkedin.com/in/victor-goncalves-vaz-/
    
