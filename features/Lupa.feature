# language: pt
@Lupa
Funcionalidade: Pesquisar produto pela lupa

  Contexto: lupa
    Dado que cliquei na lupa

  @Lupa_Sucesso
  Esquema do Cenario: Pesquisa produto pela Lupa com sucesso
    Quando pesquisei o produto "<produto>"
    Entao o produto sera validado "<produto>"

    Exemplos: 
      | produto                    |
      | HP ELITEPAD 1000 G2 TABLET |

  @Lupa_Falha
  Esquema do Cenario: Pesquisa produto inexistente
    Quando pesquisei o produto "<produto>"
    Entao o produto nao sera encontrado "<produto>"

    Exemplos: 
      | produto |
      | carro   |
