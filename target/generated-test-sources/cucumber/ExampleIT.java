import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
features = {"/Users/mdvp/eclipse-workspace_cucumber/cucumber/src/test/resources/features/example.feature:8"},
plugin = {"json:target/cucumber-reports/3.json"},
monochrome = false,
glue = { "cucumber" })
public class ExampleIT {
}
