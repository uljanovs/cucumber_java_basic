package stepDefinitions;

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

    public GoogleSteps() {
        this.driver = Hooks.driver;
    }

    @Given("^I am on Google page$")
    public void iAmOnActionPage() {
        driver.get("https://www.google.com/");
    }
    @When("^I Click on Search Field$")
    public void iClickSearchField() {
        driver.findElement(By.name("q")).click();
    }
    @When("^I Enter Cat$")
    public void iEnterCat() {
        driver.findElement(By.name("q")).sendKeys("cat");;
    }
    @When("^I Click on Search Button$")
    public void iClickSearchButton() {
    WebElement SearchButton = driver.findElement(By.name("btnK"));
    SearchButton.click();
    }
    @Then("^I see Cats$")
        public void iSeeResult() {
            assertTrue(driver.findElement(By.name("q")).getAttribute("value").equals("cat"));
    }

}

