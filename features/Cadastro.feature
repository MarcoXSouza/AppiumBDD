# language: pt
@Cadastro
Funcionalidade: Cadastrar usuario

  Contexto: Pagina de cadastro
    Dado que estou na pagina de Cadastro

  @Cadastro_Sucesso
  Esquema do Cenario: Cadastrar usuario com sucesso
    E preencher nome do usuario "<nome>"
    E preencer o email "<email>"
    E a senha "<senha>" e confirmar "<senha>"
    E primeiro nome "<nome>" sobrenome "<sobrenome>" e telefone "<telefone>"
    E selecionar o pais
    E preencher o estado "<estado>" endereco "<endereco>" cidade "<cidade>" e cep "<cep>"
    Quando clicar em registrar
    Entao o usuario devera ser cadastrado "<nome>"

    Exemplos: 
      | nome    | email            | senha  | sobrenome | telefone      | estado | endereco     | cidade | cep       |
      | iudbf   | marcos@email.com | aBc123 | Xavier    | (11)123445678 | SP     | Rua primeiro | Osasco | 09873-172 |

  @Cadastro_Falha
  Esquema do Cenario: Cadastrar usuario com falha
    E preencher nome do usuario "<nome>"
    E preencer o email "<email>"
    E a senha "<senha>" e confirmar "<senha>"
    E primeiro nome "<nome>" sobrenome "<sobrenome>" e telefone "<telefone>"
    E selecionar o pais
    E preencher o estado "<estado>" endereco "<endereco>" cidade "<cidade>" e cep "<cep>"
    Quando clicar em registrar
    Entao o usuario nao devera ser cadastrado "<nome>"

    Exemplos: 
      | nome    | email            | senha  | sobrenome | telefone      | estado | endereco     | cidade | cep       |
      | Martelo | marcos@email.com | aBc123 | Xavier    | (11)123445678 | SP     | Rua primeiro | Osasco | 09873-172 |
