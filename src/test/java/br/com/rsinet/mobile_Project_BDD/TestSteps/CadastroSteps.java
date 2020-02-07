package br.com.rsinet.mobile_Project_BDD.TestSteps;

import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.mobile_Project_BDD.ScreenObjectFactory.CadastroScreen;
import br.com.rsinet.mobile_Project_BDD.Utilitys.DriverFactory;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CadastroSteps {
	private WebDriver driver;

	@Before
	public void iniciaApp() throws MalformedURLException {
		driver = DriverFactory.iniciaAplicativo();
	}

	@After
	public void fechaApp() {
		DriverFactory.fechaAplicativo();
	}

	@Dado("^que estou na pagina de Cadastro$")
	public void que_estou_na_pagina_de_Cadastro() {
		CadastroScreen cadastro = new CadastroScreen(driver);
		cadastro.getClicaOpcoes();
		cadastro.getClicaLogIn();
		cadastro.getClicaNovaConta();
	}

	@Dado("^preencher os dados do usuario$")
	public void preencher_os_dados_do_usuario() {
		CadastroScreen cadastro = new CadastroScreen(driver);
		cadastro.getNome();
		cadastro.getEmail();
		cadastro.getSenha();
		cadastro.getConfirmarSenha();
		cadastro.getPrimeiroNome();
		cadastro.getUltimoNome();
		cadastro.getTelefone();
		cadastro.scroll(driver);
		cadastro.getPais();
		cadastro.getSelecionarPais();
		cadastro.getEstado();
		cadastro.getEndereco();
		cadastro.getCidade();
		cadastro.getCep();
	}

	// Teste Sucesso
	@Quando("^clicar em registrar$")
	public void clicar_em_registrar() {
		CadastroScreen cadastro = new CadastroScreen(driver);
		cadastro.getRegistra();
		cadastro.getClicaOpcoes();

	}

	@Entao("^o usuario devera ser cadastrado$")
	public void o_usuario_devera_ser_cadastrado() {
//		CadastroScreen cadastro = new CadastroScreen(driver);
//		Assert.assertTrue(cadastro.getValidaCadastro().equals("nome"));
	}

	// Teste Falha
	
	
	@Quando("^registrar$")
	public void registrar() {
		CadastroScreen cadastro = new CadastroScreen(driver);
		cadastro.getRegistra();
		cadastro.getClicaOpcoes();

	}

	@Entao("^o usuario nao devera ser cadastrado$")
	public void o_usuario_nao_devera_ser_cadastrado() {
		CadastroScreen cadastro = new CadastroScreen(driver);
		Assert.assertTrue(cadastro.getValidaCadastro().equals("nome"));

	}

}
