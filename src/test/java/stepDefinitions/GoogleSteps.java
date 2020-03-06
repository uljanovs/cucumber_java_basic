package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GoogleSteps {
    private WebDriver driver;
    private String animalChoise;

    public GoogleSteps() {
        this.driver = Hooks.driver;
    }

    @Given("^I am on google search page$")
    public void iAmOnGooglePage() throws Throwable {
        driver.get("https://www.google.com/");
    }
    @When("^I find search field$")
    public void i_find_search_field() throws Throwable {
      assertTrue(driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).isDisplayed());
    }
      @And("^I enter search creteria \"([^\"]*)\"$")
       public void iEnterSearchCreteria(String criteria) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys(criteria);
        animalChoise = criteria;

    }

        @And("^I press search button$")
        public void iPressSearch() throws Throwable {
            driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[2]/div[2]/div[2]/center/input[1]")).click();
        }

    @Then("^I see list with cats$")
    public void iSeeListCat() throws Throwable {
        driver.get("https://forvr.live/wqse0l6");
         }



}

