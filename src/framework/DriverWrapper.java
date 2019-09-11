package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverWrapper {

    private WebDriver driver;
    DriverWrapper(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement getElement(By Locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(Locator));
        return driver.findElement(Locator);
    }

    public void clickElement(By Locator) {
        getElement(Locator).click();
    }

    public void clearElement(By Locator) {
        getElement(Locator).clear();
    }

    public void enterData(By Locator, String data) {
        getElement(Locator).sendKeys(data);
    }

    public String getAttributeValue(By key, String attr) {
        return getElement(key).getAttribute(attr);
    }
}
