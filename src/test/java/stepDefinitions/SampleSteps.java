package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SampleSteps {
    private WebDriver driver;

    public SampleSteps() {
        this.driver = Hooks.driver;
    }

    @Given("^I am on googling page$")
    public void i_am_on_googling_page() throws Throwable {

        driver.get("https://www.google.com/");
    }
    @Given("^I enter search phrase: \"([^\"]*)\"$")
    public void i_enter_search_phrase(String name)  throws Throwable {
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys(name);

    }
    @When("^I click search$")
    public void i_click_search() throws Throwable {
        driver.findElement(By.name("btnK")).click();
    }
    @Then("^I confirm i searched for: \"([^\"]*)\"$")
    public void i_confirm_i_searched_for(String arg1) throws Throwable {
        //assertEquals(arg1, driver.findElement(By.name("q")).getText());
        assertEquals(arg1, driver.findElement(By.name("q")).getAttribute("value"));

    }

    @Then("^I look at cats for (\\d+) seconds$")
    public void i_look_at_cats_for_seconds(int arg1) throws Throwable {
        Thread.sleep(10000);
    }

    @Then("^I go back$")
    public void i_go_back() throws Throwable {
        driver.navigate().back();
    }

    @Then("^I confirm im in google$")
    public void i_confirm_im_in_google() throws Throwable {
        assertEquals("https://www.google.com/",driver.getCurrentUrl());
    }





    @Given("^I am on the home page$")
    public void iAmOnTheHomePage() throws Throwable {
        driver.get("https://uljanovs.github.io/site");
    }

    @Then("^I should see home page header$")
    public void iShouldSeeHomePageHeader() throws Throwable {
        assertEquals("This is a home page",
                driver.findElement(By.cssSelector("h1")).getText());
    }

    @And("^I should see home page description$")
    public void iShouldSeeHomePageDescription() throws Throwable {
        assertEquals("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                driver.findElement(By.cssSelector("p")).getText());
    }
    @Given("^I should see home page description like my wife$")
    public void i_should_see_home_page_description_like_my_wife() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }


        @When("^I enter name: \"([^\"]*)\"$")
    public void iEnterName(String name) throws Throwable {
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys(name);
    }

    @And("^I enter age: (\\d+)$")
    public void iEnterAge(int age) throws Throwable {
        driver.findElement(By.id("age")).sendKeys(String.valueOf(age));
    }

    @Given("^I (?:am on|open) age page$")
    public void iAmOnAgePage() throws Throwable {
        driver.get("https://uljanovs.github.io/site/examples/age");
    }

    @And("^I click submit age$")
    public void iClickSubmitAge() throws Throwable {
        driver.findElement(By.id("submit")).click();
    }

    @Then("^I see message: \"([^\"]*)\"$")
    public void iSeeMessage(String message) throws Throwable {
        assertEquals(message, driver.findElement(By.id("message")).getText());
    }

    @When("^I enter values:$")
    public void iEnterValues(Map<String, String> valuesToEnter) throws Throwable {
        for (Map.Entry<String, String> e : valuesToEnter.entrySet()) {
            driver.findElement(By.id(e.getKey())).clear();
            driver.findElement(By.id(e.getKey())).sendKeys(e.getValue());
            System.out.println("key is " + e.getKey());
            System.out.println("value is " + e.getValue());
        }
    }

    @And("^I should see menu$")
    public void iShouldSeeMenu() throws Throwable {
        assertTrue(driver.findElement(By.className("w3-navbar")).isDisplayed());
    }

    @And("^I click the result checkbox button$")
    public void iClickTheResultCheckboxButton() throws Throwable {
        driver.findElement(By.id("result_button_checkbox")).click();
    }

    @When("^I clicked on checkboxes:$")
    public void iClickedOnCheckboxes(List<String> values) throws Throwable {
        for (String value : values) {
            driver.findElement(By.cssSelector("[value='" + value + "']")).click();
        }
    }

    @Then("^message for checkboxes \"([^\"]*)\" is seen$")
    public void messageForCheckboxesIsSeen(String message) throws Throwable {
        assertEquals(message, driver.findElement(By.id("result_checkbox")).getText());
    }

    @Given("^I am on action page$")
    public void iAmOnActionPage() {
        driver.get("https://uljanovs.github.io/site/examples/actions");
    }
}
