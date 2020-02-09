package br.com.rsinet.mobile_Project_BDD.TestSteps;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import br.com.rsinet.mobile_Project_BDD.ScreenObjectFactory.LupaScreen;
import br.com.rsinet.mobile_Project_BDD.Utilitys.DriverFactory;
import br.com.rsinet.mobile_Project_BDD.Utilitys.ScreenObjectManager;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.android.AndroidDriver;

public class LupaSteps {
	private AndroidDriver<WebElement> driver;
	private LupaScreen lupa;
	private ScreenObjectManager screenObjectManager;

	@Dado("^que cliquei na lupa$")
	public void que_cliquei_na_lupa() throws MalformedURLException {
		driver = DriverFactory.iniciaAplicativo();
		screenObjectManager = new ScreenObjectManager(driver);
		lupa = screenObjectManager.getLupaScreen();
		lupa.getClicaLupa();
	}

	// Sucesso
	@Dado("^pesquisei o produto$")
	public void pesquisei_o_produto() {
		lupa.getPesquisaLupaValido();
		lupa.getClicaPesquisa();

	}

	@Quando("^selecionar o produto$")
	public void selecionar_o_produto() {
		lupa.getClicaItem();
	}

	@Entao("^o produto sera validado$")
	public void o_produto_sera_validado() {
	}

	// Falha
	@Quando("^pesquisar o produto$")
	public void pesquisar_o_produto() throws Throwable {
		lupa.getPesquisaLupaInvalido();
		lupa.getClicaPesquisa();
	}

	@Entao("^o produto nao sera encontrado$")
	public void o_produto_nao_sera_encontrado() {

	}
}
