package runnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {".\\src\\test\\java\\featureFile\\Login.feature"},
		glue = {"stepDefinations"},
		monochrome = true,
		dryRun = false
		
		
		
		
		)

public class RunnerIO extends AbstractTestNGCucumberTests{

}
