package br.com.rsinet.mobile_Project_BDD.Utilitys;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;

public class Hooks {
	private AndroidDriver<WebElement> driver;

	@Before
	public void iniciaApp() throws MalformedURLException {
		System.out.println("abre");
		driver = DriverFactory.iniciaAplicativo();
	}

//	@After
//	public void fechaApp() {
//		DriverFactory.fechaAplicativo();
//	}
}
