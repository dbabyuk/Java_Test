package page;

import framework.DriverWrapper;
import org.openqa.selenium.By;

public class SignIn {
    private DriverWrapper browser;
    public SignIn(DriverWrapper browser) {
        this.browser = browser;
    }

    private By EMAIL = By.id("username");
    private By PASSWORD = By.id("password");
    private By BUTTON_SIGN_IN = By.cssSelector("input[value='Sign In']");

    public void enter_credentials(String username, String passwd) {
        browser.clearElement(EMAIL);
        browser.enterData(EMAIL, username);
        browser.clearElement(PASSWORD);
        browser.enterData(PASSWORD, passwd);
        browser.clickElement(BUTTON_SIGN_IN);
    }


}
