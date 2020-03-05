package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages_sample.AgePage;
import pages_sample.AgeSubmittedPage;
import pages_sample.GooglePage;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GoogleSteps {
    private WebDriver driver;
    static GooglePage gPage;


    public GoogleSteps() {
        this.driver = Hooks.driver;
        gPage = PageFactory.initElements(Hooks.driver, GooglePage.class);
    }

    @Given("^I am on Google page$")
    public void iAmOnActionPage() {
        driver.get("https://www.google.com/");
    }
    @When("^I Click on Search Field$")
    public void iClickSearchField() {
        gPage.clickSearchField();
    }
    @When("^I Enter Cat$")
    public void iEnterCat() {
        gPage.clearSearch();
        gPage.enterCat();
    }
    @When("^I Click on Search Button$")
    public void iClickSearchButton() {
    gPage.clickSearchButton();
    }
    @Then("^I see Cats$")
        public void iSeeResult() {
            gPage.checkResult();
    }

}

