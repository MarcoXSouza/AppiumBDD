# language: pt

@Lupa
Funcionalidade: Pesquisar produto pela lupa
Contexto:
Dado que cliquei na lupa

@Lupa_Sucesso
Cenario:
E pesquisei o produto
Quando selecionar o produto
Entao o produto sera validado

@Lupa_Falha
Cenario:
Quando pesquisar o produto
Entao o produto nao sera encontrado