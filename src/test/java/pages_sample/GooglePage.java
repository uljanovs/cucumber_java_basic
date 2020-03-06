package pages_sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.junit.Assert.assertTrue;


public class GooglePage {
    @FindBy(how = How.NAME, using = "q") // By.id("name")
    private WebElement SearchField; // WebElement nameInput = driver.findElement(By.id("name"));
    @FindBy(how = How.NAME, using = "btnK") // By.name("age")
    private WebElement SearchButton;

    public String returnGoogleURL() {
        return ("https://www.google.com/");
    }

    public void clickSearchField() {
        SearchField.click();
    }
    public void clearSearch() {
        SearchField.clear();
    }

    public void clickSearchButton() {
        SearchButton.click();
    }


    public void checkResult(String result) {
        assertTrue(SearchField.getAttribute("value").equals(result));
    }

    public void enterCat(String searchvalue) {
        SearchField.clear();
        SearchField.sendKeys(searchvalue);
    }
}
