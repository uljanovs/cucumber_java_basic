package stepDefinitions;

import com.beust.jcommander.IValueValidator;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Task1_Steps {
    private WebDriver driver;

    public Task1_Steps() {
        this.driver = Hooks.driver;
    }

    @Given("^I am on Enter a number page$")
    public void iAmOnEnterNumberPage() {
        driver.get("https://uljanovs.github.io/site/tasks/enter_a_number");
    }

    @When("^I enter a value: \"([^\"]*)\"$")
    public void iEnterAValue(String value) throws Throwable {
        driver.findElement(By.id("numb")).sendKeys(String.valueOf(value));
    }

    @And("^I click submit$")
    public void iClickSubmit() throws Throwable {
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/button")).click();
    }

    @Then("^I see error message: \"([^\"]*)\"$")
    public void iSeeError(String message) throws Throwable {
        assertEquals(message, driver.findElement(By.id("ch1_error")).getText());
    }


    @Then("^I see alert: \"([^\"]*)\"$")
    public void iSeeAlert(String message) {
        Alert alert = driver.switchTo().alert();
        assertEquals("Square root of 81 is 9.00", alert.getText());
    }
}