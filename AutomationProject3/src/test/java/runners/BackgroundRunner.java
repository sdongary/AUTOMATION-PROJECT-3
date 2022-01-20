package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				features = "C:\\Users\\siddh\\Selenium\\AutomationProject3\\src\\test\\java\\features\\Background.feature",
				glue = "steps",
				//tags = "@Scenario",
				monochrome = true,
				dryRun = false,
				plugin = {
						   "pretty",
						   "html:target/cucumber",
						   "json:target/cucumber.json"
						}
						)
		
public class BackgroundRunner {

}
