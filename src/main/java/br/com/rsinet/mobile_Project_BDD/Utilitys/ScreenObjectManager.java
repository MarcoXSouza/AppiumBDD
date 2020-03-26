package br.com.rsinet.mobile_Project_BDD.Utilitys;

import org.openqa.selenium.WebElement;

import br.com.rsinet.mobile_Project_BDD.ScreenObjectFactory.BuscaScreen;
import br.com.rsinet.mobile_Project_BDD.ScreenObjectFactory.CadastroScreen;
import br.com.rsinet.mobile_Project_BDD.ScreenObjectFactory.LogInScreen;
import br.com.rsinet.mobile_Project_BDD.ScreenObjectFactory.LupaScreen;
import io.appium.java_client.android.AndroidDriver;

public class ScreenObjectManager {

	private AndroidDriver<WebElement> driver;

	private Acoes acoes;
	private BuscaScreen buscaScreen;
	private CadastroScreen cadastroScreen;
	private LupaScreen lupaScreen;
	private LogInScreen logInScreen;

	public ScreenObjectManager(AndroidDriver<WebElement> driver) {
		this.driver = driver;
	}

	public BuscaScreen getBuscaScreen() {
		return (buscaScreen == null) ? buscaScreen = new BuscaScreen(driver) : buscaScreen;
	}

	public CadastroScreen getcadastroScreen() {
		return (cadastroScreen == null) ? cadastroScreen = new CadastroScreen(driver) : cadastroScreen;
	}

	public LupaScreen getLupaScreen() {
		return (lupaScreen == null) ? lupaScreen = new LupaScreen(driver) : lupaScreen;
	}

	public LogInScreen getLogInScreen() {
		return (logInScreen == null) ? logInScreen = new LogInScreen(driver) : logInScreen;
	}

	public Acoes getAcoes() {
		return (acoes == null) ? acoes = new Acoes(driver) : acoes;
	}

}
