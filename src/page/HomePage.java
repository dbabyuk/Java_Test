package page;

import framework.DriverWrapper;
import framework.SolventSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends SolventSelenium {

    public HomePage(DriverWrapper browser, WebDriver driver) {
        super(driver);

    }

    By iconLocator = By.cssSelector("img[class='rounded-circle img-responsive z-depth-0']");


    public void clickIcon(DriverWrapper browser) {
        browser.clickElement(browser.driver, iconLocator);
    }

}
