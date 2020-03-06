package pages_sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NumbersPage {

    @FindBy(how = How.ID, using = "numb")
    private WebElement inputField;
    @FindBy(how = How.CLASS_NAME, using = "w3-btn")
    private WebElement submitButton;
    @FindBy(how = How.ID, using = "ch1_error")
    private WebElement errorMessage;

    public WebElement enterValue() {
        inputField.clear();
        return inputField;
    }

    public void submit (){
        submitButton.click();
    }


}
