package br.com.rsinet.mobile_Project_BDD.TestSteps;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import br.com.rsinet.mobile_Project_BDD.ScreenObjectFactory.CadastroScreen;
import br.com.rsinet.mobile_Project_BDD.ScreenObjectFactory.LogInScreen;
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
	public void que_estou_na_pagina_de_Cadastro() throws MalformedURLException {
		logIn.getClicaOpcoes();
		logIn.getClicaLogIn();
		logIn.getClicaNovaConta();
	}

	@Dado("^preencher os dados do usuario$")
	public void preencher_os_dados_do_usuario() {
		cadastro.getNome();
		cadastro.getEmail();
		cadastro.getSenha();
		cadastro.getConfirmarSenha();
		cadastro.getPrimeiroNome();
		cadastro.getUltimoNome();
		cadastro.getTelefone();
		cadastro.scroll(driver);
		cadastro.getPais();
		cadastro.escolhePais(driver);
		cadastro.getEstado();
		cadastro.getEndereco();
		cadastro.getCidade();
		cadastro.getCep();
	}

	// Teste Sucesso
	@Quando("^clicar em registrar$")
	public void clicar_em_registrar() {
		cadastro.getRegistra();
		logIn.getClicaOpcoes();

	}

	@Entao("^o usuario devera ser cadastrado$")
	public void o_usuario_devera_ser_cadastrado() {
//		Assert.assertTrue(cadastro.getValidaCadastro().equals("nome"));
	}

	// Teste Falha
	@Quando("^registrar$")
	public void registrar() {
		cadastro.getRegistra();
		logIn.getClicaOpcoes();

	}

	@Entao("^o usuario nao devera ser cadastrado$")
	public void o_usuario_nao_devera_ser_cadastrado() {
		Assert.assertFalse(cadastro.getValidaCadastro().equals("nome"));
	}

}
