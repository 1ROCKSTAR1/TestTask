package Page;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PassPage extends BasePage {

    public PassPage(WebDriver driver) {
        super(driver);
    }

    public WebElement enterYourPass = getWait5().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
    public WebElement nextButton2 = getWait5().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"passwordNext\"]/div/button")));
}
