package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AnasayfaPage extends AbstractClass {

    WebDriver driver;

    public AnasayfaPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/app-root/app-spend-point/nav/div/a")
    private WebElement employeeLogoButton;
    public void employeeAnasayfa() {
        clickFunction(employeeLogoButton);
    }

    @FindBy(xpath = "/html/body/app-root/app-select-employee/nav/div/a")
    private WebElement selectEmployeeaLogoButton;
    public void selectEmployeeManagerAnasayfa() {
        clickFunction(selectEmployeeaLogoButton);
    }

    @FindBy(xpath = "/html/body/app-root/app-point-selection/nav/div/a")
    private WebElement pointSelectLogoButton;
    public void selectArmaPuanManagerAnasayfa() {
        clickFunction(pointSelectLogoButton);
    }
}
