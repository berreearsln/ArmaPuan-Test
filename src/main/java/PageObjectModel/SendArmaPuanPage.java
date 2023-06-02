package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SendArmaPuanPage extends AbstractClass {

    WebDriver driver;

    public SendArmaPuanPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/app-root/app-homepage-manager/div/div/a")
    private WebElement sendArmaPuanButton;
    public void sendArmaPuan() {
        clickFunction(sendArmaPuanButton);
    }

    @FindBy(xpath = "//*[@id=\"mat-checkbox-1\"]/label/span[1]")
    private WebElement selectEmployee;
    public void selectEmployee() {
        clickFunction(selectEmployee);
    }

    @FindBy(xpath = "/html/body/app-root/app-select-employee/div/button/span[1]")
    private WebElement sendPointNextButton;
    public void sendPointNext() {
        clickFunction(sendPointNextButton);
    }

    @FindBy(xpath = "//*[@id=\"mat-input-0\"]")
    private WebElement sendPuanEmployeeSearchTextArea;
    public void sendPuanEmployeeSearch() {
        sendKeysFunction(sendPuanEmployeeSearchTextArea,"abBy");
    }
    public void wrongSendPuanEmployeeSearch() {
        sendKeysFunction(sendPuanEmployeeSearchTextArea,"abbb");
    }

    @FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/app-dialog-no-data/mat-dialog-actions/button")
    private WebElement puanOkayButton;
    public void puanOkay() {
        clickFunction(puanOkayButton);
    }

    @FindBy(xpath = "/html/body/app-root/app-point-selection/div/div[2]/div[3]/label")
    private WebElement gonderilecekPuan;
    public void puan() {
        clickFunction(gonderilecekPuan);
    }

    @FindBy(xpath = "/html/body/app-root/app-point-selection/div/button")
    private WebElement choosePointNextButton;
    public void puanNextButton() {
        clickFunction(choosePointNextButton);
    }

    @FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/app-dialog-example/mat-dialog-actions/a/button")
    private WebElement noButtonBox;
    public void noButton() {
        clickFunction(noButtonBox);
    }

    @FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/app-dialog-example/mat-dialog-actions/a/button")
    private WebElement yesButtonBox;
    public void yesButton() {
        clickFunction(yesButtonBox);
    }

    @FindBy(xpath = "/html/body/app-root/app-homepage-manager/div/span/h5")
    private WebElement bilgiEkrani;
    public void employeeBilgiEkrani() {
        Assertion(bilgiEkrani,"Sent Armapuan");
    }

    @FindBy(xpath = "/html/body/app-root/app-point-selection/div/div[1]/a/div")
    private WebElement employeeBilgiKutusu;
    public void clickEmployeeBilgiKutusu() {
        clickFunction(employeeBilgiKutusu);
    }

    @FindBy(xpath = "/html/body/app-root/app-select-employee/div/h3")
    private WebElement selectEmployeeEkrani;
    public void setSelectEmployeeEkrani() {
        Assertion(selectEmployeeEkrani,"Select Employee");
    }

}
