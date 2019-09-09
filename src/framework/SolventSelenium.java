package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SolventSelenium {

    public WebDriver driver;
    public SolventSelenium(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void elementClick(WebElement element) {
        element.click();
    }
}
