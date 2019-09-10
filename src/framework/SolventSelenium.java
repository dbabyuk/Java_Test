package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SolventSelenium {

    public WebDriver driver;
    public SolventSelenium(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
