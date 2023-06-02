package PageObjectModel;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateEmployeePage extends AbstractClass {

    WebDriver driver;

    public CreateEmployeePage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "/html/body/app-root/app-employee/div/form/div[1]/a[1]")
    private WebElement employeeButton;
    public void clickEmployeeButton() {
        clickFunction(employeeButton);
    }



    @FindBy(xpath = "//*[@id=\"employeeId\"]")
    private WebElement employeeIDTextArea;
    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement employeeNameTextArea;
    @FindBy(xpath = "//*[@id=\"lastname\"]")
    private WebElement employeeLastNameTextArea;
    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement employeeEmailTextArea;
    @FindBy(xpath = "//*[@id=\"managerId\"]")
    private WebElement employeeManagerIDTextArea;
    @FindBy(xpath = "//*[@id=\"managerDepartmentName\"]")
    private WebElement employeeDepartmentTextArea;


    public void writeSameEmployeeID() {
        sendKeysFunction(employeeIDTextArea, "58046");
    }

    @FindBy(xpath = "/html/body/app-root/app-employee/div/form/div[2]/table/tbody/tr[17]/td[1]/div")
    private WebElement employeeIDAlertBox;
    public void employeeIDAlert() {
        Assertion(employeeIDAlertBox, "This employee id already exist.");
        System.out.println(employeeIDAlertBox.getText());
    }

    public void writeSampleEmployee() {
        sendKeysFunction(employeeIDTextArea, "58058");
        sendKeysFunction(employeeNameTextArea, "Berre");
        sendKeysFunction(employeeLastNameTextArea, "Arslan");
        sendKeysFunction(employeeEmailTextArea, "berreearsln");
        sendKeysFunction(employeeManagerIDTextArea, "10003");
        sendKeysFunction(employeeDepartmentTextArea, "HR");
    }

    @FindBy(xpath = "/html/body/app-root/app-employee/div/form/button")
    private WebElement addEmployeeButton;
    public void addEmployee() {
        clickFunction(addEmployeeButton);
    }

    @FindBy(xpath = "//*[@id=\"employeeName\"]")
    private WebElement employeeNameSearchTextArea;
    public void employeeNameSearch() {
        sendKeysFunction(employeeNameSearchTextArea, "abBy");
    }



}
