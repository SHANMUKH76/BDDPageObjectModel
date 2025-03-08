package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/resources/features", glue = { "stepDefinition", "hooks" })

public class RediffRunnerTestCase extends AbstractTestNGCucumberTests {

}
