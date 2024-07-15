> # Forum Hub - API de Forum 
---
> ## Desafio Alura Challenges Oracle-ONE BR - Back End - Turma 6 - 2024> 
---

<p align="center">
   <img src="https://img.shields.io/badge/ STATUS-LANÇADO (desenvolvido)-brightgreen"/>
</p>
<p align="center">
   <img src="https://img.shields.io/badge/ STATUS-VERSÃO 1.0-brightgreen"/>
</p>

---
Este é um projeto desenvolvido durante o curso de Java ofertado pela Alura para a turma 6 da Oracle ONE.

O projeto do Forum Hub é uma API Rest construída em Java e Spring Boot com controle de autenticação e autorização utilizando Spring Security e testes unitários utilizando OpenAPI e Insomnia.

O Forum Hub permite que o usuário tenha acesso, cadastre, edite e exclua registros de tópicos, salvando os dados em um banco de dados MySQL local.

---

> ## * Funcionalidades *
---
> ### Funções sem autenticação JWT
- Cadastramento de usuário (salvamento da senha utilizando criptografia Bcrypt)
- Login na API
---
> ### Funções com autenticação JWT
- Cadastramento de autor
- Cadastro de tópicos.
- Listagem de tópicos salvos.
- Detalhes de tópicos salvos.
- Edição no registro de tópicos.
- Exclusão lógica do registro de tópicos.
---
>#### * Para acessar a API, após configurar o Banco de Dados MySQL e rodar a API, basta acessar o endereço (http://"server:port/context-path"/swagger-ui.html) pelo navegador.
---
> ## Tecnologias utilizadas
---
> #### Configuração do projeto
- Java (JDK 17 "17.0.10")
- Maven 4.0.0
- Spring Boot
- Projeto em JAR
---
> #### Dependências utilizadas no projeto
- Lombok
- Spring Web
- Spring Boot DevTools
- Spring Data Jpa 3.3.1
- Flyway Migration
- MySQL Driver 8.0
- Validation
- Spring Security
- Java JWT 4.4.0
- OpenAPI 2.6.0
---
> #### Versão Atual: 1.0
&nbsp;
Na versão 1.0, a aplicacação foi `finalizada` e `entregue`.

---
> ### * Créditos *
Baseado em orientação da [Alura](https://www.alura.com.br/) e seus `professores`.

Documentação e melhorias por [Rodrigo Leone](https://github.com/Rodrigo-Leone).

LinkedIn [Rodrigo Leone](https://www.linkedin.com/in/rodrigo-leone/)

---
Primeiro commit na data de 13/07/2024.

Ultimo commit na data de 14/07/2024.

---
