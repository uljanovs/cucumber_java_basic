package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages_sample.EnterNumberPage;

import java.util.Map;

import static org.junit.Assert.assertEquals;


public class EnterNumberSteps {
    private WebDriver driver;
    static EnterNumberPage enterNumberPage;

    public EnterNumberSteps() {
        this.driver = Hooks.driver;
        enterNumberPage = PageFactory.initElements(Hooks.driver, EnterNumberPage.class);
    }

    @Given("^I am on enter a Number Page$")
    public void iAmOnNumberPage() {
        driver.get("https://uljanovs.github.io/site/tasks/enter_a_number");
    }

    @When("^I click on \"Please enter a number from 50 to 100\" field$")
    public void iClickInputField() {
        WebElement Input = driver.findElement(By.id("numb"));
        Input.click();
    }

    @When("^I enter : \"([^\"]*)\"$")
    public void iEnterValue(String value) {
        WebElement Input = driver.findElement(By.id("numb"));
        Input.sendKeys(value);
    }

    @When("^I click on Submit$")
    public void iClickSubmit() {
        WebElement Submit = driver.findElement(By.className("w3-orange"));
        Submit.click();
    }

    @Then("^I see error: \"([^\"]*)\"$")
    public void iCheckResultNegative(String message) {
        assertEquals(message, driver.findElement(By.id("ch1_error")).getText());
    }
    @Then("^I see alert: \"([^\"]*)\"$")
    public void iCheckResultPositive(String message) {
        Alert alert = driver.switchTo().alert();
        assertEquals(message, alert.getText());
    }
}
