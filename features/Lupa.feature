# language: pt
@Lupa
Funcionalidade: Pesquisar produto pela lupa

  Contexto: lupa
    Dado que cliquei na lupa

  @Lupa_Sucesso
  Cenario: Pesquisa produto pela Lupa com sucesso
    E pesquisei o produto
    Quando selecionar o produto
    Entao o produto sera validado

  @Lupa_Falha
  Cenario: Pesquisa produto inexistente
    Quando pesquisar o produto
    Entao o produto nao sera encontrado
