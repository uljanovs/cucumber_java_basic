package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages_sample.*;
import org.junit.ComparisonFailure;

import java.util.Map;

import static org.junit.Assert.*;

public class Task2_Steps {
    private WebDriver driver;

    public Task2_Steps() {
        this.driver = Hooks.driver;
    }

    @Given("^I am on People with jobs page$")
    public void iAmOnPeopleWithJobsPage() {
        driver.get("https://uljanovs.github.io/site/tasks/list_of_people_with_jobs.html");
    }

    @When("^I click AddPerson$")
    public void iClickAddPerson() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"addPersonBtn\"]")).click();
    }

    @And("^I type name: \"([^\"]*)\"$")
    public void iTypeName(String name) throws Throwable {
        driver.findElement(By.id("name")).sendKeys(String.valueOf(name));
    }

    @And("^I type job: \"([^\"]*)\"$")
    public void iTypeJob(String job) throws Throwable {
        driver.findElement(By.id("job")).sendKeys(String.valueOf(job));
    }

    @And("^I press Add$")
    public void iPressAdd() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"modal_button\"]")).click();
    }

    @And("^I check added name: \"([^\"]*)\"$")
    public void iCheckAddedName(String name) throws Throwable {
        assertEquals(name, driver.findElement(By.xpath("//*[@id=\"person3\"]/span[3]")).getText());
    }

    @And("^I check added job: \"([^\"]*)\"$")
    public void iCheckAddedJob(String job) throws Throwable {
        assertEquals(job, driver.findElement(By.xpath("//*[@id=\"person3\"]/span[4]")).getText());
    }

    @Then("^I press reset list$")
    public void iPressResetList() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"addPersonBtn\"]")).click();
    }

    //______________________________________________________________________
    @When("^I click EditPerson$")
    public void iClickEditPerson() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"person0\"]/span[2]/i")).click();
    }

    @And("^I edit name: \"([^\"]*)\"$")
    public void iEditName(String name) throws Throwable {
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("name");
    }

    @And("^I edit job: \"([^\"]*)\"$")
    public void iEditJob(String job) throws Throwable {
        driver.findElement(By.id("job")).clear();
        driver.findElement(By.id("job")).sendKeys("job");
    }

    @And("^I press Edit$")
    public void iPressEdit() throws Throwable {
        driver.findElement(By.id("modal_button")).click();
    }

    @And("^I check edited name: \"([^\"]*)\"$")
    public void iCheckEditedName(String name) throws Throwable {
        assertEquals("name", driver.findElement(By.xpath("//*[@id=\"person0\"]/span[3]")).getText());
    }

    @And("^I check edited job: \"([^\"]*)\"$")
    public void iCheckEditedJob(String job) throws Throwable {
        assertEquals("job", driver.findElement(By.xpath("//*[@id=\"person0\"]/span[4]")).getText());
    }

    @Then("^I reset list$")
    public void iResetList() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"addPersonBtn\"]")).click();
    }

    //____________________________________________________________________________
    @When("^I click DeletePerson$")
    public void iClickDeletePerson() {
        driver.findElement(By.xpath("//*[@id=\"person0\"]/span[1]")).click();
    }

    @And("^I check persons$")
    public void iCheckPersons() {
        assertEquals(0, driver.findElements(By.xpath("//*[@id=\"person0\"]/span[3]")).size());
    }

    @Then("^I push update$")
    public void iPushUpdate() {
        driver.findElement(By.xpath("//*[@id=\"addPersonBtn\"]")).click();
    }

    //________________________________________________________________________________
    @When("^I Add person$")
    public void iAddPerson() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"addPersonBtn\"]")).click();
    }
    @And("^I input name: \"([^\"]*)\"$")
    public void iInputName(String name) throws Throwable {
        driver.findElement(By.id("name")).sendKeys(String.valueOf(name));
    }
    @And("^I input job: \"([^\"]*)\"$")
    public void iInputJob(String job) throws Throwable {
        driver.findElement(By.id("job")).sendKeys(String.valueOf(job));
    }
    @And("^I click clear$")
    public void iClickClear() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"addPersonBtn\"]")).click();
    }
    @And("^I check fields are clear all fields$")
        public void iCheckFieldsAreClearAllFields() {
            assertEquals("", driver.findElement(By.id("name")).getAttribute("value"));
            assertEquals("", driver.findElement(By.id("job")).getAttribute("value"));
        }
    @And("^I click cancel$")
    public void iClickCancel() {
        driver.findElement(By.xpath("//*[@id=\"modal_button\"]")).click();
    }
    @Then("^I am on home page$")
    public void iAmOnHomePage() {
        driver.findElement(By.xpath("/html/body/div[2]")).click();
    }
}
