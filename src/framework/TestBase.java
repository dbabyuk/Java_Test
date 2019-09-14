package framework;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import page.Header;
import page.SignIn;
import page.UserProfile;
import java.io.IOException;

@RunWith(JUnit4.class)
public class TestBase {

    private WebDriver driver;
    protected Header header;
    protected SignIn signIn;
    protected UserProfile userProfile;

    @BeforeClass
    public static void setupClass() throws IOException {
        PrepareDB prepareDB = new PrepareDB();
        prepareDB.main();
    }

    @Before
    public void setup()  {
        driver = WebDriverFactory.getWebDriver();
        DriverWrapper browser = new DriverWrapper(driver);
        header = new Header(browser);
        userProfile = new UserProfile(browser);
        signIn = new SignIn(browser);
    }

    @After
    public  void exitBrowser() {
        driver.quit();
    }

}
