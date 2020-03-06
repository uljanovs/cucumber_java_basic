package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages_sample.Activity_2Page;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class Activity_2Steps {
    private WebDriver driver;


    public Activity_2Steps() {
        this.driver = Hooks.driver;
    }

    @Given("^I am on Google page;$")
    public void i_am_on_Google_page() throws Throwable {
        driver.get("https://www.google.com/");
    }

    @When("^I enter word : cats$")
    public void i_enter_word_cats() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("cats");
    }

   @And("^I click Search button$")
         public void clickSearch() throws Throwable {
            driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
       }

    @Then("^result is displayed$")
    public void iSeeResult () throws Throwable {
        assertTrue(driver.findElement(By.linkText("https://www.google.com/")).isDisplayed());
    }

}




