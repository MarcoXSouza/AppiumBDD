# language: pt

@Busca
Funcionalidade: Buscar produto

@Busca_Sucesso
Cenario: Busca com sucesso
Dado o produto
Entao verificar o produto
	
@Busca_Falha
Cenario: Falha ao adicionar produtos
Dado estou logado
Quando escolhe o produto
E adiciona quantidade nao suportada
Entao validar operacao