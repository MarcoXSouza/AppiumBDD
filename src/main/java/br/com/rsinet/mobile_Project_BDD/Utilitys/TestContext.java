package br.com.rsinet.mobile_Project_BDD.Utilitys;

import java.net.MalformedURLException;

public class TestContext {
	
	/**
	 * @author marcos.souza
	 * Essa classe é o contexto em que o teste deve rodar
	 */
	
	private DriverFactory driverManager;
	private ScreenObjectManager screenObjectManager;

	public TestContext() throws MalformedURLException {
		driverManager = new DriverFactory();
		screenObjectManager = new ScreenObjectManager(driverManager.iniciaAplicativo());

	}

	public DriverFactory getDriverFactory() {
		return driverManager;

	}

	public ScreenObjectManager getScreenFactory() {
		return screenObjectManager;
		
	}

}