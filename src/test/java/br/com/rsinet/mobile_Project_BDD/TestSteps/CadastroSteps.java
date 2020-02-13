package br.com.rsinet.mobile_Project_BDD.TestSteps;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import br.com.rsinet.mobile_Project_BDD.ScreenObjectFactory.CadastroScreen;
import br.com.rsinet.mobile_Project_BDD.ScreenObjectFactory.LogInScreen;
import br.com.rsinet.mobile_Project_BDD.Utilitys.Snapshot;
import br.com.rsinet.mobile_Project_BDD.Utilitys.TestContext;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.android.AndroidDriver;

public class CadastroSteps {
	private static AndroidDriver<WebElement> driver;
	private CadastroScreen cadastro;
	private LogInScreen logIn;
	private TestContext testContext;
	
	
	
	public CadastroSteps(TestContext context) throws MalformedURLException {
		testContext = context;
		logIn = testContext.getScreenFactory().getLogInScreen();
		cadastro = testContext.getScreenFactory().getcadastroScreen();
		driver = testContext.getDriverFactory().iniciaAplicativo();
	}

	@Dado("^que estou na pagina de Cadastro$")
	public void que_estou_na_pagina_de_Cadastro() {
		logIn.getClicaOpcoes();
		logIn.getClicaLogIn();
		logIn.getClicaNovaConta();
	}

	@Dado("^preencher nome do usuario \"([^\"]*)\"$")
	public void preencher_nome_do_usuario(String nome) {
		cadastro.getNome(nome);
	}

	@Dado("^preencer o email \"([^\"]*)\"$")
	public void preencer_o_email(String email) {
		cadastro.getEmail(email);
	}

	@Dado("^a senha \"([^\"]*)\" e confirmar \"([^\"]*)\"$")
	public void a_senha_e_confirmar(String senha, String confirmarSenha) {
	       cadastro.getSenha(senha);
	       cadastro.getConfirmarSenha(confirmarSenha);
	}

	@Dado("^primeiro nome \"([^\"]*)\" sobrenome \"([^\"]*)\" e telefone \"([^\"]*)\"$")
	public void primeiro_nome_sobrenome_e_telefone(String nome, String sobrenome, String telefone) {
	       cadastro.getPrimeiroNome(nome);
	       cadastro.getUltimoNome(sobrenome);
	       cadastro.getTelefone(telefone);
	       cadastro.scroll(driver);
	}

	@Dado("^selecionar o pais$")
	public void selecionar_o_pais() {
		cadastro.getPais();
		cadastro.escolhePais(driver);
	       
	}

	@Dado("^preencher o estado \"([^\"]*)\" endereco \"([^\"]*)\" cidade \"([^\"]*)\" e cep \"([^\"]*)\"$")
	public void preencher_o_estado_endereco_cidade_e_cep(String estado, String endereco, String cidade, String cep) {
	    cadastro.getEstado(estado);
	    cadastro.getEndereco(endereco);
	    cadastro.getCidade(cidade);
		cadastro.getCep(cep);
	}

	@Quando("^clicar em registrar$")
	public void clicar_em_registrar() {
		cadastro.getRegistra();
		logIn.getClicaOpcoes();

	}

	@Entao("^o usuario devera ser cadastrado \"([^\"]*)\"$")
	public void o_usuario_devera_ser_cadastrado(String nome) throws Exception {
		System.out.println(cadastro.getValidaCadastro());
		Assert.assertTrue(cadastro.getValidaCadastro().equals(nome));
		Snapshot.tirarPrints("CadastroSucesso", driver);
	}

	@Entao("^o usuario nao devera ser cadastrado \"([^\"]*)\"$")
	public void o_usuario_nao_devera_ser_cadastrado(String nome) throws Exception {
		System.out.println(cadastro.getValidaCadastro());
		Assert.assertFalse(cadastro.getValidaCadastro().equals(nome));
		Snapshot.tirarPrints("CadastroFalha", driver);
	}

}
