package framework;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import page.Header;
import page.SignIn;
import page.UserProfile;

public class TestBase {

    private WebDriver driver;
    protected Header header;
    protected SignIn signIn;
    protected UserProfile userProfile;

    @Before
    public void setup() {
       driver = WebDriverFactory.getWebDriver();
       DriverWrapper browser = new DriverWrapper(driver);
       header = new Header(browser);
       signIn = new SignIn(browser);
       userProfile = new UserProfile(browser);
    }

    @After
    public void exitBrowser() {
        driver.quit();
    }

}
