# language: pt
#coding: utf-8

Funcionalidade: Busca produto pela tela do app

  Contexto:
  Dado Usuario esta na tela principal do App
  
  @SucessoProudutoTelaApp
  Cenario: Busca tablet pela tela do app
  Quando escolha o table pela tela do App
  E clicar no table escolhido 
  E vai para a tela do table
  Entao valide o produto escolhido
  
  @FalhaAquicaoDeProduto
  Cenario: Buscar headphone pela tela do app
  Quando escolher o headphone pela imagem da tela principal do app
  E clicar no headphone escolhido
  Entao valide que nao tem saldo
  