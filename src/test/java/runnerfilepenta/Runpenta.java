package runnerfilepenta;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
		features = {
				"C:\\Users\\chann\\Documents\\workspace-spring-tools-for-eclipse-4.32.2.RELEASE\\pentagonlife\\penta\\01_registration.feature",
				},
		
		glue = {"step_definationpenta"},
				 dryRun = false,
				    monochrome = true,
				    plugin = {
				        "pretty",
				        "html:reports/cucumber-html-report.html",
				        "json:reports/cucumber.json",
				        "junit:reports/cucumber.xml"
				    }
		
		
		
		

		
		)
public class Runpenta extends AbstractTestNGCucumberTests {

}
