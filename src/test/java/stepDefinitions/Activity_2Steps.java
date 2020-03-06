package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages_sample.Activity_2Page;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class Activity_2Steps {
    private WebDriver driver;


    public Activity_2Steps() {
        this.driver = Hooks.driver;
    }

    @Given("^I am on Google page;$")
    public void i_am_on_Google_page() throws Throwable {
        driver.get("https://www.google.com/");
    }

    @When("^I enter word : cats$")
    public void i_enter_word_cats() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("cats");
    }

   @And("^I click Search button$")
         public void clickSearch() throws Throwable {
       driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.ENTER);
       }

    @Then("^result is displayed$")
    public void iSeeResult () throws Throwable {
        driver.get("https://www.google.com/search?safe=active&sxsrf=ALeKk01SJ5BoMD2lVSLxDi0h3j8Nk1y3Dw%3A1583477217883&source=hp&ei=4fFhXqnCM_KErwSxk7DwAw&q=cats&oq=cats&gs_l=psy-ab.3..35i39j0l8j0i10.1117893.1118534..1350313...4.0..0.96.360.4......0....1..gws-wiz.....10..35i362i39.Gp-Yp7C_qrU&ved=0ahUKEwjpttGooIXoAhVywosKHbEJDD4Q4dUDCAY&uact=5");
    }

}




