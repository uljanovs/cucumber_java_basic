package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GoogleSteps {
    private WebDriver driver;

    public GoogleSteps() {
        this.driver = Hooks.driver;
    }

    @Given("^I am on Google page$")
    public void iAmOnActionPage() {
        driver.get("https://uljanovs.github.io/site/examples/actions");
    }
}
