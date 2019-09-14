package test;

import framework.TestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserProfilePositiveTest extends TestBase {
    private String textbox;
    private String userData;

    public UserProfilePositiveTest(String textbox, String userData) {
        this.textbox = textbox;
        this.userData = userData;
    }

    @Parameterized.Parameters
    public static Collection fields() {
        return Arrays.asList(new Object[][] {
                { "FIRST_NAME", "Andrew" },
                { "LAST_NAME", "Stuart" },
                { "EMAIL", "a@chnu.edu.ua" },
                { "PHONE", "+380971465478" },
                { "COUNTRY", "USA" },
                { "CITY", "Dallas" },
                { "STREET", "Hobby Horse" },
                { "BUILDING", "555" },
                { "APARTMENT", "14" },
                { "ZIP_CODE", "78741" },
        });
    }

    @Test
    public void testPositive() {
        header.clickIcon();
        header.selectOption("Log in");
        signIn.login("user");
        header.clickIcon();
        header.selectOption("Profile");
        userProfile.enterDataInTextbox(userProfile.fields.get(textbox), userData);
        userProfile.clickUpdateProfile();
        String aa = userProfile.readDataInTextbox(userProfile.fields.get(textbox));
        System.out.println(aa);
    }
}
