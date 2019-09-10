package page;

import framework.DriverWrapper;
import org.openqa.selenium.By;

public class UserProfile {
    private DriverWrapper browser;

    public UserProfile(DriverWrapper browser) {
        this.browser = browser;
    }

    protected By FIRST_NAME = By.id("firstName");
    protected By LAST_NAME = By.id("lastName");
    protected By BIRTHDAY = By.id("birthday");
    protected By EMAIL = By.id("email");
    protected By PHONE = By.id("phone");
    protected By COUNTRY = By.id("country");
    protected By CITY = By.id("city");
    protected By STREET = By.id("street");
    protected By BUILDING = By.id("building");
    protected By APARTMENT = By.id("apartment");
    protected By ZIP_CODE = By.id("zipCode");
    protected By UPDATE_PROFILE = By.cssSelector("input[value='Update Profile']");


    private Boolean checkDataValidity(By key) {
        String temp = browser.getAttributeValue(key, "class");
        return temp.contains("ng-valid");
    }

    public Boolean enterDataInTextbox(By key, String value) {
        browser.clearElement(key);
        browser.enterData(key, value);
        return checkDataValidity(key);
    }

}