package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Task_1Steps {
    private WebDriver driver;
    public Task_1Steps() {
        this.driver = Hooks.driver;
    }

        @Given("^I am on calculator page$")
        public void iAmOnCalculatorPage() {
            driver.get("https://uljanovs.github.io/site/tasks/enter_a_number");
        }

        @When("^I enter value: \"([^\"]*)\"$")
        public void iEnterValue(String arg) throws Throwable {
            driver.findElement(By.id("numb")).sendKeys();
        }

        @And("^I click submit$")
        public void iClickSubmit() {
            driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/button")).click();
        }
        @Then("I see error message: \"([^\"]*)\"$")
                public void iSeeMessage(String args) throws Throwable{
            driver.findElement(By.xpath("//*[@id=\"ch1_error\"]")).getText();
    }

        @When("^I enter numbers$")
        public void iEnterNumbers() {
            driver.findElement(By.id("numb")).sendKeys();
        }

        @Then("^message with correct answer is displayed$")
        public void messageWithCorrectAnswerIsDisplayed() {
            assertTrue(driver.findElement(By.xpath("//*[@id=\"ch1_error\"]")).isDisplayed());
        }


    }


