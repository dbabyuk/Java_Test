package test;

import framework.TestBase;
import org.junit.Test;

public class HeaderTest extends TestBase {

    @Test
    public void testSimple() {
        header.clickIcon();
        header.selectOption("Log in");
        signIn.enter_credentials("user@gmail.com", "user");
        header.clickIcon();
        header.selectOption("Profile");
        userProfile.enterDataInTextbox(userProfile.fields.get("FIRST_NAME"), "Andrew");
        userProfile.enterDataInTextbox(userProfile.fields.get("LAST_NAME"), "Stuart");
        userProfile.enterDataInTextbox(userProfile.fields.get("EMAIL"), "a@chnu.edu.ua");
        userProfile.enterDataInTextbox(userProfile.fields.get("COUNTRY"), "USA");
        userProfile.clickUpdateProfile();

    }
}
