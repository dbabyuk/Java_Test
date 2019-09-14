package framework;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import page.Header;
import page.SignIn;
import page.UserProfile;

import java.io.IOException;

public class TestBase {

    private WebDriver driver;
    protected Header header;
    protected SignIn signIn;
    protected UserProfile userProfile;
//    private PrepareDB prepareDB;

    @Before
    public void setup() throws IOException {
       PrepareDB prepareDB = new PrepareDB();
       prepareDB.main();
        driver = WebDriverFactory.getWebDriver();
       DriverWrapper browser = new DriverWrapper(driver);
       header = new Header(browser);
       userProfile = new UserProfile(browser);
       signIn = new SignIn(browser);

    }

    @After
    public void exitBrowser() {
        driver.quit();
    }

}
