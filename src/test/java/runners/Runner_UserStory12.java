package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/Login.feature",
                "src/test/resources/features/UserStory12.feature",
                "src/test/resources/features/Checkout.feature" },
        plugin = {"pretty", "html:cucumber-report/html-report",
                "junit:cucumber-report/junit-report.xml",
                "json:cucumber-report/json-report.json"},
        tags = {/*"@Login", "@AddToCart", "@Checkout", "@UserStory12"*/},
        glue = {"stepDefinitions"}
)
public class Runner_UserStory12 {


}
