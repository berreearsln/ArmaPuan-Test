package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InquiryRequestPage extends AbstractClass {

    WebDriver driver;

    public InquiryRequestPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/app-root/app-employee/nav/div/a[2]/mat-icon")
    private WebElement inquiryRequestLogo;
    public void clickInquiryRequestLogo() {
        clickFunction(inquiryRequestLogo);
    }

    @FindBy(xpath = "//*[@id=\"mat-select-0\"]/div/div[2]/div")
    private WebElement selectButton;
    public void clickControlButton() {
        clickFunction(selectButton);
    }

    @FindBy(xpath = "//*[@id=\"mat-option-0\"]/span")
    private WebElement answerButton;
    public void selectAnswerButton() {
        clickFunction(answerButton);
    }

    @FindBy(xpath = "//*[@id=\"mat-input-3\"]")
    private WebElement answerTextArea;
    public void writeSampleAnswer() {
        sendKeysFunction(answerTextArea, "answer");
    }

    @FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/app-dialog-answer/div/button")
    private WebElement sendButton;
    public void sendAnswer() {
        clickFunction(sendButton);
    }


    @FindBy(xpath = "/html/body/app-root/app-inbox/div/table/tbody/tr/td[3]")
    private WebElement requestEmployeeName;
    @FindBy(xpath = "/html/body/app-root/app-inbox/nav/div/div/a/button")
    private WebElement logoutButton;
    @FindBy(xpath = "/html/body/app-root/app-login/div/div/div[2]/a[1]/button")
    private WebElement adminButton;
    @FindBy(xpath = "//*[@id=\"employeeName\"]")
    private WebElement searchEmployeeForEmail;
    public void searchRequestEmployeeName() {
        String name = requestEmployeeName.getText();
        String[] firstName = name.split(" ");
        clickFunction(logoutButton);
        clickFunction(adminButton);
        sendKeysFunction(searchEmployeeForEmail, firstName[0]);
    }

    @FindBy(xpath = "/html/body/app-root/app-employee/div/form/div[2]/table/tbody/tr[1]/td[3]")
    private WebElement employeeEmail;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-dialog-answer/div/mat-form-field[1]/div/div[1]/div/input")
    private WebElement requestEmployeeEmail;
    @FindBy(xpath = "/html/body/app-root/app-employee/nav/div/a[2]/mat-icon")
    private WebElement logoButton2;
    @FindBy(xpath = "//*[@id=\"mat-select-0\"]/div/div[2]/div")
    private WebElement selectButton2;
    public void sameEmail() {
        String tableEmail = employeeEmail.getText();
        clickFunction(logoButton2);
        clickFunction(selectButton2);
        clickFunction(answerButton);
        Assertion2("ayse@arma.com", "" + tableEmail + "");
    }
}
