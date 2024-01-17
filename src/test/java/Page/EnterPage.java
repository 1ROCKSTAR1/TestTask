package Page;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EnterPage extends BasePage {

    public EnterPage(WebDriver driver) {
        super(driver);
    }

    public WebElement enterYourEmailField = getWait5().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
    public WebElement nextButton = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"identifierNext\"]/div/button")));


}
