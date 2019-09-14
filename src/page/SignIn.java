package page;

import framework.DriverWrapper;
import org.openqa.selenium.By;

import java.util.HashMap;

public class SignIn {
    private DriverWrapper browser;
    private HashMap<String, String[]> personCredentials = new HashMap<>();

    public SignIn(DriverWrapper browser) {
        this.browser = browser;
        personCredentials.put("user", new String[]{"user@gmail.com", "user"});
        personCredentials.put("cowner", new String[]{"cowner@gmail.com", "cowner"});
        personCredentials.put("admin", new String[]{"admin@gmail.com", "admin"});
    }

    private By EMAIL = By.id("username");
    private By PASSWORD = By.id("password");
    private By BUTTON_SIGN_IN = By.cssSelector("input[value='Sign In']");

    private void enter_credentials(String username, String passwd) {
        browser.clearElement(EMAIL);
        browser.enterData(EMAIL, username);
        browser.clearElement(PASSWORD);
        browser.enterData(PASSWORD, passwd);
    }

    public void login(String person) {
        String username = personCredentials.get(person)[0];
        String passwd = personCredentials.get(person)[1];
        enter_credentials(username, passwd);
        browser.clickElement(BUTTON_SIGN_IN);
    }


}
