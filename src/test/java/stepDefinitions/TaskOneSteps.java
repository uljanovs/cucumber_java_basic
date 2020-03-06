package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TaskOneSteps {
    private WebDriver driver;
    private String calcValue;


    public TaskOneSteps() {
        this.driver = Hooks.driver;
    }

    @Given("^I open a page$")
    public void iOpenPage() throws Throwable {
        driver.get("https://uljanovs.github.io/site/tasks/enter_a_number");
    }

    @And("^I see empty calculation field$")
    public void emptyField() throws Throwable {
        assertEquals("", driver.findElement(By.className("w3-input ")).getText());

    }

    @When("^I input an incorrect value \"([^\"]*)\"$")
    public void iInputAnIncorrectValue(String value) throws Throwable {
        driver.findElement(By.id("numb")).sendKeys(value);
        calcValue = value;

    }

    @And("^I press a search button$")
    public void iPressButton() throws Throwable {
        driver.findElement(By.className("w3-orange")).click();
    }


    @Then("^I see the error message \"([^\"]*)\"$")
    public void seeTheErrorMessage(String result) throws Throwable {
        assertEquals(result, driver.findElement(By.id("ch1_error")).getText());

    }

    @When("^I input correct value (\\d+)$")
    public void iInputCorrectValue(int number) {
        driver.findElement(By.id("numb")).sendKeys(String.valueOf(number));
    }

    @And("^I press search button again$")
    public void iPressSearchButtonAgain() {
        driver.findElement(By.className("w3-orange")).click();
    }

    @And("^I see alert message with text$")
    public void iSeeAlertMessageWithText() {
        Alert alert = driver.switchTo().alert();
        assertEquals("Square root of 100 is 10.00", alert.getText());


    }


}






