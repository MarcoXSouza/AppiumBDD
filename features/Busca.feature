# language: pt
@Busca
Funcionalidade: Buscar produto

  @Busca_Sucesso
  Esquema do Cenario: Busca com sucesso
    Dado o produto
    Entao verificar o produto "<produto>"

    Exemplos: 
      | produto                    |
      | HP ELITEPAD 1000 G2 TABLET |

  @Busca_Falha
  Cenario: Falha ao adicionar produtos
    Dado estou logado
    Quando escolhe o produto
    E adiciona quantidade nao suportada
    Entao validar operacao
