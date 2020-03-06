package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class Task2Steps {
    private WebDriver driver;

    public Task2Steps() {
        this.driver = Hooks.driver;
    }

    @Given("^I am on application page$")
    public void i_am_on_application_page() throws Throwable {
        driver.get("https://uljanovs.github.io/site/tasks/list_of_people_with_jobs.html");
    }

    //-------------------------------------------ADD-----------------------------------------------
    @When("^I click on Add person button$")
    public void iClickOnAddPersonButton() {
        driver.findElement(By.id("addPersonBtn")).click();
    }

    @And("^I am on Add person page$")
    public void iAmOnAddPersonPage() throws Throwable {
        driver.get("https://uljanovs.github.io/site/tasks/enter_a_new_person_with_a_job.html");
    }

    @And("^I input name: \"([^\"]*)\"$")
    public void iInputName(String arg0) throws Throwable {
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys(arg0);
    }

    @And("^I input job: \"([^\"]*)\"$")
    public void iInputJob(String arg1) throws Throwable {
        driver.findElement(By.id("job")).clear();
        driver.findElement(By.id("job")).sendKeys(arg1);
    }

    @And("^I click Add button$")
    public void iClickAddButton() {
        WebElement addbutton = driver.findElement(By.id("modal_button"));
        addbutton.click();

    }


    @Then("^I check that new person has:  \"([^\"]*)\" \"([^\"]*)\"$")
    public void iCheckThatNewPersonHas(String arg0, String arg1) throws Throwable {
        assertEquals(arg0, driver.findElement(By.xpath("//*[@id=\"person3\"]/span[3]")).getText());
        assertEquals(arg1, driver.findElement(By.xpath("//*[@id=\"person3\"]/span[4]")).getText());

    }

    @And("^I reset person list$")
    public void iResetPersonList() {
        WebElement resetbutton = driver.findElement(By.xpath("//*[@id=\"addPersonBtn\"]"));
        resetbutton.click();
    }


    //-------------------------------------------EDIT-----------------------------------
    @When("^I click Edit sign$")
    public void iClickEditSign() {
        WebElement editsign = driver.findElement(By.xpath("//*[@id=\"person0\"]/span[2]/i"));
        editsign.click();
    }


    @And("^I am on Edit page$")
    public void iAmOnEditPage() {
        driver.get("https://uljanovs.github.io/site/tasks/enter_a_new_person_with_a_job.html?id=0");
    }


    @And("^I edit name: \"([^\"]*)\"$")
    public void iEditName(String arg0) throws Throwable {
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys(arg0);
    }


    @And("^I edit job: \"([^\"]*)\"$")
    public void iEditJob(String arg1) throws Throwable {
        driver.findElement(By.id("job")).clear();
        driver.findElement(By.id("job")).sendKeys(arg1);
    }


    @And("^I click Edit button$")
    public void iClickEditButton() {
        WebElement editbutton = driver.findElement(By.id("modal_button"));
        editbutton.click();
    }


    @Then("^I check that edited person has:  \"([^\"]*)\" \"([^\"]*)\"$")
    public void iCheckThatEditedPersonHas(String arg0, String arg1) throws Throwable {
        assertEquals(arg0, driver.findElement(By.xpath("//*[@id=\"person0\"]/span[3]")).getText());
        assertEquals(arg1, driver.findElement(By.xpath("//*[@id=\"person0\"]/span[4]")).getText());
    }


    //------------------------------------REMOVE------------------------------------
    @When("^I click Remove sign$")
    public void iClickRemoveSign() {
        WebElement removesign = driver.findElement(By.xpath("//*[@id=\"person0\"]/span[1]"));
        removesign.click();
    }


    @Then("^I check that the person is removed$")
    public void iCheckThatThePersonIsRemoved() {
            assertEquals(0, driver.findElements(By.xpath("//*[@id=\"person0\"]/span[3]")).size());
    }


    //---------------------------CLEAR-----------------------
    @And("^I click Clear button$")
    public void iClickClearButton() {
        WebElement clearbutton = driver.findElement(By.xpath("//*[@id=\"addPersonBtn\"]"));
        clearbutton.click();
    }

    @Then("^I check that fields are empty$")
    public void iCheckThatFieldsAreEmpty() {
        assertEquals("", driver.findElement(By.id("name")).getAttribute("value"));
        assertEquals("", driver.findElement(By.id("job")).getAttribute("value"));
    }

    @And("^I click Cancel$")
    public void iClickCancel() {
        WebElement cancelbutton = driver.findElement(By.xpath("//*[@id=\"modal_button\"]"));
        cancelbutton.click();
    }
}
