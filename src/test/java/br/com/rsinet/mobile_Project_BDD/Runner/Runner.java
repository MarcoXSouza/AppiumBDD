package br.com.rsinet.mobile_Project_BDD.Runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features"
		,glue = "br.com.rsinet.mobile_Project_BDD.TestSteps"
		,monochrome = true
		,dryRun = false
		,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\marcos.souza\\Documents\\Marcos\\Projetos\\AndroidComCucumber\\workspace\\ProjetoAppiumBDD\\Report\\report.html"}
//		,tags = {"@Cadastro"}
		)

public class Runner{
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("C:\\Users\\marcos.souza\\Documents\\Marcos\\Projetos\\AndroidComCucumber\\workspace\\ProjetoAppiumBDD\\report.xml"));

	}
	
}



