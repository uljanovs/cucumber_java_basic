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
    @FindBy(how = How.CLASS_NAME, using = "w3-input w3-border w3-light-grey required")
    private WebElement numberInput;
    @FindBy(how = How.CLASS_NAME, using = "w3-btn w3-orange w3-margin")
    private WebElement Submit;
    @FindBy(how = How.ID, using = "ch1_error")
    private WebElement errorMessage;

    public void EnterInvalidValue (String invalid_value) {
        numberInput.clear();
        numberInput.sendKeys(invalid_value);
    }

    public void ClickOnSubmit (){Submit.click();}

    public void seeErrorMessage(String error) {
        assertEquals(errorMessage.getText(), errorMessage);
        assertTrue(errorMessage.isDisplayed());
    }

    public void EnterValidValue (){
        numberInput.clear();
        numberInput.sendKeys();
    }
public void result (String resultMessage) throws InterruptedException {
    Alert alert = driver.switchTo().alert();
    String alertMessage= driver.switchTo().alert().getText();
    assertEquals("Square root of 64 is 8.00", alertMessage);
    System.out.println(alertMessage);
  //  Thread.sleep(5000);

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
