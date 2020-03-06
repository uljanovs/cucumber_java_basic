package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
        driver.get("https://www.google.lv/");
    }
    @When("^I enter search criteria: \"([^\"]*)\"$")
    public void iEnterSearchCriteria(String name) throws Throwable {
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys(name);
    }
    @When("^I enter: \"([^\"]*)\" in search field$")
    public void iEnterName(String animal) throws Throwable {
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys(animal);
    }
    @And("^I search$")
    public void iClickGoogleSearch() throws Throwable {
        //driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
        //driver.findElement(By.linkText("Google Search")).click();
        driver.findElement(By.name("q")).submit();
    }

    @Then("^I see results$")
    public void iSeeResultIsNotEmpty() throws Throwable {
        assertTrue(driver.findElement(By.id("result-stats")).isDisplayed());
    }
}
