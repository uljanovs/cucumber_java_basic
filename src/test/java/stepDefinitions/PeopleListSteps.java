package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages_sample.*;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PeopleListSteps {
    private WebDriver driver;
    static ListPage listPage;
    static FormPage formPage;

    public PeopleListSteps() {
        this.driver = Hooks.driver;
        listPage = PageFactory.initElements(Hooks.driver, ListPage.class);
        formPage = PageFactory.initElements(Hooks.driver, FormPage.class);
    }

    //On page
    @Given("^I am on People List Page$")
    public void iAmOmListPage() throws Throwable {
        driver.get("https://uljanovs.github.io/site/tasks/list_of_people.html");
    }

    //Add/Edit Button
    @When("^I click on Add Button$")
    public void iClickAdd() throws Throwable {
        listPage.clickAddPersonButton();
    }

    @When("^I click on Edit Button$")
    public void iClickOnEditButton() {
        listPage.clickEdit();
    }
    //Fill Fields

    @And("^I fill Name: \"([^\"]*)\"$")
    public void iFillName(String Name) {
        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(Name);
        // formPage.enterName();
    }

    @And("^I fill Surname: \"([^\"]*)\"$")
    public void iFillSurname(String Surname) {
        formPage.clickSurnameField();
        driver.findElement(By.xpath("//*[@id=\"surname\"]")).sendKeys(Surname);
        //formPage.enterSurname();
    }

    @And("^I fill Job: \"([^\"]*)\"$")
    public void iFillJob(String Job) {
        formPage.clickJobField();
        driver.findElement(By.xpath("//*[@id=\"job\"]")).sendKeys(Job);
        //      formPage.enterJob();
    }


    @And("^I fill Languages$")
    public void iFillLanguages() {
        formPage.chooseAllLanguages();
    }

    @And("^I fill Birth: \"([^\"]*)\"$")
    public void iFillBirth(String Birth) {
        driver.findElement(By.className("hasDatepicker")).click();
        driver.findElement(By.className("hasDatepicker")).sendKeys(Birth);
    }

    @And("^I fill Gender$")
    public void iFillGender() {
        formPage.chooseMaleGender();
    }

    @And("^I fill Employee Status$")
    public void iFillEmployeeStatus() {
        formPage.chooseInternStatus();
    }

    @And("^I click \"([^\"]*)\"$")
    public void iClick(String button) throws Throwable {
        formPage.addButtonClick();
    }

    //Add/Edit/Cancel on FormPage
    @And("I click Add")
    public void iClickAddB() throws Throwable {
        formPage.addButtonClick();
    }

    @And("^I click Edit$")
    public void iClickEditB() {
        formPage.editButtonClick();
    }

    @And("^I click Cancel$")
    public void iClickCancel() {
        formPage.cancelButtonClick();
    }
    //Result

    @Then("^I see \"([^\"]*)\"$")
    public void iSee(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I see Person Added")
    public void iSeeW() throws Throwable {
        listPage.WilliamIsPresentCheck();
    }

    @And("^Others are untouched$")
    public void othersAreUntouched() {
        listPage.JaneIsPresentCheck();
        listPage.JillIsPresentCheck();
    }

    @Then("^I see Mike is William$")
    public void iSeeMikeIsWilliam() {
        listPage.MikeIsChangedCheck();
    }

    @Then("^I see Mike is Deleted$")
    public void iSeeMikeIsDeleted() {
        listPage.MikeDeletedCheck();
    }

    //Reset
    @And("^I reset List$")
    public void iResetList() {
    }
//Delete

    @And("^I Clear All Fields$")
    public void iClearAllFields() {
    }

    @And("^I fill \"([^\"]*)\" with \"([^\"]*)\"$")
    public void iFillWith(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click on Delete Mike$")
    public void iClickOnDeleteMike() {
        listPage.clickDelete1();
    }

    @When("^I click on Delete Jill$")
    public void iClickOnDeleteJill() {
        listPage.clickDelete2();
    }

    @When("^I click on Delete Jane$")
    public void iClickOnDeleteJane() {
        listPage.clickDelete3();
    }


    @Then("^I see No List$")
    public void iSeeNoList() {
        listPage.PeopleListNotDisplayedCheck();
    }


    @Then("^I see no changes$")
    public void iSeeNoChanges() {
        listPage.MikeIsPresentCheck();
        listPage.JillIsPresentCheck();
        listPage.JaneIsPresentCheck();
    }
}
