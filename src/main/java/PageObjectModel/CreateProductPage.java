package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateProductPage extends AbstractClass {

    WebDriver driver;

    public CreateProductPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "/html/body/app-root/app-employee/div/form/div[1]/a[3]")
    private WebElement productButton;
    public void clickProductButton() {
        clickFunction(productButton);
    }

    @FindBy(xpath = "//*[@id=\"productId\"]")
    private WebElement productIDTextArea;
    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement productNameTextArea;
    @FindBy(xpath = "//*[@id=\"point\"]")
    private WebElement productPoint;
    @FindBy(xpath = "//*[@id=\"rate\"]")
    private WebElement productRate;
    @FindBy(xpath = "//*[@id=\"productLink\"]")
    private WebElement productLink;


    public void writeSameProductID() {
        sendKeysFunction(productIDTextArea, "19");
    }

    @FindBy(xpath = "/html/body/app-root/app-product/form/div[2]/table/tbody/tr[21]/td[1]/div")
    private WebElement productIDAlertBox;
    public void productIDAlert() {
        Assertion(productIDAlertBox, "This product id already exist.");
        System.out.println(productIDAlertBox.getText());
    }


    public void writeSampleProduct() {
        sendKeysFunction(productIDTextArea, "20");
        sendKeysFunction(productNameTextArea, "R Brand Bag");
        sendKeysFunction(productPoint, "500");
        sendKeysFunction(productRate, "40");
        sendKeysFunction(productLink, "URL");
    }

    @FindBy(xpath = "/html/body/app-root/app-product/form/button")
    private WebElement addProductButton;
    public void addProduct() {
        clickFunction(addProductButton);
    }

    @FindBy(xpath = "//*[@id=\"productName\"]")
    private WebElement productNameSearchTextArea;
    public void searchProductName() {
        sendKeysFunction(productNameSearchTextArea,"z");
    }

    public void fazlaPuan() {
        sendKeysFunction(productPoint,"2000");
    }

    @FindBy(xpath = "/html/body/app-root/app-product/form/div[2]/table/tbody/tr[21]/td[3]/div[2]")
    private WebElement fazlaPuanAlertBox;
    public void fazlaPuanAlert() {
        Assertion(fazlaPuanAlertBox, "Point must be in range 100-1000");
        System.out.println(fazlaPuanAlertBox.getText());
    }

    public void azPuan() {
        sendKeysFunction(productPoint, "50");
    }

    @FindBy(xpath = "/html/body/app-root/app-product/form/div[2]/table/tbody/tr[21]/td[3]/div[2]")
    private WebElement azPuanAlertBox;
    public void azPuanAlert() {
        Assertion(azPuanAlertBox, "Point must be in range 100-1000");
        System.out.println(azPuanAlertBox.getText());
    }

    public void maxRate() {
        sendKeysFunction(productRate, "101");
    }

    @FindBy(xpath = "/html/body/app-root/app-product/form/div[2]/table/tbody/tr[21]/td[4]/div[2]")
    private WebElement maxRateAlertBox;
    public void maxRateAlert() {
        Assertion(maxRateAlertBox, "Rate must be in range 0-100");
        System.out.println(maxRateAlertBox.getText());
    }


}
