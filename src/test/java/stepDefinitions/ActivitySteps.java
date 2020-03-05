package stepDefinitions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages_sample.GooglePage;

import static org.junit.Assert.assertEquals;

public class ActivitySteps {

    private WebDriver driver;
    static GooglePage googlePage;

    public ActivitySteps() {
        this.driver = Hooks.driver;
       googlePage = PageFactory.initElements(Hooks.driver, GooglePage.class);

    }

    @Given("^I am on google page$")
    public void i_am_on_google_page() throws Throwable {
        driver.get("https://www.google.com/");

    }

    @When("^I enter cute cats to the search field$")
    public void i_enter_cute_cats_to_the_search_field() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
            googlePage.enterSearch("cute cats");
    }

    @When("^I press Search button$")
    public void i_press_Search_button() throws Throwable {
        WebElement SearchButton = driver.findElement(By.name("btnK"));
        SearchButton.click();
    }

    @Then("^I should see search results$")
    public void i_should_see_search_results() throws Throwable {
        assertEquals("Attēli vaicājumam cute cats", googlePage.verifySearchResult());

    }


}
