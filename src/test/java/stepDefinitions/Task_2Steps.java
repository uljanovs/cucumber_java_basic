package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class Task_2Steps {

    private WebDriver driver;
    public Task_2Steps() {
        this.driver = Hooks.driver;
    }



        @Given("^I am on person list page$")
        public void iAmOnPersonListPage() {
        driver.get("https://uljanovs.github.io/site/tasks/list_of_people_with_jobs.html");
        }

        @When("^I click on Add button$")
        public void iClickOnAddButton() {
        driver.findElement(By.xpath("//button[contains(.,'Add person')]")).click();
        }
        @And("^I enter person name$")
        public void iUpdatePersonName() {
        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys();
        }

        @And("^I enter person Job$")
        public void iEnterPersonJob() {
        driver.findElement(By.xpath("//*[@id=\"job\"]")).sendKeys();
        }



        @When("^I click on Edit button$")
        public void iClickOnEditButton() {
        driver.findElement(By.xpath("//*[@id=\"person0\"]/span[2]/i")).click();
        }

        @And("^I can update person name$")
        public void iCanUpdatePersonName() {
        driver.findElement(By.xpath("//*[@id=\"name\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys();
        }

        @And("^I can update person Job$")
        public void iCanUpdatePersonJob() {
        driver.findElement(By.xpath("//*[@id=\"job\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"job\"]")).sendKeys();
        }

        @Then("^I click <button> to add or clear just created person$")
        public void iClickButtonToAddOrClearJustCreatedPerson() {
        driver.findElement(By.xpath("//button[contains(.,'Add')]")).click();
        driver.findElement(By.xpath("//button[contains(.,'Clear all fields')]")).click();
        }



        @Then("^I click Edit button to complete$")
        public void iClickEditButtonToCompleteEdit() {
        driver.findElement(By.xpath("//*[@id=\"modal_button\"]")).click();
        }

        @When("^I see Close button$")
        public void iClickOnCloseButtonToDelete() {
            driver.findElement(By.xpath("//*[@id=\"person0\"]/span[1]"));
        }

        @And("^I press the close button in the person list$")
        public void IClickOnCloseInPersonList() {
        driver.findElement(By.xpath("//*[@id=\"person0\"]/span[1]")).click();
        }

        @Then("^Person is removed from list$")
        public void personIsNotInTheList() {
        assertFalse(driver.findElement(By.xpath("//*[@id=\"listOfPeople\"]/div[1]")).isDisplayed());
        }

        @Then("^I click <reset_remove> to delete person or reset all$")
        public void iClickReset_removeToDeletePersonOrResetAll() {
            driver.findElement(By.xpath("//*[@id=\"person0\"]/span[1]")).click();
            driver.findElement(By.xpath("//button[contains(.,'Reset List')]")).click();

        }


        @When("^I click on Reset button$")
        public void iClickOnResetButton() {
        driver.findElement(By.xpath("//button[contains(.,'Reset List')]")).click();

        }

        @Then("^I should see initial list of people$")
        public void iSeeInitialListAfterReset(){
        assertEquals("https://uljanovs.github.io/site/tasks/list_of_people_with_jobs.html",driver.getCurrentUrl());
        }

        @When("^I want to add a person$")
        public void iWantToAddPerson() {
            driver.findElement(By.xpath("//button[contains(.,'Add person')]")).click();
        }
        @And("^I type persons name$")
        public void iWasMistakenWithName() {
        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys();
        }
        @And("^I type persons job$")
        public void iTypePersonsJob() {
        driver.findElement(By.xpath("//*[@id=\"job\"]")).sendKeys();
        }
        @Then("^I can clear all fields$")
        public void iCanClearAllFields() {
        driver.findElement(By.xpath("//button[contains(.,'Clear all fields')]")).click();
        }



}

