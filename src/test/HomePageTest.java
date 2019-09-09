package test;

import framework.TestBase;
import org.testng.annotations.Test;
import page.HomePage;

public class HomePageTest extends TestBase {
    @Test
    public void testSimple() {
        HomePage home = new HomePage(driver);
        home.clickIcon();

    }
}
