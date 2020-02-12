package br.com.rsinet.mobile_Project_BDD.TestSteps;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import br.com.rsinet.mobile_Project_BDD.ScreenObjectFactory.LupaScreen;
import br.com.rsinet.mobile_Project_BDD.Utilitys.TestContext;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.android.AndroidDriver;

public class LupaSteps {
	@SuppressWarnings("unused")
	private static AndroidDriver<WebElement> driver;
	private LupaScreen lupa;
	private TestContext testContext;

	public LupaSteps(TestContext context) throws MalformedURLException {
		testContext = context;
		lupa = testContext.getScreenFactory().getLupaScreen();
		driver = testContext.getDriverFactory().iniciaAplicativo();
	}

	@Dado("^que cliquei na lupa$")
	public void que_cliquei_na_lupa() throws MalformedURLException {
		lupa.getClicaLupa();
	}

	@Quando("^pesquisei o produto \"([^\"]*)\"$")
	public void pesquisei_o_produto(String produto) {
		lupa.getPesquisaLupa(produto);
		lupa.getClicaPesquisa();
	}

	@Entao("^o produto sera validado$")
	public void o_produto_sera_validado() {
		lupa.getClicaItem();
	}

	@Entao("^o produto nao sera encontrado$")
	public void o_produto_nao_sera_encontrado() {

	}

}
