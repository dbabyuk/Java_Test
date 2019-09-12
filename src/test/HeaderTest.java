package test;

import framework.TestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class HeaderTest extends TestBase {
    private String textbox;
    private String userData;

    public HeaderTest(String textbox, String userData) {
        this.textbox = textbox;
        this.userData = userData;
    }

    @Parameterized.Parameters
    public static Collection fields1() {
        return Arrays.asList(new Object[][] {
                { "FIRST_NAME", "Andrew" },
                { "LAST_NAME", "Stuart" }
        });
    }

    @Test
    public void testSimple() {
        header.clickIcon();
        header.selectOption("Log in");
        signIn.enter_credentials("user@gmail.com", "user");
        header.clickIcon();
        header.selectOption("Profile");
        userProfile.enterDataInTextbox(userProfile.fields.get(textbox), userData);
        userProfile.clickUpdateProfile();

    }
}
