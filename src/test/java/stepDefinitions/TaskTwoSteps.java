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
        assertTrue(driver.findElement(By.xpath("//*[@id='person3']/span[4]")).isDisplayed());

    }

    @And("^I reset list button$")
    public void iResetListButton() {
        driver.findElement(By.xpath("(//*[@id=\"addPersonBtn\"])[2]")).click();
    }

    @Then("^I don't see new person$")
    public void iSeePerson() {

        assertFalse(driver.findElements(By.xpath("//*[@id='person3']/span[3]")).size() > 0);
        assertFalse(driver.findElements(By.xpath("//*[@id='person3']/span[4]")).size() > 0);


    }

    @When("^I press edit button$")
    public void iPressEditButton() {
        driver.findElement(By.xpath("//*[@id='person0']/span[2]/i")).click();
    }

    @And("^I see person page$")
    public void iSeePersonPage() {
        assertEquals("https://uljanovs.github.io/site/tasks/enter_a_new_person_with_a_job.html?id=0", driver.getCurrentUrl());
    }

    @And("^I change person name$")
    public void iChangePersonName() {
        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("John");
    }


    @And("^I change job title$")
    public void iChangeJobTitle() {
        driver.findElement(By.xpath("//*[@id=\"job\"]")).sendKeys("Manager");
    }


    @And("^I press new edit button$")
    public void iPressNewEditButton() {

            driver.findElement(By.xpath("(//*[@id=\"modal_button\"])[1]")).click();
        }

        @And("^I am on main page$")
        public void iAmOnPage() {

            assertEquals("https://uljanovs.github.io/site/tasks/list_of_people_with_jobs.html", driver.getCurrentUrl());
        }

    @And("^I check edition name \"([^\"]*)\" and title \"([^\"]*)\"$")
    public void iCheckEdition (String name, String title) throws Throwable {
        assertTrue(driver.findElement(By.xpath("//*[@id='person0']/span[3]")).isDisplayed());
        assertTrue(driver.findElement(By.xpath("//*[@id='person0']/span[4]")).isDisplayed());
    }

        @And("^I reset a page$")
        public void iResetAPage () {
            driver.findElement(By.xpath("(//*[@id=\"addPersonBtn\"])[2]")).click();

        }

            @Then("^I check result name \"([^\"]*)\" and title \"([^\"]*)\"$")
            public void iCheckResultNameAndTitle(String arg0, String arg1) throws Throwable {
                assertTrue(driver.findElement(By.xpath("//*[@id='person0']/span[3]")).isDisplayed());
                assertTrue(driver.findElement(By.xpath("//*[@id='person0']/span[4]")).isDisplayed());

        }


    @When("^I press remove button$")
    public void iPressRemoveButton() {
        driver.findElement(By.xpath("//*[@id='person0']/span[1]")).click();

    }

    @And("^I see the result$")
    public void iSeeTheResult() {
        assertFalse(driver.findElements(By.xpath("//*[@id='person0']/span[3]")).size() > 0);
        assertFalse(driver.findElements(By.xpath("//*[@id='person0']/span[4]")).size() > 0);
    }

    @And("^I reset list$")
    public void iResetList() {
        driver.findElement(By.xpath("(//*[@id=\"addPersonBtn\"])[2]")).click();
    }

    @Then("^I see new list$")
    public void iSeeNewList() {
        assertTrue(driver.findElement(By.xpath("//*[@id='person0']/span[3]")).isDisplayed());
        assertTrue(driver.findElement(By.xpath("//*[@id='person0']/span[4]")).isDisplayed());

    }


    @When("^I click to add person button$")
    public void iClickToAddPersonButton() {
        driver.findElement(By.xpath("(//*[@id='addPersonBtn'])[1]")).click();
    }

    @And("^I open a new page$")
    public void iOpenANewPage() {
        assertEquals("https://uljanovs.github.io/site/tasks/enter_a_new_person_with_a_job.html", driver.getCurrentUrl());
    }


    @And("^I input a new name \"([^\"]*)\"$")
    public void iInputANewName(String name) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(name);
    }
    @And("^I input a new job title \"([^\"]*)\"$")
    public void iInputANewJobTitle(String title) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"job\"]")).sendKeys(title);
    }


    @And("^I press clear fields button$")
  public void iPressClearFieldsButton() {
  driver.findElement(By.xpath("//*[@id=\"addPersonBtn\"]")).click();
 }

    @And("^I see clear fields \"([^\"]*)\",\"([^\"]*)\"$")
    public void iSeeClearFields(String arg1, String arg2) {
        assertTrue("",driver.findElement(By.xpath("//*[@id='name']")).isDisplayed());
        assertTrue("", driver.findElement(By.xpath("//*[@id='job']")).isDisplayed());

    }

    @Then("^I press cancel button$")
    public void iPressCancelButton() {
        driver.findElement(By.xpath("//*[@id=\"modal_button\"]")).click();
    }


}










