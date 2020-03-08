package stepDefinitions;

import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;

import static org.junit.Assert.assertEquals;

public class Task1 {
    private WebDriver driver;
    public Task1() {
        this.driver = Hooks.driver;
    }

    @Given("^I am on the page \"Enter a number\"$")
    public void iAmOnPageEnterANumber() throws Throwable {
        driver.get("https://uljanovs.github.io/site/tasks/enter_a_number");
    }

    @When("^(.+) is submitted$")
    public void iEnterTooSmallNumber(int x) throws Throwable {
        driver.findElement(By.id("numb")).clear();
        driver.findElement(By.id("numb")).sendKeys(String.valueOf(x));
    }

    @And("^I press Submit button$")
    public void iPressSubmitButton() {
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/button")).click();

    }

    @Then("^Error is shown: \"([^\"]*)\"$")
    public void iSeeError(String message) throws Throwable {
        assertEquals(message, driver.findElement(By.id("ch1_error")).getText());
    }

    @When("^(.+) is entered$")
    public void iEnterTooBigNumbers(int z) throws Throwable {
        driver.findElement(By.cssSelector("#numb")).clear();
        driver.findElement(By.cssSelector("#numb")).sendKeys(String.valueOf(z));
    }

    @And("^I click Submit button again$")
    public void iPressSubmitButton2() {
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/button")).click();
    }

    @Then("^I see error for too long numbers: \"([^\"]*)\"$")
    public void iSeeError2(String arg0) throws Throwable {
        assertEquals(arg0, driver.findElement(By.id("ch1_error")).getText());
   }

    @When("^I submit (.+)$")
    public void iEnterText(String text) throws Throwable {
        driver.findElement(By.cssSelector("#numb")).clear();
        driver.findElement(By.cssSelector("#numb")).sendKeys(text);
    }

    @And("^I press Submit button one more time")
    public void iPressSubmitButton3() {
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/button")).click();
    }

    @Then("^I see error: \"([^\"]*)\"$")
    public void iSeeError3(String arg1) throws Throwable {
        assertEquals(arg1, driver.findElement(By.id("ch1_error")).getText());
    }

    @When("^number is: 68$")
    public void iEnterNormalNumbers() throws Throwable {
        driver.findElement(By.cssSelector("#numb")).clear();
        driver.findElement(By.cssSelector("#numb")).sendKeys("68");
    }

    @And("^I press Submit$")
    public void iPressSubmitButton4() {
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/button")).click();
    }
    @Then("^Square root for this number is shown$")
    public void squareRootIsShown()  throws Throwable {
        Alert alert = driver.switchTo().alert();
        assertEquals("Square root of 68 is 8.25", alert.getText());
    }

    @And("I click Ok$")
    public void clickOk() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}