package br.com.rsinet.mobile_Project_BDD.Utilitys;

import java.net.MalformedURLException;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	private TestContext testContext;

	public Hooks(TestContext context) {
		testContext = context;
	}

	@Before
	public void iniciaApp() throws MalformedURLException {
		testContext.getDriverFactory().iniciaAplicativo();
	}

	@After
	public void fechaApp() {
		DriverFactory.fechaAplicativo();
	}

}
