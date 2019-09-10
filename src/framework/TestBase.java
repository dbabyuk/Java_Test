package framework;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class TestBase {

    protected WebDriver driver;
    public DriverWrapper browser;

    @Before
    public void setup() {
       driver = WebDriverFactory.getWebDriver();
       browser = new DriverWrapper(driver);
    }

    @After
    public void exitBrowser() {
        driver.quit();
    }

}
