package page;

import framework.DriverWrapper;
import org.openqa.selenium.By;


public class Header {

    private DriverWrapper browser;
    public Header(DriverWrapper browser) {
        this.browser = browser;
    }

    private By ICON = By.cssSelector("img[class='rounded-circle img-responsive z-depth-0']");
    private By DROPDOWN_LOGIN = By.xpath("//a[ text()='Log in']");
    private By DROPDOWN_PROFILE = By.xpath("//a[ text()='Profile']");
    private By DROPDOWN_LOGOUT = By.xpath("//a[ text()='Log out']");



    public void clickIcon() {
        browser.clickElement(ICON);
    }

    public void selectOption(String pick_item) {
        By locator = null;
        switch (pick_item) {
            case "Log in":
                locator = DROPDOWN_LOGIN;
                break;
            case "Profile":
                locator = DROPDOWN_PROFILE;
                break;
            case "Log out":
                locator = DROPDOWN_LOGOUT;
                break;
            default:
                System.out.println("Wrong parameter pick_up");
        }
        browser.clickElement(locator);
    }

}
