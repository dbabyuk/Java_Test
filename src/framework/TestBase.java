package framework;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected WebDriver driver;

    @BeforeMethod
    public WebDriver setup() {
       driver = WebDriverFactory.getWebDriver();
       return driver;
    }

    @AfterMethod
    public void exitBrowser() {
        driver.quit();
    }

}
