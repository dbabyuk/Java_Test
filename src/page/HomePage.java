package page;

import framework.SolventSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends SolventSelenium {
    public HomePage(WebDriver driver)  {
        super(driver);
    }

    @FindBy(css = "img[class='rounded-circle img-responsive z-depth-0']")
    public WebElement clickLink;

    public void clickIcon() {
        elementClick(clickLink);
    }

}
