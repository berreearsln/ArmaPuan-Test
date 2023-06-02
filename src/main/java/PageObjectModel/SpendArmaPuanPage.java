package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SpendArmaPuanPage extends AbstractClass {
    WebDriver driver;

    public SpendArmaPuanPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/app-root/app-homepage-employee/div/div/a/button")
    private WebElement spendArmaPuanButton;
    public void spendArmaPuan() {
        clickFunction(spendArmaPuanButton);
    }

    @FindBy(xpath = "//*[@id=\"productName\"]")
    private WebElement spendArmapuanSearchTextArea;
    public void spendArmaPuanSearch() {
        sendKeysFunction(spendArmapuanSearchTextArea, "z bRanD bAg");
    }
}
