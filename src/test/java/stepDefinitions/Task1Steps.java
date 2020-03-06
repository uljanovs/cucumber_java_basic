package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import pages_sample.AgePage;
import pages_sample.NumbersPage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class Task1Steps {
    private WebDriver driver;
    static NumbersPage numbersPage;

    public Task1Steps() {
        this.driver = Hooks.driver;
        numbersPage = PageFactory.initElements(Hooks.driver, NumbersPage.class);
    }

    @Given("^user is on the number page$")
    public void iAmOnNumberPage() throws Throwable {
        driver.get("https://uljanovs.github.io/site/tasks/enter_a_number");
    }

    @When("^i enter\"([^\"]*)\"$")
    public void i_enter(String invalid_value) throws Throwable {
        numbersPage.EnterInvalidValue(invalid_value);
    }

    @When("^i click submit$")
    public void i_click_submit() throws Throwable {
        numbersPage.ClickOnSubmit();
    }

    @Then("^i see error message \"([^\"]*)\"$")
    public void i_see_error_message(String error) throws Throwable {
        numbersPage.seeErrorMessage(error);
    }

    @When("^i enter valid value: \"([^\"]*)\"$")
    public void i_enter_valid_value(String number) throws Throwable {
        numbersPage.EnterValidValue(number);
    }

    @Then("^i see result: \"([^\"]*)\"$")
    public void i_see_result(String resultMessage) throws Throwable {
        System.out.println("1" + resultMessage);
        numbersPage.result(resultMessage, driver.switchTo().alert());
    }


}
