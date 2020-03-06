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

public class GoogleSteps {
    private WebDriver driver;

    public GoogleSteps() {
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
        //driver.findElement(By.name("btnK")).click();
        WebElement button123=driver.findElement(By.name("btnK"));
        button123.submit();
        Thread.sleep(2000);
    }
    @Then("^I confirm i searched for: \"([^\"]*)\"$")
    public void i_confirm_i_searched_for(String arg1) throws Throwable {
        assertEquals(arg1, driver.findElement(By.name("q")).getAttribute("value"));

    }

    @Then("^I look at cats for (\\\\d+) seconds$")
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


}
