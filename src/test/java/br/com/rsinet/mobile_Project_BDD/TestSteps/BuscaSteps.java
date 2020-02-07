package br.com.rsinet.mobile_Project_BDD.TestSteps;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.mobile_Project_BDD.ScreenObjectFactory.BuscaScreen;
import br.com.rsinet.mobile_Project_BDD.Utilitys.DriverFactory;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class BuscaSteps {
	private WebDriver driver;
	
	@Before
	public void iniciaApp() throws MalformedURLException {
		driver = DriverFactory.iniciaAplicativo();
	}

	@Dado("^o produto desejado$")
	public void o_produto_desejado() throws Throwable {
		BuscaScreen busca = new BuscaScreen(driver);
		busca.getEscolheCategoria();
	}

	@Quando("^verificar o produto$")
	public void verificar_o_produto() throws Throwable {

	}

	@Entao("^escolhe o produto$")
	public void escolhe_o_produto() throws Throwable {
		BuscaScreen busca = new BuscaScreen(driver);
		busca.getEscolheItem();

	}
}
