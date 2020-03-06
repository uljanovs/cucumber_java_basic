package stepDefinitions;

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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Task1Steps {
    private WebDriver driver;

    public Task1Steps() {
        this.driver = Hooks.driver;
    }

    @Given("^I am on app page$")
    public void i_am_on_app_page() throws Throwable {
        driver.get("https://uljanovs.github.io/site/tasks/enter_a_number");
    }

    @When("^I enter value: \"([^\"]*)\"$")
    public void i_enter_value(String arg1) throws Throwable {
        driver.findElement(By.id("numb")).clear();
        driver.findElement(By.id("numb")).sendKeys(arg1);
    }

    @When("^I click submit button$")
    public void i_click_submit_button() throws Throwable {
        driver.findElement(By.cssSelector("body > div.w3-row > div > div > div.w3-container.w3-card-4 > button")).click();
    }

    @Then("^I see error message: \"([^\"]*)\"$")
    public void i_see_error_message(String arg1) throws Throwable {
        assertEquals(arg1, driver.findElement(By.id("ch1_error")).getText());
    }
    @Then("^I see alert$")
    public void i_see_alert() throws Throwable {
        Alert alert = driver.switchTo().alert();
        assertEquals("Square root of 81 is 9.00", alert.getText());
}
}

