package br.com.rsinet.mobile_Project_BDD.TestSteps;

import java.net.MalformedURLException;

import org.junit.Assert;

import br.com.rsinet.mobile_Project_BDD.ScreenObjectFactory.CadastroScreen;
import br.com.rsinet.mobile_Project_BDD.ScreenObjectFactory.LogInScreen;
import br.com.rsinet.mobile_Project_BDD.Utilitys.Acoes;
import br.com.rsinet.mobile_Project_BDD.Utilitys.TestContext;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CadastroSteps {
	private CadastroScreen cadastro;
	private LogInScreen logIn;
	private TestContext testContext;
	private Acoes acoes;

	public CadastroSteps(TestContext context) throws MalformedURLException {
		testContext = context;
		logIn = testContext.getScreenFactory().getLogInScreen();
		cadastro = testContext.getScreenFactory().getcadastroScreen();
		acoes = testContext.getScreenFactory().getAcoes();
	}

	@Dado("^que estou na pagina de Cadastro$")
	public void que_estou_na_pagina_de_Cadastro() {
		logIn.getClicaOpcoes();
		logIn.getClicaLogIn();
		logIn.getClicaNovaConta();
	}

	@Quando("^preencher cadastro \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void preencher_cadastro(String nome, String email, String senha, String sobrenome, String telefone,
			String pais, String estado, String endereco, String cidade, String cep) {
		cadastro.getNome(nome);
		cadastro.getEmail(email);
		cadastro.getSenha(senha);
		cadastro.getConfirmarSenha(senha);
		cadastro.getPrimeiroNome(nome);
		cadastro.getUltimoNome(sobrenome);
		cadastro.getTelefone(telefone);
		acoes.scroll();
		cadastro.getPais();
		acoes.selecionaPorNome(pais);
		cadastro.getEstado(estado);
		cadastro.getEndereco(endereco);
		cadastro.getCidade(cidade);
		cadastro.getCep(cep);
		cadastro.getRegistra();
		logIn.getClicaOpcoes();
	}

	@Entao("^o usuario devera ser cadastrado \"([^\"]*)\"$")
	public void o_usuario_devera_ser_cadastrado(String nome) throws Exception {
		System.out.println(cadastro.getValidaCadastro());
		Assert.assertTrue(cadastro.getValidaCadastro().equals(nome));
	}

	@Entao("^o usuario nao devera ser cadastrado \"([^\"]*)\"$")
	public void o_usuario_nao_devera_ser_cadastrado(String nome) throws Exception {
		System.out.println(cadastro.getValidaCadastro());
		Assert.assertFalse(cadastro.getValidaCadastro().equals(nome));
	}

}
