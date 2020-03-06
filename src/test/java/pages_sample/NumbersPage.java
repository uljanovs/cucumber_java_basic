package pages_sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class NumbersPage {
    private WebDriver driver;

    @FindBy(how = How.CSS, using = ".required")
    private WebElement numberInput;
    @FindBy(how = How.XPATH, using = "//*[.='Submit']")
    private WebElement Submit;
    @FindBy(how = How.ID, using = "ch1_error")
    private WebElement errorMessage;


    public void EnterInvalidValue(String invalid_value) {
        numberInput.clear();
        numberInput.sendKeys(invalid_value);
    }

    public void ClickOnSubmit() {
        Submit.click();
    }

    public void seeErrorMessage(String error) {
        assertEquals(error, errorMessage.getText());
        assertTrue(errorMessage.isDisplayed());
    }

    public void EnterValidValue(String number) {
        numberInput.clear();
        numberInput.sendKeys(number);
    }

    public void result(String resultMessage, Alert alert) throws InterruptedException {
        System.out.println("2" + resultMessage);
        Thread.sleep(5000);

        System.out.println("3 Switched to Allert");

        assertEquals(resultMessage, alert.getText());
        System.out.println("hello");

        alert.accept();

    }



   /* public boolean isAlertPresent(){
        WebDriver driver;
        try{
            driver.switchTo().alert();
            return true;
        }catch(NoAlertPresentException ex){
            return false;
        }
    }*/


}
