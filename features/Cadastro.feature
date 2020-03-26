# language: pt
@Cadastro
Funcionalidade: Cadastrar usuario

  Contexto: Pagina de cadastro
    Dado que estou na pagina de Cadastro

  @Cadastro_Sucesso
  Esquema do Cenario: Cadastrar usuario com sucesso
    Quando preencher cadastro "<nome>" "<email>" "<senha>" "<sobrenome>" "<telefone>" "<pais>" "<estado>" "<endereco>" "<cidade>" "<cep>"
    Entao o usuario devera ser cadastrado "<nome>"

    Exemplos: 
      | nome   | email            | senha  | sobrenome | telefone      | estado | endereco     | cidade | cep       | pais   |
      | jujuba | marcos@email.com | aBc123 | Xavier    | (11)123445678 | SP     | Rua primeiro | Osasco | 09873-172 | Brazil |

  @Cadastro_Falha
  Esquema do Cenario: Cadastrar usuario com falha
    Quando preencher cadastro "<nome>" "<email>" "<senha>" "<sobrenome>" "<telefone>" "<pais>" "<estado>" "<endereco>" "<cidade>" "<cep>"
    Entao o usuario nao devera ser cadastrado "<nome>"

    Exemplos: 
      | nome    | email            | senha  | sobrenome | telefone      | estado | endereco     | cidade | cep       | pais   |
      | Martelo | marcos@email.com | aBc123 | Xavier    | (11)123445678 | SP     | Rua primeiro | Osasco | 09873-172 | Brazil |
