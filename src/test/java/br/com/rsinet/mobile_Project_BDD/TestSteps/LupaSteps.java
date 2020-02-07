package br.com.rsinet.mobile_Project_BDD.TestSteps;

import java.net.MalformedURLException;

import org.junit.After;
import org.openqa.selenium.WebElement;

import br.com.rsinet.mobile_Project_BDD.ScreenObjectFactory.LupaScreen;
import br.com.rsinet.mobile_Project_BDD.Utilitys.DriverFactory;
import br.com.rsinet.mobile_Project_BDD.Utilitys.ScreenObjectManager;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.android.AndroidDriver;

public class LupaSteps {
	private AndroidDriver<WebElement> driver;
	LupaScreen lupa;
	ScreenObjectManager screenObjectManager;

	@Before
	public void iniciaNavegador() throws MalformedURLException {
	}
	
	@After
	public void fechaApp() {
//		DriverFactory.fechaAplicativo();
	}

	@Dado("^que cliquei na lupa$")
	public void que_cliquei_na_lupa() throws MalformedURLException {
		driver = DriverFactory.iniciaAplicativo();
		screenObjectManager = new ScreenObjectManager(driver);
		lupa = screenObjectManager.getLupaScreen();
		lupa.getClicaLupa();
	}

	@Dado("^pesquisei o produto$")
	public void pesquisei_o_produto() {
		lupa.getPesquisaLupa();
		lupa.getClicaPesquisa();
		
	}

	@Quando("^selecionar o produto$")
	public void selecionar_o_produto() {
		lupa.getClicaItem();
	}

	@Entao("^o produto sera validado$")
	public void o_produto_sera_validado() {

	}

	@Quando("^pesquisar o produto$")
	public void pesquisar_o_produto() throws Throwable {
		lupa.getPesquisaLupa();
	}

	@Entao("^o produto nao sera encontrado$")
	public void o_produto_nao_sera_encontrado() {

	}
}
