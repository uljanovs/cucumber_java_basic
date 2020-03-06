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

import static org.junit.Assert.*;

public class TaskTwoSteps {
    private WebDriver driver;

    public TaskTwoSteps() {
        this.driver = Hooks.driver;
    }

    @Given("^I open the page$")
    public void openPage() throws Throwable {
        driver.get("https://uljanovs.github.io/site/tasks/list_of_people_with_jobs.html");


    }

    @When("^I press add person button$")
    public void iPressAddPersonButton() {
        driver.findElement(By.xpath("(//*[@id='addPersonBtn'])[1]")).click();
    }

    @And("^I see new page$")
    public void iSeeNewPage() {
        assertEquals("https://uljanovs.github.io/site/tasks/enter_a_new_person_with_a_job.html", driver.getCurrentUrl());
    }

    @And("^I add  new name \"([^\"]*)\"$")
    public void iAddNewName(String name) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(name);
    }

    @And("^I add new job title \"([^\"]*)\"$")
    public void iAddNewJobTitle(String title) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"job\"]")).sendKeys(title);
    }

    @And("^I press add button$")
    public void iPressAddButton() {
        driver.findElement(By.xpath("//*[@id='modal_button']")).click();
    }

    @And("^I redirect on main page$")
    public void iRedirectOnMainPage() {
        assertEquals("https://uljanovs.github.io/site/tasks/list_of_people_with_jobs.html", driver.getCurrentUrl());

    }
    @And("^I see new \"([^\"]*)\" and new \"([^\"]*)\" there$")
    public void iSeeNewAndNewThere(String name, String title) throws Throwable {
        assertTrue(driver.findElement(By.xpath("//*[@id='person3']/span[3]")).isDisplayed());
        assertTrue(driver.findElement(By.xpath("//*[@id=\"person3\"]/span[4]")).isDisplayed());


    }

    @And("^I reset list button$")
    public void iResetListButton() {
        driver.findElement(By.xpath("(//*[@id=\"addPersonBtn\"])[2]")).click();
    }

    @Then("^I don't see new person$")
    public void iSeePerson() {

        assertFalse(driver.findElement(By.xpath("//*[@id='person3']/span[3]")).isDisplayed());
        assertFalse(driver.findElement(By.xpath("//*[@id=\"person3\"]/span[4]")).isDisplayed());



    }

    @When("^I press edit button$")
    public void iPressEditButton() {
        driver.findElement(By.xpath("//*[@id='person0']/span[2]/i")).click();
    }

    @And("^I see person page$")
    public void iSeePersonPage() {
    }

    @And("^I change job title$")
    public void iChangeJobTitle() {
    }

    @And("^I press new edit button$")
    public void iPressNewEditButton() {
    }

    @And("^I reset a page$")
    public void iResetAPage() {

    }

    @Then("^I check result$")
    public void iCheckResult() {
    }


    }



   /* @When("^I want to add a new peron \"([^\"]*)\"$")
    public void iWantToAddANewPeron(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    } */







    

