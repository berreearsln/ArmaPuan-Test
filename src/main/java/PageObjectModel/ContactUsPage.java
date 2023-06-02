package PageObjectModel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactUsPage extends AbstractClass {

    WebDriver driver;

    public ContactUsPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/app-root/app-homepage-employee/nav/div/a[2]/mat-icon")
    private WebElement contactUsLogo;
    public void clickContactUsLogo() {
        clickFunction(contactUsLogo);
    }

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement contactEmailTextArea;
    @FindBy(xpath = "//*[@id=\"subject\"]")
    private WebElement contactSubjectTextArea;
    @FindBy(xpath = "//*[@id=\"request\"]")
    private WebElement contactRequestTextArea;

    public void emptyContactEmail() {
        sendKeysFunction(contactEmailTextArea,"berreearsln@hotmail.com");
        clearTextArea(contactEmailTextArea);
    }
    public void emptyContactSubject() {
        sendKeysFunction(contactSubjectTextArea, "test");
        clearTextArea(contactSubjectTextArea);
    }
    public void emptyContactRequest() {
        sendKeysFunction(contactRequestTextArea, "request");
        clearTextArea(contactRequestTextArea);
    }

    @FindBy(xpath = "/html/body/app-root/app-contact-us/form/fieldset/div/div[1]/div")
    private WebElement emptyEmailAlertBox;
    public void emptyEmailAlert() {
        Assertion(emptyEmailAlertBox, "Email required");
        System.out.println(emptyEmailAlertBox.getText());
    }
    @FindBy(xpath = "/html/body/app-root/app-contact-us/form/fieldset/div/div[2]/div")
    private WebElement emptySubjectAlertBox;
    public void emptySubjectAlert() {
        Assertion(emptySubjectAlertBox, "Subject required");
        System.out.println(emptySubjectAlertBox.getText());
    }
    @FindBy(xpath = "/html/body/app-root/app-contact-us/form/fieldset/div/div[3]/div")
    private WebElement emptyRequestAlertBox;
    public void emptyRequestAlert() {
        Assertion(emptyRequestAlertBox, "Request required");
        System.out.println(emptyRequestAlertBox.getText());
    }

    public void writeSampleRequest() {
        sendKeysFunction(contactEmailTextArea,"berreearsln@hotmail.com");
        sendKeysFunction(contactSubjectTextArea, "test");
        sendKeysFunction(contactRequestTextArea, "request");
    }

    @FindBy(xpath = "/html/body/app-root/app-contact-us/form/fieldset/button[1]")
    private WebElement resetButton;
    public void clickResetButton() {
        clickFunction(resetButton);
    }

    public void emailBosMu() {
        Assertion(contactEmailTextArea, "");
        System.out.println("Email kutusu boş");
    }
    public void subjectBosMu() {
        Assertion(contactSubjectTextArea, "");
        System.out.println("Subject kutusu boş");
    }
    public void requestBosMu() {
        Assertion(contactRequestTextArea, "");
        System.out.println("Request kutusu boş");
    }
}
