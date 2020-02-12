package br.com.rsinet.mobile_Project_BDD.Utilitys;

import java.net.MalformedURLException;

public class TestContext {
	private DriverFactory driverManager;
	private ScreenObjectManager screenObjectManager;

	public TestContext() throws MalformedURLException {

		driverManager = new DriverFactory();
		screenObjectManager = new ScreenObjectManager(driverManager.iniciaDriver());

	}

	public DriverFactory getDriverFactory() {

		return driverManager;

	}

	public ScreenObjectManager getScreenFactory() {

		return screenObjectManager;
}
}
