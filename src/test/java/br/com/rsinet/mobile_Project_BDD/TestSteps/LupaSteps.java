package br.com.rsinet.mobile_Project_BDD.TestSteps;

import java.net.MalformedURLException;

import org.junit.After;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.mobile_Project_BDD.Utilitys.DriverFactory;
import br.com.rsinet.mobile_Project_BDD.pageObjectFactory.LupaPage;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class LupaSteps {
	private WebDriver driver;

	@Before
	public void iniciaNavegador() throws MalformedURLException {
		driver = DriverFactory.iniciaDriver(driver);
	}
	
	@After
	public void fechaApp() {
		DriverFactory.fechaDriver();
	}

	@Dado("^que cliquei na lupa$")
	public void que_cliquei_na_lupa() {
		LupaPage lupa = new LupaPage(driver);
		lupa.getClicaLupa();
	}

	@Dado("^pesquisei o produto$")
	public void pesquisei_o_produto() {
		LupaPage lupa = new LupaPage(driver);
		lupa.getPesquisaLupa();
		lupa.getClicaPesquisa();
		
	}

	@Quando("^selecionar o produto$")
	public void selecionar_o_produto() {
		LupaPage lupa = new LupaPage(driver);
		lupa.getClicaItem();
	}

	@Entao("^o produto sera validado$")
	public void o_produto_sera_validado() {

	}

	@Quando("^pesquisar o produto$")
	public void pesquisar_o_produto() throws Throwable {
		LupaPage lupa = new LupaPage(driver);
		lupa.getPesquisaLupa();
	}

	@Entao("^o produto nao sera encontrado$")
	public void o_produto_nao_sera_encontrado() {

	}
}
