package br.com.rsinet.mobile_Project_BDD.TestSteps;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import br.com.rsinet.mobile_Project_BDD.ScreenObjectFactory.BuscaScreen;
import br.com.rsinet.mobile_Project_BDD.Utilitys.DriverFactory;
import br.com.rsinet.mobile_Project_BDD.Utilitys.ScreenObjectManager;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.android.AndroidDriver;

public class BuscaSteps {
	private AndroidDriver<WebElement> driver;
	BuscaScreen busca;
	ScreenObjectManager screenObjectManager;
	
	@Dado("^o produto desejado$")
	public void o_produto_desejado() throws MalformedURLException {
		driver = DriverFactory.iniciaAplicativo();
		screenObjectManager = new ScreenObjectManager(driver);
		busca = screenObjectManager.getBuscaScreen();
		busca.getEscolheCategoria();
	}

	@Dado("^estou logado$")
	public void estou_logado() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Quando("^verificar o produto$")
	public void verificar_o_produto() {

	}
	//Sucesso
	@Entao("^escolhe o produto$")
	public void escolhe_o_produto() {
		busca.getEscolheItem();
	}

	//falha
	@Quando("^adiciona quantidade nao suportada$")
	public void adiciona_quantidade_nao_suportada() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Entao("^validar operacao$")
	public void validar_operacao() {
	    // Write code here that turns the phrase above into concrete actions
	}


}
