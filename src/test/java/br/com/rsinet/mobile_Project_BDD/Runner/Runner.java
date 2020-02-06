package br.com.rsinet.mobile_Project_BDD.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features",
		glue = "br.com.rsinet.mobile_Project_BDD.TestSteps",
		monochrome = true,
		dryRun = false,
		tags = {"@Lupa"}
		)


public class Runner{
	
}
