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
import static org.junit.Assert.assertTrue;

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

    @When("^I enter \"([^\"]*)\" \"([^\"]*)\" to the search field$")
    public void iEnterToTheSearchField (String characteristic, String animalz) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
            googlePage.enterSearch(characteristic + " " + animalz);
    }

    @When("^I press Search button$")
    public void i_press_Search_button() throws Throwable {
        WebElement SearchButton = driver.findElement(By.name("btnK"));
        SearchButton.submit();
    }

    @Then("^I should see search results$")
    public void i_should_see_search_results() throws Throwable {
        assertTrue(googlePage.verifySearchResult());

    }



    }

