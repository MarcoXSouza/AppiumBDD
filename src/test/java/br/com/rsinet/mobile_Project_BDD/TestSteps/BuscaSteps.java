package br.com.rsinet.mobile_Project_BDD.TestSteps;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import br.com.rsinet.mobile_Project_BDD.ScreenObjectFactory.BuscaScreen;
import br.com.rsinet.mobile_Project_BDD.ScreenObjectFactory.LogInScreen;
import br.com.rsinet.mobile_Project_BDD.Utilitys.DriverFactory;
import br.com.rsinet.mobile_Project_BDD.Utilitys.ScreenObjectManager;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.android.AndroidDriver;

public class BuscaSteps {
	private AndroidDriver<WebElement> driver;
	private BuscaScreen busca;
	private LogInScreen logIn;
	private ScreenObjectManager screenObjectManager;

	@Dado("^estou logado$")
	public void estou_logado() throws MalformedURLException {
		driver = DriverFactory.iniciaAplicativo();
		screenObjectManager = new ScreenObjectManager(driver);
		busca = screenObjectManager.getBuscaScreen();
		logIn = screenObjectManager.getLogInScreen();
		logIn.getClicaOpcoes();
		logIn.getClicaLogIn();
		logIn.getUserName();
		logIn.getPassword();
		logIn.getFazLogIn();

	}

	@Quando("^escolhe o produto$")
	public void escolhe_o_produto() {
		busca.getEscolheCategoria();
		busca.getEscolheItem();
	}

	// Sucesso
	@Entao("^verificar o produto$")
	public void verificar_o_produto() {

	}

	// Falha
	@Quando("^adiciona quantidade nao suportada$")
	public void adiciona_quantidade_nao_suportada() {
		busca.getQuantidade();
		busca.getAdcQuantidade();
		busca.getAplicar();
		busca.getAdcAoCarrinho();
	}

	@Entao("^validar operacao$")
	public void validar_operacao() {
		// Write code here that turns the phrase above into concrete actions
	}

}
