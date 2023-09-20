package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

@io.cucumber.testng.CucumberOptions(
		features = "C:\\Users\\Lenovo\\eclipse-workspace\\testcucu\\src\\test\\resources\\features",
		dryRun =!true,
		glue = {"stepDefinition","hooks"},
		tags = "@book",plugin = {"pretty","html:target/cucumber-reports.html"}
		
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
