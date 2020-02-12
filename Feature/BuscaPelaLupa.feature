# language: pt
#coding: utf-8
Funcionalidade: Busca produlo app pela lupa

  Contexto: 
    Dado O usuario esta na tela inicial do App
    Quando ele clica na tela barra de pesquisa

  @BuscaProdutoValido
  Cenario: Pagina de busca produto valido
    E digita o nome do produto valido
    E sera direcionado para a tela do produto
    Entao validara o produto escolhido

  @BuscaProdutoInvalido
  Cenario: Tela de Busca produto Inexistente
    E digita o nome do produto
    Entao valida a mensagem que o produto nao existe
