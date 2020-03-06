package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.*;


public class task2steps {
    private WebDriver driver;

    public task2steps() {
        this.driver = Hooks.driver;
    }

    @Given("^I am on People with jobs page$")
    public void i_am_on_People_with_jobs_page() throws Throwable {
        driver.get("https://uljanovs.github.io/site/tasks/list_of_people_with_jobs.html");
    }

    @When("^I press add person button$")
    public void i_press_add_person_button() throws Throwable {
        WebElement button123=driver.findElement(By.xpath("//*[.='Add person'][1]"));
        button123.click();
    }

    @When("^I enter the name: \"([^\"]*)\"$")
    public void i_enter_the_name(String arg1) throws Throwable {
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys(arg1);
    }

    @When("^I enter job: \"([^\"]*)\"$")
    public void i_enter_job(String arg1) throws Throwable {
        driver.findElement(By.id("job")).clear();
        driver.findElement(By.id("job")).sendKeys(arg1);
    }

    @Then("^I press add$")
    public void i_press_add() throws Throwable {
        WebElement button123=driver.findElement(By.xpath("//*[@id=\"modal_button\"][1]"));
        button123.click();
    }

    @Then("^I check that person is added: \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_check_that_person_is_added(String arg1, String arg2) throws Throwable {
        assertEquals(arg1, driver.findElement(By.xpath("//*[@id=\"person3\"]/span[3]")).getText());
        assertEquals(arg2, driver.findElement(By.xpath("//*[@id=\"person3\"]/span[4]")).getText());
    }

    //*[@id="person3"]/span[3]
        //*[@id="person3"]/span[4]


    @Then("^I reset list$")
    public void i_reset_list() throws Throwable {
        WebElement button123=driver.findElement(By.xpath("//*[.='Reset List'][1]"));
        button123.click();
    }

    @When("^I press edit button$")
    public void i_press_edit_button() throws Throwable {
        WebElement button123=driver.findElement(By.xpath("//*[@id=\"person0\"]/span[2]"));
        button123.click();
    }

    @When("^I edit name: \"([^\"]*)\"$")
    public void i_edit_name(String arg1) throws Throwable {
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys(arg1);
    }

    @When("^I edit job: \"([^\"]*)\"$")
    public void i_edit_job(String arg1) throws Throwable {
        driver.findElement(By.id("job")).clear();
        driver.findElement(By.id("job")).sendKeys(arg1);
    }

    @Then("^I press edit$")
    public void i_press_edit() throws Throwable {
        WebElement button123=driver.findElement(By.xpath("//*[@id=\"modal_button\"][1]"));
        button123.click();
    }

    @Then("^I check that person is edited: \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_check_that_person_is_edited(String arg1, String arg2) throws Throwable {
        assertEquals(arg1, driver.findElement(By.xpath("//*[@id=\"person0\"]/span[3]")).getText());
        assertEquals(arg2, driver.findElement(By.xpath("//*[@id=\"person0\"]/span[4]")).getText());
    }

    @When("^I press remove person$")
    public void i_press_remove_person() throws Throwable {
        WebElement button123=driver.findElement(By.xpath("//*[@id=\"person0\"]/span[1]"));
        button123.click();
    }

    @When("^I check that person is removed$")
    public void i_check_that_person_is_removed() throws Throwable {
        assertEquals(0,driver.findElements(By.xpath("//*[@id=\"person0\"]/span[3]")).size());
    }

    @Then("^I click clear all fields$")
    public void i_click_clear_all_fields() throws Throwable {
        WebElement button123=driver.findElement(By.xpath("//*[@id=\"addPersonBtn\"]"));
        button123.click();
    }

    @Then("^I check that fields are empty$")
    public void i_check_that_fields_are_empty() throws Throwable {
        assertEquals("", driver.findElement(By.id("name")).getAttribute("value"));
        assertEquals("", driver.findElement(By.id("job")).getAttribute("value"));
    }

    @Then("^I click cancel$")
    public void i_click_cancel() throws Throwable {
        WebElement button123=driver.findElement(By.xpath("//*[@id=\"modal_button\"][2]"));
        button123.click();
    }


}
