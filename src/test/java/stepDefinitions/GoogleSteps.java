package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GoogleSteps {
    private WebDriver driver;

    public GoogleSteps() {
        this.driver = Hooks.driver;
    }

        @Given("^I am on page$")
        public void i_am_on_page() throws Throwable {
            driver.get("https://www.google.lv/");
        }

        @Given("^I see search field$")
        public void i_see_search_field() throws Throwable {
            assertTrue(driver.findElement(By.name("q")).isDisplayed());
        }

        @When("^I input cats$")
        public void i_input_cats() throws Throwable {
          WebElement name = driver.findElement(By.name("q"));
            name.sendKeys("Cats");
           /*@When("^I input \"([^\"]*)\"$")
            public void i_input(String item) throws Throwable {
                driver.findElement(By.name("q")).clear();
                driver.findElement(By.name("q")).sendKeys(item);*/

            }



        @When("^I click search button$")
        public void i_click_search_button() throws Throwable {
           // driver.findElement(By.name("btnK")).click();
            WebElement button12 = driver.findElement(By.name("btnK"));
            button12.submit();
        }

        @Then("^I see request result cats in search field$")
        public void i_see_request_result_cats_in_search_field() throws Throwable {
            WebElement searchResult = driver.findElement(By.name("q"));
            assertEquals("cats", searchResult.getAttribute("value"));
            
        }
}





