package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage extends AbstractClass{

    WebDriver driver;

    public LoginPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/app-root/app-login/div/div/div[2]/a[1]/button")
    private WebElement adminButton;
    public void clickAdminButton() {
        clickFunction(adminButton);
    }

    @FindBy(xpath = "/html/body/app-root/app-login/div/div/div[2]/a[2]/button")
    private WebElement employeeButton;
    public void clickEmployeeButton() {
        clickFunction(employeeButton);
    }

    @FindBy(xpath = "/html/body/app-root/app-login/div/div/div[2]/a[3]/button")
    private WebElement managerButton;
    public void clickManagerButton() {
        clickFunction(managerButton);
    }




}
