package pages_sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.junit.Assert.*;


public class EnterNumberPage {
    private String EnterPage = "https://uljanovs.github.io/site/tasks/enter_a_number" ;
    @FindBy(how = How.ID, using = "numb")
    private WebElement Input;
    @FindBy(how = How.CLASS_NAME, using = "w3-orange")
    private WebElement Submit;
    @FindBy(how = How.ID, using = "ch1_error")
    private WebElement ErrorMessage;
    public void iClickInputField() {
        Input.click();
    }
    public void iEnterValue(String value) {
        Input.sendKeys(value);
    }
    public void iClickSubmit() {
        Submit.click();
    }
    public void iCheckResultNegative(String message) {
        assertEquals(message, ErrorMessage);
    }

}
