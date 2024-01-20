package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"feature"},
		glue = {"steps"},
		plugin = {"pretty","html:Report1"},
		dryRun = false,
		//monochrome = true,
		//name = "Advanced"
		tags = "@P32"
		)
public class TestRunner {

}
