package stepDefinitions;

import cucumber.api.java.en.Given;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class Task1Steps {
    private WebDriver driver;

    public Task1Steps() {
        this.driver = Hooks.driver;
    }

    @Given("^user is on the number page$")
    public void iAmOnNumberPage() throws Throwable {
        driver.get("https://uljanovs.github.io/site");
    }

}
