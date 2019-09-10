package test;

import framework.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;

public class HeaderTest extends TestBase {
    private By FIRST_NAME = By.id("firstName");
    @Test
    public void testSimple() {
        header.clickIcon();
        header.selectOption("Log in");
        signIn.enter_credentials("user@gmail.com", "user");
        header.clickIcon();
        header.selectOption("Profile");
        userProfile.enterDataInTextbox(FIRST_NAME, "Andrew");
        userProfile.clickUpdateProfile();

    }
}
