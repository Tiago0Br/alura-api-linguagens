# Alura API de Linguagens

## Descrição

Projeto desenvolvido no evento **Imersão Java** da [Alura](https://www.alura.com.br).

API que cadastra e retorna linguagens de programação com sua descrição, imagem e sua posição no ranking. Endpoints criados até o  momento:

 - **GET /linguagens** - Retorna todas as linguagens cadastradas na ordem de cadastro.
 - **POST /linguagens** - Cadastra uma nova linguagem, deve ser informado o conteúdo em formato JSON com as seguintes propriedades:
	 - **title** - Título da linguagem (String)
	 - **image** - URL da imagem (String)
	 - **ranking** - Posição no ranking (number)

			{
			"title": "PHP",
			"image": "https://linkimagem/php_256x256.png",
			"ranking": 5
			}

## 🚀 Tecnologias utilizadas

<div>
	<a href="https://www.java.com/pt-BR/">
    <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg" heigth="60px" width="60px" title="Java" />
  </a>
	<a href="https://spring.io">
	    <img src="https://seeklogo.com/images/S/spring-logo-9A2BC78AAF-seeklogo.com.png" heigth="50px" width="50px" title="Spring" />
	</a>
  <a href="https://www.mongodb.com/pt-br">
	    <img src="https://coffops.com/wp-content/uploads/2022/07/mdb.png" heigth="60px" width="60px" title="Spring" />
	</a>
	 <a href="https://www.heroku.com">
	    <img src="https://pbs.twimg.com/profile_images/689189555765784576/3wgIDj3j_400x400.png" heigth="50px" width="50px" title="Heroku" />
	</a>
</div>

 - [Java] - Linguagem de programação
 - [Spring] - Framework utilizado para a construção da API
 - [MongoDB] - Banco de dados não relacional
 - [Heroku] - Plataforma onde a API está hospedada

## 🎯 Desafios propostos

 - [ ] Finalizar o CRUD (Create, Read, Update e Delete) para que se possa atualizar e excluir uma linguagem cadastrada;
 - [ ] Devolver a listagem ordenada pelo ranking;
 - [ ] Criar na sua API um modelo de entidade com nomes diferentes de title e image e criar seu próprio extrator de informações personalizado OU, manter com o nome title e image e traduzir para que seja retornado como título e imagem através do uso de DTO (Data Transfer Object);
 - [ ] Retornar o status 201 quando um recurso (linguagem, no nosso caso) for cadastrado através do POST;
 - [ ] Desafio supremo: Aplicar modificações parciais no recurso através do método PATCH, por exemplo, modificando o número de votos ou de pessoas que utilizam cada linguagem de programação.
 - [X] Compartilhe com seus amigos a sua URL do Heroku, para que eles possam consumir a sua API (com o padrão de atributos title e image) e gerar figurinhas do conteúdo que você utilizou (linguagens de programação, filmes, músicas);
 - [ ] Colocar a aplicação no cloud da Oracle;
 - [ ] Implementar algum mecanismo de votação na API, para que outros amigos votem nas linguagens preferidas para que se possa fazer um ranking;
 - [ ] Desafio supremo: Evoluir o projeto das três primeiras aula para que ele gere um bundle de stickers, para que se possa fazer o download e já incluir vários stickers no WhatsApp; 
 - [ ] Usar os conhecimentos aprendidos em alguma imersão React da Alura e fazer uma aplicação front-end para gerar esse bundle, onde possa se passar a URL do conteúdo e já visualizar os stickers;

## 👨🏻‍💻 Como executar o projeto
A API está hospedada no Heroku e disponível [nesse link](https://linguagens-api-tiagolopes.herokuapp.com).
 
### Executando o projeto localmente

 **Pré-requisitos**: [Git](https://git-scm.com) e [Java](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) (foi utilizada a versão 17.0) instalados no computador.
 - Fazer o clone do projeto.

	    git clone git@github.com:<seu usuário>/alura-api-linguagens.git

 - Abrir o projeto no editor de sua preferência.
 - Instalar as dependências do arquivo pom.xml
 - Executar o projeto (vai depender da IDE utilizada)
 - O projeto será executado na porta 8080 do localhost.

---

Feito com 💜 &nbsp;por Tiago Lopes 👋 &nbsp;[Meu Github](https://github.com/Tiago0Br)