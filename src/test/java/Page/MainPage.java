package Page;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public WebElement enterButton = getWait2().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@aria-label='Войти']")));




}
