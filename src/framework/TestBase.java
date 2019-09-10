package framework;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class TestBase {

    protected WebDriver driver;

    @Before
    public void setup() {
       driver = WebDriverFactory.getWebDriver();
    }

    @After
    public void exitBrowser() {
        driver.quit();
    }

}
