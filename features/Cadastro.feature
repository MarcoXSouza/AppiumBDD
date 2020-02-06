# language: pt

@Cadastro
Funcionalidade: Cadastrar usuario

Contexto: Pagina de cadastro
Dado que estou na pagina de Cadastro
E preencher os dados do usuario

@Cadastro_Sucesso
Cenario: Cadastrar usuario com sucesso
Quando clicar em registrar
Entao o usuario devera ser cadastrado

@Cadastro_Falha
Cenario: Cadastrar usuario com falha
Quando registrar
Entao o usuario nao devera ser cadastrado