package br.com.rsinet.mobile_Project_BDD.TestSteps;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import br.com.rsinet.mobile_Project_BDD.Utilitys.TestContext;
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
		testContext.getDriverFactory().iniciaDriver();
	}

	@After
	public void afterScenario(Scenario scenario) throws MalformedURLException, Exception {
		String screenshotName = scenario.getName().replaceAll(" ", "_");

		try {
			File sourcePath = ((TakesScreenshot) testContext.getDriverFactory().iniciaAplicativo())
					.getScreenshotAs(OutputType.FILE);

			File destinationPath = new File(
					"C:\\Users\\marcos.souza\\Documents\\Marcos\\Projetos\\AndroidComCucumber\\workspace\\ProjetoAppiumBDD\\Report\\"
							+ screenshotName + ".png");

			Files.copy(sourcePath, destinationPath);

			Reporter.addScreenCaptureFromPath(destinationPath.toString());
		}
		
		catch (IOException e) {
			System.out.println("Erro" + e.getMessage());
		}
		
		testContext.getDriverFactory().fechaAplicativo();

	}

}
