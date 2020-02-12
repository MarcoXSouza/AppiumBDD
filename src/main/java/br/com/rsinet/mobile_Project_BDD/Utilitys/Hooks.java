package br.com.rsinet.mobile_Project_BDD.Utilitys;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import cucumber.api.Scenario;
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

	@After(order = 1000)
	public void afterScenario(Scenario scenario) {

		String screenshotName = scenario.getName().replaceAll(" ", "_");
		try {
			File sourcePath = ((TakesScreenshot) testContext.getDriverFactory().iniciaAplicativo())
					.getScreenshotAs(OutputType.FILE);

			File destinationPath = new File(
					System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");

			Files.copy(sourcePath, destinationPath);

			Reporter.addScreenCaptureFromPath(destinationPath.toString());
		} catch (IOException e) {
		}

	}

	@After
	public void fechaApp() {
		testContext.getDriverFactory().fechaAplicativo();
	}

}
