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
import pages_sample.NumbersPage;

public class Task1StepDef {
    private WebDriver driver;
    static NumbersPage numbersPage;

    public Task1StepDef() {
        this.driver = Hooks.driver;
        numbersPage = PageFactory.initElements(Hooks.driver, NumbersPage.class);
    }

    @Given("^I am on the application page$")
    public void iAmOnTheApplicationPage() {
        driver.get("https://uljanovs.github.io/site/tasks/enter_a_number");
    }

    @When("^I enter \"([^\"]*)\"$")
    public void iEnter(String input) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        numbersPage.enterValue().sendKeys(input);
    }


    @And("^I press Submit button$")
    public void iPressSubmitButton() {
        numbersPage.submit();
    }


    @Then("^I see an \"([^\"]*)\"$")
    public void iSeeAn(String err) throws Throwable {

        Assert.assertEquals(err, driver.findElement(By.id("ch1_error")).getText());
    }

    @Then("^I see an alert$")
    public void iSeeAnAlert() {
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals("Square root of 100 is 10.00", alert.getText());
    }
}
