package PageObjectModel;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateManagerPage extends AbstractClass {

    WebDriver driver;

    public CreateManagerPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "/html/body/app-root/app-employee/div/form/div[1]/a[2]")
    private WebElement createManagerButton;
    public void clickManagerButton() {
        clickFunction(createManagerButton);
    }

    @FindBy(xpath = "//*[@id=\"managerId\"]")
    private WebElement managerIDTextArea;
    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement managerNameTextArea;
    @FindBy(xpath = "//*[@id=\"lastname\"]")
    private WebElement managerLastNameTextArea;
    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement managerEmailTextArea;
    @FindBy(xpath = "//*[@id=\"departmentName\"]")
    private WebElement managerDepartmentTextArea;


    public void writeSameManagerID() {
        sendKeysFunction(managerIDTextArea, "10004");
    }

    @FindBy(xpath = "/html/body/app-root/app-manager/div/form/div[2]/table/tbody/tr[6]/td[1]/div")
    private WebElement managerIDAlertBox;
    public void managerIDAlert() {
        Assertion(managerIDAlertBox, "This manager id already exist.");
        System.out.println(managerIDAlertBox.getText());
    }

    public void writeSampleManager() {
        sendKeysFunction(managerIDTextArea, "10005");
        sendKeysFunction(managerNameTextArea, "Berre");
        sendKeysFunction(managerLastNameTextArea, "Arslan");
        sendKeysFunction(managerEmailTextArea, "berreearsln@hotmail.com");
        sendKeysFunction(managerDepartmentTextArea, "HR");
    }

    @FindBy(xpath = "/html/body/app-root/app-manager/div/form/button")
    private WebElement addManagerButton;
    public void addManager() {
        clickFunction(addManagerButton);
    }

    @FindBy(xpath = "//*[@id=\"managerName\"]")
    private WebElement managerNameSearchTextArea;
    public void searchManagerName() {
        sendKeysFunction(managerNameSearchTextArea,"scArletT");
    }





}
