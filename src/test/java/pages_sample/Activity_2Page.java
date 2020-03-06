package pages_sample;
import org.openqa.selenium.By;
import  org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.junit.Assert.*;

public class Activity_2Page {
    public String getPageUrl() {
        return "https://www.google.com/";
    }
    @FindBy(how = How.CLASS_NAME,using = "gLFyf gsfi")
    private WebElement textArea;
    @FindBy(how = How.CLASS_NAME,using = "gNO89b")
    private WebElement searchButton;

    public void iAmOnThePage(){}

    public void updateTextArea(String name) {
        textArea.sendKeys(name);

    }

    public void clickSearch() {
        searchButton.click();
    }

    public void iUpdateText() {
        updateTextArea("cats");
        clickSearch();
    }

    public void iSeeResult(){

    }
}
