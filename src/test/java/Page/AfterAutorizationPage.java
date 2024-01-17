package Page;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AfterAutorizationPage extends BasePage {

    public AfterAutorizationPage(WebDriver driver) {
        super(driver);
    }

    public WebElement emailButton = getWait5().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@aria-label='Почта (откроется новая вкладка)']")));

}
