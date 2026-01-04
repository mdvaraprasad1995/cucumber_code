import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
features = {"/Users/mdvp/eclipse-workspace_cucumber/cucumber/src/test/resources/features/amazon/login.feature:20"},
plugin = {"json:target/cucumber-reports/2.json"},
monochrome = false,
glue = { "cucumber" })
public class LoginIT {
}
