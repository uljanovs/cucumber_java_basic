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


public class task1steps {
    private WebDriver driver;

    public task1steps() {
        this.driver = Hooks.driver;
    }

    @Given("^I am on numbers page$")
    public void i_am_on_numbers_page() throws Throwable {
        driver.get("https://uljanovs.github.io/site/tasks/enter_a_number");
    }

    @When("^I enter number: \"([^\"]*)\"$")
    public void i_enter_number(String arg1) throws Throwable {
        driver.findElement(By.id("numb")).clear();
        driver.findElement(By.id("numb")).sendKeys(arg1);
    }

    @When("^I click submit$")
    public void i_click_submit() throws Throwable {
        WebElement button123=driver.findElement(By.cssSelector("body > div.w3-row > div > div > div.w3-container.w3-card-4 > button"));
        button123.click();
    }

    @Then("^I confirm error message \"([^\"]*)\"$")
    public void i_confirm_error_message(String arg1) throws Throwable {
        assertEquals(arg1,driver.findElement(By.id("ch1_error")).getText());

    }
    @Then("^I confirm correct alert$")
    public void i_confirm_correct_alert() throws Throwable {
        Alert alert = driver.switchTo().alert();
        assertEquals("Square root of 64 is 8.00", alert.getText());
        alert.accept();
    }

}
