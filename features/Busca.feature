# language: pt

@Busca_de_produto 
Funcionalidade: Cadastro de novo usuario 

Contexto:
Dado o produto desejado
E estou logado
Quando verificar o produto

@Busca_Sucesso
Cenario: Cadastro com sucesso 
Entao escolhe o produto
	
@Busca_Falha
Cenario: Cadastro com Falha
E adiciona quantidade nao suportada
Entao validar operacao