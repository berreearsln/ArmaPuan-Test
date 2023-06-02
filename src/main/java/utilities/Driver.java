package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
            driver = new ChromeDriver();
        }

        return driver;
    }

    //public static WebDriver closeDriver() {
    //    if (driver != null) {
    //        driver.quit();
    //      driver = null;
    //    }
    //    return null;
    //}
}
