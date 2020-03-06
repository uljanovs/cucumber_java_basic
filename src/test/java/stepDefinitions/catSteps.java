package stepDefinitions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class catSteps {
    private WebDriver driver;
    public catSteps() {
        this.driver = Hooks.driver;
    }

    @Given("^i am on google page$")
    public void iAmOnTheGooglepage() throws Throwable {
        driver.get("https://www.google.com/webhp");
    }

    @When("^i type in searchbox cat and click search$")
    public void iTypeCat() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("cat");
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.ENTER);
    }
        @And("^click on first search result$")
        public void clickonfirstsearchresult() throws Throwable {
        Thread.sleep(3000);
            driver.findElement(By.xpath("//h3[.='Cat - Wikipedia']")).click();
        }

        @Then("^i see search cats on wikipedia$")
        public void iSeeResults() throws Throwable {
        assertEquals("https://en.wikipedia.org/wiki/Cat", driver.getCurrentUrl());
//assertTrue(driver.findElement(By.xpath("//*[@id=\"result-stats\"]")).isDisplayed());


            }
            @Given("^i am on youtube search results$")
            public void iAmOnYoutube() throws Throwable {
                driver.get("https://www.youtube.com/results?search_query=cat+meowing");
        }
    @When("^i click on video$")
    public void iclickOnVideo() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[.='10 CATS MEOWING | Make your Cat or Dog Go Crazy! HD Sound Effect']")).click();



    }

    @Then("^cats are meaowing$")
    public void meaow() throws Throwable {
        Thread.sleep(10000);



    }

    }

