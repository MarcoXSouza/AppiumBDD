package br.com.rsinet.mobile_Project_BDD.Utilitys;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class Snapshot {
	private TestContext testContext;

	public Snapshot(TestContext context) {
		testContext = context;
	}

	@After(order = 1)
	public void afterScenario(Scenario scenario) {
		String screenshotName = scenario.getName().replaceAll(" ", "_");
		try {

			File sourcePath = ((TakesScreenshot) testContext.getDriverFactory().iniciaDriver())
					.getScreenshotAs(OutputType.FILE);

			File destinationPath = new File(System.getProperty("user.dir") + "/target/"
					+ screenshotName + ".png");

			Files.copy(sourcePath, destinationPath);

			Reporter.addScreenCaptureFromPath(destinationPath.toString());

		} catch (IOException e) {
			System.out.println("falha no Teste");
		}

	}
}
















