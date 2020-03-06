package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages_sample.*;

import java.util.Map;

import static org.junit.Assert.*;

public class Task2_Steps {
    private WebDriver driver;

    public Task2_Steps() {
        this.driver = Hooks.driver;
    }

    @Given("^I am on People with jobs page$")
    public void iAmOnPeopleWithJobsPage()  {
        driver.get("https://uljanovs.github.io/site/tasks/list_of_people_with_jobs.html");
    }
    @When("^I click AddPerson button$")
    public void iClickAddPerson() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"addPersonBtn\"]")).click();
    }
    @And("^I type name: \"([^\"]*)\"$")
    public void iTypeName(String name) throws Throwable {
        driver.findElement(By.id("name")).sendKeys(String.valueOf(name));
    }
    @And("^I enter job: \"([^\"]*)\"$")
    public void iTypeJob(String name) throws Throwable {
        driver.findElement(By.id("job")).sendKeys(String.valueOf(name));
    }
    @And("^I press Add$")
    public void iPressAdd() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"modal_button\"]")).click();
    }
    @Then("^I press reset list$")
    public void iPressResetList() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"addPersonBtn\"]")).click();
    }


    @When("^I click EditPerson button$")
    public void iClickEditPersonButton() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"person0\"]/span[2]/i")).click();

    }
    @And("^I edit name: \"([^\"]*)\"$")
    public void iEditName(String name) throws Throwable {
        driver.findElement(By.id("name")).sendKeys(String.valueOf(name));
    }
    @And("^I edit job: \"([^\"]*)\"$")
    public void iEditJob(String name) throws Throwable {
        driver.findElement(By.id("job")).sendKeys(String.valueOf(name));
    }
    @And("^I press Edit$")
    public void iPressEdit() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"modal_button\"]")).click();
    }
    @Then("^I reset list$")
    public void iResetList() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"addPersonBtn\"]")).click();
    }


    @When("^I click DeletePerson button$")
    public void iClickDeletePersonButton() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"person0\"]/span[1]")).click();
    }
    @And("^I check list$")
    public void iCheckList(String name) throws Throwable {
        assertEquals(0, driver.findElements(By.xpath("//*[@id=\"person0\"]/span[3]")).size());
    }
   // @Then("^I press reset$")
   // public void iPressReset() throws Throwable {
    //    driver.findElement(By.xpath("//*[@id=\"addPersonBtn\"]")).click();
  //  }

//assertEquals("0", driver.findelementby(whatever).size())
}
