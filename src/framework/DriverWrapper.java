package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverWrapper {

    public WebDriver driver;
    public DriverWrapper(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElement(WebDriver driver, By Locator) {
         return driver.findElement(Locator);
    }

    public void clickElement(WebDriver driver, By Locator) {
        getElement(driver, Locator).click();
    }
}
