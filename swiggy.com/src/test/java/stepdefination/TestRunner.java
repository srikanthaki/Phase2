package stepdefination;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	monochrome=true,	
	plugin = {"pretty", "html:target/cucumber-html" ,"json:target/Swiggycucumber.json" },
	features = "src/test/java/feature",

	glue = { "stepdefination" }
	)
public class TestRunner {

}
