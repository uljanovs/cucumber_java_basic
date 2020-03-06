package stepDefinitions;

import cucumber.api.PendingException;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;

import static org.junit.Assert.assertEquals;

public class Task2 {
    private WebDriver driver;

    public Task2() {
        this.driver = Hooks.driver;
    }
    @Given("^I am on the page \"([^\"]*)\"$")
    public void iAmOnThePage() throws Throwable {
        driver.get("https://uljanovs.github.io/site/tasks/list_of_people_with_jobs.html");
    }

    @When("^I click Edit button$")
    public void iClickEditButton() throws Throwable{
        driver.findElement(By.xpath("//*[@id=\"person2\"]/span[2]/i")).click();
    }

    @Then("^I am redirected to \"([^\"]*)\" page$")
    public void iAmRedirectedToPage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}