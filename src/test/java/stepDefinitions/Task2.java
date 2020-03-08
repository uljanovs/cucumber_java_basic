package stepDefinitions;

import org.openqa.selenium.*;
import cucumber.api.java.en.Given;
import static org.junit.Assert.assertEquals;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Task2 {
    private WebDriver driver;

    public Task2() {
        this.driver = Hooks.driver;
    }

    @Given("^I am going to the page \"([^\"]*)\"$")
    public void iAmGoingToThePage(String arg) throws Throwable {
        driver.get("https://uljanovs.github.io/site/tasks/list_of_people_with_jobs.html");
    }

    @When("^I click Edit button$")
    public void iClickEditButton() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"person0\"]/span[2]/i")).click();
    }

    @Then("^I am redirected to \"([^\"]*)\" page$")
    public void iAmRedirectedToPage(String arg2) throws Throwable {
        assertEquals("https://uljanovs.github.io/site/tasks/enter_a_new_person_with_a_job.html?id=0",
                driver.getCurrentUrl());
    }

    @When("^I will enter new (.+)$")
    public void IEnterNewName(String name) throws Throwable {
        driver.findElement(By.cssSelector("#name")).clear();
        driver.findElement(By.cssSelector("#name")).sendKeys(name);
    }

    @And("^I enter (.+)$")
    public void IEnterJob(String job) throws Throwable {
        driver.findElement(By.cssSelector("#job")).clear();
        driver.findElement(By.cssSelector("#job")).sendKeys(job);
    }

    @And("^click on Edit$")
    public void ClickOnEdit() throws Throwable {
        driver.findElement(By.cssSelector("[id=modal_button]:nth-child(1)")).click();
    }

    @Then("^I am redirected to home page$")
    public void IAmRedirectedOne() throws Throwable {
        assertEquals("https://uljanovs.github.io/site/tasks/list_of_people_with_jobs.html",
                driver.getCurrentUrl());
    }

    @And("^new (.+) is seen on home page$")
    public void new_is_seen_on_home_page(String name) throws Throwable {
        assertEquals(name, driver.findElement(By.xpath("//*[@id=\"person0\"]/span[3]")).getText());
    }

    @And("^new (.+) is displayed$")
    public void new_is_seen(String job) throws Throwable {
        assertEquals(job, driver.findElement(By.xpath("//*[@id=\"person0\"]/span[4]")).getText());
    }

    @When("^button reset is clicked$")
    public void button_reset_is_clicked() throws Throwable {
        driver.findElement(By.cssSelector("[id=addPersonBtn]:nth-child(3)")).click();
    }

    @Then("^original page items are shown$")
    public void original_page_items_are_shown() throws Throwable {
        assertEquals("https://uljanovs.github.io/site/tasks/list_of_people_with_jobs.html",
                driver.getCurrentUrl());
        assertEquals("Mike", driver.findElement(By.xpath("//*[@id=\"person0\"]/span[3]")).getText());
        assertEquals("Web Designer", driver.findElement(By.xpath("//*[@id=\"person0\"]/span[4]")).getText());
    }

    @When("^I click on Add button$")
    public void i_click_on_add_button() throws Throwable {
        driver.findElement(By.cssSelector("[id=addPersonBtn]:nth-child(1)")).click();
    }

    @Then("^\"([^\"]*)\" page opens$")
    public void add_new_page_opens(String arg4) throws Throwable {
        assertEquals("https://uljanovs.github.io/site/tasks/enter_a_new_person_with_a_job.html",
                driver.getCurrentUrl());
    }

    @When("^I add firstname: (.+)$")
    public void i_add_firstname(String name) throws Throwable {
        driver.findElement(By.cssSelector("#name")).clear();
        driver.findElement(By.cssSelector("#name")).sendKeys(name);
    }

    @And("^I add jobtitle: (.+)$")
    public void i_add_jobtitle(String job) throws Throwable {
        driver.findElement(By.cssSelector("#job")).clear();
        driver.findElement(By.cssSelector("#job")).sendKeys(job);
    }

    @And("^I press Add$")
    public void i_press_add() throws Throwable {
        driver.findElement(By.cssSelector("[id=modal_button]:nth-child(1)")).click();
    }

    @Then("^I am at home page again$")
    public void i_am_at_home_page_again() throws Throwable {
        assertEquals("https://uljanovs.github.io/site/tasks/list_of_people_with_jobs.html",
                driver.getCurrentUrl());
    }

    @And("^I see that new person (.+) is added$")
    public void i_see_that_new_person_is_added(String name) throws Throwable {
    }

        private boolean isNewNamePresent (By xpath){
            try {
                driver.findElement(By.xpath("//*[@id=\"person3\"]/span[3]"));
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }

    @And("^new person (.+) is seen$")
    public void new_person_is_seen(String job) throws Throwable {
    }

    private boolean isNewJobPresent(By xpath) {
        try {
            driver.findElement(By.xpath("//*[@id=\"person3\"]/span[4]"));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }


    @When("^I am resetting a list$")
    public void i_am_resetting_a_list() throws Throwable {
        driver.findElement(By.cssSelector("[id=addPersonBtn]:nth-child(3)")).click();
    }

    @Then("^original person list is displayed$")
    public void original_person_list_is_displayed() throws Throwable {
        assertEquals("https://uljanovs.github.io/site/tasks/list_of_people_with_jobs.html",
                driver.getCurrentUrl());
        assertEquals("Mike", driver.findElement(By.xpath("//*[@id=\"person0\"]/span[3]")).getText());
        assertEquals("Web Designer", driver.findElement(By.xpath("//*[@id=\"person0\"]/span[4]")).getText());
    }

    private boolean isNamePresent(By xpath) {
        try {
            driver.findElement(By.xpath("//*[@id=\"person3\"]/span[3]"));
            return false;
        } catch (NoSuchElementException e) {
            return true;
        }
    }

    private boolean isJobPresent(By xpath) {
        try {
            driver.findElement(By.xpath("//*[@id=\"person3\"]/span[4]"));
            return false;
        } catch (NoSuchElementException e) {
            return true;
        }
    }

    @When("^I remove person$")
    public void i_remove_person() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"person0\"]/span[1]")).click();
    }

    @Then("^This employee is not visible$")
    public void this_employee_is_not_visible() throws Throwable {
        assertEquals("https://uljanovs.github.io/site/tasks/list_of_people_with_jobs.html",
                driver.getCurrentUrl());
    }

    private boolean isMikePresent(By xpath) {
        try {
            driver.findElement(By.xpath("//*[@id=\"person0\"]/span[3]"));
            return false;
        } catch (NoSuchElementException e) {
            return true;
        }
    }

    private boolean isDesignerPresent(By xpath) {
        try {
            driver.findElement(By.xpath("//*[@id=\"person0\"]/span[4]"));
            return false;
        } catch (NoSuchElementException e) {
            return true;
        }
    }

    @When("^list was reset$")
    public void list_was_reset() throws Throwable {
        driver.findElement(By.cssSelector("[id=addPersonBtn]:nth-child(3)")).click();
    }

    @Then("^homepage is shown$")
    public void homepage_is_shown() throws Throwable {
        assertEquals("https://uljanovs.github.io/site/tasks/list_of_people_with_jobs.html",
                driver.getCurrentUrl());
        assertEquals("Mike", driver.findElement(By.xpath("//*[@id=\"person0\"]/span[3]")).getText());
        assertEquals("Web Designer", driver.findElement(By.xpath("//*[@id=\"person0\"]/span[4]")).getText());
    }

    @When("^I will add person$")
    public void i_will_add_person() throws Throwable {
        driver.findElement(By.cssSelector("[id=addPersonBtn]:nth-child(1)")).click();
    }
    @And("^I will add name \"([^\"]*)\"$")
    public void i_will_add_name_victoria(String strArg1) throws Throwable {
        driver.findElement(By.cssSelector("#name")).clear();
        driver.findElement(By.cssSelector("#name")).sendKeys("Victoria");
    }

    @And("^I will press Clear all fields button$")
    public void i_will_press_clear_all_fields_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"addPersonBtn\"]")).click();
    }
    @Then("^field will be cleared$")
    public void field_will_be_cleared() throws Throwable {
        assertEquals("", driver.findElement(By.id("name")).getAttribute("value"));
    }

}