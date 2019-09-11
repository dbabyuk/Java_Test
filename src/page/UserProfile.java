package page;

import framework.DriverWrapper;
import org.openqa.selenium.By;

import java.util.HashMap;

public class UserProfile {
    private DriverWrapper browser;

    public HashMap<String, By> fields = new HashMap<>();

    public UserProfile(DriverWrapper browser) {
        this.browser = browser;
        fields.put("FIRST_NAME", By.id("firstName"));
        fields.put("LAST_NAME", By.id("lastName"));
        fields.put("EMAIL", By.id("email"));
        fields.put("PHONE", By.id("phone"));
        fields.put("COUNTRY", By.id("country"));
        fields.put("CITY", By.id("city"));
        fields.put("STREET", By.id("street"));
        fields.put("BUILDING", By.id("building"));
        fields.put("APARTMENT", By.id("apartment"));
        fields.put("ZIP_CODE", By.id("zipCode"));
    }



    private By UPDATE_PROFILE = By.cssSelector("input[value='Update Profile']");




    private Boolean checkDataValidity(By key) {
        String temp = browser.getAttributeValue(key, "class");
        return temp.contains("ng-valid");
    }

    public Boolean enterDataInTextbox(By key, String value) {
        browser.clearElement(key);
        browser.enterData(key, value);
        return checkDataValidity(key);
    }
    public void clickUpdateProfile() {
        browser.clickElement(UPDATE_PROFILE);
    }
}