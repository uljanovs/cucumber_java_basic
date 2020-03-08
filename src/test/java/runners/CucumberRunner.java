package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {/*"src/test/resources/features/Sample1.feature",
                "src/test/resources/features/Cats.feature",*/
                "src/test/resources/features/Task1.feature",
                "src/test/resources/features/Task2.feature"},
        plugin = {"pretty", "html:cucumber-report/html-report",
                "junit:cucumber-report/junit-report.xml",
                "json:cucumber-report/json-report.json"},
        tags = {"~@test", "~@bug", "~@smokeTest", "~@regressionTest", "@TaskOne"},
        glue = {"stepDefinitions"}
)
public class CucumberRunner {

}
