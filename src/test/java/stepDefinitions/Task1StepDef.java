package stepDefinitions;
import cucumber.api.PendingException;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages_sample.GooglePage;

public class Task1StepDef {
    private WebDriver driver;

    public Task1StepDef() {
        this.driver = Hooks.driver;
    }

    @Given("^I am on the application page$")
    public void iAmOnTheApplicationPage() {
        driver.get("https://uljanovs.github.io/site/tasks/enter_a_number");
    }

    @When("^I enter \"([^\"]*)\"$")
    public void iEnter(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("numb")).clear();
        driver.findElement(By.id("numb")).sendKeys(input);
    }


    @And("^I press Submit button$")
    public void iPressSubmitButton() {
        driver.findElement(By.className("w3-btn")).click();
    }


    @Then("^I see an \"([^\"]*)\"$")
    public void iSeeAn(String error) throws Throwable {
        if (error == "Number is too small"){
            Assert.assertEquals("Number is too small", error);
        }
        else if (error == "Number is too big"){
            Assert.assertEquals("Number is too big", error);
        }
        else if (error == "Please enter a number"){
            Assert.assertEquals("Please enter a number", error);
        }
    }

    @Then("^I see an alert$")
    public void iSeeAnAlert() {
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals("Square root of 100 is 10.00", alert.getText());
    }
}
