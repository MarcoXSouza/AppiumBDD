package br.com.rsinet.mobile_Project_BDD.Utilitys;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;

public class Hooks {
	public static AndroidDriver<WebElement> driver;

	@Before//("@Cadastro")
	public void iniciaApp() throws MalformedURLException {
		driver = DriverFactory.iniciaAplicativo();
	}

	@After("@Cadastro_Sucesso")
	public void fechaCS() {
		driver.closeApp();
	}

	@After
	public void fechaApp() {
		System.out.println("Fecha app");
		driver.closeApp();
	}

}
