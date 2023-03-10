package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features="Features/HooksConcept.feature",
		         glue={"hookStepDefinitions"},
		         dryRun = false,
		         monochrome = true,
		         plugin = {"pretty","html:target/HtmlReports/report.html",
		        		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)


public class TestRun {

	
}
