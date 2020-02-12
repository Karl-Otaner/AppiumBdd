# language: pt
#coding: utf-8
Funcionalidade: Cadastrar Ususario
  Descricao: essa acao, testara a funcionalidade de cadastrar um
  novo usuario e cadastra um usuario já cadastrado.

  Contexto: 
    Dado o usuario esta na tela inicial do site advantage online shopping
    Quando o usuari clicar no botao menu
    E clicar em botao de login
    E clicar em criar conta
 

  @Sucesso
  Cenario: Cadastrar usuario com dados Validos
    E Fazer o cadastro da nova conta
    E clica no botao registro
    E clica no botao menu
 		Entao validar o retorno a pagina inicial
 		
 	@Falha
  Cenario: Cadastrar usuario ja cadastrado
    E Fazer o cadastro ja existente
    E clicar no botao registro
    Entao validar mensagem de usuario ja cadastrado