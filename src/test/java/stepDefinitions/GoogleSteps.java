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
       // gPage.clickSearchField();
        WebElement SearchField = driver.findElement(By.name("q"));
        SearchField.click();
    }
    @When("^I Enter: \"([^\"]*)\"$")
    public void iEnterValue(String searchvalue) throws Throwable {
        WebElement SearchField = driver.findElement(By.name("q"));
        SearchField.clear();
        SearchField.sendKeys(searchvalue);
    }
    @When("^I Click on Search Button$")
    public void iClickSearchButton() {
        WebElement SearchButton = driver.findElement(By.name("btnK"));
        SearchButton.submit();
//    gPage.clickSearchButton();
    }
    @Then("^I see: \"([^\"]*)\"$")
        public void iSeeResult(String result) throws Throwable {
        //    gPage.checkResult();
        assertEquals(result, driver.findElement(By.name("q")).getAttribute("value"));

    }

}

