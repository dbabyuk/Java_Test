package test;

import framework.TestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class UserProfileNegativeTest extends TestBase {
    private String textbox;
    private String userData;

    public UserProfileNegativeTest(String textbox, String userData) {
        this.textbox = textbox;
        this.userData = userData;
    }

    @Parameterized.Parameters
    public static Collection fields() {
        return Arrays.asList(new Object[][] {
                { "FIRST_NAME", "Andrew1" },
                { "LAST_NAME", "$tuart" },
                { "PHONE", "+999999999" },
                { "COUNTRY", "USA6@" },
                { "CITY", "Austin-98" },
                { "STREET", "'FT1&u- h" },
                { "BUILDING", "7B 4-" },
                { "APARTMENT", "14-Q" },
                { "ZIP_CODE", "787414" },
        });
    }

    @Test
    public void testNegative() {
        header.clickIcon();
        header.selectOption("Log in");
        signIn.login("user");
        header.clickIcon();
        header.selectOption("Profile");
        Boolean dataValidity = userProfile.enterDataInTextbox(userProfile.fields.get(textbox), userData);
        assertFalse(dataValidity);
    }
}
