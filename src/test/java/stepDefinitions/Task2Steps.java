package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import pages_sample.AgePage;
import pages_sample.NumbersPage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class Task2Steps {
    private WebDriver driver;

    public Task2Steps() {
        this.driver = Hooks.driver;
    }

    @Given("^user is on people with jobs page$")
    public void iAmOnNumberPage() throws Throwable {
        driver.get("https://uljanovs.github.io/site/tasks/list_of_people_with_jobs.html");
    }

    @When("^i click on Add person button$")
    public void i_click_on_Add_person_button() throws Throwable {
        driver.findElement(By.xpath("//h2[contains(.,'People with jobs')]/following-sibling::*[1]"));

    }

    @Then("^i see a form$")
    public void i_see_a_form() throws Throwable {
        assertEquals("https://uljanovs.github.io/site/tasks/enter_a_new_person_with_a_job.html", driver.getCurrentUrl());
    }
    @When("^i input \"([^\"]*)\" in name field and \"([^\"]*)\" in job field$")
    public void i_input_in_name_field_and_in_job_field(String name, String job) throws Throwable {
        driver.findElement(By.cssSelector("#name")).sendKeys(name);
        driver.findElement(By.cssSelector("#job")).sendKeys(job);
    }

    @When("^click Add button$")
    public void click_Add_button() throws Throwable {
       driver.findElement(By.xpath("//*[.='Add']")).click();
    }

    @Then("^i see person on list$")
    public void i_see_person_on_list() throws Throwable {

    }



}
