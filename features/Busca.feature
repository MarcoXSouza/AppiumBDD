# language: pt

@Busca
Funcionalidade: Buscar produto

Contexto:
Dado estou logado
Quando escolhe o produto

@Busca_Sucesso
Cenario: Busca com sucesso
Entao verificar o produto
	
@Busca_Falha
Cenario: Falha ao adicionar produtos
E adiciona quantidade nao suportada
Entao validar operacao