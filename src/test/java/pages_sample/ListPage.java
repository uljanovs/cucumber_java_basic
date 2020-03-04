package pages_sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ListPage {
    @FindBy(how = How.XPATH, using = "//*[@id=\"addPersonBtn\"][1]")
    private WebElement addPersonButton;
    @FindBy(how = How.CSS, using = "#addPersonBtn")
    private WebElement resetListButton;
    @FindBy(how = How.ID, using = "name")
    private WebElement nameField;
    @FindBy(how = How.ID, using = "job")
    private WebElement jobField;
    @FindBy(how = How.XPATH, using = "//button[@onclick='addPersonWithJobToList()']")
    private WebElement addingButton;
    @FindBy(how = How.XPATH, using = "//*[@id='person3']/span[3]")
    private WebElement addedPersonName;
    @FindBy(how = How.XPATH, using = "//*[@id=\"person3\"]/span[4]")
    private WebElement addedPersonJob;
    @FindBy(how = How.XPATH, using = "//*[@id=\"person0\"]/span[2]")
    private WebElement editButton;
    @FindBy(how = How.XPATH, using = "//button[@onclick='editPersonWithJob(0)']")
    private WebElement confirmEditingButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"person0\"]/span[3]")
    private WebElement person0Name;
    @FindBy(how = How.XPATH, using = "//*[@id=\"person0\"]/span[4]")
    private WebElement person0Job;
    @FindBy(how = How.XPATH, using = "//span[@onclick='deletePerson(0)']")
    private WebElement deleteButton;
    @FindBy(how = How.XPATH, using = "//button[@onclick='openModalForAddPersonWithJob()']")
    private WebElement clearButton;

    public void addPerson() {
        addPersonButton.click();
    }

    public void resetList() {
        resetListButton.click();
    }

    public WebElement enterName() {
        return nameField;
    }

    public WebElement enterJob() {
        return jobField;
    }

    public void confirmAddition() {
        addingButton.click();
    }

    public String addedName() {
        return addedPersonName.getText();
    }

    public String addedJob() {
        return addedPersonJob.getText();
    }

    public void editPerson() {
        editButton.click();
    }

    public void confirmEdition() {
        confirmEditingButton.click();
    }

    public String editedName() {
        return person0Name.getText();
    }

    public String editedJob() {
        return person0Job.getText();
    }

    public void deletePerson() {
        deleteButton.click();
    }

    public void clearFields() {
        clearButton.click();
    }

}
