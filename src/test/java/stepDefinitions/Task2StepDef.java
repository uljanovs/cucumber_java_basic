package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages_sample.ListPage;
import stepDefinitions.Hooks;

import static org.junit.Assert.assertEquals;

public class Task2StepDef {
    private WebDriver driver;
    static ListPage listPage;

    public Task2StepDef() {
        this.driver = Hooks.driver;
        listPage = PageFactory.initElements(Hooks.driver, ListPage.class);
    }

    @Given("^I am on the List page$")
    public void iAmOnTheListPage() {
        driver.get("https://uljanovs.github.io/site/tasks/list_of_people_with_jobs.html");
    }

    @When("^I press add button$")
    public void iPressAddButton() {
        listPage.addPerson();
    }

    @And("^I add \"([^\"]*)\"$")
    public void iAdd(String name) throws Throwable {
        listPage.enterName().sendKeys(name);
    }

    @And("^add \"([^\"]*)\"$")
    public void add(String job) throws Throwable {
        listPage.enterJob().sendKeys(job);
    }

    @And("^I confirm addition$")
    public void iConfirmAddition() throws InterruptedException {
        listPage.confirmAddition();

    }

    @And("^I check that \"([^\"]*)\" is correct$")
    public void iCheckThatIsCorrect(String name) throws Throwable {
        WebDriverWait wait = (WebDriverWait)
                new WebDriverWait(driver, 10).ignoring(StaleElementReferenceException.class);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#person3 > span.w3-xlarge.name")));
        assertEquals(name, listPage.addedName());
        //driver.findElement(By.cssSelector("#person3 > span.w3-xlarge.name"))
    }

    @And("^I check \"([^\"]*)\" is correct$")
    public void iCheckIsCorrect(String job) throws Throwable {
        WebDriverWait wait = (WebDriverWait)
                new WebDriverWait(driver, 10).ignoring(StaleElementReferenceException.class);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"person3\"]/span[4]")));
        assertEquals(job, listPage.addedJob());
    }

    @Then("^I reset list$")
    public void iResetList() {
        listPage.resetList();
    }


    @When("^I press edit button$")
    public void iPressEditButton() {
        listPage.editPerson();
    }

    @And("^I edit \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEditAnd(String name, String job) throws Throwable {
        listPage.enterName().clear();
        listPage.enterJob().clear();
        listPage.enterName().sendKeys(name);
        listPage.enterJob().sendKeys(job);
    }

    @And("^I confirm editing$")
    public void iConfirmEditing() {
        listPage.confirmEdition();
    }

    @And("^I check \"([^\"]*)\" and \"([^\"]*)\" edited correctly$")
    public void iCheckAndEditedCorrectly(String name, String job) throws Throwable {
        WebDriverWait wait = (WebDriverWait)
                new WebDriverWait(driver, 10).ignoring(StaleElementReferenceException.class);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"person0\"]/span[3]")));
        assertEquals(name, listPage.editedName());
        // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='person0']/span[4]")));
        assertEquals(job, listPage.editedJob());
    }


    @When("^I press Delete button$")
    public void iPressDeleteButton() {
        listPage.deletePerson();
    }

    @And("^I check that person removed$")
    public void iCheckThatPersonRemoved() {
        assertEquals(0, driver.findElements(By.xpath("//*[@id=\"person0\"]/span[3]")).size());
        assertEquals(0, driver.findElements(By.xpath("//*[@id=\"person0\"]/span[4]")).size());

    }

    @And("^I check fields \"([^\"]*)\" and \"([^\"]*)\" are filled correctly$")
    public void iCheckFieldsAndAreFilledCorrectly(String name, String job) throws Throwable {
        assertEquals(name, listPage.enterName().getAttribute("value"));
        assertEquals(job, listPage.enterJob().getAttribute("value"));
    }

    @And("^I press Clear button$")
    public void iPressClearButton() {
        listPage.clearFields();
    }

    @Then("^I check that fields are empty$")
    public void iCheckThatFieldsAreEmpty() {
        assertEquals("", listPage.enterName().getAttribute("value"));
        assertEquals("", listPage.enterName().getAttribute("value"));
    }


}
