package testRun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//feature//",
		glue="steps",
		monochrome=true,
		tags= {"@tag1"},
		plugin= {"pretty","html:test-output"}
		)
public class TestRunner {

}
